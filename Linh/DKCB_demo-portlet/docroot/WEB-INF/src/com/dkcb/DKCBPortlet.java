package com.dkcb;

import com.dkcb.model.Bacsi;
import com.dkcb.model.DKCB;
import com.dkcb.model.Dichvu;
import com.dkcb.model.Lichkham;
import com.dkcb.model.Phongkham;
import com.dkcb.model.impl.BacsiImpl;
import com.dkcb.model.impl.DKCBImpl;
import com.dkcb.model.impl.DichvuImpl;
import com.dkcb.model.impl.LichkhamImpl;
import com.dkcb.model.impl.PhongkhamImpl;
import com.dkcb.service.DKCBLocalServiceUtil;
import com.dkcb.service.DichvuLocalServiceUtil;
import com.dkcb.service.LichkhamLocalService;
import com.dkcb.service.LichkhamLocalServiceUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.apache.catalina.connector.Request;
//import org.apache.tomcat.dbcp.dbcp.DriverConnectionFactory;
//import org.apache.tools.ant.taskdefs.Sleep;

/**
 * Portlet implementation class DKCBPortlet
 */
public class DKCBPortlet extends MVCPortlet {

	private static String phongkham="";
	private static String Idphongkham="";
	private static int id;
	public void addPatient(ActionRequest actionRequest,ActionResponse actionResponse) throws SystemException, ClassNotFoundException, SQLException, InterruptedException {
		DKCB dk=new DKCBImpl();
		Long Id=CounterLocalServiceUtil.increment(DKCB.class.getName());
		DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		String hoten=ParamUtil.getString(actionRequest, "Hoten");
		Date ngaysinh=ParamUtil.getDate(actionRequest, "Ngaysinh", dateFormat);
		/*String ngaysinhString=ParamUtil.getString(actionRequest, "Ngaysinh");*/
		Boolean gioitinh=ParamUtil.getBoolean(actionRequest, "Gioitinh");
		String sodienthoai=ParamUtil.getString(actionRequest, "Sodienthoai");
		String diachi=ParamUtil.getString(actionRequest, "Diachi");
		String trieuchung=ParamUtil.getString(actionRequest, "Trieuchung");
		phongkham=ParamUtil.getString(actionRequest, "TenPK");
		Idphongkham=checkPK(phongkham);
		String tenbacsi=ParamUtil.getString(actionRequest, "TenBS");
		String idbacsi=checkidBacsi(tenbacsi);
		String tendichvu=ParamUtil.getString(actionRequest, "Tendichvu");
		Long iddichvu=checkidDichvu(tendichvu);
		Date ngaykham=ParamUtil.getDate(actionRequest, "Ngaykham", dateFormat);
		String giodukien=ParamUtil.getString(actionRequest, "Giodukien");
		Lichkham lk=new LichkhamImpl();
        if(hoten==""|| ngaysinh==null|| gioitinh==null){
		
		}else{
			dk.setHoten(hoten);
			dk.setId(Id);
			dk.setGioitinh(gioitinh);
			dk.setNgaysinh(ngaysinh);
			dk.setSodienthoai(sodienthoai);
			dk.setDiachi(diachi);
			dk.setTrieuchung(trieuchung);
			DKCBLocalServiceUtil.addDKCB(dk);
			lk.setNgaykham(ngaykham);
			lk.setGiodukien(giodukien);
			lk.setId(checkidPatient(hoten));
			lk.setIdphongkham(Idphongkham);
			lk.setIdbacsi(idbacsi);
			lk.setIddichvu(iddichvu);
		}
		try {
		LichkhamLocalServiceUtil.addLichkham(lk);
		
		}catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	 
	
	
	private java.sql.PreparedStatement getPreparedStatement(String sql) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/lportal";
		String user="lportal";
		String pass="kinhmat*2";
		java.sql.Connection con;
		con=DriverManager.getConnection(url, user, pass);
		return con.prepareStatement(sql);
	}
	
