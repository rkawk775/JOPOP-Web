<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome JoPoP</title>
<link rel="stylesheet" href="resources/css/search.css">
</head>
<body>
	<%@include file="includes/header.jsp"%>
	<div class="wrapper">
		<div class="wrap">

			<div class="navi_bar_area">
				<h1>navi area</h1>
			</div>
			<div class="content_area">
				<h1>검색결과</h1>
				<div>${list}</div>
				<div>${pageMaker}</div>
			</div>
		</div>

		
		</div>

		
	<%@include file="nav/nav.jsp"%>

	<%@include file="includes/footer.jsp"%>
</body>
</html>