<%@page import="javax.portlet.RenderRequest"%>
<%@page import="com.liferay.portal.model.PortletPreferences"%>
<%@page import="javax.portlet.ActionResponse"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="javax.portlet.PortletRequest"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.dkcb.Dichvu"%>
<%@page import="com.dkcb.model.impl.DichvuImpl"%>
<%@page import="com.dkcb.service.DichvuLocalServiceUtil"%>
<%@page import="com.dkcb.DKCBPortlet"%>
<%@page import="java.util.List"%>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<portlet:defineObjects />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<portlet:actionURL var="addPatientURL" name="addPatient">
	<portlet:param name="jspPage" value="Dichvu.jsp" />
</portlet:actionURL>

<meta http-equiv="Content-Style-Type" content="text/css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/docroot/css/main.css" />
	
</head>

<form action="<%=addPatientURL%>">

<%                                
                DKCBPortlet dp=new DKCBPortlet();
				List<Dichvu> dataDichvu = dp.getdichvu();
				if (dataDichvu.size() > 0) {
			%>
			 <table id="tableDichvu">
				<tr style="background-color: #47cbae; text-align: center; " >
					<td><b>Chọn</b></td>
					<td><b>Dịch vụ</b></td>
					<td><b>Mức thu</b></td>
					<td><b>Ghi chú</b></td>
				</tr>
				<%
					for (Dichvu dv : dataDichvu) {
				%>
				<tr>
					<td><input type="checkbox" value="<%=dv.tendichvu %>" name='<portlet:namespace/>Tendichvu' ></td>
					<td><%=dv.tendichvu%></td>
					<td><%=dv.mucthu%></td>
					<%if(dv.ghichu==null){%>
					<td></td>
					<%}else{ %>
					<td><%=dv.ghichu %></td>
				</tr>
				
				<%}}%>
				<%} %>
				
			</table>
			
</form>
</body>
</html>