<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	request : <%=request.getAttribute("test") %><br>
	el : ${test }<br>
	str : ${str[0]},${str[1] },${str[2] }
	<hr>
	<c:forEach var="i" items="${str}">
		<b>${i }</b><br>
	</c:forEach>
	<h3>로그인 페이지 입니다</h3>
	<a href="logout">로그아웃 페이지</a> <a href="index">기본 페이지</a>
</body>
</html>