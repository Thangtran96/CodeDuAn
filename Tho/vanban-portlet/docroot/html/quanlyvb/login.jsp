<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<portlet:renderURL var="log">
	<portlet:param name="mvcPath" value="/html/quanlyvb/manage.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="search" >
	<portlet:param name="mvcPath" value="/html/quanlyvb/search.jsp"/>
</portlet:renderURL>

<portlet:actionURL name="getlogin" var="getlogin">
	<portlet:param name="jspPage" value="/html/quanlyvb/login.jsp"/>
</portlet:actionURL>



<body>
	<div id=login>
		<form action="<%=getlogin %>" method="post">
			<table>
				<tr>
					<td>Tài khoản : </td>
					<td><input type="text" name='<portlet:namespace/>mail'></td>
				</tr>
				<tr>
					<td>Mật Khẩu</td>
					<td><input type="password" name='<portlet:namespace/>matkhau'></td>
				</tr>
				
				<tr>
					<td><aui:button type="submit" name="login" value="Đăng nhập" ></aui:button> </td>
					<td><aui:button type="cancel" name="cancel" value="Hủy"></aui:button></td>
					
				</tr>
			</table>
		</form>
	</div>
</body>
</html>