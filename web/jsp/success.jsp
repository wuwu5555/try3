<%--
  Created by IntelliJ IDEA.
  User: A
  Date: 2018/11/19
  Time: 19:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查找单条新闻</title>
</head>
<body>
<h1>请输入编号：</h1>
<form action="/my/success" method="post">
    编号：<input type="text" name="id" value=""/><br>
    <input type="submit" name="method" value="显示">
</form>
</body>
</html>
