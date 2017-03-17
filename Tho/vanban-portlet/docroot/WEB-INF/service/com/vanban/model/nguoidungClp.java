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

package com.vanban.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.vanban.service.ClpSerializer;
import com.vanban.service.nguoidungLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author nguye
 */
public class nguoidungClp extends BaseModelImpl<nguoidung> implements nguoidung {
	public nguoidungClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return nguoidung.class;
	}

	@Override
	public String getModelClassName() {
		return nguoidung.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _userId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setUserId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _userId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("userId", getUserId());
		attributes.put("hoten", getHoten());
		attributes.put("ngaysinh", getNgaysinh());
		attributes.put("gioitinh", getGioitinh());
		attributes.put("diachi", getDiachi());
		attributes.put("sdt", getSdt());
		attributes.put("donvi", getDonvi());
		attributes.put("mail", getMail());
		attributes.put("matkhau", getMatkhau());
		attributes.put("tinhtrang", getTinhtrang());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String hoten = (String)attributes.get("hoten");

		if (hoten != null) {
			setHoten(hoten);
		}

		Date ngaysinh = (Date)attributes.get("ngaysinh");

		if (ngaysinh != null) {
			setNgaysinh(ngaysinh);
		}

		Integer gioitinh = (Integer)attributes.get("gioitinh");

		if (gioitinh != null) {
			setGioitinh(gioitinh);
		}

		String diachi = (String)attributes.get("diachi");

		if (diachi != null) {
			setDiachi(diachi);
		}

		String sdt = (String)attributes.get("sdt");

		if (sdt != null) {
			setSdt(sdt);
		}

		String donvi = (String)attributes.get("donvi");

		if (donvi != null) {
			setDonvi(donvi);
		}

		String mail = (String)attributes.get("mail");

		if (mail != null) {
			setMail(mail);
		}

		String matkhau = (String)attributes.get("matkhau");

		if (matkhau != null) {
			setMatkhau(matkhau);
		}

		Boolean tinhtrang = (Boolean)attributes.get("tinhtrang");

		if (tinhtrang != null) {
			setTinhtrang(tinhtrang);
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_nguoidungRemoteModel != null) {
			try {
				Class<?> clazz = _nguoidungRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_nguoidungRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getHoten() {
		return _hoten;
	}

	@Override
	public void setHoten(String hoten) {
		_hoten = hoten;

		if (_nguoidungRemoteModel != null) {
			try {
				Class<?> clazz = _nguoidungRemoteModel.getClass();

				Method method = clazz.getMethod("setHoten", String.class);

				method.invoke(_nguoidungRemoteModel, hoten);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgaysinh() {
		return _ngaysinh;
	}

	@Override
	public void setNgaysinh(Date ngaysinh) {
		_ngaysinh = ngaysinh;

		if (_nguoidungRemoteModel != null) {
			try {
				Class<?> clazz = _nguoidungRemoteModel.getClass();

				Method method = clazz.getMethod("setNgaysinh", Date.class);

				method.invoke(_nguoidungRemoteModel, ngaysinh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getGioitinh() {
		return _gioitinh;
	}

	@Override
	public void setGioitinh(int gioitinh) {
		_gioitinh = gioitinh;

		if (_nguoidungRemoteModel != null) {
			try {
				Class<?> clazz = _nguoidungRemoteModel.getClass();

				Method method = clazz.getMethod("setGioitinh", int.class);

				method.invoke(_nguoidungRemoteModel, gioitinh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDiachi() {
		return _diachi;
	}

	@Override
	public void setDiachi(String diachi) {
		_diachi = diachi;

		if (_nguoidungRemoteModel != null) {
			try {
				Class<?> clazz = _nguoidungRemoteModel.getClass();

				Method method = clazz.getMethod("setDiachi", String.class);

				method.invoke(_nguoidungRemoteModel, diachi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSdt() {
		return _sdt;
	}

	@Override
	public void setSdt(String sdt) {
		_sdt = sdt;

		if (_nguoidungRemoteModel != null) {
			try {
				Class<?> clazz = _nguoidungRemoteModel.getClass();

				Method method = clazz.getMethod("setSdt", String.class);

				method.invoke(_nguoidungRemoteModel, sdt);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDonvi() {
		return _donvi;
	}

	@Override
	public void setDonvi(String donvi) {
		_donvi = donvi;

		if (_nguoidungRemoteModel != null) {
			try {
				Class<?> clazz = _nguoidungRemoteModel.getClass();

				Method method = clazz.getMethod("setDonvi", String.class);

				method.invoke(_nguoidungRemoteModel, donvi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMail() {
		return _mail;
	}

	@Override
	public void setMail(String mail) {
		_mail = mail;

		if (_nguoidungRemoteModel != null) {
			try {
				Class<?> clazz = _nguoidungRemoteModel.getClass();

				Method method = clazz.getMethod("setMail", String.class);

				method.invoke(_nguoidungRemoteModel, mail);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMatkhau() {
		return _matkhau;
	}

	@Override
	public void setMatkhau(String matkhau) {
		_matkhau = matkhau;

		if (_nguoidungRemoteModel != null) {
			try {
				Class<?> clazz = _nguoidungRemoteModel.getClass();

				Method method = clazz.getMethod("setMatkhau", String.class);

				method.invoke(_nguoidungRemoteModel, matkhau);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getTinhtrang() {
		return _tinhtrang;
	}

	@Override
	public boolean isTinhtrang() {
		return _tinhtrang;
	}

	@Override
	public void setTinhtrang(boolean tinhtrang) {
		_tinhtrang = tinhtrang;

		if (_nguoidungRemoteModel != null) {
			try {
				Class<?> clazz = _nguoidungRemoteModel.getClass();

				Method method = clazz.getMethod("setTinhtrang", boolean.class);

				method.invoke(_nguoidungRemoteModel, tinhtrang);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getnguoidungRemoteModel() {
		return _nguoidungRemoteModel;
	}

	public void setnguoidungRemoteModel(BaseModel<?> nguoidungRemoteModel) {
		_nguoidungRemoteModel = nguoidungRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _nguoidungRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_nguoidungRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			nguoidungLocalServiceUtil.addnguoidung(this);
		}
		else {
			nguoidungLocalServiceUtil.updatenguoidung(this);
		}
	}

	@Override
	public nguoidung toEscapedModel() {
		return (nguoidung)ProxyUtil.newProxyInstance(nguoidung.class.getClassLoader(),
			new Class[] { nguoidung.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		nguoidungClp clone = new nguoidungClp();

		clone.setUserId(getUserId());
		clone.setHoten(getHoten());
		clone.setNgaysinh(getNgaysinh());
		clone.setGioitinh(getGioitinh());
		clone.setDiachi(getDiachi());
		clone.setSdt(getSdt());
		clone.setDonvi(getDonvi());
		clone.setMail(getMail());
		clone.setMatkhau(getMatkhau());
		clone.setTinhtrang(getTinhtrang());

		return clone;
	}

	@Override
	public int compareTo(nguoidung nguoidung) {
		long primaryKey = nguoidung.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof nguoidungClp)) {
			return false;
		}

		nguoidungClp nguoidung = (nguoidungClp)obj;

		long primaryKey = nguoidung.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{userId=");
		sb.append(getUserId());
		sb.append(", hoten=");
		sb.append(getHoten());
		sb.append(", ngaysinh=");
		sb.append(getNgaysinh());
		sb.append(", gioitinh=");
		sb.append(getGioitinh());
		sb.append(", diachi=");
		sb.append(getDiachi());
		sb.append(", sdt=");
		sb.append(getSdt());
		sb.append(", donvi=");
		sb.append(getDonvi());
		sb.append(", mail=");
		sb.append(getMail());
		sb.append(", matkhau=");
		sb.append(getMatkhau());
		sb.append(", tinhtrang=");
		sb.append(getTinhtrang());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.vanban.model.nguoidung");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hoten</column-name><column-value><![CDATA[");
		sb.append(getHoten());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngaysinh</column-name><column-value><![CDATA[");
		sb.append(getNgaysinh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gioitinh</column-name><column-value><![CDATA[");
		sb.append(getGioitinh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>diachi</column-name><column-value><![CDATA[");
		sb.append(getDiachi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sdt</column-name><column-value><![CDATA[");
		sb.append(getSdt());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>donvi</column-name><column-value><![CDATA[");
		sb.append(getDonvi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mail</column-name><column-value><![CDATA[");
		sb.append(getMail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>matkhau</column-name><column-value><![CDATA[");
		sb.append(getMatkhau());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tinhtrang</column-name><column-value><![CDATA[");
		sb.append(getTinhtrang());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _userId;
	private String _userUuid;
	private String _hoten;
	private Date _ngaysinh;
	private int _gioitinh;
	private String _diachi;
	private String _sdt;
	private String _donvi;
	private String _mail;
	private String _matkhau;
	private boolean _tinhtrang;
	private BaseModel<?> _nguoidungRemoteModel;
	private Class<?> _clpSerializerClass = com.vanban.service.ClpSerializer.class;
}