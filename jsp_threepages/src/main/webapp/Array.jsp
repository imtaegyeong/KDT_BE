<%--
  Created by IntelliJ IDEA.
  User: YTG
  Date: 2023-02-28
  Time: 오후 2:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String[] menus = (String[])request.getAttribute("menu");
    %>
  <h1>메뉴 리스트</h1>
    <% for(String menu : menus) { %>
        <h3><%=menu%></h3>
    <% } %>
  </body>
</html>
