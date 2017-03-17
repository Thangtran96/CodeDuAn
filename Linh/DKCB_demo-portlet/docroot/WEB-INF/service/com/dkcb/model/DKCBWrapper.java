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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DKCB}.
 * </p>
 *
 * @author hoang_000
 * @see DKCB
 * @generated
 */
public class DKCBWrapper implements DKCB, ModelWrapper<DKCB> {
	public DKCBWrapper(DKCB dkcb) {
		_dkcb = dkcb;
	}

	@Override
	public Class<?> getModelClass() {
		return DKCB.class;
	}

	@Override
	public String getModelClassName() {
		return DKCB.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id", getId());
		attributes.put("Hoten", getHoten());
		attributes.put("Diachi", getDiachi());
		attributes.put("Gioitinh", getGioitinh());
		attributes.put("Sodienthoai", getSodienthoai());
		attributes.put("Ngaysinh", getNgaysinh());
		attributes.put("Trieuchung", getTrieuchung());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		String Hoten = (String)attributes.get("Hoten");

		if (Hoten != null) {
			setHoten(Hoten);
		}

		String Diachi = (String)attributes.get("Diachi");

		if (Diachi != null) {
			setDiachi(Diachi);
		}

		Boolean Gioitinh = (Boolean)attributes.get("Gioitinh");

		if (Gioitinh != null) {
			setGioitinh(Gioitinh);
		}

		String Sodienthoai = (String)attributes.get("Sodienthoai");

		if (Sodienthoai != null) {
			setSodienthoai(Sodienthoai);
		}

		Date Ngaysinh = (Date)attributes.get("Ngaysinh");

		if (Ngaysinh != null) {
			setNgaysinh(Ngaysinh);
		}

		String Trieuchung = (String)attributes.get("Trieuchung");

		if (Trieuchung != null) {
			setTrieuchung(Trieuchung);
		}
	}

	/**
	* Returns the primary key of this d k c b.
	*
	* @return the primary key of this d k c b
	*/
	@Override
	public long getPrimaryKey() {
		return _dkcb.getPrimaryKey();
	}

	/**
	* Sets the primary key of this d k c b.
	*
	* @param primaryKey the primary key of this d k c b
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dkcb.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this d k c b.
	*
	* @return the ID of this d k c b
	*/
	@Override
	public long getId() {
		return _dkcb.getId();
	}

	/**
	* Sets the ID of this d k c b.
	*
	* @param Id the ID of this d k c b
	*/
	@Override
	public void setId(long Id) {
		_dkcb.setId(Id);
	}

	/**
	* Returns the hoten of this d k c b.
	*
	* @return the hoten of this d k c b
	*/
	@Override
	public java.lang.String getHoten() {
		return _dkcb.getHoten();
	}

	/**
	* Sets the hoten of this d k c b.
	*
	* @param Hoten the hoten of this d k c b
	*/
	@Override
	public void setHoten(java.lang.String Hoten) {
		_dkcb.setHoten(Hoten);
	}

	/**
	* Returns the diachi of this d k c b.
	*
	* @return the diachi of this d k c b
	*/
	@Override
	public java.lang.String getDiachi() {
		return _dkcb.getDiachi();
	}

	/**
	* Sets the diachi of this d k c b.
	*
	* @param Diachi the diachi of this d k c b
	*/
	@Override
	public void setDiachi(java.lang.String Diachi) {
		_dkcb.setDiachi(Diachi);
	}

	/**
	* Returns the gioitinh of this d k c b.
	*
	* @return the gioitinh of this d k c b
	*/
	@Override
	public boolean getGioitinh() {
		return _dkcb.getGioitinh();
	}

	/**
	* Returns <code>true</code> if this d k c b is gioitinh.
	*
	* @return <code>true</code> if this d k c b is gioitinh; <code>false</code> otherwise
	*/
	@Override
	public boolean isGioitinh() {
		return _dkcb.isGioitinh();
	}

	/**
	* Sets whether this d k c b is gioitinh.
	*
	* @param Gioitinh the gioitinh of this d k c b
	*/
	@Override
	public void setGioitinh(boolean Gioitinh) {
		_dkcb.setGioitinh(Gioitinh);
	}

	/**
	* Returns the sodienthoai of this d k c b.
	*
	* @return the sodienthoai of this d k c b
	*/
	@Override
	public java.lang.String getSodienthoai() {
		return _dkcb.getSodienthoai();
	}

	/**
	* Sets the sodienthoai of this d k c b.
	*
	* @param Sodienthoai the sodienthoai of this d k c b
	*/
	@Override
	public void setSodienthoai(java.lang.String Sodienthoai) {
		_dkcb.setSodienthoai(Sodienthoai);
	}

	/**
	* Returns the ngaysinh of this d k c b.
	*
	* @return the ngaysinh of this d k c b
	*/
	@Override
	public java.util.Date getNgaysinh() {
		return _dkcb.getNgaysinh();
	}

	/**
	* Sets the ngaysinh of this d k c b.
	*
	* @param Ngaysinh the ngaysinh of this d k c b
	*/
	@Override
	public void setNgaysinh(java.util.Date Ngaysinh) {
		_dkcb.setNgaysinh(Ngaysinh);
	}

	/**
	* Returns the trieuchung of this d k c b.
	*
	* @return the trieuchung of this d k c b
	*/
	@Override
	public java.lang.String getTrieuchung() {
		return _dkcb.getTrieuchung();
	}

	/**
	* Sets the trieuchung of this d k c b.
	*
	* @param Trieuchung the trieuchung of this d k c b
	*/
	@Override
	public void setTrieuchung(java.lang.String Trieuchung) {
		_dkcb.setTrieuchung(Trieuchung);
	}

	@Override
	public boolean isNew() {
		return _dkcb.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dkcb.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dkcb.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dkcb.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dkcb.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dkcb.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dkcb.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dkcb.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dkcb.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dkcb.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dkcb.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DKCBWrapper((DKCB)_dkcb.clone());
	}

	@Override
	public int compareTo(com.dkcb.model.DKCB dkcb) {
		return _dkcb.compareTo(dkcb);
	}

	@Override
	public int hashCode() {
		return _dkcb.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.dkcb.model.DKCB> toCacheModel() {
		return _dkcb.toCacheModel();
	}

	@Override
	public com.dkcb.model.DKCB toEscapedModel() {
		return new DKCBWrapper(_dkcb.toEscapedModel());
	}

	@Override
	public com.dkcb.model.DKCB toUnescapedModel() {
		return new DKCBWrapper(_dkcb.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dkcb.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dkcb.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dkcb.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DKCBWrapper)) {
			return false;
		}

		DKCBWrapper dkcbWrapper = (DKCBWrapper)obj;

		if (Validator.equals(_dkcb, dkcbWrapper._dkcb)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DKCB getWrappedDKCB() {
		return _dkcb;
	}

	@Override
	public DKCB getWrappedModel() {
		return _dkcb;
	}

	@Override
	public void resetOriginalValues() {
		_dkcb.resetOriginalValues();
	}

	private DKCB _dkcb;
}