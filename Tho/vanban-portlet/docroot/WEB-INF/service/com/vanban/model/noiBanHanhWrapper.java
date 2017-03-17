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
 * This class is a wrapper for {@link noiBanHanh}.
 * </p>
 *
 * @author nguye
 * @see noiBanHanh
 * @generated
 */
public class noiBanHanhWrapper implements noiBanHanh, ModelWrapper<noiBanHanh> {
	public noiBanHanhWrapper(noiBanHanh noiBanHanh) {
		_noiBanHanh = noiBanHanh;
	}

	@Override
	public Class<?> getModelClass() {
		return noiBanHanh.class;
	}

	@Override
	public String getModelClassName() {
		return noiBanHanh.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("noiBHId", getNoiBHId());
		attributes.put("tennoibanhanh", getTennoibanhanh());
		attributes.put("ghichu", getGhichu());
		attributes.put("tinhtrang", getTinhtrang());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long noiBHId = (Long)attributes.get("noiBHId");

		if (noiBHId != null) {
			setNoiBHId(noiBHId);
		}

		String tennoibanhanh = (String)attributes.get("tennoibanhanh");

		if (tennoibanhanh != null) {
			setTennoibanhanh(tennoibanhanh);
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
	* Returns the primary key of this noi ban hanh.
	*
	* @return the primary key of this noi ban hanh
	*/
	@Override
	public long getPrimaryKey() {
		return _noiBanHanh.getPrimaryKey();
	}

	/**
	* Sets the primary key of this noi ban hanh.
	*
	* @param primaryKey the primary key of this noi ban hanh
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_noiBanHanh.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the noi b h ID of this noi ban hanh.
	*
	* @return the noi b h ID of this noi ban hanh
	*/
	@Override
	public long getNoiBHId() {
		return _noiBanHanh.getNoiBHId();
	}

	/**
	* Sets the noi b h ID of this noi ban hanh.
	*
	* @param noiBHId the noi b h ID of this noi ban hanh
	*/
	@Override
	public void setNoiBHId(long noiBHId) {
		_noiBanHanh.setNoiBHId(noiBHId);
	}

	/**
	* Returns the tennoibanhanh of this noi ban hanh.
	*
	* @return the tennoibanhanh of this noi ban hanh
	*/
	@Override
	public java.lang.String getTennoibanhanh() {
		return _noiBanHanh.getTennoibanhanh();
	}

	/**
	* Sets the tennoibanhanh of this noi ban hanh.
	*
	* @param tennoibanhanh the tennoibanhanh of this noi ban hanh
	*/
	@Override
	public void setTennoibanhanh(java.lang.String tennoibanhanh) {
		_noiBanHanh.setTennoibanhanh(tennoibanhanh);
	}

	/**
	* Returns the ghichu of this noi ban hanh.
	*
	* @return the ghichu of this noi ban hanh
	*/
	@Override
	public java.lang.String getGhichu() {
		return _noiBanHanh.getGhichu();
	}

	/**
	* Sets the ghichu of this noi ban hanh.
	*
	* @param ghichu the ghichu of this noi ban hanh
	*/
	@Override
	public void setGhichu(java.lang.String ghichu) {
		_noiBanHanh.setGhichu(ghichu);
	}

	/**
	* Returns the tinhtrang of this noi ban hanh.
	*
	* @return the tinhtrang of this noi ban hanh
	*/
	@Override
	public boolean getTinhtrang() {
		return _noiBanHanh.getTinhtrang();
	}

	/**
	* Returns <code>true</code> if this noi ban hanh is tinhtrang.
	*
	* @return <code>true</code> if this noi ban hanh is tinhtrang; <code>false</code> otherwise
	*/
	@Override
	public boolean isTinhtrang() {
		return _noiBanHanh.isTinhtrang();
	}

	/**
	* Sets whether this noi ban hanh is tinhtrang.
	*
	* @param tinhtrang the tinhtrang of this noi ban hanh
	*/
	@Override
	public void setTinhtrang(boolean tinhtrang) {
		_noiBanHanh.setTinhtrang(tinhtrang);
	}

	@Override
	public boolean isNew() {
		return _noiBanHanh.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_noiBanHanh.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _noiBanHanh.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_noiBanHanh.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _noiBanHanh.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _noiBanHanh.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_noiBanHanh.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _noiBanHanh.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_noiBanHanh.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_noiBanHanh.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_noiBanHanh.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new noiBanHanhWrapper((noiBanHanh)_noiBanHanh.clone());
	}

	@Override
	public int compareTo(com.vanban.model.noiBanHanh noiBanHanh) {
		return _noiBanHanh.compareTo(noiBanHanh);
	}

	@Override
	public int hashCode() {
		return _noiBanHanh.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.vanban.model.noiBanHanh> toCacheModel() {
		return _noiBanHanh.toCacheModel();
	}

	@Override
	public com.vanban.model.noiBanHanh toEscapedModel() {
		return new noiBanHanhWrapper(_noiBanHanh.toEscapedModel());
	}

	@Override
	public com.vanban.model.noiBanHanh toUnescapedModel() {
		return new noiBanHanhWrapper(_noiBanHanh.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _noiBanHanh.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _noiBanHanh.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_noiBanHanh.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof noiBanHanhWrapper)) {
			return false;
		}

		noiBanHanhWrapper noiBanHanhWrapper = (noiBanHanhWrapper)obj;

		if (Validator.equals(_noiBanHanh, noiBanHanhWrapper._noiBanHanh)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public noiBanHanh getWrappednoiBanHanh() {
		return _noiBanHanh;
	}

	@Override
	public noiBanHanh getWrappedModel() {
		return _noiBanHanh;
	}

	@Override
	public void resetOriginalValues() {
		_noiBanHanh.resetOriginalValues();
	}

	private noiBanHanh _noiBanHanh;
}