<%--
  Created by IntelliJ IDEA.
  User: A
  Date: 2018/11/19
  Time: 19:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加新闻</title>
</head>
<body>
添加新闻 <br>
<form action="/my/addnews" method="post">
    编号：<input type="text" name="id" value=""/><br>
    标题：<input type="text" name="name" value=""/><br>
    内容：<input type="text" name="content" value=""/><br>
    作者：<input type="text" name="author" value=""/><br>
    <input type="submit" name="method" value="发布新闻"/>
</form>
</body>
</html>
