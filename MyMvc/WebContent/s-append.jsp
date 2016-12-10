<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>List Append</title>
</head>
<body>
	<s:append var="newList">
		<s:param value="#{'Oralce', 'SQL Server', 'DB2', 'MySQL'}"></s:param>
		<s:param value="#{'Struts2', 'Hibernate', 'Spring'}"></s:param>
		<s:param value="#{'Gordon':4,'Kathy':30 }" />
	</s:append>
	<table border="1" style="width:200px">
		<s:iterator value="#newList" var="item" status="st">
			<tr <s:if test="#st.odd">style="background-color:#bbbbbb"</s:if>>
				<td>
					<s:property value="key" />
				</td>
				<td>
					<s:property value="value" />
				</td>
				<td>
					<s:property value="#st.count" />
				</td>
			</tr>
		</s:iterator>
	</table>
	
	<br />
	<br />
	<s:debug />
</body>
</html>