<%@page import="com.vanban.service.LoaiVBLocalServiceUtil"%>
<%@page import="java.util.List"%>
<%@page import="com.vanban.model.LoaiVB"%>
<%@page import="com.vb.loailist"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   %>
    
    <%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
    
 <%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>loaivanban</title>
<style>
     <%@ include file="/css/main.css"%>
</style>

</head>

<portlet:renderURL var="search" >
	<portlet:param name="mvcPath" value="/html/quanlyvb/search.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="cancer" >
	<portlet:param name="mvcPath" value="/html/quanlyvb/manage.jsp"/>
</portlet:renderURL>

<portlet:actionURL name="editloaivb" var="editloai">
	<portlet:param name="jspPage" value="/html/manage/editLoaivb.jsp"/>
	<portlet:param name="mvcPath" value="/html/manage/editLoaivb.jsp"/>
</portlet:actionURL>





<% 
	List<LoaiVB> loai=LoaiVBLocalServiceUtil.getLoaiVBs(0, 100);
%>

<body>
<%-- <div class="header">
	<ul>
		<li><a href="<%=search %>"> Tìm kiếm </a></li>
	</ul>
</div> --%>
<div>
	<form action="<%= editloai %> " method="post" id="table">
		<table>
			<tr>
				<td>Tên loại</td>
				<td>
					<input name='<portlet:namespace/>tenloai' type="text" />
				</td>
			</tr>
			<tr>
				<td>ghichu</td>
				<td>
					<input type="text" name='<portlet:namespace/>ghichu'>
				</td>
			</tr>
			<tr>
				<td>
					<aui:button type="submit" value="Đăng Nhập"></aui:button>
				</td>
				<td>
					<aui:button type="cancel" value="hủy " onClick="<%= cancer%>"></aui:button>
				</td>	
			</tr>
		</table>
	</form>
</div>

<div class="table_search">
<form action="ediloai">
<table class="dsvb">
	<tr class="boder">
		<th style = "width:28px">STT</th>
		<th style = "width:100px">Mã loại</th>
		<th style = "width:200px">Tên loại </th>
		<th style = "width:300px">Chú thích</th>
		<th style = "width:70px"></th>
	</tr>
	
	<%
	int i=0;
	for(LoaiVB lv: loai  )
	{
	%>
	<tr class="tdborder">
		<td><%=i+1 %> </td>
		<td><%=lv.getLoaiId() %></td>
		<td><%=lv.getTenloai() %></td>
		<td><%=lv.getGhichu() %></td>
		<td>
			<input type="button" name="edit" value="edit" onclick="">
		</td>
	</tr>
	<%} %>
</table>
</form>
</div>

</body>
</html>