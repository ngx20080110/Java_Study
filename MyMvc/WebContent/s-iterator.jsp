<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Iterator</title>
</head>
<body>
	<table border="1" style="width:200px">
		<tr>
			<td>Name</td>
			<td>Count</td>
			<td>Index</td>
			<td>First</td>
			<td>Last</td>
			<td>Odd</td>
			<td>Even</td>
		</tr>
		<s:iterator value="{'Java','Struts2','Spring','Hibernate'}" var="name" status="st">
			<tr <s:if test="#st.odd">style="background-color:#bbbbbb"</s:if>>
				<td>
					<s:property value="name" />
				</td>
				<td>
					<s:property value="#st.count" />
				</td>
				<td>
					<s:property value="#st.index" />
				</td>
				<td>
					<s:if test="#st.first">Yes</s:if>
					<s:else>No</s:else>
				</td>
				<td>
					<s:if test="#st.last">Yes</s:if>
					<s:else>No</s:else>
				</td>
				<td>
					<s:if test="#st.odd">Yes</s:if>
					<s:else>No</s:else>
				</td>
				<td>
					<s:if test="#st.even">Yes</s:if>
					<s:else>No</s:else>
				</td>
			</tr>
		</s:iterator>
	</table>
	<br />
	<br />
	<table border="1" style="width:350px">
		<tr>
			<td>Name</td>
			<td>Age</td>
		</tr>
		<s:iterator value="#{'Gordon':4, 'Guan Ying WU':30, 'Kathy':30}" var="person" status="st">
			<tr <s:if test="#st.odd">style="background-color:#bbbbbb"</s:if>>
				<td><s:property value="key" /></td>
				<td><s:property value="value" /></td>
			</tr>
		</s:iterator>
	</table>
	
	<br />
	<br />
	<s:debug />
</body>
</html>