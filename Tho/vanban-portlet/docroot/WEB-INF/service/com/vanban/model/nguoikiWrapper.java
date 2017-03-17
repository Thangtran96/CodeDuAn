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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link nguoiki}.
 * </p>
 *
 * @author nguye
 * @see nguoiki
 * @generated
 */
public class nguoikiWrapper implements nguoiki, ModelWrapper<nguoiki> {
	public nguoikiWrapper(nguoiki nguoiki) {
		_nguoiki = nguoiki;
	}

	@Override
	public Class<?> getModelClass() {
		return nguoiki.class;
	}

	@Override
	public String getModelClassName() {
		return nguoiki.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("nguoikiID", getNguoikiID());
		attributes.put("hoten", getHoten());
		attributes.put("ngaysinh", getNgaysinh());
		attributes.put("gioitinh", getGioitinh());
		attributes.put("donvi", getDonvi());
		attributes.put("chucvu", getChucvu());
		attributes.put("tinhtrang", getTinhtrang());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long nguoikiID = (Long)attributes.get("nguoikiID");

		if (nguoikiID != null) {
			setNguoikiID(nguoikiID);
		}

		String hoten = (String)attributes.get("hoten");

		if (hoten != null) {
			setHoten(hoten);
		}

		Date ngaysinh = (Date)attributes.get("ngaysinh");

		if (ngaysinh != null) {
			setNgaysinh(ngaysinh);
		}

		Integer gioitinh = (Integer)attributes.get("gioitinh");

		if (gioitinh != null) {
			setGioitinh(gioitinh);
		}

		String donvi = (String)attributes.get("donvi");

		if (donvi != null) {
			setDonvi(donvi);
		}

		String chucvu = (String)attributes.get("chucvu");

		if (chucvu != null) {
			setChucvu(chucvu);
		}

		Boolean tinhtrang = (Boolean)attributes.get("tinhtrang");

		if (tinhtrang != null) {
			setTinhtrang(tinhtrang);
		}
	}

	/**
	* Returns the primary key of this nguoiki.
	*
	* @return the primary key of this nguoiki
	*/
	@Override
	public long getPrimaryKey() {
		return _nguoiki.getPrimaryKey();
	}

	/**
	* Sets the primary key of this nguoiki.
	*
	* @param primaryKey the primary key of this nguoiki
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_nguoiki.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the nguoiki i d of this nguoiki.
	*
	* @return the nguoiki i d of this nguoiki
	*/
	@Override
	public long getNguoikiID() {
		return _nguoiki.getNguoikiID();
	}

	/**
	* Sets the nguoiki i d of this nguoiki.
	*
	* @param nguoikiID the nguoiki i d of this nguoiki
	*/
	@Override
	public void setNguoikiID(long nguoikiID) {
		_nguoiki.setNguoikiID(nguoikiID);
	}

	/**
	* Returns the hoten of this nguoiki.
	*
	* @return the hoten of this nguoiki
	*/
	@Override
	public java.lang.String getHoten() {
		return _nguoiki.getHoten();
	}

	/**
	* Sets the hoten of this nguoiki.
	*
	* @param hoten the hoten of this nguoiki
	*/
	@Override
	public void setHoten(java.lang.String hoten) {
		_nguoiki.setHoten(hoten);
	}

	/**
	* Returns the ngaysinh of this nguoiki.
	*
	* @return the ngaysinh of this nguoiki
	*/
	@Override
	public java.util.Date getNgaysinh() {
		return _nguoiki.getNgaysinh();
	}

	/**
	* Sets the ngaysinh of this nguoiki.
	*
	* @param ngaysinh the ngaysinh of this nguoiki
	*/
	@Override
	public void setNgaysinh(java.util.Date ngaysinh) {
		_nguoiki.setNgaysinh(ngaysinh);
	}

	/**
	* Returns the gioitinh of this nguoiki.
	*
	* @return the gioitinh of this nguoiki
	*/
	@Override
	public int getGioitinh() {
		return _nguoiki.getGioitinh();
	}

	/**
	* Sets the gioitinh of this nguoiki.
	*
	* @param gioitinh the gioitinh of this nguoiki
	*/
	@Override
	public void setGioitinh(int gioitinh) {
		_nguoiki.setGioitinh(gioitinh);
	}

	/**
	* Returns the donvi of this nguoiki.
	*
	* @return the donvi of this nguoiki
	*/
	@Override
	public java.lang.String getDonvi() {
		return _nguoiki.getDonvi();
	}

	/**
	* Sets the donvi of this nguoiki.
	*
	* @param donvi the donvi of this nguoiki
	*/
	@Override
	public void setDonvi(java.lang.String donvi) {
		_nguoiki.setDonvi(donvi);
	}

	/**
	* Returns the chucvu of this nguoiki.
	*
	* @return the chucvu of this nguoiki
	*/
	@Override
	public java.lang.String getChucvu() {
		return _nguoiki.getChucvu();
	}

	/**
	* Sets the chucvu of this nguoiki.
	*
	* @param chucvu the chucvu of this nguoiki
	*/
	@Override
	public void setChucvu(java.lang.String chucvu) {
		_nguoiki.setChucvu(chucvu);
	}

	/**
	* Returns the tinhtrang of this nguoiki.
	*
	* @return the tinhtrang of this nguoiki
	*/
	@Override
	public boolean getTinhtrang() {
		return _nguoiki.getTinhtrang();
	}

	/**
	* Returns <code>true</code> if this nguoiki is tinhtrang.
	*
	* @return <code>true</code> if this nguoiki is tinhtrang; <code>false</code> otherwise
	*/
	@Override
	public boolean isTinhtrang() {
		return _nguoiki.isTinhtrang();
	}

	/**
	* Sets whether this nguoiki is tinhtrang.
	*
	* @param tinhtrang the tinhtrang of this nguoiki
	*/
	@Override
	public void setTinhtrang(boolean tinhtrang) {
		_nguoiki.setTinhtrang(tinhtrang);
	}

	@Override
	public boolean isNew() {
		return _nguoiki.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_nguoiki.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _nguoiki.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_nguoiki.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _nguoiki.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _nguoiki.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_nguoiki.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _nguoiki.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_nguoiki.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_nguoiki.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_nguoiki.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new nguoikiWrapper((nguoiki)_nguoiki.clone());
	}

	@Override
	public int compareTo(com.vanban.model.nguoiki nguoiki) {
		return _nguoiki.compareTo(nguoiki);
	}

	@Override
	public int hashCode() {
		return _nguoiki.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.vanban.model.nguoiki> toCacheModel() {
		return _nguoiki.toCacheModel();
	}

	@Override
	public com.vanban.model.nguoiki toEscapedModel() {
		return new nguoikiWrapper(_nguoiki.toEscapedModel());
	}

	@Override
	public com.vanban.model.nguoiki toUnescapedModel() {
		return new nguoikiWrapper(_nguoiki.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _nguoiki.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _nguoiki.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_nguoiki.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof nguoikiWrapper)) {
			return false;
		}

		nguoikiWrapper nguoikiWrapper = (nguoikiWrapper)obj;

		if (Validator.equals(_nguoiki, nguoikiWrapper._nguoiki)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public nguoiki getWrappednguoiki() {
		return _nguoiki;
	}

	@Override
	public nguoiki getWrappedModel() {
		return _nguoiki;
	}

	@Override
	public void resetOriginalValues() {
		_nguoiki.resetOriginalValues();
	}

	private nguoiki _nguoiki;
}