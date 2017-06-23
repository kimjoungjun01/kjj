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
<h1>JSTL 개요 c:set 사용법2</h1>
<%
pageContext.setAttribute("m", new Member());
%>
<c:set target="${pageScope.m}" property="name" value="홍길동"/>
<c:set target="${pageScope.m}" property="age" value="20"/>
<c:set target="${pageScope.m}" property="working" value="true"/>
<%-- 요거 많이 헷갈리는데
     name2 가아니라 name 인 이유는 c:set의 property 가 setName을 호출하기 때문!! name2를 쓰면 에러,
     또한 ${pageScope.m.name} 이건 getName 을 호출하기 때문에 getName 메소드가 없다면 에러다
 --%>
name:    ${pageScope.m.name}<br>
age:     ${pageScope.m.age}<br>
working: ${pageScope.m.working}<br>
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
