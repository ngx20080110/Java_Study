<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>URL tag</title>
</head>
<body>
	<br />
	<h2>Use s:url to generate a URL address</h2>
	<s:url value="editGadget.action" />
	<hr />
	<s:url action="showBook">
		<s:param name="author">wugy</s:param>
	</s:url>
	<hr />
	<s:url includeParams="get">
		<s:param name="id">%{'22'}</s:param>
	</s:url>
	<hr />
	<s:url includeParams="none">
		<s:param name="id">%{'22'}</s:param>
	</s:url>
	<hr />
	<s:url includeParams="all">
		<s:param name="id">%{'22'}</s:param>
	</s:url>
	<hr />
	<s:url action="showBook" value="xxxx">
		<s:param name="author">wugy</s:param>
	</s:url>
	<br />
	<br />
	<s:debug />
</body>
</html>