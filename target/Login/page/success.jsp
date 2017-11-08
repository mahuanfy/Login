<%@ page import="com.eu.login.entity.Login" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body style="background-color: grey">
<%
    Login login = (Login) request.getSession().getAttribute("user");

%>

<div style="background-color: white;">
    <h1>登录成功</h1>
    用户名：<%= login.getUsername()%>
</div>
</body>
</html>
