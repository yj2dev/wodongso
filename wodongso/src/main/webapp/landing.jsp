<%@page import="entity.Society"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>우동소</title>
</head>
<body>
	<a href="index.jsp">메인으로</a>
	<h3>우동소</h3>

	<% 
		List<Society> societyList = (List<Society>) request.getAttribute("societyList");
		for(Society v: societyList){
			pageContext.setAttribute("v", v);
	%>
		<div>${v.number}</div>
		<div>${v.name}</div>
		<div>${v.position}</div>
	<% } %>
</body>
</html>