<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.dkcb.service.DichvuLocalServiceUtil"%>
<%@page import="com.dkcb.model.Dichvu"%>
<%@page import="com.dkcb.service.BacsiLocalServiceUtil"%>
<%@page import="com.dkcb.model.impl.BacsiImpl"%>
<%@page import="com.dkcb.model.Bacsi"%>
<%@page import="com.dkcb.Information"%>
<%@page import="com.dkcb.Patient"%>
<%@page import="org.hsqldb.jdbcDriver"%>
<%@page import="com.mysql.jdbc.Connection"%>
<%@page import="com.mysql.jdbc.Statement"%>
<%@page import="com.dkcb.service.LichkhamLocalServiceUtil"%>
<%@page import="com.dkcb.model.Lichkham"%>
<%@page import="com.dkcb.service.PhongkhamLocalServiceUtil"%>
<%@page import="com.dkcb.model.impl.PhongkhamImpl"%>
<%@page import="com.dkcb.model.Phongkham"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.dkcb.service.DKCBLocalServiceUtil"%>
<%@page import="com.liferay.counter.service.CounterLocalServiceUtil"%>
<%@page import="java.util.List"%>
<%@page import="com.dkcb.DKCBPortlet"%>
<%@page import="com.dkcb.model.impl.DKCBImpl"%>
<%@page import="com.dkcb.model.DKCB"%>
<%
/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />
<style>
     <%@ include file="/css/main.css"%>
     <%@ include file="/js/main.js"%>
     
</style>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui"%>

<%
	DKCBPortlet dp = new DKCBPortlet();
	DKCB ds = new DKCBImpl();
	
	List<DKCB> data = DKCBLocalServiceUtil.getDKCBs(0, 100);
	List<Patient> dataPatient = dp.getPatient();
	List<Information> listInformations = dp.getInformations();
	List<Bacsi> listBacsis = BacsiLocalServiceUtil.getBacsis(0, 100);
	
%>
<%! int i=0; %>
<portlet:renderURL var="DichvuURL" windowState="<%=LiferayWindowState.POP_UP.toString() %>">
<portlet:param name="mvcPath" value="/html/dkcb/Dichvu.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="checkURL" windowState="<%=LiferayWindowState.POP_UP.toString() %>"><
<portlet:param name="mvcPath" value="/html/dkcb/checkPatient.jsp"/>
</portlet:renderURL>
<portlet:defineObjects />

<portlet:actionURL var="addPatientURL" name="addPatient">
<portlet:param name="jspPage" value="view.jsp" />
</portlet:actionURL>
 
<head>
<meta http-equiv="Content-Style-Type" content="text/css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/docroot/css/main.css" />
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
 <script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/jquery-ui.min.js" type="text/javascript"></script>
 <script src="js/main.js"></script>
 <script type="text/javascript"></script>


