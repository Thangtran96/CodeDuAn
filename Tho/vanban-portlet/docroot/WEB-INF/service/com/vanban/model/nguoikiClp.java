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

import com.vanban.service.ClpSerializer;
import com.vanban.service.nguoikiLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author nguye
 */
public class nguoikiClp extends BaseModelImpl<nguoiki> implements nguoiki {
	public nguoikiClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return nguoiki.class;
	}

	@Override
	public String getModelClassName() {
		return nguoiki.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _nguoikiID;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setNguoikiID(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _nguoikiID;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("nguoikiID", getNguoikiID());
		attributes.put("hoten", getHoten());
		attributes.put("ngaysinh", getNgaysinh());
		attributes.put("gioitinh", getGioitinh());
		attributes.put("donvi", getDonvi());
		attributes.put("chucvu", getChucvu());
		attributes.put("tinhtrang", getTinhtrang());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long nguoikiID = (Long)attributes.get("nguoikiID");

		if (nguoikiID != null) {
			setNguoikiID(nguoikiID);
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

		String donvi = (String)attributes.get("donvi");

		if (donvi != null) {
			setDonvi(donvi);
		}

		String chucvu = (String)attributes.get("chucvu");

		if (chucvu != null) {
			setChucvu(chucvu);
		}

		Boolean tinhtrang = (Boolean)attributes.get("tinhtrang");

		if (tinhtrang != null) {
			setTinhtrang(tinhtrang);
		}
	}

	@Override
	public long getNguoikiID() {
		return _nguoikiID;
	}

	@Override
	public void setNguoikiID(long nguoikiID) {
		_nguoikiID = nguoikiID;

		if (_nguoikiRemoteModel != null) {
			try {
				Class<?> clazz = _nguoikiRemoteModel.getClass();

				Method method = clazz.getMethod("setNguoikiID", long.class);

				method.invoke(_nguoikiRemoteModel, nguoikiID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getHoten() {
		return _hoten;
	}

	@Override
	public void setHoten(String hoten) {
		_hoten = hoten;

		if (_nguoikiRemoteModel != null) {
			try {
				Class<?> clazz = _nguoikiRemoteModel.getClass();

				Method method = clazz.getMethod("setHoten", String.class);

				method.invoke(_nguoikiRemoteModel, hoten);
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

		if (_nguoikiRemoteModel != null) {
			try {
				Class<?> clazz = _nguoikiRemoteModel.getClass();

				Method method = clazz.getMethod("setNgaysinh", Date.class);

				method.invoke(_nguoikiRemoteModel, ngaysinh);
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

		if (_nguoikiRemoteModel != null) {
			try {
				Class<?> clazz = _nguoikiRemoteModel.getClass();

				Method method = clazz.getMethod("setGioitinh", int.class);

				method.invoke(_nguoikiRemoteModel, gioitinh);
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

		if (_nguoikiRemoteModel != null) {
			try {
				Class<?> clazz = _nguoikiRemoteModel.getClass();

				Method method = clazz.getMethod("setDonvi", String.class);

				method.invoke(_nguoikiRemoteModel, donvi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getChucvu() {
		return _chucvu;
	}

	@Override
	public void setChucvu(String chucvu) {
		_chucvu = chucvu;

		if (_nguoikiRemoteModel != null) {
			try {
				Class<?> clazz = _nguoikiRemoteModel.getClass();

				Method method = clazz.getMethod("setChucvu", String.class);

				method.invoke(_nguoikiRemoteModel, chucvu);
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

		if (_nguoikiRemoteModel != null) {
			try {
				Class<?> clazz = _nguoikiRemoteModel.getClass();

				Method method = clazz.getMethod("setTinhtrang", boolean.class);

				method.invoke(_nguoikiRemoteModel, tinhtrang);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getnguoikiRemoteModel() {
		return _nguoikiRemoteModel;
	}

	public void setnguoikiRemoteModel(BaseModel<?> nguoikiRemoteModel) {
		_nguoikiRemoteModel = nguoikiRemoteModel;
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

		Class<?> remoteModelClass = _nguoikiRemoteModel.getClass();

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

		Object returnValue = method.invoke(_nguoikiRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			nguoikiLocalServiceUtil.addnguoiki(this);
		}
		else {
			nguoikiLocalServiceUtil.updatenguoiki(this);
		}
	}

	@Override
	public nguoiki toEscapedModel() {
		return (nguoiki)ProxyUtil.newProxyInstance(nguoiki.class.getClassLoader(),
			new Class[] { nguoiki.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		nguoikiClp clone = new nguoikiClp();

		clone.setNguoikiID(getNguoikiID());
		clone.setHoten(getHoten());
		clone.setNgaysinh(getNgaysinh());
		clone.setGioitinh(getGioitinh());
		clone.setDonvi(getDonvi());
		clone.setChucvu(getChucvu());
		clone.setTinhtrang(getTinhtrang());

		return clone;
	}

	@Override
	public int compareTo(nguoiki nguoiki) {
		long primaryKey = nguoiki.getPrimaryKey();

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

		if (!(obj instanceof nguoikiClp)) {
			return false;
		}

		nguoikiClp nguoiki = (nguoikiClp)obj;

		long primaryKey = nguoiki.getPrimaryKey();

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
		StringBundler sb = new StringBundler(15);

		sb.append("{nguoikiID=");
		sb.append(getNguoikiID());
		sb.append(", hoten=");
		sb.append(getHoten());
		sb.append(", ngaysinh=");
		sb.append(getNgaysinh());
		sb.append(", gioitinh=");
		sb.append(getGioitinh());
		sb.append(", donvi=");
		sb.append(getDonvi());
		sb.append(", chucvu=");
		sb.append(getChucvu());
		sb.append(", tinhtrang=");
		sb.append(getTinhtrang());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.vanban.model.nguoiki");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>nguoikiID</column-name><column-value><![CDATA[");
		sb.append(getNguoikiID());
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
			"<column><column-name>donvi</column-name><column-value><![CDATA[");
		sb.append(getDonvi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>chucvu</column-name><column-value><![CDATA[");
		sb.append(getChucvu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tinhtrang</column-name><column-value><![CDATA[");
		sb.append(getTinhtrang());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _nguoikiID;
	private String _hoten;
	private Date _ngaysinh;
	private int _gioitinh;
	private String _donvi;
	private String _chucvu;
	private boolean _tinhtrang;
	private BaseModel<?> _nguoikiRemoteModel;
	private Class<?> _clpSerializerClass = com.vanban.service.ClpSerializer.class;
}