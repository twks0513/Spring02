<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>member</h3>
	이름 : ${member.name }<br>
	주소 : ${member.addr }<br>
	나이 : ${member.age }<br>
	
	<a href="/mvc/mvcindex">index</a>
	<a href="/mvc/members">모든 회원 보기</a>
</body>
</html>