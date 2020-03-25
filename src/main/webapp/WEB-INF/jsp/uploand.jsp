<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="uploadzip.action" method="POST" enctype="multipart/form-data">
	<a>---------双传文件------------</a>
	<input type="file" name="file">
	<input type="submit" value="提交"/>
</form>
</body>
</html>