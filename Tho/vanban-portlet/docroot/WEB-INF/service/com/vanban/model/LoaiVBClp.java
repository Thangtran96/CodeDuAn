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
import com.vanban.service.LoaiVBLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author nguye
 */
public class LoaiVBClp extends BaseModelImpl<LoaiVB> implements LoaiVB {
	public LoaiVBClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return LoaiVB.class;
	}

	@Override
	public String getModelClassName() {
		return LoaiVB.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _loaiId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setLoaiId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _loaiId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("loaiId", getLoaiId());
		attributes.put("tenloai", getTenloai());
		attributes.put("ghichu", getGhichu());
		attributes.put("tinhtrang", getTinhtrang());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long loaiId = (Long)attributes.get("loaiId");

		if (loaiId != null) {
			setLoaiId(loaiId);
		}

		String tenloai = (String)attributes.get("tenloai");

		if (tenloai != null) {
			setTenloai(tenloai);
		}

		String ghichu = (String)attributes.get("ghichu");

		if (ghichu != null) {
			setGhichu(ghichu);
		}

		Boolean tinhtrang = (Boolean)attributes.get("tinhtrang");

		if (tinhtrang != null) {
			setTinhtrang(tinhtrang);
		}
	}

	@Override
	public long getLoaiId() {
		return _loaiId;
	}

	@Override
	public void setLoaiId(long loaiId) {
		_loaiId = loaiId;

		if (_loaiVBRemoteModel != null) {
			try {
				Class<?> clazz = _loaiVBRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiId", long.class);

				method.invoke(_loaiVBRemoteModel, loaiId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenloai() {
		return _tenloai;
	}

	@Override
	public void setTenloai(String tenloai) {
		_tenloai = tenloai;

		if (_loaiVBRemoteModel != null) {
			try {
				Class<?> clazz = _loaiVBRemoteModel.getClass();

				Method method = clazz.getMethod("setTenloai", String.class);

				method.invoke(_loaiVBRemoteModel, tenloai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGhichu() {
		return _ghichu;
	}

	@Override
	public void setGhichu(String ghichu) {
		_ghichu = ghichu;

		if (_loaiVBRemoteModel != null) {
			try {
				Class<?> clazz = _loaiVBRemoteModel.getClass();

				Method method = clazz.getMethod("setGhichu", String.class);

				method.invoke(_loaiVBRemoteModel, ghichu);
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

		if (_loaiVBRemoteModel != null) {
			try {
				Class<?> clazz = _loaiVBRemoteModel.getClass();

				Method method = clazz.getMethod("setTinhtrang", boolean.class);

				method.invoke(_loaiVBRemoteModel, tinhtrang);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getLoaiVBRemoteModel() {
		return _loaiVBRemoteModel;
	}

	public void setLoaiVBRemoteModel(BaseModel<?> loaiVBRemoteModel) {
		_loaiVBRemoteModel = loaiVBRemoteModel;
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

		Class<?> remoteModelClass = _loaiVBRemoteModel.getClass();

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

		Object returnValue = method.invoke(_loaiVBRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			LoaiVBLocalServiceUtil.addLoaiVB(this);
		}
		else {
			LoaiVBLocalServiceUtil.updateLoaiVB(this);
		}
	}

	@Override
	public LoaiVB toEscapedModel() {
		return (LoaiVB)ProxyUtil.newProxyInstance(LoaiVB.class.getClassLoader(),
			new Class[] { LoaiVB.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		LoaiVBClp clone = new LoaiVBClp();

		clone.setLoaiId(getLoaiId());
		clone.setTenloai(getTenloai());
		clone.setGhichu(getGhichu());
		clone.setTinhtrang(getTinhtrang());

		return clone;
	}

	@Override
	public int compareTo(LoaiVB loaiVB) {
		long primaryKey = loaiVB.getPrimaryKey();

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

		if (!(obj instanceof LoaiVBClp)) {
			return false;
		}

		LoaiVBClp loaiVB = (LoaiVBClp)obj;

		long primaryKey = loaiVB.getPrimaryKey();

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
		StringBundler sb = new StringBundler(9);

		sb.append("{loaiId=");
		sb.append(getLoaiId());
		sb.append(", tenloai=");
		sb.append(getTenloai());
		sb.append(", ghichu=");
		sb.append(getGhichu());
		sb.append(", tinhtrang=");
		sb.append(getTinhtrang());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.vanban.model.LoaiVB");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>loaiId</column-name><column-value><![CDATA[");
		sb.append(getLoaiId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenloai</column-name><column-value><![CDATA[");
		sb.append(getTenloai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ghichu</column-name><column-value><![CDATA[");
		sb.append(getGhichu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tinhtrang</column-name><column-value><![CDATA[");
		sb.append(getTinhtrang());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _loaiId;
	private String _tenloai;
	private String _ghichu;
	private boolean _tinhtrang;
	private BaseModel<?> _loaiVBRemoteModel;
	private Class<?> _clpSerializerClass = com.vanban.service.ClpSerializer.class;
}