<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<body>
<h2>구구단 출력!</h2>
<%
    int dan = (int)(request.getAttribute("dan"));
    int limit = (int)(request.getAttribute("limit"));
%>

<% for(int i = 1; i < limit+1; i ++) {%>
<li><%= dan%> * <%=i%> =<%= dan * i%> </li>
<% }%>
</body>
</html>

