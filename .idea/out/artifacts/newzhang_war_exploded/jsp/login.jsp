<%--
  Created by IntelliJ IDEA.
  User: A
  Date: 2018/11/20
  Time: 19:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
登录 <br>
<form action="/my/login" method="post">
    姓名：<input type="text" name="name" value=""/><br>
    密码：<input type="text" name="password" value=""/><br>
    <input type="submit" name="method" value="登录"/>
</form>
</body>
</html>
