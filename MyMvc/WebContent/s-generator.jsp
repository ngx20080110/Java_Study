<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Generator</title>
</head>
<body>
	<table border="1" style="width:200px">
		<s:generator separator="," val="'Oracle,SQL Server,DB2'">
			<s:iterator status="st">
				<tr <s:if test="#st.odd">style="background-color:#bbbbbb"</s:if>>
					<td><s:property/></td>
				</tr>
			</s:iterator>
		</s:generator>
	</table>
	<br />
	<s:generator separator="," val="'Oracle,SQL Server,DB2'" var="databases" count="2" />
	<table border="1" style="width:200px">
		<s:iterator value="#databases">
			<tr>
				<td><s:property/></td>
			</tr>
		</s:iterator>
	</table>
	<br />
	${requestScope.databases}
	<br />
	<s:debug />
</body>
</html>