	public List<String> getBacsi() throws ClassNotFoundException, SQLException {
		List<String> data=new ArrayList<String>();
		String sql="select *from u_bacsi where u_bacsi.Idphongkham=N'"+checkPK(phongkham)+"'";
		PreparedStatement stm=getPreparedStatement(sql);
		ResultSet rs=stm.executeQuery();
		while(rs.next()){
			String tenbacsi=rs.getString("TenBS");
			data.add(tenbacsi);
		}
		return data;
	}

	
	
	
	public List<Patient> getPatient() throws ClassNotFoundException, SQLException {
		List<Patient> data=new ArrayList<Patient>();
		String sql="select * from u_dkcb inner join u_lichkham on u_lichkham.Id=u_dkcb.Id order by u_dkcb.id DESC ";
		java.sql.PreparedStatement stm=getPreparedStatement(sql);
		ResultSet rs=stm.executeQuery();
		while(rs.next()){
			Patient pt=new Patient();
			pt.hoten=rs.getString("Hoten");
			if(rs.getBoolean("Gioitinh")){
				pt.gioitinh=true;
			}else{
				pt.gioitinh=false;
			}
			pt.ngaysinh=rs.getDate("Ngaysinh");
			pt.diachi=rs.getString("Diachi");
			pt.sodienthoai=rs.getString("Sodienthoai");
			data.add(pt);
		}
		return data;
	}
	
	
	public List<Information> getInformations() throws ClassNotFoundException, SQLException {
List<Information> data=new ArrayList<Information>();
String sql="select *from thongtindatkham order by Idlichkham DESC";
java.sql.PreparedStatement stm=getPreparedStatement(sql);
ResultSet rs=stm.executeQuery();
while(rs.next()){
	Information in=new Information();
	in.phong=rs.getString("TenPK");
	in.tenbacsi=rs.getString("TenBS");
	in.giokham=rs.getString("Giodukien");
	in.ngaykham=rs.getDate("Ngaykham");
	in.stt=rs.getString("Idlichkham");
	in.mucthu=rs.getDouble("Mucthu");
	in.tendinhvu=rs.getString("Tendichvu");
	data.add(in);
}
	return data;	
}

	private String checkPK(String tenpk) throws ClassNotFoundException, SQLException{
		String idPK="";
		String sql="select u_phongkham.Idphongkham from u_phongkham where u_phongkham.TenPK=N'"+tenpk+"'";
		java.sql.PreparedStatement stm=getPreparedStatement(sql);
		ResultSet rs=stm.executeQuery();
		while(rs.next()){
			idPK=rs.getString("Idphongkham");
			}
		return idPK;
		
		
	}
	private Long checkidPatient(String ten) throws SQLException, ClassNotFoundException {
		Long idPatient=null;
		String sql="select u_dkcb.Id from u_dkcb where u_dkcb.Hoten=N'"+ten+"'";
		java.sql.PreparedStatement stm=getPreparedStatement(sql);
		ResultSet rs=stm.executeQuery();
		while(rs.next()){
			idPatient=rs.getLong("Id");
			}
		return idPatient;
	}
	private String checkidBacsi(String ten) throws ClassNotFoundException, SQLException {
		String idbacsi="";
		String sql="select u_bacsi.Idbacsi from u_bacsi where u_bacsi.TenBS=N'"+ten+"'";
		PreparedStatement stm=getPreparedStatement(sql);
		ResultSet rs=stm.executeQuery();
		while(rs.next()){
			idbacsi=rs.getString("Idbacsi");
		}
		return idbacsi;
	}
	private Long checkidDichvu(String ten) throws ClassNotFoundException, SQLException {
		Long id=null;
		String sql="select u_dichvu.Iddichvu from u_dichvu where u_dichvu.Tendichvu=N'"+ten+"'";
		java.sql.PreparedStatement stm=getPreparedStatement(sql);
		ResultSet rs=stm.executeQuery();
		while(rs.next()){
			id=rs.getLong("Iddichvu");
			}
		return id;
	}

	public List<com.dkcb.Dichvu> getdichvu() throws ClassNotFoundException, SQLException {
		List<com.dkcb.Dichvu> data=new ArrayList<com.dkcb.Dichvu>();
		String sql="select *from u_dichvu";
		PreparedStatement stm=getPreparedStatement(sql);
		ResultSet rs=stm.executeQuery();
		while(rs.next()){
			com.dkcb.Dichvu dv=new com.dkcb.Dichvu();
			dv.tendichvu=rs.getString("Tendichvu");
			dv.mucthu=rs.getDouble("Mucthu");
			dv.ghichu=rs.getString("Ghichi");
			data.add(dv);
			
	}
		return data;
	}
	
/*public void getdichvu(ActionRequest actionRequest,ActionResponse actionResponse) throws ClassNotFoundException, SQLException, SystemException {
	String tenpk=checkPK(actionRequest,"TenPK");
	String sql="select *from u_dichvu where u_dichvu.Idphongkham=N'"+tenpk+"'";
	PreparedStatement stm=getPreparedStatement(sql);
	ResultSet rs=stm.executeQuery();
	while(rs.next()){
		Dichvu dv=new DichvuImpl();
		dv.setTendichvu(rs.getString("Tendichvu"));
		dv.setMucthu(rs.getDouble("Mucthu"));
		dv.setGhichi(rs.getString("Ghichu"));
		DichvuLocalServiceUtil.addDichvu(dv);
	
}
}*/
}

