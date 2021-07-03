<%--
  Created by IntelliJ IDEA.
  User: 散久良
  Date: 2021/7/2
  Time: 12:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="row clearfix">
    <div class="col-md-12">
        <div class="page-header" align="center">
            <small>操作提示</small>
        </div>
    </div>
</div>
<div align="center">
<form action="${pageContext.request.contextPath}/book/add" method="post">

    <div class="form-group">
        <label>书籍名称</label>
        <input type="text" name="bookName" class="form-control" required>
    </div>
    <div class="form-group">
        <label>书籍数量</label>
        <input type="text" name="bookCounts" class="form-control" required>
    </div>
    <div class="form-group">
        <label>书籍详情</label>
        <input type="text" name="detail" class="form-control" required>
    </div>
    <div class="form-group">
        <input type="submit" value="提交">
    </div>
</form>
</div>
</body>
</html>
