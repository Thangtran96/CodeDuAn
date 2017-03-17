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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link LoaiVB}.
 * </p>
 *
 * @author nguye
 * @see LoaiVB
 * @generated
 */
public class LoaiVBWrapper implements LoaiVB, ModelWrapper<LoaiVB> {
	public LoaiVBWrapper(LoaiVB loaiVB) {
		_loaiVB = loaiVB;
	}

	@Override
	public Class<?> getModelClass() {
		return LoaiVB.class;
	}

	@Override
	public String getModelClassName() {
		return LoaiVB.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("loaiId", getLoaiId());
		attributes.put("tenloai", getTenloai());
		attributes.put("ghichu", getGhichu());
		attributes.put("tinhtrang", getTinhtrang());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long loaiId = (Long)attributes.get("loaiId");

		if (loaiId != null) {
			setLoaiId(loaiId);
		}

		String tenloai = (String)attributes.get("tenloai");

		if (tenloai != null) {
			setTenloai(tenloai);
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

	/**
	* Returns the primary key of this loai v b.
	*
	* @return the primary key of this loai v b
	*/
	@Override
	public long getPrimaryKey() {
		return _loaiVB.getPrimaryKey();
	}

	/**
	* Sets the primary key of this loai v b.
	*
	* @param primaryKey the primary key of this loai v b
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_loaiVB.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the loai ID of this loai v b.
	*
	* @return the loai ID of this loai v b
	*/
	@Override
	public long getLoaiId() {
		return _loaiVB.getLoaiId();
	}

	/**
	* Sets the loai ID of this loai v b.
	*
	* @param loaiId the loai ID of this loai v b
	*/
	@Override
	public void setLoaiId(long loaiId) {
		_loaiVB.setLoaiId(loaiId);
	}

	/**
	* Returns the tenloai of this loai v b.
	*
	* @return the tenloai of this loai v b
	*/
	@Override
	public java.lang.String getTenloai() {
		return _loaiVB.getTenloai();
	}

	/**
	* Sets the tenloai of this loai v b.
	*
	* @param tenloai the tenloai of this loai v b
	*/
	@Override
	public void setTenloai(java.lang.String tenloai) {
		_loaiVB.setTenloai(tenloai);
	}

	/**
	* Returns the ghichu of this loai v b.
	*
	* @return the ghichu of this loai v b
	*/
	@Override
	public java.lang.String getGhichu() {
		return _loaiVB.getGhichu();
	}

	/**
	* Sets the ghichu of this loai v b.
	*
	* @param ghichu the ghichu of this loai v b
	*/
	@Override
	public void setGhichu(java.lang.String ghichu) {
		_loaiVB.setGhichu(ghichu);
	}

	/**
	* Returns the tinhtrang of this loai v b.
	*
	* @return the tinhtrang of this loai v b
	*/
	@Override
	public boolean getTinhtrang() {
		return _loaiVB.getTinhtrang();
	}

	/**
	* Returns <code>true</code> if this loai v b is tinhtrang.
	*
	* @return <code>true</code> if this loai v b is tinhtrang; <code>false</code> otherwise
	*/
	@Override
	public boolean isTinhtrang() {
		return _loaiVB.isTinhtrang();
	}

	/**
	* Sets whether this loai v b is tinhtrang.
	*
	* @param tinhtrang the tinhtrang of this loai v b
	*/
	@Override
	public void setTinhtrang(boolean tinhtrang) {
		_loaiVB.setTinhtrang(tinhtrang);
	}

	@Override
	public boolean isNew() {
		return _loaiVB.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_loaiVB.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _loaiVB.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_loaiVB.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _loaiVB.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _loaiVB.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_loaiVB.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _loaiVB.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_loaiVB.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_loaiVB.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_loaiVB.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new LoaiVBWrapper((LoaiVB)_loaiVB.clone());
	}

	@Override
	public int compareTo(com.vanban.model.LoaiVB loaiVB) {
		return _loaiVB.compareTo(loaiVB);
	}

	@Override
	public int hashCode() {
		return _loaiVB.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.vanban.model.LoaiVB> toCacheModel() {
		return _loaiVB.toCacheModel();
	}

	@Override
	public com.vanban.model.LoaiVB toEscapedModel() {
		return new LoaiVBWrapper(_loaiVB.toEscapedModel());
	}

	@Override
	public com.vanban.model.LoaiVB toUnescapedModel() {
		return new LoaiVBWrapper(_loaiVB.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _loaiVB.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _loaiVB.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_loaiVB.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LoaiVBWrapper)) {
			return false;
		}

		LoaiVBWrapper loaiVBWrapper = (LoaiVBWrapper)obj;

		if (Validator.equals(_loaiVB, loaiVBWrapper._loaiVB)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public LoaiVB getWrappedLoaiVB() {
		return _loaiVB;
	}

	@Override
	public LoaiVB getWrappedModel() {
		return _loaiVB;
	}

	@Override
	public void resetOriginalValues() {
		_loaiVB.resetOriginalValues();
	}

	private LoaiVB _loaiVB;
}