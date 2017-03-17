
<%@page import="com.vb.vanbanlist"%>
<%@page import="com.vanban.model.impl.vanbanImpl"%>
<%@page import="com.vb.Vanba"%>
<%@page import="com.vb.DocumentUpload" %>
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
<portlet:defineObjects/>
<portlet:renderURL var="login" >
	<portlet:param name="mvcPath" value="/html/quanlyvb/login.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="cancel" >
	<portlet:param name="mvcPath" value="/html/quanlyvb/manage.jsp"/>
</portlet:renderURL>
<portlet:actionURL var="uplaodURL" name="uploadDocument">
	<portlet:param name="jspPage" value="editVB.jsp"/>
</portlet:actionURL>
<portlet:actionURL var="downloadURL" name="downloadFiles"></portlet:actionURL>

<portlet:actionURL name="editvanban" var="editvanban">
	<portlet:param name="jspPage" value="/html/manage/editVB.jsp"/>
	<portlet:param name="mvcPath" value="/html/manage/editVB.jsp"/>
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

<body>
<div class="header">
	
</div>

<div>
	<form action="<%=editvanban %>" method="post" enctype="multipart/form-data">
		<table>
			<tr>
				<td>Loai văn bản</td>
				<td>
					<select name='<portlet:namespace/>loaiId'>
						<%
			if(loai.size()>0)
			{
			for(LoaiVB lv: loai){
				 %>
				 	<option value=""> </option>
					<option value="<%=lv.getLoaiId() %>"><%=lv.getLoaiId() %></option>
			<% } }%>
					</select >
				</td>
				<td>Cơ quan ban hành </td>
				<td>
					<select name='<portlet:namespace/>noiBHId'>
							<%
							if(noibh.size()>0)
							{
							for(noiBanHanh nbh: noibh){
								 %>
								 	<option value=""> </option>
									<option value="<%=nbh.getNoiBHId() %>"><%=nbh.getTennoibanhanh().toString() %></option>
							<%} }%>
					</select>
				</td>
			</tr>
			<tr>
				<td>Người kí</td>
				<td>
					<select name='<portlet:namespace/>nguoikiID'>
							<%
							if(nguoiki.size()>0)
							{
							for(nguoiki nk: nguoiki){
								 %>
								 	<option value=""> </option>
									<option value="<%=nk.getNguoikiID() %>"><%=nk.getHoten().toString() %></option>
							<%} }%>
					</select>
				</td>
				<td>ngaybanhanh </td>
				<td><input type="date" name='<portlet:namespace/>ngaybanhanh' value="dd/mm/yyyy"> </td>
			</tr>
			<tr>
				<td>Kí hiệu </td>
				<td><input type="text" name='<portlet:namespace/>kihieu'> </td>
				<td>Trích yếu </td>
				<td><input type="text" name='<portlet:namespace/>trichyeu' > </td>
			</tr>	
			<tr>
				<td>
				<aui:button type="submit" value="Lưu"></aui:button>
				</td>
				<td>
				<aui:button type="cancel" value="Hủy " onClick="<%= cancel.toString()  %>"></aui:button>
				</td>
			</tr>

		</table>
	</form>
</div>

<%-- <form action="<%=uplaodURL%>" method="post" enctype="multipart/form-data">
<input type="file" name="uploadedFile">
<input type="Submit" name="Submit">
</form>

<a href="<%=downloadURL%>">Download Files</a>
 --%>
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
		<td></td>
	</tr> 
	<%i++; } %>
</table>
</form>
</div>

</body>
</html>












