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

package com.dkcb.model.impl;

import com.dkcb.model.Phongkham;
import com.dkcb.model.PhongkhamModel;
import com.dkcb.model.PhongkhamSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Phongkham service. Represents a row in the &quot;u_Phongkham&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.dkcb.model.PhongkhamModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PhongkhamImpl}.
 * </p>
 *
 * @author hoang_000
 * @see PhongkhamImpl
 * @see com.dkcb.model.Phongkham
 * @see com.dkcb.model.PhongkhamModel
 * @generated
 */
@JSON(strict = true)
public class PhongkhamModelImpl extends BaseModelImpl<Phongkham>
	implements PhongkhamModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a phongkham model instance should use the {@link com.dkcb.model.Phongkham} interface instead.
	 */
	public static final String TABLE_NAME = "u_Phongkham";
	public static final Object[][] TABLE_COLUMNS = {
			{ "Idphongkham", Types.VARCHAR },
			{ "TenPK", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table u_Phongkham (Idphongkham VARCHAR(75) not null primary key,TenPK VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table u_Phongkham";
	public static final String ORDER_BY_JPQL = " ORDER BY phongkham.Idphongkham ASC";
	public static final String ORDER_BY_SQL = " ORDER BY u_Phongkham.Idphongkham ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.dkcb.model.Phongkham"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.dkcb.model.Phongkham"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Phongkham toModel(PhongkhamSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Phongkham model = new PhongkhamImpl();

		model.setIdphongkham(soapModel.getIdphongkham());
		model.setTenPK(soapModel.getTenPK());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Phongkham> toModels(PhongkhamSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Phongkham> models = new ArrayList<Phongkham>(soapModels.length);

		for (PhongkhamSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.dkcb.model.Phongkham"));

	public PhongkhamModelImpl() {
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
	public Class<?> getModelClass() {
		return Phongkham.class;
	}

	@Override
	public String getModelClassName() {
		return Phongkham.class.getName();
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

	@JSON
	@Override
	public String getIdphongkham() {
		if (_Idphongkham == null) {
			return StringPool.BLANK;
		}
		else {
			return _Idphongkham;
		}
	}

	@Override
	public void setIdphongkham(String Idphongkham) {
		_Idphongkham = Idphongkham;
	}

	@JSON
	@Override
	public String getTenPK() {
		if (_TenPK == null) {
			return StringPool.BLANK;
		}
		else {
			return _TenPK;
		}
	}

	@Override
	public void setTenPK(String TenPK) {
		_TenPK = TenPK;
	}

	@Override
	public Phongkham toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Phongkham)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		PhongkhamImpl phongkhamImpl = new PhongkhamImpl();

		phongkhamImpl.setIdphongkham(getIdphongkham());
		phongkhamImpl.setTenPK(getTenPK());

		phongkhamImpl.resetOriginalValues();

		return phongkhamImpl;
	}

	@Override
	public int compareTo(Phongkham phongkham) {
		String primaryKey = phongkham.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Phongkham)) {
			return false;
		}

		Phongkham phongkham = (Phongkham)obj;

		String primaryKey = phongkham.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<Phongkham> toCacheModel() {
		PhongkhamCacheModel phongkhamCacheModel = new PhongkhamCacheModel();

		phongkhamCacheModel.Idphongkham = getIdphongkham();

		String Idphongkham = phongkhamCacheModel.Idphongkham;

		if ((Idphongkham != null) && (Idphongkham.length() == 0)) {
			phongkhamCacheModel.Idphongkham = null;
		}

		phongkhamCacheModel.TenPK = getTenPK();

		String TenPK = phongkhamCacheModel.TenPK;

		if ((TenPK != null) && (TenPK.length() == 0)) {
			phongkhamCacheModel.TenPK = null;
		}

		return phongkhamCacheModel;
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
		sb.append("com.dkcb.model.Phongkham");
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

	private static ClassLoader _classLoader = Phongkham.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Phongkham.class
		};
	private String _Idphongkham;
	private String _TenPK;
	private Phongkham _escapedModel;
}