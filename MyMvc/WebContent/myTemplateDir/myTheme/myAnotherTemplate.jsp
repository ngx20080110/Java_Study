<%@ page language="java" contentType="text/html; charset=BIG5"
	pageEncoding="BIG5"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div style="background-color:#bbbbbb;">
JSP�۩w�q�ҪO<br />
�п�ܱz���w���Ϯ�<br />
<select>
	<s:iterator value="%{top.parameters.list}">
		<option><s:property/></option>
	</s:iterator>
</select>
</div>