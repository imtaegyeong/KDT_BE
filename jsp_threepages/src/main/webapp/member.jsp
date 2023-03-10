<%@ page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="Servelet.Member" %>
<%@ page import="java.util.HashMap" %>
<html>
<body>
<%
    ArrayList<Member> al = (ArrayList<Member>)request.getAttribute("al");
    HashMap<Integer, Member> hm = (HashMap<Integer,Member>)request.getAttribute("hm");
%>
<h2>ArrayList</h2>
    <% for(Member member: al) {%>
    <li><%= member.getId()%>  <%=member.getName()%></li>
    <% }%>
<h2>HashMap</h2>
    <% for(int key : hm.keySet()) {%>
    <li><%= hm.get(key).getId()%>  <%=hm.get(key).getName()%></li>
    <% }%>
</body>
</html>


