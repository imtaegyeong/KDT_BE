<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<body>
<%
    int num1 = Integer.parseInt(request.getParameter("num1"));
    int num2 = Integer.parseInt(request.getParameter("num2"));
    String op = request.getParameter("add");
%>

<h2>Hello World</h2>
<div>
    <p>out.println(num1)</p>
    <p>out.println(num2)</p>
    <p>out.println(op)</p>
</div>
</body>
</html>


