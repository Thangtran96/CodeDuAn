package com.vb;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.taglib.util.OutputTag;
import com.liferay.util.bridges.mvc.MVCPortlet;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.apache.taglibs.standard.tag.rt.core.OutTag;

public class login extends MVCPortlet {
	
/*	public java.sql.PreparedStatement getPreparedStatement(String sql) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		 String url="jdbc:mysql://localhost:3306/lportal";
		 String user="root";
		 String pass="123456";
		 java.sql.Connection con;
		 con=DriverManager.getConnection(url, user, pass);
		 return con.prepareStatement(sql);

	}*/
	
	public void getlogin(ActionRequest request, ActionResponse response) throws ClassNotFoundException, SQLException {
		String taikhoan="";
		String password="";	
		taikhoan = ParamUtil.getString(request, "mail");
		password = ParamUtil.getString(request, "matkhau");
		
		/*if(kiemtraLogin(taikhoan, password)!="")
		{
			String url="http://localhost:8080/web/guest/managertext?p_p_id=vanban_WAR_vanbanportlet&p_p_lifecycle=0&p_p_state=normal&p_p_mode=view&p_p_col_id=column-2&p_p_col_count=1&_vanban_WAR_vanbanportlet_mvcPath=%2Fhtml%2Fquanlyvb%2Fmanage.jsp";
			response.setRenderParameter("jspPage","/html/manage/editVB.jsp");
		}
		else{
		}*/

	}
	
	/*public String kiemtraLogin(String taikhoan , String password) throws ClassNotFoundException, SQLException {
		boolean kt= false;;
		String userId="";
		String sql="select userId from vanban_nguoidung where mail='"+taikhoan +"' and matkhau='"+ password + "'";
		java.sql.PreparedStatement stm=getPreparedStatement(sql);
		ResultSet rs=stm.executeQuery();
		while(rs.next()){
				userId=rs.getString("userId");
			}		
		
		return userId;
		
	}*/
	
}
