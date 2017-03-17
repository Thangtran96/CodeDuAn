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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the nguoidung service. Represents a row in the &quot;vanban_nguoidung&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.vanban.model.impl.nguoidungModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.vanban.model.impl.nguoidungImpl}.
 * </p>
 *
 * @author nguye
 * @see nguoidung
 * @see com.vanban.model.impl.nguoidungImpl
 * @see com.vanban.model.impl.nguoidungModelImpl
 * @generated
 */
public interface nguoidungModel extends BaseModel<nguoidung> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a nguoidung model instance should use the {@link nguoidung} interface instead.
	 */

	/**
	 * Returns the primary key of this nguoidung.
	 *
	 * @return the primary key of this nguoidung
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this nguoidung.
	 *
	 * @param primaryKey the primary key of this nguoidung
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the user ID of this nguoidung.
	 *
	 * @return the user ID of this nguoidung
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this nguoidung.
	 *
	 * @param userId the user ID of this nguoidung
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this nguoidung.
	 *
	 * @return the user uuid of this nguoidung
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this nguoidung.
	 *
	 * @param userUuid the user uuid of this nguoidung
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the hoten of this nguoidung.
	 *
	 * @return the hoten of this nguoidung
	 */
	@AutoEscape
	public String getHoten();

	/**
	 * Sets the hoten of this nguoidung.
	 *
	 * @param hoten the hoten of this nguoidung
	 */
	public void setHoten(String hoten);

	/**
	 * Returns the ngaysinh of this nguoidung.
	 *
	 * @return the ngaysinh of this nguoidung
	 */
	public Date getNgaysinh();

	/**
	 * Sets the ngaysinh of this nguoidung.
	 *
	 * @param ngaysinh the ngaysinh of this nguoidung
	 */
	public void setNgaysinh(Date ngaysinh);

	/**
	 * Returns the gioitinh of this nguoidung.
	 *
	 * @return the gioitinh of this nguoidung
	 */
	public int getGioitinh();

	/**
	 * Sets the gioitinh of this nguoidung.
	 *
	 * @param gioitinh the gioitinh of this nguoidung
	 */
	public void setGioitinh(int gioitinh);

	/**
	 * Returns the diachi of this nguoidung.
	 *
	 * @return the diachi of this nguoidung
	 */
	@AutoEscape
	public String getDiachi();

	/**
	 * Sets the diachi of this nguoidung.
	 *
	 * @param diachi the diachi of this nguoidung
	 */
	public void setDiachi(String diachi);

	/**
	 * Returns the sdt of this nguoidung.
	 *
	 * @return the sdt of this nguoidung
	 */
	@AutoEscape
	public String getSdt();

	/**
	 * Sets the sdt of this nguoidung.
	 *
	 * @param sdt the sdt of this nguoidung
	 */
	public void setSdt(String sdt);

	/**
	 * Returns the donvi of this nguoidung.
	 *
	 * @return the donvi of this nguoidung
	 */
	@AutoEscape
	public String getDonvi();

	/**
	 * Sets the donvi of this nguoidung.
	 *
	 * @param donvi the donvi of this nguoidung
	 */
	public void setDonvi(String donvi);

	/**
	 * Returns the mail of this nguoidung.
	 *
	 * @return the mail of this nguoidung
	 */
	@AutoEscape
	public String getMail();

	/**
	 * Sets the mail of this nguoidung.
	 *
	 * @param mail the mail of this nguoidung
	 */
	public void setMail(String mail);

	/**
	 * Returns the matkhau of this nguoidung.
	 *
	 * @return the matkhau of this nguoidung
	 */
	@AutoEscape
	public String getMatkhau();

	/**
	 * Sets the matkhau of this nguoidung.
	 *
	 * @param matkhau the matkhau of this nguoidung
	 */
	public void setMatkhau(String matkhau);

	/**
	 * Returns the tinhtrang of this nguoidung.
	 *
	 * @return the tinhtrang of this nguoidung
	 */
	public boolean getTinhtrang();

	/**
	 * Returns <code>true</code> if this nguoidung is tinhtrang.
	 *
	 * @return <code>true</code> if this nguoidung is tinhtrang; <code>false</code> otherwise
	 */
	public boolean isTinhtrang();

	/**
	 * Sets whether this nguoidung is tinhtrang.
	 *
	 * @param tinhtrang the tinhtrang of this nguoidung
	 */
	public void setTinhtrang(boolean tinhtrang);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(com.vanban.model.nguoidung nguoidung);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.vanban.model.nguoidung> toCacheModel();

	@Override
	public com.vanban.model.nguoidung toEscapedModel();

	@Override
	public com.vanban.model.nguoidung toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}