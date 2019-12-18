<%--
  Created by IntelliJ IDEA.
  User: JT.L
  Date: 2019/12/17
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>查询所有的账户</h3>
<c:forEach items="${list}" var="account">
    姓名：${account.name}
    金钱：${account.money}<br>
</c:forEach>
</body>
</html>
