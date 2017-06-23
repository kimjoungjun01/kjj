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
<%@page import="java.util.HashMap"%>
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
<h1>EL - List에서 값 꺼내기</h1>
<% 
HashMap<String,String> map = new HashMap<>();
map.put("s01", "홍길동");
map.put("s02","임꺽정");
map.put("s03","유관순");
map.put("s04","안중근");
map.put("s05","윤봉길");
pageContext.setAttribute("map", map); 
%>
\${map.s02]}: ${map.s02}<br>
\${map['s03']}: ${map['s03']}<br>
\${map['s04']}: ${map['s04']}<br>
\${map[s05]}: ${map[s05]}<br>
</body>
</html>




