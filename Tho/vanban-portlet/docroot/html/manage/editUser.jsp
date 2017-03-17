<%@page import="com.vanban.model.impl.nguoidungImpl"%>
<%@page import="com.vanban.model.nguoidung"%>
<%@page import="com.vb.Vanba"%>
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

<portlet:actionURL var="editngdung" name="editnguoidung">
	<portlet:param name="jspPage" value="/html/manage/editUser.jsp"/>
	<portlet:param name="mvcPath" value="/html/manage/editUser.jsp"/>
</portlet:actionURL>
<%
	Vanba vb= new Vanba();
	nguoidung nd = new nguoidungImpl();
%>

<body>
<%-- <div class="header">
	<ul>
		<li><a href="<%=search.toString() %>"> Tìm kiếm </a></li>
	</ul>
</div> --%>
<div>
	<form action="editngdung">
		<table>
			<tr>
				<td>Họ tên</td>
				<td>
					<input type="text" name='<portlet:namespace/>hoten'>
				</td>
				<td>Giới tính </td>
					<td><input type="radio" name='<portlet:namespace/>gioitinh'
					value="1" <%=nd.getGioitinh()== 1 ? "checked" : ""%>>Nam</td>
				<td><input type="radio" name='<portlet:namespace/>gioitinh'
					value="0" <%=nd.getGioitinh() == 0 ? "checked" : ""%>>Nữ</td>	
			</tr>
			<tr>
				<td>Ngày sinh </td>
				<td>
					<input type="date" name= '<portlet:namespace/>ngaysinh'>		
				</td>	
				<td>Địa chỉ  </td>
				<td>
					<input type="text" name='<portlet:namespace/>diachi'>
				</td>
			</tr>
			<tr>
				<td>sdt  </td>
				<td>
					<input type="text" name='<portlet:namespace/>sdt'>
				</td>
				<td>Đơn vị </td>
				<td><input type="text" name='<portlet:namespace/>donvi'> </td>		
			</tr>
			<tr>
				<td>Mail </td>
				<td><input type="text" name='<portlet:namespace/>mail'> </td>
				<td>Mật khẩu </td>
				<td><input type="text" name='<portlet:namespace/>matkhau'> </td>
						
			</tr>
			<tr>
				<td>
					<input type="submit" name="savengdung" value="Save">
				</td>
				<td><input type="button" name="cancer" value="Cancer"> </td>
			</tr>

		</table>
	</form>
</div>
</body>
</html>