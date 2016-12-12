<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Sort</title>
</head>
<body>
	<br />
	Call first action and include in the page. <br />
	<s:action name="tag1" executeResult="true" />
	<hr />
	Call second action and include in the page, but prevent passing parameters into the action. <br />
	<s:action name="tag2" executeResult="true" ignoreContextParams="true" />
	<hr />
	Call third action, but not include in the page. <br />
	<s:action name="tag2" executeResult="false" />
	Page access? <s:property value="author" />
	<br />
	<br />
	<s:debug />
</body>
</html>