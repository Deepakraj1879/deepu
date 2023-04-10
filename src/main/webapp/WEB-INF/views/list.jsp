<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>list names</h1>
<%
List<String> list=(List<String>)request.getAttribute("list");

%>

<h1>name list
<%=list%>
</h1>

</body>
</html>