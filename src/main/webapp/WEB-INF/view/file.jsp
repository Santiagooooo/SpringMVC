<%--
  Created by IntelliJ IDEA.
  User: Mr.Wu
  Date: 2019/9/10
  Time: 20:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传与下载</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/file/uploads" method="post" enctype="multipart/form-data">
        用户名：<input type="text" name="username"/><br>
        文件1：<input type="file" name="files"/><br>
        文件2：<input type="file" name="files"/><br>
        文件3：<input type="file" name="files"/><br>
        <input type="submit" value="上传"/>
    </form>

    <a href="${pageContext.request.contextPath}/file/download?filename=1.png">下载文件:使用请求参数传递文件名</a><br>
    <a href="${pageContext.request.contextPath}/file/download2/1.png">下载文件:使用rest风格传递文件名</a><br>
    <a href="${pageContext.request.contextPath}/file/download3/filename=1.png">下载文件:使用ResponseEntity</a>
</body>
</html>
