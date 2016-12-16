<%@ page language="java" contentType="text/html; charset=BIG5"
	pageEncoding="BIG5"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>┬р┤лжие\</title>
</head>
<body>
	<s:iterator value="users" status="st">
		name: <s:property value="name" /> pass:<s:property value="pass" />
		<br />
	</s:iterator>
</body>
</html>