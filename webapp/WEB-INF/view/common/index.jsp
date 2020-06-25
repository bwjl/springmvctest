<%--
  Created by IntelliJ IDEA.
  User: bear
  Date: 2020/6/25
  Time: 下午7:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form id="form" method="POST" enctype="multipart/form-data"
      action="/springmvctest/upload/image" onsubmit="return check();">
    <input type="file" accept="image/*" name="image" id="file"/>
    <input type="submit" value="提交"/>
</form>

</body>
</html>
