<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<body>
<%
    String errorMessage = (String)request.getAttribute("errorMessage");
%>
<h2>Hello World</h2>
<div>
    <p><%=errorMessage%></p>
</div>
</body>
</html>