</head>
<div id="left">
	<h3 style="color: red; text-align: center;">Liên hệ với chúng tôi</h3>
	<br>Quý khách có thể liên hệ với chúng tôi bằng cách điền đầy đủ
	thông tin vào mẫu sau:</br>
	<aui:nav-item label="Nếu bạn đã đăng ký click vào đây" useDialog="true" href="<%=checkURL.toString() %>"></aui:nav-item>
		<%
		List<Phongkham> listPK = PhongkhamLocalServiceUtil.getPhongkhams(0, 100);
	
	
	%>
		<form action="<%=addPatientURL%>" action="Dichvu.jsp"  method="post">
	   
		<table>
			<tr>
				<td colspan="2"><b style="color: red">Mời bạn chọn dịch vụ</b></td>
			</tr>
			<tr>
				<td>Khám</td>
				<td><select id="Phongkham" onchange="getDichvu(this.value)"  name='<portlet:namespace/>TenPK'  >
				
				 <%
                     %>
				       <option value="">Chọn phòng khám</option>
						<%
							for (Phongkham pk : listPK) {
						%>
						<option value="<%=pk.getTenPK()%>" /><%=pk.getTenPK()%>
						<%
							}
						
						
						%>
						
						
				</select></td>
				
			<tr>
				<td>Ngày khám</td>
				<td><input type="date" name='<portlet:namespace/>Ngaykham'></td>
			</tr>
			<tr>
				<td><b>Khung giờ đến khám</b></td>
				<td><select name='<portlet:namespace/>Giodukien' >
						<option value="Từ 7h30 đến 8h30" />Từ 7h30 đến 8h30
						<option value="Từ 8h30 đến 9h30" />Từ 8h30 đến 9h30
						<option value="Từ 9h30 đến 10h30" />Từ 9h30 đến 10h30
						<option value="Từ 10h30 đến 11h30" />Từ 10h30 đến 11h30
						<option value="Từ 11h30 đến 12h30" />Từ 11h30 đến 12h30
						<option value="Từ 2h30 đến 3h30" />Từ 2h30 đến 3h30
						<option value="Từ 3h30 đến 4h30" />Từ 3h30 đến 4h30
						<option value="Từ 4h30 đến 5h30" />Từ 4h30 đến 5h30
				</select>
			</tr>
		</table>
		<div id="dichvu">
			
		</div>
		<table id="tablePatient">
			<tr>
				<td colspan="2"><b style="color: red;">Mời bạn nhập thông
						tin cá nhân</b></td>
			</tr>
			<tr>
				<td>Họ và tên(*)</td>
				<td><input type="text" name='<portlet:namespace/>Hoten'
					required="required"></td>
			</tr>
			<tr>
				<td>Giới tính(*)</td>
				<td><input type="radio" name='<portlet:namespace/>Gioitinh'
					value="true" <%=ds.getGioitinh() == true ? "checked" : ""%>>Nam</td>
				<td><input type="radio" name='<portlet:namespace/>Gioitinh'
					value="false" <%=ds.getGioitinh() == false ? "checked" : ""%>>Nữ</td>
			</tr>
			<tr>
				<td>Địa chỉ(*)</td>
				<td><input name='<portlet:namespace/>Diachi' type="text"
					required="required"></td>
			</tr>
			<tr>
				<td>Số điện thoại(*)</td>
				<td><input name='<portlet:namespace/>Sodienthoai' type="text"
					required="required"></td>
			</tr>
			<tr>
				<td>Ngày sinh(*)</td>
				<td><input type="date" name='<portlet:namespace/>Ngaysinh'
					required="" /></td>
			</tr>
			<tr>
				<td>Triệu chứng(*)</td>
				<td><textarea style="border-radius: 5px" rows="4" cols="200"
						name='<portlet:namespace/>Trieuchung' required="required"></textarea>
			</tr>
		</table>

		<table id="tableBacsi">
			<tr>
				<td colspan="1"><b style="color: red;">Lựa chọn bác sĩ</b></td>
				<td><a href="">Bảng giá dịch vụ khám</a></td>
			</tr>
			<tr>
				<td><input type="radio" id="chonbacsiBtn" />Chọn bác sĩ của bạn</td>
			</tr>
			<tr id="danhsachbacsi">
				<td><select name='<portlet:namespace/>TenBS'>
						<%
							for (Bacsi bs : listBacsis) {
						%>
						<option value="<%=bs.getTenBS()%>"><%=bs.getTenBS()%></option>
						<%
							}
						%>
				</select>
			</tr>
				<td><input id="okBtn" value="Đăng ký" type="submit" onclick="<%%>" /></td>
			</tr>
		</table>
		
	</form>
</div>


