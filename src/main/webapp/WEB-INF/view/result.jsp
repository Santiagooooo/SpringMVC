<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Mr.Wu
  Date: 2019/8/26
  Time: 20:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>result</title>
</head>
<body>
    name:${requestScope.name} <br>
    age:${age} <br>
    sex:${sex} <br>
    address:${address} <br>

    位置选择：
    <select>
        <c:forEach items="${types}" var="type">
            <option value="">${type}</0></option>
        </c:forEach>
    </select>
</body>
</html>
