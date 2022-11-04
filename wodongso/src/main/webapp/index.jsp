<%@page import="entity.Society"%>
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
  <a href="login.jsp">로그인</a>
  <a href="register.jsp">회원가입</a>
  <a href="findPassword.do">비밀번호 찾기</a>
  <a href="societyAll.do">전체 콘텐츠 조회</a>
	  
  <% 
  		List<Society> societyList;
  		if(request.getAttribute("societyList") != null){
			societyList = (List<Society>) request.getAttribute("societyList") ;
  		} else {
			societyList = null;  		
  		}
  		
  		if(societyList != null) {
			for(Society v: societyList){
				pageContext.setAttribute("v", v);
	  		}
	%>
				<div>${v.number}</div>
				<div>${v.name}</div>
				<div>${v.position}</div>
	<% } %>
</body>
</html>