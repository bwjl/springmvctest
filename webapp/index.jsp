<%--
  Created by IntelliJ IDEA.
  User: bear
  Date: 2020/4/25
  Time: 上午9:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>welcome pages</title>
</head>
<body>
<script src="https://cdnjs.gtimg.com/cdnjs/libs/zepto/0.6/zepto.min.js"></script>
<script>
    // /**
    //  * 模拟跨域请求
    //  * @type {XMLHttpRequest}
    //  */
    // var xhr = new XMLHttpRequest();
    // xhr.open('GET', 'http://localhost:9085/springmvc5test/api/index');
    // xhr.send(null);
    // xhr.onload = function(e) {
    //     var xhr = e.target;
    //     console.log(xhr.responseText);
    // }


    $.ajax({
        url: "http://localhost:9085/springmvc5test/api/index",
        type: "post",
        contentType: "application/json;charset=utf-8",
        // contentType: "text/plain",
        data: {},
        success: function (res) {
            console.log("success", "ajax");
        },
        error: function (e) {
            console.log("error", "ajax");
        }
    });

</script>
</body>
</html>
