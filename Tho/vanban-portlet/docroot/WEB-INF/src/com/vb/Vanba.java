


package com.vb;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.DateFormatFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.model.DLFolder;
import com.liferay.portlet.documentlibrary.model.DLFolderConstants;
import com.liferay.portlet.documentlibrary.service.DLAppServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.liferay.util.portlet.PortletProps;
import com.mysql.jdbc.PreparedStatement;
import com.vanban.model.LoaiVB;
import com.vanban.model.nguoidung;
import com.vanban.model.nguoiki;
import com.vanban.model.noiBanHanh;
import com.vanban.model.vanban;
import com.vanban.model.impl.LoaiVBImpl;
import com.vanban.model.impl.nguoidungImpl;
import com.vanban.model.impl.nguoikiImpl;
import com.vanban.model.impl.noiBanHanhImpl;
import com.vanban.model.impl.vanbanImpl;
import com.vanban.service.LoaiVBLocalServiceUtil;
import com.vanban.service.nguoidungLocalServiceUtil;
import com.vanban.service.nguoikiLocalServiceUtil;
import com.vanban.service.noiBanHanhLocalServiceUtil;
import com.vanban.service.vanbanLocalServiceUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Id;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.swing.JOptionPane;

import org.apache.naming.java.javaURLContextFactory;

/**
 * Portlet implementation class Vanba
 */
public class Vanba extends MVCPortlet {
 
