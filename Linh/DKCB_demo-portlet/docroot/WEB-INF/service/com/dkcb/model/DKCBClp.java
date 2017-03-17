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

package com.dkcb.model;

import com.dkcb.service.ClpSerializer;
import com.dkcb.service.DKCBLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author hoang_000
 */
public class DKCBClp extends BaseModelImpl<DKCB> implements DKCB {
	public DKCBClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DKCB.class;
	}

	@Override
	public String getModelClassName() {
		return DKCB.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _Id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _Id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id", getId());
		attributes.put("Hoten", getHoten());
		attributes.put("Diachi", getDiachi());
		attributes.put("Gioitinh", getGioitinh());
		attributes.put("Sodienthoai", getSodienthoai());
		attributes.put("Ngaysinh", getNgaysinh());
		attributes.put("Trieuchung", getTrieuchung());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		String Hoten = (String)attributes.get("Hoten");

		if (Hoten != null) {
			setHoten(Hoten);
		}

		String Diachi = (String)attributes.get("Diachi");

		if (Diachi != null) {
			setDiachi(Diachi);
		}

		Boolean Gioitinh = (Boolean)attributes.get("Gioitinh");

		if (Gioitinh != null) {
			setGioitinh(Gioitinh);
		}

		String Sodienthoai = (String)attributes.get("Sodienthoai");

		if (Sodienthoai != null) {
			setSodienthoai(Sodienthoai);
		}

		Date Ngaysinh = (Date)attributes.get("Ngaysinh");

		if (Ngaysinh != null) {
			setNgaysinh(Ngaysinh);
		}

		String Trieuchung = (String)attributes.get("Trieuchung");

		if (Trieuchung != null) {
			setTrieuchung(Trieuchung);
		}
	}

	@Override
	public long getId() {
		return _Id;
	}

	@Override
	public void setId(long Id) {
		_Id = Id;

		if (_dkcbRemoteModel != null) {
			try {
				Class<?> clazz = _dkcbRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_dkcbRemoteModel, Id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getHoten() {
		return _Hoten;
	}

	@Override
	public void setHoten(String Hoten) {
		_Hoten = Hoten;

		if (_dkcbRemoteModel != null) {
			try {
				Class<?> clazz = _dkcbRemoteModel.getClass();

				Method method = clazz.getMethod("setHoten", String.class);

				method.invoke(_dkcbRemoteModel, Hoten);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDiachi() {
		return _Diachi;
	}

	@Override
	public void setDiachi(String Diachi) {
		_Diachi = Diachi;

		if (_dkcbRemoteModel != null) {
			try {
				Class<?> clazz = _dkcbRemoteModel.getClass();

				Method method = clazz.getMethod("setDiachi", String.class);

				method.invoke(_dkcbRemoteModel, Diachi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getGioitinh() {
		return _Gioitinh;
	}

	@Override
	public boolean isGioitinh() {
		return _Gioitinh;
	}

	@Override
	public void setGioitinh(boolean Gioitinh) {
		_Gioitinh = Gioitinh;

		if (_dkcbRemoteModel != null) {
			try {
				Class<?> clazz = _dkcbRemoteModel.getClass();

				Method method = clazz.getMethod("setGioitinh", boolean.class);

				method.invoke(_dkcbRemoteModel, Gioitinh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSodienthoai() {
		return _Sodienthoai;
	}

	@Override
	public void setSodienthoai(String Sodienthoai) {
		_Sodienthoai = Sodienthoai;

		if (_dkcbRemoteModel != null) {
			try {
				Class<?> clazz = _dkcbRemoteModel.getClass();

				Method method = clazz.getMethod("setSodienthoai", String.class);

				method.invoke(_dkcbRemoteModel, Sodienthoai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgaysinh() {
		return _Ngaysinh;
	}

	@Override
	public void setNgaysinh(Date Ngaysinh) {
		_Ngaysinh = Ngaysinh;

		if (_dkcbRemoteModel != null) {
			try {
				Class<?> clazz = _dkcbRemoteModel.getClass();

				Method method = clazz.getMethod("setNgaysinh", Date.class);

				method.invoke(_dkcbRemoteModel, Ngaysinh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTrieuchung() {
		return _Trieuchung;
	}

	@Override
	public void setTrieuchung(String Trieuchung) {
		_Trieuchung = Trieuchung;

		if (_dkcbRemoteModel != null) {
			try {
				Class<?> clazz = _dkcbRemoteModel.getClass();

				Method method = clazz.getMethod("setTrieuchung", String.class);

				method.invoke(_dkcbRemoteModel, Trieuchung);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDKCBRemoteModel() {
		return _dkcbRemoteModel;
	}

	public void setDKCBRemoteModel(BaseModel<?> dkcbRemoteModel) {
		_dkcbRemoteModel = dkcbRemoteModel;
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

		Class<?> remoteModelClass = _dkcbRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dkcbRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DKCBLocalServiceUtil.addDKCB(this);
		}
		else {
			DKCBLocalServiceUtil.updateDKCB(this);
		}
	}

	@Override
	public DKCB toEscapedModel() {
		return (DKCB)ProxyUtil.newProxyInstance(DKCB.class.getClassLoader(),
			new Class[] { DKCB.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DKCBClp clone = new DKCBClp();

		clone.setId(getId());
		clone.setHoten(getHoten());
		clone.setDiachi(getDiachi());
		clone.setGioitinh(getGioitinh());
		clone.setSodienthoai(getSodienthoai());
		clone.setNgaysinh(getNgaysinh());
		clone.setTrieuchung(getTrieuchung());

		return clone;
	}

	@Override
	public int compareTo(DKCB dkcb) {
		int value = 0;

		if (getId() < dkcb.getId()) {
			value = -1;
		}
		else if (getId() > dkcb.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DKCBClp)) {
			return false;
		}

		DKCBClp dkcb = (DKCBClp)obj;

		long primaryKey = dkcb.getPrimaryKey();

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

		sb.append("{Id=");
		sb.append(getId());
		sb.append(", Hoten=");
		sb.append(getHoten());
		sb.append(", Diachi=");
		sb.append(getDiachi());
		sb.append(", Gioitinh=");
		sb.append(getGioitinh());
		sb.append(", Sodienthoai=");
		sb.append(getSodienthoai());
		sb.append(", Ngaysinh=");
		sb.append(getNgaysinh());
		sb.append(", Trieuchung=");
		sb.append(getTrieuchung());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.dkcb.model.DKCB");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>Id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Hoten</column-name><column-value><![CDATA[");
		sb.append(getHoten());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Diachi</column-name><column-value><![CDATA[");
		sb.append(getDiachi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Gioitinh</column-name><column-value><![CDATA[");
		sb.append(getGioitinh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Sodienthoai</column-name><column-value><![CDATA[");
		sb.append(getSodienthoai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Ngaysinh</column-name><column-value><![CDATA[");
		sb.append(getNgaysinh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Trieuchung</column-name><column-value><![CDATA[");
		sb.append(getTrieuchung());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _Id;
	private String _Hoten;
	private String _Diachi;
	private boolean _Gioitinh;
	private String _Sodienthoai;
	private Date _Ngaysinh;
	private String _Trieuchung;
	private BaseModel<?> _dkcbRemoteModel;
	private Class<?> _clpSerializerClass = com.dkcb.service.ClpSerializer.class;
}