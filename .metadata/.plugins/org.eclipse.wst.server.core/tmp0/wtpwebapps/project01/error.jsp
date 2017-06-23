<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'>
  <title>오류</title>
<jsp:include page="/corestyle.jsp"></jsp:include>
</head>
<body>
<jsp:include page="/header.jsp"></jsp:include>
<div id='logo'>실행오류!</div>
<pre>
<%
Exception error = (Exception)request.getAttribute("error");
if (error != null) {
  error.printStackTrace(new PrintWriter(out));
}
%>
</pre>

<jsp:include page="/footer.jsp"></jsp:include>
</body>
</html>
