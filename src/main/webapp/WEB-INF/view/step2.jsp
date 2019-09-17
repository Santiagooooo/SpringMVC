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
    <title>register2</title>
</head>
<body>
    <h2>用户注册</h2>
    <form action="${pageContext.request.contextPath}/session/step3" method="post">
        年龄：<input type="text" name="age"> <br>
        手机号：<input type="text" name="phone"> <br>
        <input type="submit" value="下一步">
    </form>
</body>
</html>
