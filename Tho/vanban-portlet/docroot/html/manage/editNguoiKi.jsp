<%@page import="com.vanban.model.impl.nguoikiImpl"%>
<%@page import="com.vanban.model.nguoiki"%>
<%@page import="com.vanban.model.impl.vanbanImpl"%>
<%@page import="com.vanban.model.vanban"%>
<%@page import="com.vb.Vanba"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   %>
    
    <%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
    
 <%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>nguoiki</title>
<style>
     <%@ include file="/css/main.css"%>
</style>
</head>

<portlet:renderURL var="search" >
	<portlet:param name="mvcPath" value="/html/quanlyvb/search.jsp"/>
</portlet:renderURL>

<portlet:actionURL name="editnguoiki" var="ngki">
	<portlet:param name="jspPage" value="html/manage/editNguoiKi.jsp"/>
	<portlet:param name="mvcPath" value="html/manage/editNguoiKi.jsp"/>
</portlet:actionURL>

<portlet:renderURL var="cancel" >
	<portlet:param name="mvcPath" value="/html/quanlyvb/manage.jsp"/>
</portlet:renderURL>
<%
	Vanba vb= new Vanba();
	nguoiki nk = new nguoikiImpl();
%>

<body>
<%-- <div class="header">
	<ul>
		<li><a href="<%=search.toString() %>"> Tìm kiếm </a></li>
	</ul>
</div> --%>
<div>
	<form action="<%= ngki %> " method="post">
		<table>
			<tr>
				<td>Họ tên</td>
				<td>
					<input type="text" name='<portlet:namespace/>hoten'>
				</td>
				<td>Giới tính </td>
					<td><input type="radio" name='<portlet:namespace/>gioitinh'
					value="1" <%=nk.getGioitinh()== 1 ? "checked" : ""%>>Nam</td>
				<td><input type="radio" name='<portlet:namespace/>gioitinh'
					value="0" <%=nk.getGioitinh() == 0 ? "checked" : ""%>>Nữ</td>	
			</tr>
			<tr>
				<td>Ngày sinh </td>
				<td>
					<input type="date" name= '<portlet:namespace/>ngaysinh'>		
				</td>	
				
			</tr>
			<tr>
				<td>Đơn vị </td>
				<td><input type="text" name='<portlet:namespace/>donvi'> </td>
				<td>Chức vụ  </td>
				<td>
					<input type="text" name='<portlet:namespace/>chucvu'>
				</td>		
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
</body>
</html>