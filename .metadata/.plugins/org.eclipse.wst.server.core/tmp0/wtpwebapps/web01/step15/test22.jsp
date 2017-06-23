<%-- JSP 구성 요소 : 지시어 엘리먼트 - taglib
1) 템플릿 데이터
2) 스크립트릿(scriptlet) 엘리먼트
3) 지시(directive) 엘리먼트
   - <%@ page %> 
   - <%@ include %>
   - <%@ taglib %>
     JSP에서 기본으로 제공하지 않는, 외부에서 제공하는 태그를 사용할 때 선언한다. 
     prefix 속성:
       외부 태그를 사용할 때 태그명 앞에 붙이는 접두어.
       즉 태그 라이브러리의 별명.
     url 속성:
       외부 태그의 라이브러리 이름.
       자바의 패키지 명과는 다르게 URL 주소 형태로 되어 있다.
       개발자가 직접 만든 태그나 외부에서 만든 태그를 사용하려면
       /WEB-INF/classes 또는 /WEB-INF/lib 에 태그를 처리하는 라이브러리를 두어야 한다. 
       
4) 표현식(expression) 엘리먼트
5) 선언문(declaration) 엘리먼트
6) JSP 액션 태그
7) JSP 확장 태그(JSTL)
8) EL(Expression Language)
9) JSP 주석
 --%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>JSTL</title>
</head>
<body>
<h1>JSTL 개요 c:forEach 사용법</h1>
<%
pageContext.setAttribute("names", new String[]{"홍길동","임꺽정","유관순"});

ArrayList<String> names2 = new ArrayList<>();
names2.add("홍길동2");
names2.add("임꺽정2");
names2.add("유관순2");

pageContext.setAttribute("names2", names2);

pageContext.setAttribute("names3", "홍길동3,임꺽정3,유관순3");
%>


<c:forEach var="name" items="${pageScope.names}">
${name}<br>
</c:forEach>
<hr>
<c:forEach var="name" items="${pageScope.names2}">
${name}<br>
</c:forEach>
<hr>
<c:forEach var="name" items="${pageScope.names3}">
${name}<br>
</c:forEach>
<hr>


</body>
</html>

