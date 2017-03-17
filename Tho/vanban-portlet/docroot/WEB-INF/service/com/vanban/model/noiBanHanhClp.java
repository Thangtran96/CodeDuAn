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
import com.vanban.service.noiBanHanhLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author nguye
 */
public class noiBanHanhClp extends BaseModelImpl<noiBanHanh>
	implements noiBanHanh {
	public noiBanHanhClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return noiBanHanh.class;
	}

	@Override
	public String getModelClassName() {
		return noiBanHanh.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _noiBHId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setNoiBHId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _noiBHId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("noiBHId", getNoiBHId());
		attributes.put("tennoibanhanh", getTennoibanhanh());
		attributes.put("ghichu", getGhichu());
		attributes.put("tinhtrang", getTinhtrang());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long noiBHId = (Long)attributes.get("noiBHId");

		if (noiBHId != null) {
			setNoiBHId(noiBHId);
		}

		String tennoibanhanh = (String)attributes.get("tennoibanhanh");

		if (tennoibanhanh != null) {
			setTennoibanhanh(tennoibanhanh);
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
	public long getNoiBHId() {
		return _noiBHId;
	}

	@Override
	public void setNoiBHId(long noiBHId) {
		_noiBHId = noiBHId;

		if (_noiBanHanhRemoteModel != null) {
			try {
				Class<?> clazz = _noiBanHanhRemoteModel.getClass();

				Method method = clazz.getMethod("setNoiBHId", long.class);

				method.invoke(_noiBanHanhRemoteModel, noiBHId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTennoibanhanh() {
		return _tennoibanhanh;
	}

	@Override
	public void setTennoibanhanh(String tennoibanhanh) {
		_tennoibanhanh = tennoibanhanh;

		if (_noiBanHanhRemoteModel != null) {
			try {
				Class<?> clazz = _noiBanHanhRemoteModel.getClass();

				Method method = clazz.getMethod("setTennoibanhanh", String.class);

				method.invoke(_noiBanHanhRemoteModel, tennoibanhanh);
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

		if (_noiBanHanhRemoteModel != null) {
			try {
				Class<?> clazz = _noiBanHanhRemoteModel.getClass();

				Method method = clazz.getMethod("setGhichu", String.class);

				method.invoke(_noiBanHanhRemoteModel, ghichu);
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

		if (_noiBanHanhRemoteModel != null) {
			try {
				Class<?> clazz = _noiBanHanhRemoteModel.getClass();

				Method method = clazz.getMethod("setTinhtrang", boolean.class);

				method.invoke(_noiBanHanhRemoteModel, tinhtrang);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getnoiBanHanhRemoteModel() {
		return _noiBanHanhRemoteModel;
	}

	public void setnoiBanHanhRemoteModel(BaseModel<?> noiBanHanhRemoteModel) {
		_noiBanHanhRemoteModel = noiBanHanhRemoteModel;
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

		Class<?> remoteModelClass = _noiBanHanhRemoteModel.getClass();

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

		Object returnValue = method.invoke(_noiBanHanhRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			noiBanHanhLocalServiceUtil.addnoiBanHanh(this);
		}
		else {
			noiBanHanhLocalServiceUtil.updatenoiBanHanh(this);
		}
	}

	@Override
	public noiBanHanh toEscapedModel() {
		return (noiBanHanh)ProxyUtil.newProxyInstance(noiBanHanh.class.getClassLoader(),
			new Class[] { noiBanHanh.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		noiBanHanhClp clone = new noiBanHanhClp();

		clone.setNoiBHId(getNoiBHId());
		clone.setTennoibanhanh(getTennoibanhanh());
		clone.setGhichu(getGhichu());
		clone.setTinhtrang(getTinhtrang());

		return clone;
	}

	@Override
	public int compareTo(noiBanHanh noiBanHanh) {
		long primaryKey = noiBanHanh.getPrimaryKey();

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

		if (!(obj instanceof noiBanHanhClp)) {
			return false;
		}

		noiBanHanhClp noiBanHanh = (noiBanHanhClp)obj;

		long primaryKey = noiBanHanh.getPrimaryKey();

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

		sb.append("{noiBHId=");
		sb.append(getNoiBHId());
		sb.append(", tennoibanhanh=");
		sb.append(getTennoibanhanh());
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
		sb.append("com.vanban.model.noiBanHanh");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>noiBHId</column-name><column-value><![CDATA[");
		sb.append(getNoiBHId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tennoibanhanh</column-name><column-value><![CDATA[");
		sb.append(getTennoibanhanh());
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

	private long _noiBHId;
	private String _tennoibanhanh;
	private String _ghichu;
	private boolean _tinhtrang;
	private BaseModel<?> _noiBanHanhRemoteModel;
	private Class<?> _clpSerializerClass = com.vanban.service.ClpSerializer.class;
}