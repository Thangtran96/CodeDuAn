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
import com.dkcb.service.LichkhamLocalServiceUtil;

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
public class LichkhamClp extends BaseModelImpl<Lichkham> implements Lichkham {
	public LichkhamClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Lichkham.class;
	}

	@Override
	public String getModelClassName() {
		return Lichkham.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _Idlichkham;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setIdlichkham(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _Idlichkham;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Idbacsi", getIdbacsi());
		attributes.put("Id", getId());
		attributes.put("Idphongkham", getIdphongkham());
		attributes.put("Iddichvu", getIddichvu());
		attributes.put("Giodukien", getGiodukien());
		attributes.put("Ngaykham", getNgaykham());
		attributes.put("Idlichkham", getIdlichkham());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String Idbacsi = (String)attributes.get("Idbacsi");

		if (Idbacsi != null) {
			setIdbacsi(Idbacsi);
		}

		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		String Idphongkham = (String)attributes.get("Idphongkham");

		if (Idphongkham != null) {
			setIdphongkham(Idphongkham);
		}

		Long Iddichvu = (Long)attributes.get("Iddichvu");

		if (Iddichvu != null) {
			setIddichvu(Iddichvu);
		}

		String Giodukien = (String)attributes.get("Giodukien");

		if (Giodukien != null) {
			setGiodukien(Giodukien);
		}

		Date Ngaykham = (Date)attributes.get("Ngaykham");

		if (Ngaykham != null) {
			setNgaykham(Ngaykham);
		}

		Integer Idlichkham = (Integer)attributes.get("Idlichkham");

		if (Idlichkham != null) {
			setIdlichkham(Idlichkham);
		}
	}

	@Override
	public String getIdbacsi() {
		return _Idbacsi;
	}

	@Override
	public void setIdbacsi(String Idbacsi) {
		_Idbacsi = Idbacsi;

		if (_lichkhamRemoteModel != null) {
			try {
				Class<?> clazz = _lichkhamRemoteModel.getClass();

				Method method = clazz.getMethod("setIdbacsi", String.class);

				method.invoke(_lichkhamRemoteModel, Idbacsi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getId() {
		return _Id;
	}

	@Override
	public void setId(long Id) {
		_Id = Id;

		if (_lichkhamRemoteModel != null) {
			try {
				Class<?> clazz = _lichkhamRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_lichkhamRemoteModel, Id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getIdphongkham() {
		return _Idphongkham;
	}

	@Override
	public void setIdphongkham(String Idphongkham) {
		_Idphongkham = Idphongkham;

		if (_lichkhamRemoteModel != null) {
			try {
				Class<?> clazz = _lichkhamRemoteModel.getClass();

				Method method = clazz.getMethod("setIdphongkham", String.class);

				method.invoke(_lichkhamRemoteModel, Idphongkham);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getIddichvu() {
		return _Iddichvu;
	}

	@Override
	public void setIddichvu(long Iddichvu) {
		_Iddichvu = Iddichvu;

		if (_lichkhamRemoteModel != null) {
			try {
				Class<?> clazz = _lichkhamRemoteModel.getClass();

				Method method = clazz.getMethod("setIddichvu", long.class);

				method.invoke(_lichkhamRemoteModel, Iddichvu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGiodukien() {
		return _Giodukien;
	}

	@Override
	public void setGiodukien(String Giodukien) {
		_Giodukien = Giodukien;

		if (_lichkhamRemoteModel != null) {
			try {
				Class<?> clazz = _lichkhamRemoteModel.getClass();

				Method method = clazz.getMethod("setGiodukien", String.class);

				method.invoke(_lichkhamRemoteModel, Giodukien);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgaykham() {
		return _Ngaykham;
	}

	@Override
	public void setNgaykham(Date Ngaykham) {
		_Ngaykham = Ngaykham;

		if (_lichkhamRemoteModel != null) {
			try {
				Class<?> clazz = _lichkhamRemoteModel.getClass();

				Method method = clazz.getMethod("setNgaykham", Date.class);

				method.invoke(_lichkhamRemoteModel, Ngaykham);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIdlichkham() {
		return _Idlichkham;
	}

	@Override
	public void setIdlichkham(int Idlichkham) {
		_Idlichkham = Idlichkham;

		if (_lichkhamRemoteModel != null) {
			try {
				Class<?> clazz = _lichkhamRemoteModel.getClass();

				Method method = clazz.getMethod("setIdlichkham", int.class);

				method.invoke(_lichkhamRemoteModel, Idlichkham);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getLichkhamRemoteModel() {
		return _lichkhamRemoteModel;
	}

	public void setLichkhamRemoteModel(BaseModel<?> lichkhamRemoteModel) {
		_lichkhamRemoteModel = lichkhamRemoteModel;
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

		Class<?> remoteModelClass = _lichkhamRemoteModel.getClass();

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

		Object returnValue = method.invoke(_lichkhamRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			LichkhamLocalServiceUtil.addLichkham(this);
		}
		else {
			LichkhamLocalServiceUtil.updateLichkham(this);
		}
	}

	@Override
	public Lichkham toEscapedModel() {
		return (Lichkham)ProxyUtil.newProxyInstance(Lichkham.class.getClassLoader(),
			new Class[] { Lichkham.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		LichkhamClp clone = new LichkhamClp();

		clone.setIdbacsi(getIdbacsi());
		clone.setId(getId());
		clone.setIdphongkham(getIdphongkham());
		clone.setIddichvu(getIddichvu());
		clone.setGiodukien(getGiodukien());
		clone.setNgaykham(getNgaykham());
		clone.setIdlichkham(getIdlichkham());

		return clone;
	}

	@Override
	public int compareTo(Lichkham lichkham) {
		int primaryKey = lichkham.getPrimaryKey();

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

		if (!(obj instanceof LichkhamClp)) {
			return false;
		}

		LichkhamClp lichkham = (LichkhamClp)obj;

		int primaryKey = lichkham.getPrimaryKey();

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
		return getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{Idbacsi=");
		sb.append(getIdbacsi());
		sb.append(", Id=");
		sb.append(getId());
		sb.append(", Idphongkham=");
		sb.append(getIdphongkham());
		sb.append(", Iddichvu=");
		sb.append(getIddichvu());
		sb.append(", Giodukien=");
		sb.append(getGiodukien());
		sb.append(", Ngaykham=");
		sb.append(getNgaykham());
		sb.append(", Idlichkham=");
		sb.append(getIdlichkham());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.dkcb.model.Lichkham");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>Idbacsi</column-name><column-value><![CDATA[");
		sb.append(getIdbacsi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Idphongkham</column-name><column-value><![CDATA[");
		sb.append(getIdphongkham());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Iddichvu</column-name><column-value><![CDATA[");
		sb.append(getIddichvu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Giodukien</column-name><column-value><![CDATA[");
		sb.append(getGiodukien());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Ngaykham</column-name><column-value><![CDATA[");
		sb.append(getNgaykham());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Idlichkham</column-name><column-value><![CDATA[");
		sb.append(getIdlichkham());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _Idbacsi;
	private long _Id;
	private String _Idphongkham;
	private long _Iddichvu;
	private String _Giodukien;
	private Date _Ngaykham;
	private int _Idlichkham;
	private BaseModel<?> _lichkhamRemoteModel;
	private Class<?> _clpSerializerClass = com.dkcb.service.ClpSerializer.class;
}