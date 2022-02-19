<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>书籍列表</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <!-- 引入 Bootstrap -->
  <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container">
  <div class="row clearfix">
    <div class="col-md-12 column">
      <div class="page-header">
        <h1>
          <small>查询书籍</small>
        </h1>
      </div>
    </div>
  </div>
</div>
</body>
  <form action="${pageContext.request.contextPath}/book/oneBook" method="post">
    书籍id：<input type="text" name="bookID" value="${book.getBookID()}"/>
    <input type="submit" value="提交"/>
  </form>
      </table>
    </div>
  </div>
</div>
</html>