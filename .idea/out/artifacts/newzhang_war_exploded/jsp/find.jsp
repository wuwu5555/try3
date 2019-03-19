<%--
  Created by IntelliJ IDEA.
  User: A
  Date: 2018/11/19
  Time: 21:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询新闻</title>
</head>
<body>
<h1>新闻显示成功！</h1>
</body>
<center>
    <table border="1">
        <tr>
            <td>发布者</td>
            <td>${lname}</td>
        </tr>
        <tr>
            <td>编号</td>
            <td>${lid} </td>
        </tr>
        <tr>
            <td>内容</td>
            <td>${lcontent}</td>
        </tr>
    </table>
</center>
</html>
