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
    <title>天气</title>
</head>
<body>
<table border="1">
    <c:forEach var="tmp" items="${list}">
        <tr>


            <td>天气：</td>
            <td>${tmp}&nbsp; </td>

        </tr>
    </c:forEach>
</table>

</body>
</html>
