<%@page import="entity.Society"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>�쵿��</title>
</head>
<body>
	<a href="index.jsp">��������</a>
	<h3>�쵿��</h3>

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