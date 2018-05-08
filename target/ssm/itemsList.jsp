<%--
  Created by IntelliJ IDEA.
  User: OneCallAway
  Date: 18-5-2
  Time: 下午12:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>查询商品列表</title>
</head>
<body>
<from action = "${pageContext.request.contextPath}/item/queryItem.action" method = "post">
    查询条件:
    <table width = "100%" border = "1">
        <tr>
            <td><input type="submit" value="查询"></td>
        </tr>
    </table>
    商品列表:
    <table width = "100%" border = "1">
        <tr>
            <td>商品名称</td>
            <td>商品价格</td>
            <td>生产日期</td>
            <td>商品描述</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${itemsList}" var="item">
        <tr>
            <td>${item.itemsName}</td>
            <td>${item.price}</td>
            <td><fmt:formatDate value="${item.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
            <td>${item.detail}</td>
            <td><a href="${pageContext.request.contextPath}/item/editItem.action?id=${item.id}">修改</a> </td>
        </tr>
        </c:forEach>
    </table>
</from>
</body>
</html>
