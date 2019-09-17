<%--
  Created by IntelliJ IDEA.
  User: Mr.Wu
  Date: 2019/9/8
  Time: 9:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>处理ajax</title>
    <script src="${pageContext.request.contextPath}/js/jquery.js">
    </script>
    <script>
        $(function () {
            $('#btn').click(function () {
                $.post('${pageContext.request.contextPath}/ajax/showUser',function (data) {
                    console.log(data);
                })
            })
        })
    </script>
</head>
<body>
    <button id="btn">发送AJAX请求</button>
</body>
</html>
