<%@ page language="java" contentType="text/html; charset=BIG5"
	pageEncoding="BIG5"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title><s:text name="succPage" /></title>
</head>
<body>
	<s:text name="succTips">
		<s:param>${sessionScope.user}</s:param>
	</s:text>
	<br />
	<s:property value="tip" />
	<br /> ${tip}
	<br /> Cookie: ${cookie.user.value}
	<br /> ${requestScope.extra}
</body>
</html>