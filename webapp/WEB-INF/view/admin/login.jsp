<%--
  Created by IntelliJ IDEA.
  User: bear
  Date: 2020/7/25
  Time: 下午10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>admin index</title>
</head>
<body>
<h1>login index</h1>
<form action="j_spring_security_check" method="post">
    用户名<input type="text" name="j_username"/><br/>
    密码<input type="password" name="j_password"/><br/>
    <input type="submit" value="submit"/>
</form>

</body>
</html>
