<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file="../includes/header.jsp"%>
	<div class="mynav">
		<ul class="list">
			<li><a href="/member/mypage">내 정보</a></li>
			<li><a href="/cart/cart/${member.mId}">관심 팝업</a></li>
			<li><a href="/cart/orderItem">사전예약</a></li>
		</ul>
	</div>
	<%@include file="../nav/nav.jsp"%>

	<%@include file="../includes/footer.jsp"%>
</body>
</html>