<div id="right">

	<div id="thongtinbenhnhan">
		<%
			if (dataPatient.size() > 0) {
		%>
		<h4 style="color: red; text-align: center;">Thông tin bệnh nhân</h4>
		<table border-collapse: collapse;" id="tableBenhnhan">
			<tr>
				<td>Họ tên</td>
				<td><%=dataPatient.get(i).hoten%></td>
			</tr>
			<tr>
				<td>Giới tính</td>
				<%
					if (dataPatient.get(i).gioitinh) {
				%>
				<td>Nam</td>
				<%
					} else {
				%>
				<td>Nữ</td>
				<%
					}
				%>
			</tr>
			<tr>
				<td>Ngày sinh</td>
				<td><%=dataPatient.get(i).ngaysinh%></td>
			</tr>
			<tr>
			<td>Địa chỉ</td>
			<td><%=dataPatient.get(i).diachi %></td>
			</tr	>
			<tr>
				<td>Điện thoại</td>
				<td><%=dataPatient.get(i).sodienthoai%></td>
			</tr>
		</table>
	</div>
	<%
		}
	%>


	<div id="thongtinlichkham">
		<h4 style="color: red; text-align: center; margin-top: 10px;">Thông
			tin lịch đặt khám</h4>
		<%
			if (listInformations.size() > 0) {
		%>
		<table border-collapse: collapse;" id="tableLichkham">
			<tr>
				<td>Phòng</td>
				<td><%=listInformations.get(i).phong%></td>
			</tr>
			<tr>
				<td>Giờ dự kiến</td>
				<td><%=listInformations.get(i).giokham%></td>
			</tr>
			<tr>
				<td>Bác sĩ</td>
				<td><%=listInformations.get(i).tenbacsi%></td>
			</tr>
			<tr>
				<td>Ngày khám</td>
				<td><%=listInformations.get(i).ngaykham%></td>
			</tr>
			<tr>
				<td>STT dự kiến</td>
				<td><%=listInformations.get(i).stt %></td>
			</tr>
		</table>
		
	</div>
	<div id="canhbao">
	<b>Chú ý:</b><p>Yêu cầu Quý khách đến đúng giờ dự kiến,nếu không đến đúng giờ trên Quý khách phải chịu sự sắp xếp của nhân viên phòng khám</p>
	
	</div>
	<%double tong;
	double dv=listInformations.get(i).mucthu;
	%>
	<div id="banggia">
	<h4 style="color: red; text-align: center;">DỊCH VỤ ĐĂNG KÝ</h4>
	<table id="tableBanggia">
	<tr style="background-color:#47cbae;">
	<td><b>STT</b></td>
	<td><b>Nội dung</b></td>
	<td><b>Số tiền(VNĐ)</b></td>
	</tr>
	<tr>
	<td>1</td>
	<td><%=listInformations.get(i).tendinhvu %></td>
	<td><%=listInformations.get(i).mucthu %>
	</tr>
	<tr>
	<td>2</td>
	<td>Phí đặt lịch khám</td>
	<td>20.000</td>
	</tr>
	<tr>
	<td>3</td>
	<td>Phí cấp thẻ khám</td>
	<td>10.000</td>
	</tr>
	<tr>
	<td></td>
	<td><b>Tổng tiền</b></td>
	<td><b style="color: red;"><%=tong=10000+20000+dv%></b></td>
	</tr>
	</table>
	
	</div>
	<%} %>
</div>



<script type="text/javascript">
function getDichvu(str){
	var xhttp;
	var url="<%=DichvuURL.toString()%>"
    if(window.XMLHttpRequest) { 
    	xhttp=new XMLHttpRequest(); 
    	} else { 
    		xhttp=new ActiveXObject("Microsoft.XMLHTTP"); 
    	} 
	    xhttp.onreadystatechange= function(){
		if(this.readyState== 4 && this.status== 200){
			document.getElementById("dichvu").innerHTML=xhttp.responseText;
		}	
	};
	xhttp.open("GET",url,true); 
	xhttp.send(); 
	};
</script>


<script type="text/javascript">
$(document).ready(function(){
	$("#danhsachbacsi").hide();
    $("#chonbacsiBtn").click(function(){
    	$("#danhsachbacsi").toggle();
    });
	});
</script>












