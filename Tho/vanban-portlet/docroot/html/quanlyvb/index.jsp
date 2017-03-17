
<%@page import="com.vb.vanbanlist"%>
<%@page import="com.vanban.model.impl.vanbanImpl"%>
<%@page import="com.vb.Vanba"%>
<%@page import="com.vanban.service.vanbanLocalServiceUtil"%>
<%@page import="com.vanban.model.vanban"%>
<%@page import="com.vanban.service.nguoikiLocalServiceUtil"%>
<%@page import="com.vanban.model.nguoiki"%>
<%@page import="com.vanban.service.noiBanHanhLocalServiceUtil"%>
<%@page import="com.vanban.model.noiBanHanh"%>
<%@page import="com.vanban.service.LoaiVBLocalServiceUtil"%>
<%@page import="com.vanban.model.LoaiVB"%>
<%@page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
 <%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
  <%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Văn bản</title>
<link rel="stylesheet"
 href="${pageContext.request.contextPath}/docroot/css/main.css" />
</head>
<style>
     <%@ include file="/css/main.css"%>
</style>
<portlet:renderURL var="login" >
	<portlet:param name="mvcPath" value="/html/quanlyvb/login.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="cancer" >
	<portlet:param name="mvcPath" value="/html/quanlyvb/index.jsp"/>
</portlet:renderURL>


<portlet:actionURL name="search" var="editsearch">
	<portlet:param name="jspPage" value="index.jsp"/>
</portlet:actionURL>
<body>

<% 	List<LoaiVB> loai=LoaiVBLocalServiceUtil.getLoaiVBs(0, 100);
 	List<noiBanHanh> noibh=noiBanHanhLocalServiceUtil.getnoiBanHanhs(0, 100);
 	List<nguoiki> nguoiki=nguoikiLocalServiceUtil.getnguoikis(0, 100);
	List<vanban> vblist=vanbanLocalServiceUtil.getvanbans(0, 100);
	
	Vanba VB = new Vanba();
	vanban ds= new vanbanImpl();
	List<vanbanlist> datavanban = VB.getvb(0);
	List<vanbanlist> searchvanban = VB.getvb(0);
%>

<div class="header">
	<ul>
		<li style="list-style: none;"><a style="color: white;text-decoration: none;" href="<%=login.toString() %>"> Đăng Nhập </a></li>
	</ul>
</div>
<div class="table_search">
<form action="<%=editsearch %>" method="post">
<table>
	<tr>
		<td>Loai văn bản</td>
		<td>
			<select name='<portlet:namespace/>loaivanban' >
			<option value=""> </option>
			<%
			if(loai.size()>0)
			{
			for(LoaiVB lv: loai){
				 %>
				 	
					<option value="<%=lv.getTenloai() %>"><%=lv.getTenloai().toString() %></option>
			<% } }%>
			</select>
		</td>
		<td>Cơ quan ban hành </td>
		<td>
			<select name='<portlet:namespace/>noibanhanh'>
			<option value=""> </option>
				<%
			if(noibh.size()>0)
			{
			for(noiBanHanh nbh: noibh){
				 %>
				 	
					<option value="<%=nbh.getTennoibanhanh() %>"><%=nbh.getTennoibanhanh().toString() %></option>
			<%} }%>
			</select>
		</td>
	</tr>
	<tr>
		<td>Người kí</td>
		<td>
			<select name='<portlet:namespace/>nguoiki'>
			<option value=""> </option>
				<%
			if(nguoiki.size()>0)
			{
			for(nguoiki nk: nguoiki){
				 %>
				 	
					<option value="<%=nk.getHoten() %>"><%=nk.getHoten().toString() %></option>
			<%} }%>
			</select>
		</td>
	</tr>
	<tr>
		<td>Ngày ban hành từ ngày : </td>
		<td>
			<input type="date" name='<portlet:namespace/>ngaybanhanhtu' >
		</td>
		<td>Tới ngày</td>
		<td>
			<input type="date" name='<portlet:namespace/>ngaybanhanhden' >
		</td>
		
	</tr>
	<tr>
		<td>Từ khóa tìm kiếm </td>
		<td>
			<input type="text" name='<portlet:namespace/>tukhoa'>
		</td>
	</tr>
	<tr>
		<td>
			<aui:button type="submit" value="Tìm kiếm"></aui:button>
		</td>
		<td>
			<aui:button type="cancel" value="Bỏ tìm kiếm " onClick="<%= cancer.toString()  %>"></aui:button>
		</td>		
	</tr>
</table>
</form>
</div>


<div class="table_search">
<form action="">
<table class="dsvb">
	<tr class="boder">
		<th style = "width:28px">STT</th>
		<th style = "width:100px">Kí hiệu</th>
		<th>Trích yếu </th>
		<th>Ngày ban hành</th>
		<th>Đơn vị ban hành</th>
		<th>Tệp</th>
	</tr>
	
	<%
	int i=0;
	for(vanbanlist vbl: datavanban)
	{
	%>
	<tr class="tdborder">
		<td><%=i+1 %> </td>
		<td><%=vbl.kihieu %></td>
		<td><%=vbl.trichyeu %></td>
		<td><%=vbl.ngaybanhanh %></td>
		<td><%=vbl.tennoiBH%></td>
	</tr>
	<% i++; } %>
</table>
</form>
</div>


</body>
</html>