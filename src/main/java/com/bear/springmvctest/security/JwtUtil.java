package com.bear.springmvctest.security;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/8/28 上午12:48
 * Description:
 */

import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JwtUtil {
    //  @Value("${jwt.secret}")
    private static final String secret = "MTIz";// Base64 encode "123"

    /**
     * 解析JWT token, 成功回傳使用者資訊, 失敗回傳null
     */
    public static User parseToken(String token) {
        try {

            // Claims就是JWT的payload部分
            // setSigningKey(String base64EncodedKeyBytes)只吃base64編碼的字串, 傳入無法base64解碼的字串會發生錯誤
            Claims body = Jwts.parser()
                    .setSigningKey(secret)
                    .parseClaimsJws(token)
                    .getBody();

            String username = (String) body.get("name");
            String password = (String) body.get("password");
            String role = (String) body.get("role");

            // 以下設定會影響Spring Security是否讓此帳號通過驗證
            boolean enabled = true;               // 此帳號是否啟用
            boolean accountNonExpired = true;     // 此帳號是否未過期
            boolean credentialsNonExpired = true; // 此憑證是否過期
            boolean accountNonLocked = true;      // 此帳號是否鎖住

            List authorityList = AuthorityUtils.commaSeparatedStringToAuthorityList(role); // 取得角色權限

            User user = new User(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorityList);

            return user;

        } catch (JwtException | ClassCastException e) {
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 產生 JWT token, payload中裝載name, password, role
     */
    public String generateToken(User u) {
        Claims claims = Jwts.claims().setSubject("");
        claims.put("name", u.getUsername());
        claims.put("password", u.getPassword());
        claims.put("role", u.getRole());

        return Jwts.builder()
                .setClaims(claims)
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();
    }
}
