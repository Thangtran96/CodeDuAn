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

<portlet:renderURL var="cancel" >
	<portlet:param name="mvcPath" value="/html/quanlyvb/editLoaivb.jsp"/>
</portlet:renderURL>

<portlet:actionURL name="editnoibanhanh" var="editnoiBH">
	<portlet:param name="jspPage" value="/html/manage/editnoibanhanh.jsp"/>
	<portlet:param name="mvcPath" value="/html/manage/editnoibanhanh.jsp"/>
</portlet:actionURL>
<body>
<%-- <div class="header">
	<ul>
		<li><a href="<%=search.toString() %>"> Tìm kiếm </a></li>
	</ul>
</div> --%>
<div>
	<form action="<%=editnoiBH.toString() %>" method="post">
		<table>
			<tr>
				<td>Tên Nơi ban hành</td>
				<td>
					<input name='<portlet:namespace/>tennoibanhanh' type="text"/>
				</td>
			</tr>
			<tr>
				<td>ghichu</td>
				<td>
					<input name='<portlet:namespace/>ghichu' type="text"/>
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