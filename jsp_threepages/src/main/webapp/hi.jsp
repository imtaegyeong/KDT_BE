<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<html>
<head><meta charset="UTF-8"/></head>
<body>
<h2>이름 출력</h2>
<%
    String name = (String)(request.getAttribute("name"));
    System.out.println(name);
%>

<h3><%=name%>님 환영합니다.</h3>
</body>
</html>

