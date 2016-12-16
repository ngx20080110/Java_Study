<%@ page language="java" contentType="text/html; charset=BIG5"
	pageEncoding="BIG5"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div style="background-color:#eeeeee;">
<b>JSP自定義模板<br />
請選擇您喜歡的圖書<br /></b>
<s:select list="parameters.list"></s:select>
</div>