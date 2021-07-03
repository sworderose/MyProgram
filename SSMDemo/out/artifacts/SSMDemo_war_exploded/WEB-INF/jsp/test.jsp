<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"
          integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">
</head>

<body>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12">
           <div class="page-header" align="center">
               <h1>操作提示</h1>
           </div>
        </div>
    </div>
    <div class="container">
        <div class="row clearfix">
            <div class="col-md-12">
                <div align="center">
                    <a href="${pageContext.request.contextPath}/book/addbook">添加书籍</a>
                </div>
                <div>
                    <form action="${pageContext.request.contextPath}/book/selectbyname" method="post" style="float:right">
                        <input type="text" name="bookName" placeholder="请输入书籍名称">
                        <input type="submit" value="提交">
                    </form>
                </div>
            </div>
        </div>
    </div>
<div class="row clearfix" align="center">
    <div class="col-md-12 column">
        <table class="table-hover table-striped table-condensed table-bordered">
            <thead>
            <tr>
                <th>书籍编号</th>
                <th>书籍名称</th>
                <th>书籍数量</th>
                <th>书籍详情</th>
                <th>操作</th>
            </tr>
            </thead>

            <tbody>
            <c:forEach var="book" items="${msg}">
                <tr>
                    <td>${book.bookID}</td>
                    <td>${book.bookName}</td>
                    <td>${book.bookCounts}</td>
                    <td>${book.detail}</td>
                    <td>
                        <a href="${pageContext.request.contextPath}/book/update?bookID=${book.bookID}">修改</a> |&nbsp;
                        <a href="${pageContext.request.contextPath}/book/delete?bookID=${book.bookID}">删除</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</div>

</body>
</html>
