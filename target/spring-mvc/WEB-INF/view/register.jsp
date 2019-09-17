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
    <title>register</title>
</head>
<body>
    <h2>用户注册</h2>
    <form action="${pageContext.request.contextPath}/user/register" method="post">
        用户名：<input type="text" name="username"> <br>
        密码：<input type="password" name="password"> <br>
        年龄：<input type="text" name="age"> <br>
        手机号：<input type="text" name="phone"> <br>
        邮箱：<input type="text" name="email"> <br>
        地址：<input type="text" name="address"> <br>
        <input type="submit" value="注册">
    </form>
</body>
</html>
