<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>If elseif else</title>
</head>
<body>
<s:set var="age" value="29" />
<s:if test="#age > 60">
老年人
</s:if>
<s:elseif test="#age > 35">
中年人
</s:elseif>
<s:elseif test="#age > 15">
青年人
</s:elseif>
<s:else>
少年
</s:else>

</body>
</html>