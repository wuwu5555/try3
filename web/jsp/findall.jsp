<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: A
  Date: 2018/11/21
  Time: 15:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新闻</title>
</head>
<body>
<table border="1">
    <c:forEach var="tmp" items="${list}">
        <tr>
            <td>新闻名称：</td>
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

</body>
</html>
