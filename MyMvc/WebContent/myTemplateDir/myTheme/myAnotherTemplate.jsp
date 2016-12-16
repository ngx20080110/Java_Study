<%@ page language="java" contentType="text/html; charset=BIG5"
	pageEncoding="BIG5"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div style="background-color:#bbbbbb;">
JSP自定義模板<br />
請選擇您喜歡的圖書<br />
<select>
	<s:iterator value="%{top.parameters.list}">
		<option><s:property/></option>
	</s:iterator>
</select>
</div>