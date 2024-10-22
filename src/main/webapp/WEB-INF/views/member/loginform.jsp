<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>로그인 페이지</title>
</head>
<body>
    <h2>로그인페이지</h2>
    ${errMsg}
    <form action="/login" method="POST">
        id<input type="text" name="id">
        pw<input type="password" name="pw">
        <button type="submit">로그인하기</button>
    </form>
</body>
</html>