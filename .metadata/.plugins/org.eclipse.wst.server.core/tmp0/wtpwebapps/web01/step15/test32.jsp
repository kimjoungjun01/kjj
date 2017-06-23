<%-- JSP 구성 요소 : JSTL - c:forEach II
1) 템플릿 데이터
2) 스크립트릿(scriptlet) 엘리먼트
3) 지시(directive) 엘리먼트      
4) 표현식(expression) 엘리먼트
5) 선언문(declaration) 엘리먼트
6) JSP 액션 태그
7) JSP 확장 태그(JSTL)
   c:forEach
   => 조건이 참인 동안 반복한다. 
8) EL(Expression Language)
9) JSP 주석
 --%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>JSTL</title>
</head>
<body>
<h1>EL - 보관소에서 값 꺼내기</h1>
<c:set var="name1" value="홍길동" scope="page"/>
<c:set var="name1" value="임꺽정" scope="request"/>
<c:set var="name1" value="유관순" scope="session"/>
<c:set var="name1" value="윤봉길" scope="application"/>
\${pageScope.name1}: ${pageScope.name1}<br>
\${requestScope.name1}: ${requestScope.name1}<br> 
\${sessionScope.name1}: ${sessionScope.name1} <br>
\${applicationScope.name1}: ${applicationScope.name1}<br>


<hr>

<c:set var="name2" value="홍길동" scope="page"/>
<c:set var="name2" value="임꺽정" scope="request"/>
<c:set var="name2" value="유관순" scope="session"/>
<c:set var="name2" value="윤봉길" scope="application"/>
\${name2}: ${name2}


 

</body>
</html>




