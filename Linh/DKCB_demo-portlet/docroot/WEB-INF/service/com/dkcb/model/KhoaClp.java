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
import com.dkcb.service.KhoaLocalServiceUtil;

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
public class KhoaClp extends BaseModelImpl<Khoa> implements Khoa {
	public KhoaClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Khoa.class;
	}

	@Override
	public String getModelClassName() {
		return Khoa.class.getName();
	}

	@Override
	public String getPrimaryKey() {
		return _Idphongkham;
	}

	@Override
	public void setPrimaryKey(String primaryKey) {
		setIdphongkham(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _Idphongkham;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Idphongkham", getIdphongkham());
		attributes.put("TenPK", getTenPK());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String Idphongkham = (String)attributes.get("Idphongkham");

		if (Idphongkham != null) {
			setIdphongkham(Idphongkham);
		}

		String TenPK = (String)attributes.get("TenPK");

		if (TenPK != null) {
			setTenPK(TenPK);
		}
	}

	@Override
	public String getIdphongkham() {
		return _Idphongkham;
	}

	@Override
	public void setIdphongkham(String Idphongkham) {
		_Idphongkham = Idphongkham;

		if (_khoaRemoteModel != null) {
			try {
				Class<?> clazz = _khoaRemoteModel.getClass();

				Method method = clazz.getMethod("setIdphongkham", String.class);

				method.invoke(_khoaRemoteModel, Idphongkham);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenPK() {
		return _TenPK;
	}

	@Override
	public void setTenPK(String TenPK) {
		_TenPK = TenPK;

		if (_khoaRemoteModel != null) {
			try {
				Class<?> clazz = _khoaRemoteModel.getClass();

				Method method = clazz.getMethod("setTenPK", String.class);

				method.invoke(_khoaRemoteModel, TenPK);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getKhoaRemoteModel() {
		return _khoaRemoteModel;
	}

	public void setKhoaRemoteModel(BaseModel<?> khoaRemoteModel) {
		_khoaRemoteModel = khoaRemoteModel;
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

		Class<?> remoteModelClass = _khoaRemoteModel.getClass();

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

		Object returnValue = method.invoke(_khoaRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			KhoaLocalServiceUtil.addKhoa(this);
		}
		else {
			KhoaLocalServiceUtil.updateKhoa(this);
		}
	}

	@Override
	public Khoa toEscapedModel() {
		return (Khoa)ProxyUtil.newProxyInstance(Khoa.class.getClassLoader(),
			new Class[] { Khoa.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		KhoaClp clone = new KhoaClp();

		clone.setIdphongkham(getIdphongkham());
		clone.setTenPK(getTenPK());

		return clone;
	}

	@Override
	public int compareTo(Khoa khoa) {
		String primaryKey = khoa.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof KhoaClp)) {
			return false;
		}

		KhoaClp khoa = (KhoaClp)obj;

		String primaryKey = khoa.getPrimaryKey();

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
		StringBundler sb = new StringBundler(5);

		sb.append("{Idphongkham=");
		sb.append(getIdphongkham());
		sb.append(", TenPK=");
		sb.append(getTenPK());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.dkcb.model.Khoa");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>Idphongkham</column-name><column-value><![CDATA[");
		sb.append(getIdphongkham());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TenPK</column-name><column-value><![CDATA[");
		sb.append(getTenPK());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _Idphongkham;
	private String _TenPK;
	private BaseModel<?> _khoaRemoteModel;
	private Class<?> _clpSerializerClass = com.dkcb.service.ClpSerializer.class;
}