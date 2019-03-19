<%--
  Created by IntelliJ IDEA.
  User: A
  Date: 2018/11/21
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户界面</title>
</head>
<body>
<form action="/my/person1" method="post">
    <input type="submit" name="method" value="发布新闻"/>
</form>
<form action="/my/person2" method="post">
    <input type="submit" name="method" value="查询新闻"/>
</form>
    <form action="/my/person4" method="post">
        <input type="submit" name="method" value="查询所有新闻"/>

    </form>
        <form action="/my/person5" method="post">
            <input type="submit" name="method" value="新闻状态统计"/>

</form>
<form action="/my/person6" method="post">
    <input type="submit" name="method" value="新闻日期统计"/>

</form>

<form action="/my/person7" method="post">
    <input type="submit" name="method" value="新闻摘要"/>

</form>
<form action="/my/person8" method="post">
    <input type="submit" name="method" value="天气"/>

</form>
</body>
</html>
