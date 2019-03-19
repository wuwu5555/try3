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
    <title>管理员审核界面aaa</title>
    <script src="https://cdn.bootcss.com/echarts/4.2.0-rc.2/echarts.common.js"></script>
    <style>
        #chartmain{
            width:300px;
            height: 400px;
        }
    </style>
</head>
<body>




<div id="chartmain">


</div>
<form action="/my/shenhe" method="post">
    <table border="1">
        <br>
            <td>未审核</td>
        </br>

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
        <br>
        <td>已审核</td>
        </br>
        <c:forEach var="tmp" items="${list1}">
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

            </form>
<script type="text/javascript">
    //指定图标的配置和数据
    var option = {
        title:{
            text:'ECharts 数据统计'
        },
        tooltip:{},
        legend:{
            data:['用户来源']
        },
        xAxis:{
            data:["审核","未审核"]
        },
        yAxis:{

        },
        series:[{
            name:'访问量',
            type:'bar',
            data:[${con2},${con1}]
        }]
    };
    //初始化echarts实例
    var myChart = echarts.init(document.getElementById('chartmain'));

    //使用制定的配置项和数据显示图表
    myChart.setOption(option);
</script>
            </body>
            </html>




