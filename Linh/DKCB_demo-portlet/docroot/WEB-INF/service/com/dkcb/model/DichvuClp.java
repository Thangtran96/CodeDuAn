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
import com.dkcb.service.DichvuLocalServiceUtil;

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
public class DichvuClp extends BaseModelImpl<Dichvu> implements Dichvu {
	public DichvuClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Dichvu.class;
	}

	@Override
	public String getModelClassName() {
		return Dichvu.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _Iddichvu;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setIddichvu(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _Iddichvu;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Iddichvu", getIddichvu());
		attributes.put("Tendichvu", getTendichvu());
		attributes.put("Mucthu", getMucthu());
		attributes.put("Ghichi", getGhichi());
		attributes.put("Idphongkham", getIdphongkham());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Iddichvu = (Long)attributes.get("Iddichvu");

		if (Iddichvu != null) {
			setIddichvu(Iddichvu);
		}

		String Tendichvu = (String)attributes.get("Tendichvu");

		if (Tendichvu != null) {
			setTendichvu(Tendichvu);
		}

		Double Mucthu = (Double)attributes.get("Mucthu");

		if (Mucthu != null) {
			setMucthu(Mucthu);
		}

		String Ghichi = (String)attributes.get("Ghichi");

		if (Ghichi != null) {
			setGhichi(Ghichi);
		}

		String Idphongkham = (String)attributes.get("Idphongkham");

		if (Idphongkham != null) {
			setIdphongkham(Idphongkham);
		}
	}

	@Override
	public long getIddichvu() {
		return _Iddichvu;
	}

	@Override
	public void setIddichvu(long Iddichvu) {
		_Iddichvu = Iddichvu;

		if (_dichvuRemoteModel != null) {
			try {
				Class<?> clazz = _dichvuRemoteModel.getClass();

				Method method = clazz.getMethod("setIddichvu", long.class);

				method.invoke(_dichvuRemoteModel, Iddichvu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTendichvu() {
		return _Tendichvu;
	}

	@Override
	public void setTendichvu(String Tendichvu) {
		_Tendichvu = Tendichvu;

		if (_dichvuRemoteModel != null) {
			try {
				Class<?> clazz = _dichvuRemoteModel.getClass();

				Method method = clazz.getMethod("setTendichvu", String.class);

				method.invoke(_dichvuRemoteModel, Tendichvu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getMucthu() {
		return _Mucthu;
	}

	@Override
	public void setMucthu(double Mucthu) {
		_Mucthu = Mucthu;

		if (_dichvuRemoteModel != null) {
			try {
				Class<?> clazz = _dichvuRemoteModel.getClass();

				Method method = clazz.getMethod("setMucthu", double.class);

				method.invoke(_dichvuRemoteModel, Mucthu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGhichi() {
		return _Ghichi;
	}

	@Override
	public void setGhichi(String Ghichi) {
		_Ghichi = Ghichi;

		if (_dichvuRemoteModel != null) {
			try {
				Class<?> clazz = _dichvuRemoteModel.getClass();

				Method method = clazz.getMethod("setGhichi", String.class);

				method.invoke(_dichvuRemoteModel, Ghichi);
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

		if (_dichvuRemoteModel != null) {
			try {
				Class<?> clazz = _dichvuRemoteModel.getClass();

				Method method = clazz.getMethod("setIdphongkham", String.class);

				method.invoke(_dichvuRemoteModel, Idphongkham);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDichvuRemoteModel() {
		return _dichvuRemoteModel;
	}

	public void setDichvuRemoteModel(BaseModel<?> dichvuRemoteModel) {
		_dichvuRemoteModel = dichvuRemoteModel;
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

		Class<?> remoteModelClass = _dichvuRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dichvuRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DichvuLocalServiceUtil.addDichvu(this);
		}
		else {
			DichvuLocalServiceUtil.updateDichvu(this);
		}
	}

	@Override
	public Dichvu toEscapedModel() {
		return (Dichvu)ProxyUtil.newProxyInstance(Dichvu.class.getClassLoader(),
			new Class[] { Dichvu.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DichvuClp clone = new DichvuClp();

		clone.setIddichvu(getIddichvu());
		clone.setTendichvu(getTendichvu());
		clone.setMucthu(getMucthu());
		clone.setGhichi(getGhichi());
		clone.setIdphongkham(getIdphongkham());

		return clone;
	}

	@Override
	public int compareTo(Dichvu dichvu) {
		long primaryKey = dichvu.getPrimaryKey();

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

		if (!(obj instanceof DichvuClp)) {
			return false;
		}

		DichvuClp dichvu = (DichvuClp)obj;

		long primaryKey = dichvu.getPrimaryKey();

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
		StringBundler sb = new StringBundler(11);

		sb.append("{Iddichvu=");
		sb.append(getIddichvu());
		sb.append(", Tendichvu=");
		sb.append(getTendichvu());
		sb.append(", Mucthu=");
		sb.append(getMucthu());
		sb.append(", Ghichi=");
		sb.append(getGhichi());
		sb.append(", Idphongkham=");
		sb.append(getIdphongkham());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.dkcb.model.Dichvu");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>Iddichvu</column-name><column-value><![CDATA[");
		sb.append(getIddichvu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Tendichvu</column-name><column-value><![CDATA[");
		sb.append(getTendichvu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Mucthu</column-name><column-value><![CDATA[");
		sb.append(getMucthu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Ghichi</column-name><column-value><![CDATA[");
		sb.append(getGhichi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Idphongkham</column-name><column-value><![CDATA[");
		sb.append(getIdphongkham());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _Iddichvu;
	private String _Tendichvu;
	private double _Mucthu;
	private String _Ghichi;
	private String _Idphongkham;
	private BaseModel<?> _dichvuRemoteModel;
	private Class<?> _clpSerializerClass = com.dkcb.service.ClpSerializer.class;
}