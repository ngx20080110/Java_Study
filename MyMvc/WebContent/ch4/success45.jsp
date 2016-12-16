<%@ page language="java" contentType="text/html; charset=BIG5"
	pageEncoding="BIG5"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>┬р┤лжие\</title>
</head>
<body>
	<s:property value="users" /><br />
	user wugy's name -> <s:property value="users('wugy').name" /><br />
	user wugy's pass -> <s:property value="users('wugy').pass" /><br />
	user gordon's name -> <s:property value="users('gordon').name" /><br />
	user gordon's pass -> <s:property value="users('gordon').pass" /><br />
	birthday: <s:property value="birth" />	
</body>
</html>