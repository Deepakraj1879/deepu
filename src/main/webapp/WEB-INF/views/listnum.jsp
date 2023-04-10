<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>number list</h1>

<h1>${message}</h1>
<hr>

<h1>${list}</h1>

<hr>

<c:forEach var="item" items="${list}">
<h2>${item}</h2>
</c:forEach>
</body>
</html>