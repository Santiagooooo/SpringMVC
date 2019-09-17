<%--
  Created by IntelliJ IDEA.
  User: Mr.Wu
  Date: 2019/8/15
  Time: 19:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
    <script src="${pageContext.request.contextPath}/js/hello.js"></script>
</head>
<body>
    <h2>用户登录</h2>
    <span style="color:red">${loginError}</span>
    <form action="${pageContext.request.contextPath}/param/test9" method="post">
        用户名：<input type="text" name="username"> <br>
        密码：<input type="password" name="password"> <br>
        <input type="submit" value="登录">
    </form>

    <img src="${pageContext.request.contextPath}/img/123.jpg">
    <img src="${pageContext.request.contextPath}/WEB-INF/img/123.jpg">
    <img src="${pageContext.request.contextPath}/img2/123.jpg">
</body>
</html>