	//edit cac bang
	DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	
	public void editvanban(ActionRequest request, ActionResponse response) throws PortalException, SystemException, IOException, PortletException {
		long vanbanID=1;
		try {
			vanbanID=CounterLocalServiceUtil.increment(Vanba.class.getName());
		} catch (SystemException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String kihieu="";
		String trichyeu="";
		Date ngaybanhanh;
		long nguoikiId;
		long userId;
		long loaiId;
		long noiBHId;
		boolean tinhtrang =true;
		
		
		kihieu = ParamUtil.getString(request, "kihieu");
		trichyeu = ParamUtil.getString(request, "trichyeu");
		ngaybanhanh = ParamUtil.getDate(request, "ngaybanhanh", dateFormat);
		nguoikiId = ParamUtil.getLong(request, "nguoikiID");
		
		loaiId=ParamUtil.getLong(request, "loaiId");
		noiBHId = ParamUtil.getLong(request, "noiBHId");
		
		vanban vb = new vanbanImpl();
		vb.setVanbanId(vanbanID);
		vb.setLoaiID(loaiId);
		vb.setKihieu(kihieu);
		vb.setTrichyeu(trichyeu);
		vb.setNgaybanhanh(ngaybanhanh);
		vb.setNgaytao(new Date());
		vb.setNguoikiID(nguoikiId);
		vb.setUserID(1);
		vb.setNoiBHID(noiBHId);
		vb.setTinhtrang(tinhtrang);
		
		try {
			vanbanLocalServiceUtil.addvanban(vb);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//uploadDocument(request, response);
	}
	
	public void editloaivb(ActionRequest request,ActionResponse response) {
		long loaiId = 0;
		try {
			 loaiId=CounterLocalServiceUtil.increment(Vanba.class.getName());
		} catch (SystemException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String tenloai;
		String ghichu;
		boolean tinhtrang=true;
		LoaiVB loai= new LoaiVBImpl();
		
		tenloai = ParamUtil.getString(request, "tenloai");
		ghichu = ParamUtil.getString(request, "ghichu");
		
		loai.setLoaiId(loaiId);
		loai.setTenloai(tenloai);
		loai.setGhichu(ghichu);
		loai.setTinhtrang(tinhtrang);
		try {
			LoaiVBLocalServiceUtil.addLoaiVB(loai);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void editnoibanhanh(ActionRequest request,ActionResponse response) {
		long noiBHId = 0;
		try {
			 noiBHId=CounterLocalServiceUtil.increment(Vanba.class.getName());
		} catch (SystemException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String tennoibanhanh;
		String ghichu;
		boolean tinhtrang=true;
		noiBanHanh noiBH= new noiBanHanhImpl();
		
		tennoibanhanh = ParamUtil.getString(request, "tennoibanhanh");
		ghichu = ParamUtil.getString(request, "ghichu");
		
		noiBH.setNoiBHId(noiBHId);
		noiBH.setTennoibanhanh(tennoibanhanh);
		noiBH.setGhichu(ghichu);
		noiBH.setTinhtrang(tinhtrang);
		try {
			noiBanHanhLocalServiceUtil.addnoiBanHanh(noiBH);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void editnguoiki(ActionRequest request , ActionResponse response) {
		long nguoikiId=0;
		try {
			 nguoikiId = CounterLocalServiceUtil.increment(Vanba.class.getName());
		} catch (SystemException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		String hoten ;
		Date ngaysinh;
		int gioitinh ;
		String donvi ;
		String chucvu ;
		boolean tinhtrang=true;
		nguoiki ngki= new nguoikiImpl();
		
		hoten = ParamUtil.getString(request, "hoten");
		ngaysinh = ParamUtil.getDate(request, "ngaysinh", dateFormat);
		gioitinh= ParamUtil.getInteger(request, "gioitinh");
		donvi = ParamUtil.getString(request, "donvi");
		chucvu = ParamUtil.getString(request, "chucvu");
		
		ngki.setNguoikiID(nguoikiId);
		ngki.setHoten(hoten);
		ngki.setNgaysinh(ngaysinh);
		ngki.setGioitinh(gioitinh);
		ngki.setDonvi(donvi);
		ngki.setChucvu(chucvu);
		ngki.setTinhtrang(tinhtrang);
		
		
		try {
			nguoikiLocalServiceUtil.addnguoiki(ngki);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void editnguoidung(ActionRequest request , ActionResponse response) {
		long nguoidungId=0;
		try {
			 nguoidungId = CounterLocalServiceUtil.increment(Vanba.class.getName());
		} catch (SystemException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		String hoten ;
		Date ngaysinh;
		int gioitinh ;
		String diachi ;
		String donvi ;
		String  sdt;
		String mail;
		String matkhau;
		boolean tinhtrang=true;
		nguoidung ngdung= new nguoidungImpl();
		
		hoten = ParamUtil.getString(request, "hoten");
		ngaysinh = ParamUtil.getDate(request, "ngaysinh", dateFormat);
		gioitinh= ParamUtil.getInteger(request, "gioitinh");
		diachi = ParamUtil.getString(request, "donvi");
		donvi = ParamUtil.getString(request, "donvi");
		sdt = ParamUtil.getString(request, "sdt");
		mail = ParamUtil.getString(request, "mail");
		matkhau = ParamUtil.getString(request, "matkhau");
		tinhtrang = ParamUtil.getBoolean(request, "tinhtrang");
		
		ngdung.setUserId(nguoidungId);
		ngdung.setHoten(hoten);
		ngdung.setNgaysinh(ngaysinh);
		ngdung.setGioitinh(gioitinh);
		ngdung.setDiachi(diachi);
		ngdung.setDonvi(donvi);
		ngdung.setSdt(sdt);
		ngdung.setMail(mail);
		ngdung.setMatkhau(matkhau);
		ngdung.setTinhtrang(tinhtrang);
		
		
		
		try {
			nguoidungLocalServiceUtil.addnguoidung(ngdung);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// tao conection voi msql
	  String url="jdbc:mysql://localhost:3306/portal";
	  String user="root";
	  String pass="1";
	public java.sql.PreparedStatement getPreparedStatement(String sql) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		 String url="jdbc:mysql://localhost:3306/lportal";
		 String user="lportal";
		 String pass="kinhmat*2";
		 Connection con;
		 con=DriverManager.getConnection(url, user, pass);
		 return con.prepareStatement(sql);

	}
	
	public static String sloai="";
	public static String snbh="";
	public static Date stu=null;
	public static Date sden=new Date();
	public static String snguoiki="";
	public static String stukhoa="" ;
	public static String userId;
	
	public void cancervb() {
		sloai="";
		snbh="";
		stu=null;
		 sden=new Date();
		 snguoiki="";
		 stukhoa="" ;
	}
	
	public void search(ActionRequest request,ActionResponse response ) {
		
		sloai = ParamUtil.getString(request, "loaivanban");
		snbh = ParamUtil.getString(request, "noibanhanh");
		stu = ParamUtil.getDate(request, "ngaybanhanhtu", dateFormat);
		sden = ParamUtil.getDate(request, "ngaybanhanhden", dateFormat);
		snguoiki = ParamUtil.getString(request, "nguoiki");
		stukhoa = ParamUtil.getString(request, "tukhoa");
		
	}
	
	public void searchvb(ActionRequest request,ActionResponse response) {
		stukhoa= ParamUtil.getString(request, "keyword");
		snbh = ParamUtil.getString(request, "noibanhanh");
		stu = ParamUtil.getDate(request, "ngaybanhanhtu", dateFormat);
		snguoiki = ParamUtil.getString(request, "nguoiki");
		stukhoa = ParamUtil.getString(request, "tukhoa");
	}
	
	
	// lay ra danh sach cac loai su dung lenh sql
	
	// login
	public String getIDLogin(String taikhoan , String password) throws ClassNotFoundException, SQLException {
		boolean kt= false;;
		String userId="";
		String sql="select userId from vanban_nguoidung where mail='"+taikhoan +"' and matkhau='"+ password + "'";
		java.sql.PreparedStatement stm=getPreparedStatement(sql);
		ResultSet rs=stm.executeQuery();
		while(rs.next()){
				userId=rs.getString("userId");
			}		
		
		return userId;
		
	}
	public void getlogin(ActionRequest request, ActionResponse response) throws ClassNotFoundException, SQLException {
		String taikhoan="";
		String password="";	
		taikhoan = ParamUtil.getString(request, "mail");
		password = ParamUtil.getString(request, "matkhau");
		
		if(getIDLogin(taikhoan, password)!="")
		{
			response.setRenderParameter("jspPage","/html/quanlyvb/manage.jsp");
		}
		else{
			
			response.setRenderParameter("jspPage","/html/quanlyvb/login.jsp");
		}

	}
	
	
	//lay van ban trong search
	public List<vanbanlist> getvb(int x) throws ClassNotFoundException, SQLException{
		List<vanbanlist> vb= new ArrayList<vanbanlist>();
		String sql;
		if(x==0)
		{
			 sql="select * from vanbanlist where tenloai like '%"+sloai +"%' and tennoibanhanh like '%"
					+ snbh+"%' and hoten like '%"+snguoiki+"%' and trichyeu like'%"+stukhoa+"%' and kihieu like'%"
					+stukhoa+"%'and ngaybanhanh < '"+sden +"'";
		}
		else
		{
			 sql="select * from vanbanlist where tenloai like '%"+sloai +"%' and tennoibanhanh like '%"
					+ snbh+"%' and hoten like '%"+snguoiki+"%' and trichyeu like'%"+stukhoa+"%' and kihieu like'%"
					+stukhoa+"%'and ngaybanhanh = '"+sden +"'";
		}
	
		
		java.sql.PreparedStatement stm= getPreparedStatement(sql);
		ResultSet rs = stm.executeQuery();
		while(rs.next()){
			vanbanlist vbl=new vanbanlist();
			vbl.kihieu=rs.getString("kihieu");
			vbl.trichyeu=rs.getString("trichyeu");
			vbl.ngaybanhanh= rs.getDate("ngaybanhanh");
			vbl.nguoiki = rs.getString("hoten");
			vbl.tenloai = rs.getString("tenloai");
			vbl.tennoiBH = rs.getString("tennoibanhanh");
			
			vb.add(vbl);
		}
		cancervb();
		return vb;
	}
	
	// lấy loai van ban
	public List<loailist> getloai(int x) throws ClassNotFoundException, SQLException{
		List<loailist> loai= new ArrayList<loailist>();
		String sql;
		sql="SELECT * FROM lportal.vanban_loaivb where tinhtrang = true";

		java.sql.PreparedStatement stm= getPreparedStatement(sql);
		ResultSet rs = stm.executeQuery();
		while(rs.next()){
			loailist l=new loailist();
			l.loaiId=rs.getLong("loaiId");
			l.tenloai =rs.getString("tenloai");
			l.ghichu = rs.getString("ghichu");
			
			loai.add(l);
			
		}
		
		return loai;
	}
	
	public long getId(long id)
	{
		return id;
	}
	
	// xóa loại
	public void xoaloai(ActionRequest request, ActionResponse response ) {
		long loaiId;
		
		loaiId = ParamUtil.getLong(request, "");
		
		
	}
	
	
	
	
	
	
	// upload va dowload file
	private static String ROOT_FOLDER_NAME = PortletProps.get("fileupload.folder.name");
	private static String ROOT_FOLDER_DESCRIPTION = PortletProps.get("fileupload.folder.description");
	private static long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
	
	public void uploadDocument(ActionRequest actionRequest,ActionResponse actionResponse) throws IOException,PortletException, PortalException, SystemException 
	{
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		createFolder(actionRequest, themeDisplay);
		fileUpload(themeDisplay, actionRequest);
		
	}

	public void downloadFiles(ActionRequest actionRequest,ActionResponse actionResponse) throws IOException,PortletException, PortalException, SystemException 
	{
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		  Map<String,String> urlMap = getAllFileLink(themeDisplay);
		  actionRequest.setAttribute("urlMap", urlMap);
		  actionResponse.setRenderParameter("jspPage","/html/manage/download.jsp");
	}
	public Folder createFolder(ActionRequest actionRequest,ThemeDisplay themeDisplay)
	{
        boolean folderExist = isFolderExist(themeDisplay);
        Folder folder = null;
		if (!folderExist) {
			long repositoryId = themeDisplay.getScopeGroupId();		
			try {
				ServiceContext serviceContext = ServiceContextFactory.getInstance(DLFolder.class.getName(), actionRequest);
				folder = DLAppServiceUtil.addFolder(repositoryId,PARENT_FOLDER_ID, ROOT_FOLDER_NAME,ROOT_FOLDER_DESCRIPTION, serviceContext);
			} catch (PortalException e1) {
				e1.printStackTrace();
			} catch (SystemException e1) {
				e1.printStackTrace();
			}			
		}
		return folder;
	}
	
	
	public boolean isFolderExist(ThemeDisplay themeDisplay){
			boolean folderExist = false;
			try {
				DLAppServiceUtil.getFolder(themeDisplay.getScopeGroupId(), PARENT_FOLDER_ID, ROOT_FOLDER_NAME);
				folderExist = true;
				System.out.println("Folder is already Exist");
			} catch (Exception e) {	
				System.out.println(e.getMessage());
			}
			return folderExist;
	}
	
	public Folder getFolder(ThemeDisplay themeDisplay){
		Folder folder = null;
		try {
			folder =DLAppServiceUtil.getFolder(themeDisplay.getScopeGroupId(), PARENT_FOLDER_ID, ROOT_FOLDER_NAME);
		} catch (Exception e) {	
			System.out.println(e.getMessage());
		}
		return folder;
	}
	
	
		public void fileUpload(ThemeDisplay themeDisplay,ActionRequest actionRequest)
		{
			UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(actionRequest);
          
			String fileName=uploadPortletRequest.getFileName("uploadedFile");		 			
			File file = uploadPortletRequest.getFile("uploadedFile");
			String mimeType = uploadPortletRequest.getContentType("uploadedFile");
                        String title = fileName;
			String description = "This file is added via programatically";
			long repositoryId = themeDisplay.getScopeGroupId();
			System.out.println("Title=>"+title);
		    try
		    {  
		    	Folder folder = getFolder(themeDisplay);
		    	ServiceContext serviceContext = ServiceContextFactory.getInstance(DLFileEntry.class.getName(), actionRequest);
		    	InputStream is = new FileInputStream( file );
		    	DLAppServiceUtil.addFileEntry(repositoryId, folder.getFolderId(), fileName, mimeType, 
		    			title, description, "", is, file.getTotalSpace(), serviceContext);
		    	
		     } catch (Exception e)
		    {
		       System.out.println(e.getMessage());
		    	e.printStackTrace();
		    }

		}
		
		public Map<String, String> getAllFileLink(ThemeDisplay themeDisplay){
			Map<String, String> urlMap = new HashMap<String, String>();//key = file name ,value = url
			long repositoryId = themeDisplay.getScopeGroupId();
			try {
				Folder folder =getFolder(themeDisplay);
				List<FileEntry> fileEntries = DLAppServiceUtil.getFileEntries(repositoryId, folder.getFolderId());
				 for (FileEntry file : fileEntries) {
					String url = themeDisplay.getPortalURL() + themeDisplay.getPathContext() + "/documents/" + themeDisplay.getScopeGroupId() + "/" + 
							      file.getFolderId() +  "/" +file.getTitle() ;
					urlMap.put(file.getTitle().split("\\.")[0], url);// remove jpg or pdf
				   
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return urlMap;
			
		}
	

}