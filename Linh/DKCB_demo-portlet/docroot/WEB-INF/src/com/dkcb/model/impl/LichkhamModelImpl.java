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

import com.dkcb.model.Lichkham;
import com.dkcb.model.LichkhamModel;
import com.dkcb.model.LichkhamSoap;

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
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Lichkham service. Represents a row in the &quot;u_Lichkham&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.dkcb.model.LichkhamModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LichkhamImpl}.
 * </p>
 *
 * @author hoang_000
 * @see LichkhamImpl
 * @see com.dkcb.model.Lichkham
 * @see com.dkcb.model.LichkhamModel
 * @generated
 */
@JSON(strict = true)
public class LichkhamModelImpl extends BaseModelImpl<Lichkham>
	implements LichkhamModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a lichkham model instance should use the {@link com.dkcb.model.Lichkham} interface instead.
	 */
	public static final String TABLE_NAME = "u_Lichkham";
	public static final Object[][] TABLE_COLUMNS = {
			{ "Idbacsi", Types.VARCHAR },
			{ "Id", Types.BIGINT },
			{ "Idphongkham", Types.VARCHAR },
			{ "Iddichvu", Types.BIGINT },
			{ "Giodukien", Types.VARCHAR },
			{ "Ngaykham", Types.TIMESTAMP },
			{ "Idlichkham", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table u_Lichkham (Idbacsi VARCHAR(75) null,Id LONG,Idphongkham VARCHAR(75) null,Iddichvu LONG,Giodukien VARCHAR(75) null,Ngaykham DATE null,Idlichkham INTEGER not null primary key IDENTITY)";
	public static final String TABLE_SQL_DROP = "drop table u_Lichkham";
	public static final String ORDER_BY_JPQL = " ORDER BY lichkham.Idlichkham ASC";
	public static final String ORDER_BY_SQL = " ORDER BY u_Lichkham.Idlichkham ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.dkcb.model.Lichkham"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.dkcb.model.Lichkham"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Lichkham toModel(LichkhamSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Lichkham model = new LichkhamImpl();

		model.setIdbacsi(soapModel.getIdbacsi());
		model.setId(soapModel.getId());
		model.setIdphongkham(soapModel.getIdphongkham());
		model.setIddichvu(soapModel.getIddichvu());
		model.setGiodukien(soapModel.getGiodukien());
		model.setNgaykham(soapModel.getNgaykham());
		model.setIdlichkham(soapModel.getIdlichkham());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Lichkham> toModels(LichkhamSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Lichkham> models = new ArrayList<Lichkham>(soapModels.length);

		for (LichkhamSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.dkcb.model.Lichkham"));

	public LichkhamModelImpl() {
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
	public Class<?> getModelClass() {
		return Lichkham.class;
	}

	@Override
	public String getModelClassName() {
		return Lichkham.class.getName();
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

	@JSON
	@Override
	public String getIdbacsi() {
		if (_Idbacsi == null) {
			return StringPool.BLANK;
		}
		else {
			return _Idbacsi;
		}
	}

	@Override
	public void setIdbacsi(String Idbacsi) {
		_Idbacsi = Idbacsi;
	}

	@JSON
	@Override
	public long getId() {
		return _Id;
	}

	@Override
	public void setId(long Id) {
		_Id = Id;
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
	public long getIddichvu() {
		return _Iddichvu;
	}

	@Override
	public void setIddichvu(long Iddichvu) {
		_Iddichvu = Iddichvu;
	}

	@JSON
	@Override
	public String getGiodukien() {
		if (_Giodukien == null) {
			return StringPool.BLANK;
		}
		else {
			return _Giodukien;
		}
	}

	@Override
	public void setGiodukien(String Giodukien) {
		_Giodukien = Giodukien;
	}

	@JSON
	@Override
	public Date getNgaykham() {
		return _Ngaykham;
	}

	@Override
	public void setNgaykham(Date Ngaykham) {
		_Ngaykham = Ngaykham;
	}

	@JSON
	@Override
	public int getIdlichkham() {
		return _Idlichkham;
	}

	@Override
	public void setIdlichkham(int Idlichkham) {
		_Idlichkham = Idlichkham;
	}

	@Override
	public Lichkham toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Lichkham)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		LichkhamImpl lichkhamImpl = new LichkhamImpl();

		lichkhamImpl.setIdbacsi(getIdbacsi());
		lichkhamImpl.setId(getId());
		lichkhamImpl.setIdphongkham(getIdphongkham());
		lichkhamImpl.setIddichvu(getIddichvu());
		lichkhamImpl.setGiodukien(getGiodukien());
		lichkhamImpl.setNgaykham(getNgaykham());
		lichkhamImpl.setIdlichkham(getIdlichkham());

		lichkhamImpl.resetOriginalValues();

		return lichkhamImpl;
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

		if (!(obj instanceof Lichkham)) {
			return false;
		}

		Lichkham lichkham = (Lichkham)obj;

		int primaryKey = lichkham.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<Lichkham> toCacheModel() {
		LichkhamCacheModel lichkhamCacheModel = new LichkhamCacheModel();

		lichkhamCacheModel.Idbacsi = getIdbacsi();

		String Idbacsi = lichkhamCacheModel.Idbacsi;

		if ((Idbacsi != null) && (Idbacsi.length() == 0)) {
			lichkhamCacheModel.Idbacsi = null;
		}

		lichkhamCacheModel.Id = getId();

		lichkhamCacheModel.Idphongkham = getIdphongkham();

		String Idphongkham = lichkhamCacheModel.Idphongkham;

		if ((Idphongkham != null) && (Idphongkham.length() == 0)) {
			lichkhamCacheModel.Idphongkham = null;
		}

		lichkhamCacheModel.Iddichvu = getIddichvu();

		lichkhamCacheModel.Giodukien = getGiodukien();

		String Giodukien = lichkhamCacheModel.Giodukien;

		if ((Giodukien != null) && (Giodukien.length() == 0)) {
			lichkhamCacheModel.Giodukien = null;
		}

		Date Ngaykham = getNgaykham();

		if (Ngaykham != null) {
			lichkhamCacheModel.Ngaykham = Ngaykham.getTime();
		}
		else {
			lichkhamCacheModel.Ngaykham = Long.MIN_VALUE;
		}

		lichkhamCacheModel.Idlichkham = getIdlichkham();

		return lichkhamCacheModel;
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

	private static ClassLoader _classLoader = Lichkham.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Lichkham.class
		};
	private String _Idbacsi;
	private long _Id;
	private String _Idphongkham;
	private long _Iddichvu;
	private String _Giodukien;
	private Date _Ngaykham;
	private int _Idlichkham;
	private Lichkham _escapedModel;
}