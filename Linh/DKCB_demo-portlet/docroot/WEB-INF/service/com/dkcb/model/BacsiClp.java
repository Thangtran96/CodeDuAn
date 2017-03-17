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

import com.dkcb.service.BacsiLocalServiceUtil;
import com.dkcb.service.ClpSerializer;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hoang_000
 */
public class BacsiClp extends BaseModelImpl<Bacsi> implements Bacsi {
	public BacsiClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Bacsi.class;
	}

	@Override
	public String getModelClassName() {
		return Bacsi.class.getName();
	}

	@Override
	public String getPrimaryKey() {
		return _Idbacsi;
	}

	@Override
	public void setPrimaryKey(String primaryKey) {
		setIdbacsi(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _Idbacsi;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Idbacsi", getIdbacsi());
		attributes.put("TenBS", getTenBS());
		attributes.put("Idphongkham", getIdphongkham());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String Idbacsi = (String)attributes.get("Idbacsi");

		if (Idbacsi != null) {
			setIdbacsi(Idbacsi);
		}

		String TenBS = (String)attributes.get("TenBS");

		if (TenBS != null) {
			setTenBS(TenBS);
		}

		String Idphongkham = (String)attributes.get("Idphongkham");

		if (Idphongkham != null) {
			setIdphongkham(Idphongkham);
		}
	}

	@Override
	public String getIdbacsi() {
		return _Idbacsi;
	}

	@Override
	public void setIdbacsi(String Idbacsi) {
		_Idbacsi = Idbacsi;

		if (_bacsiRemoteModel != null) {
			try {
				Class<?> clazz = _bacsiRemoteModel.getClass();

				Method method = clazz.getMethod("setIdbacsi", String.class);

				method.invoke(_bacsiRemoteModel, Idbacsi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenBS() {
		return _TenBS;
	}

	@Override
	public void setTenBS(String TenBS) {
		_TenBS = TenBS;

		if (_bacsiRemoteModel != null) {
			try {
				Class<?> clazz = _bacsiRemoteModel.getClass();

				Method method = clazz.getMethod("setTenBS", String.class);

				method.invoke(_bacsiRemoteModel, TenBS);
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

		if (_bacsiRemoteModel != null) {
			try {
				Class<?> clazz = _bacsiRemoteModel.getClass();

				Method method = clazz.getMethod("setIdphongkham", String.class);

				method.invoke(_bacsiRemoteModel, Idphongkham);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getBacsiRemoteModel() {
		return _bacsiRemoteModel;
	}

	public void setBacsiRemoteModel(BaseModel<?> bacsiRemoteModel) {
		_bacsiRemoteModel = bacsiRemoteModel;
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

		Class<?> remoteModelClass = _bacsiRemoteModel.getClass();

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

		Object returnValue = method.invoke(_bacsiRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			BacsiLocalServiceUtil.addBacsi(this);
		}
		else {
			BacsiLocalServiceUtil.updateBacsi(this);
		}
	}

	@Override
	public Bacsi toEscapedModel() {
		return (Bacsi)ProxyUtil.newProxyInstance(Bacsi.class.getClassLoader(),
			new Class[] { Bacsi.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		BacsiClp clone = new BacsiClp();

		clone.setIdbacsi(getIdbacsi());
		clone.setTenBS(getTenBS());
		clone.setIdphongkham(getIdphongkham());

		return clone;
	}

	@Override
	public int compareTo(Bacsi bacsi) {
		String primaryKey = bacsi.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BacsiClp)) {
			return false;
		}

		BacsiClp bacsi = (BacsiClp)obj;

		String primaryKey = bacsi.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
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
		return getPrimaryKey().hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{Idbacsi=");
		sb.append(getIdbacsi());
		sb.append(", TenBS=");
		sb.append(getTenBS());
		sb.append(", Idphongkham=");
		sb.append(getIdphongkham());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.dkcb.model.Bacsi");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>Idbacsi</column-name><column-value><![CDATA[");
		sb.append(getIdbacsi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TenBS</column-name><column-value><![CDATA[");
		sb.append(getTenBS());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Idphongkham</column-name><column-value><![CDATA[");
		sb.append(getIdphongkham());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _Idbacsi;
	private String _TenBS;
	private String _Idphongkham;
	private BaseModel<?> _bacsiRemoteModel;
	private Class<?> _clpSerializerClass = com.dkcb.service.ClpSerializer.class;
}