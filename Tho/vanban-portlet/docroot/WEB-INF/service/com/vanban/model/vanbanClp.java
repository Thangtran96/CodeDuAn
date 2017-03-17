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
import com.vanban.service.vanbanLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author nguye
 */
public class vanbanClp extends BaseModelImpl<vanban> implements vanban {
	public vanbanClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return vanban.class;
	}

	@Override
	public String getModelClassName() {
		return vanban.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _vanbanId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setVanbanId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vanbanId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("vanbanId", getVanbanId());
		attributes.put("kihieu", getKihieu());
		attributes.put("trichyeu", getTrichyeu());
		attributes.put("ngaybanhanh", getNgaybanhanh());
		attributes.put("ngaytao", getNgaytao());
		attributes.put("nguoikiID", getNguoikiID());
		attributes.put("userID", getUserID());
		attributes.put("loaiID", getLoaiID());
		attributes.put("noiBHID", getNoiBHID());
		attributes.put("tinhtrang", getTinhtrang());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long vanbanId = (Long)attributes.get("vanbanId");

		if (vanbanId != null) {
			setVanbanId(vanbanId);
		}

		String kihieu = (String)attributes.get("kihieu");

		if (kihieu != null) {
			setKihieu(kihieu);
		}

		String trichyeu = (String)attributes.get("trichyeu");

		if (trichyeu != null) {
			setTrichyeu(trichyeu);
		}

		Date ngaybanhanh = (Date)attributes.get("ngaybanhanh");

		if (ngaybanhanh != null) {
			setNgaybanhanh(ngaybanhanh);
		}

		Date ngaytao = (Date)attributes.get("ngaytao");

		if (ngaytao != null) {
			setNgaytao(ngaytao);
		}

		Long nguoikiID = (Long)attributes.get("nguoikiID");

		if (nguoikiID != null) {
			setNguoikiID(nguoikiID);
		}

		Long userID = (Long)attributes.get("userID");

		if (userID != null) {
			setUserID(userID);
		}

		Long loaiID = (Long)attributes.get("loaiID");

		if (loaiID != null) {
			setLoaiID(loaiID);
		}

		Long noiBHID = (Long)attributes.get("noiBHID");

		if (noiBHID != null) {
			setNoiBHID(noiBHID);
		}

		Boolean tinhtrang = (Boolean)attributes.get("tinhtrang");

		if (tinhtrang != null) {
			setTinhtrang(tinhtrang);
		}
	}

	@Override
	public long getVanbanId() {
		return _vanbanId;
	}

	@Override
	public void setVanbanId(long vanbanId) {
		_vanbanId = vanbanId;

		if (_vanbanRemoteModel != null) {
			try {
				Class<?> clazz = _vanbanRemoteModel.getClass();

				Method method = clazz.getMethod("setVanbanId", long.class);

				method.invoke(_vanbanRemoteModel, vanbanId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getKihieu() {
		return _kihieu;
	}

	@Override
	public void setKihieu(String kihieu) {
		_kihieu = kihieu;

		if (_vanbanRemoteModel != null) {
			try {
				Class<?> clazz = _vanbanRemoteModel.getClass();

				Method method = clazz.getMethod("setKihieu", String.class);

				method.invoke(_vanbanRemoteModel, kihieu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTrichyeu() {
		return _trichyeu;
	}

	@Override
	public void setTrichyeu(String trichyeu) {
		_trichyeu = trichyeu;

		if (_vanbanRemoteModel != null) {
			try {
				Class<?> clazz = _vanbanRemoteModel.getClass();

				Method method = clazz.getMethod("setTrichyeu", String.class);

				method.invoke(_vanbanRemoteModel, trichyeu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgaybanhanh() {
		return _ngaybanhanh;
	}

	@Override
	public void setNgaybanhanh(Date ngaybanhanh) {
		_ngaybanhanh = ngaybanhanh;

		if (_vanbanRemoteModel != null) {
			try {
				Class<?> clazz = _vanbanRemoteModel.getClass();

				Method method = clazz.getMethod("setNgaybanhanh", Date.class);

				method.invoke(_vanbanRemoteModel, ngaybanhanh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgaytao() {
		return _ngaytao;
	}

	@Override
	public void setNgaytao(Date ngaytao) {
		_ngaytao = ngaytao;

		if (_vanbanRemoteModel != null) {
			try {
				Class<?> clazz = _vanbanRemoteModel.getClass();

				Method method = clazz.getMethod("setNgaytao", Date.class);

				method.invoke(_vanbanRemoteModel, ngaytao);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getNguoikiID() {
		return _nguoikiID;
	}

	@Override
	public void setNguoikiID(long nguoikiID) {
		_nguoikiID = nguoikiID;

		if (_vanbanRemoteModel != null) {
			try {
				Class<?> clazz = _vanbanRemoteModel.getClass();

				Method method = clazz.getMethod("setNguoikiID", long.class);

				method.invoke(_vanbanRemoteModel, nguoikiID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserID() {
		return _userID;
	}

	@Override
	public void setUserID(long userID) {
		_userID = userID;

		if (_vanbanRemoteModel != null) {
			try {
				Class<?> clazz = _vanbanRemoteModel.getClass();

				Method method = clazz.getMethod("setUserID", long.class);

				method.invoke(_vanbanRemoteModel, userID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getLoaiID() {
		return _loaiID;
	}

	@Override
	public void setLoaiID(long loaiID) {
		_loaiID = loaiID;

		if (_vanbanRemoteModel != null) {
			try {
				Class<?> clazz = _vanbanRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiID", long.class);

				method.invoke(_vanbanRemoteModel, loaiID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getNoiBHID() {
		return _noiBHID;
	}

	@Override
	public void setNoiBHID(long noiBHID) {
		_noiBHID = noiBHID;

		if (_vanbanRemoteModel != null) {
			try {
				Class<?> clazz = _vanbanRemoteModel.getClass();

				Method method = clazz.getMethod("setNoiBHID", long.class);

				method.invoke(_vanbanRemoteModel, noiBHID);
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

		if (_vanbanRemoteModel != null) {
			try {
				Class<?> clazz = _vanbanRemoteModel.getClass();

				Method method = clazz.getMethod("setTinhtrang", boolean.class);

				method.invoke(_vanbanRemoteModel, tinhtrang);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getvanbanRemoteModel() {
		return _vanbanRemoteModel;
	}

	public void setvanbanRemoteModel(BaseModel<?> vanbanRemoteModel) {
		_vanbanRemoteModel = vanbanRemoteModel;
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

		Class<?> remoteModelClass = _vanbanRemoteModel.getClass();

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

		Object returnValue = method.invoke(_vanbanRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			vanbanLocalServiceUtil.addvanban(this);
		}
		else {
			vanbanLocalServiceUtil.updatevanban(this);
		}
	}

	@Override
	public vanban toEscapedModel() {
		return (vanban)ProxyUtil.newProxyInstance(vanban.class.getClassLoader(),
			new Class[] { vanban.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		vanbanClp clone = new vanbanClp();

		clone.setVanbanId(getVanbanId());
		clone.setKihieu(getKihieu());
		clone.setTrichyeu(getTrichyeu());
		clone.setNgaybanhanh(getNgaybanhanh());
		clone.setNgaytao(getNgaytao());
		clone.setNguoikiID(getNguoikiID());
		clone.setUserID(getUserID());
		clone.setLoaiID(getLoaiID());
		clone.setNoiBHID(getNoiBHID());
		clone.setTinhtrang(getTinhtrang());

		return clone;
	}

	@Override
	public int compareTo(vanban vanban) {
		long primaryKey = vanban.getPrimaryKey();

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

		if (!(obj instanceof vanbanClp)) {
			return false;
		}

		vanbanClp vanban = (vanbanClp)obj;

		long primaryKey = vanban.getPrimaryKey();

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

		sb.append("{vanbanId=");
		sb.append(getVanbanId());
		sb.append(", kihieu=");
		sb.append(getKihieu());
		sb.append(", trichyeu=");
		sb.append(getTrichyeu());
		sb.append(", ngaybanhanh=");
		sb.append(getNgaybanhanh());
		sb.append(", ngaytao=");
		sb.append(getNgaytao());
		sb.append(", nguoikiID=");
		sb.append(getNguoikiID());
		sb.append(", userID=");
		sb.append(getUserID());
		sb.append(", loaiID=");
		sb.append(getLoaiID());
		sb.append(", noiBHID=");
		sb.append(getNoiBHID());
		sb.append(", tinhtrang=");
		sb.append(getTinhtrang());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.vanban.model.vanban");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>vanbanId</column-name><column-value><![CDATA[");
		sb.append(getVanbanId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kihieu</column-name><column-value><![CDATA[");
		sb.append(getKihieu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trichyeu</column-name><column-value><![CDATA[");
		sb.append(getTrichyeu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngaybanhanh</column-name><column-value><![CDATA[");
		sb.append(getNgaybanhanh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngaytao</column-name><column-value><![CDATA[");
		sb.append(getNgaytao());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguoikiID</column-name><column-value><![CDATA[");
		sb.append(getNguoikiID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userID</column-name><column-value><![CDATA[");
		sb.append(getUserID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiID</column-name><column-value><![CDATA[");
		sb.append(getLoaiID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>noiBHID</column-name><column-value><![CDATA[");
		sb.append(getNoiBHID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tinhtrang</column-name><column-value><![CDATA[");
		sb.append(getTinhtrang());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _vanbanId;
	private String _kihieu;
	private String _trichyeu;
	private Date _ngaybanhanh;
	private Date _ngaytao;
	private long _nguoikiID;
	private long _userID;
	private long _loaiID;
	private long _noiBHID;
	private boolean _tinhtrang;
	private BaseModel<?> _vanbanRemoteModel;
	private Class<?> _clpSerializerClass = com.vanban.service.ClpSerializer.class;
}