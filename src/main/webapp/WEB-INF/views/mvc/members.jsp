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
	<h3>members</h3>
		<table border="1">
			<tr>
				<td>이름</td><td>나이</td><td>주소</td>
			</tr>
			<c:forEach var="i" items="${list }">
				<tr>
					<td>${i.name }</td><td>${i.age }</td><td>${i.addr }</td>
				</tr>
			</c:forEach>
		</table>
	
	<a href="/mvc/mvcindex">index</a>
	<a href="/mvc/member">한명 보기</a>
</body>
</html>