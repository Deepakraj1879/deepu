<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
String message=(String)request.getAttribute("msg");
Integer num=(Integer)request.getAttribute("number");
%>

<h1>message is <%=message%></h1>

<h1>number is <%=num%></h1>
</body>
</html>