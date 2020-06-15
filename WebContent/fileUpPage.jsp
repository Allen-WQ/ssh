<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<s:form action="fileUp" method="post"  enctype="multipart/form-data">
	<s:textfield name="title" label="文件标题"/>
	<s:file name="upload" label="选择文件"/>
	<s:submit value="上传文件"/>
</s:form>
</body>
</html>
