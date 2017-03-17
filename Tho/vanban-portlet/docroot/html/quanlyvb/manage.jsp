<%@page import="com.vb.vanbanlist"%>
<%@page import="com.vanban.model.impl.vanbanImpl"%>
<%@page import="com.vanban.model.vanban"%>
<%@page import="java.util.List"%>
<%@page import="com.vb.Vanba"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
  %>
  
  <%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
   <%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:renderURL var="search" >
	<portlet:param name="mvcPath" value="/html/quanlyvb/search.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="editvb" >
	<portlet:param name="mvcPath" value="/html/manage/editVB.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="editnguoiki" >
	<portlet:param name="mvcPath" value="/html/manage/editNguoiKi.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="editloaivb" >
	<portlet:param name="mvcPath" value="/html/manage/editLoaivb.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="edituser" >
	<portlet:param name="mvcPath" value="/html/manage/editUser.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="editnoibanhanh" >
	<portlet:param name="mvcPath" value="/html/manage/editnoibanhanh.jsp"/>
</portlet:renderURL>

<% 
	Vanba VB = new Vanba();
	vanban ds= new vanbanImpl();
	List<vanbanlist> datavanban = VB.getvb(0);
	
%>

  <aui:nav cssClass="nav-tabs">
		<aui:nav-item cssClass="demo" href="<%=edituser.toString() %>"
			label="Thiết lập tài khoản" />
		<aui:nav-item cssClass="demo" href="<%= editvb.toString() %>"
			label="Văn Bản" />
		<aui:nav-item cssClass="demo" href="<%= editloaivb.toString() %>"
			label="Loại văn bản" />
		<aui:nav-item cssClass="demo" href="<%= editnguoiki.toString() %>"
			label="Người kí" />
		<aui:nav-item cssClass="demo" href="<%= editnoibanhanh.toString() %>"
			label="Nơi ban hành" />			
	</aui:nav>
	
<aui:form action="" method="get" name="fm">

    <div class="search-form">
		<span class="aui-search-bar">
		    <aui:input inlineField="<%= true %>" label="" name="keywords" size="30" title="search-entries" type="text" />
		    <aui:button type="submit" value="search" />
		</span>
    </div>
</aui:form>


<div class="table_search">
<form action="">
<table class="dsvb">
	<tr class="boder">
		<th style = "width:28px">STT</th>
		<th style = "width:100px">Kí hiệu</th>
		<th style = "width:100px">Trích yếu </th>
		<th style = "width:150px">Ngày ban hành</th>
		<th style = "width:150px">Đơn vị ban hành</th>
		<th style = "width:100px" ></th>
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
		<td><input type="button" value="edit"></td>
	</tr>
	<% i++; } %>
</table>
</form>
</div>



