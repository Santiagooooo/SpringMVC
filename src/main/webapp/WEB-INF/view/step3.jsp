<%--
  Created by IntelliJ IDEA.
  User: Mr.Wu
  Date: 2019/8/27
  Time: 21:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>register3</title>
</head>
<body>
    <h2>用户注册</h2>
    <form action="${pageContext.request.contextPath}/session/register" method="post">
        邮箱：<input type="text" name="email"> <br>
        地址：<input type="text" name="address"> <br>
        <input type="submit" value="注册">
    </form>
</body>
</html>
