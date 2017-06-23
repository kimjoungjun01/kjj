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
<h1>EL - 객체에서 값 꺼내기</h1>
<% 
Member member = new Member();
member.setName("홍기르동");
member.setAge(20);
member.setWorking(true);

pageContext.setAttribute("member", member); 
%>
\${member.name]}: ${member.name}<br>
\${member['name']}: ${member['name']}<br>
</body>
</html>

<%!
public class Member {
  String name2;
  int age;
  boolean working;
  
  public void setName(String name) {this.name2 = name;}
  public void setAge(int age) {this.age = age;}
  public void setWorking(boolean working) {this.working = working;}
  public String getName() {return this.name2;}
  public int getAge() {return this.age;}
  public boolean isWorking() {return this.working;}
}
%>




