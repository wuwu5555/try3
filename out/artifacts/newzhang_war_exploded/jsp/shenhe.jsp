<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core_1_1" %>

<%--
  Created by IntelliJ IDEA.
  User: A
  Date: 2018/11/21
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="" %>--%>
<html>
<head>
    <title>管理员审核界面</title>
</head>
<body>
<form action="/my/shenhe" method="post">
    <table border="1">
        <c:forEach var="tmp" items="${list}">
            <tr>
                <td>发布新闻：</td>
                <td>${tmp.name}&nbsp; </td>
                <td> 标号:</td>
                <td>${tmp.id} &nbsp;</td>
                <td>内容：</td>
                <td>${tmp.content}&nbsp; </td>
                <td>状态</td>
                <td>${tmp.state}&nbsp;</td>
            </tr>
        </c:forEach>
    </table>
    id：<input type="text" name="id" value=""/><br>
    <input type="submit" name="method" value="通过"/>
</form>

</body>
</html>
