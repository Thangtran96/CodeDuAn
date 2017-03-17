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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Khoa}.
 * </p>
 *
 * @author hoang_000
 * @see Khoa
 * @generated
 */
public class KhoaWrapper implements Khoa, ModelWrapper<Khoa> {
	public KhoaWrapper(Khoa khoa) {
		_khoa = khoa;
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

	/**
	* Returns the primary key of this khoa.
	*
	* @return the primary key of this khoa
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _khoa.getPrimaryKey();
	}

	/**
	* Sets the primary key of this khoa.
	*
	* @param primaryKey the primary key of this khoa
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_khoa.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the idphongkham of this khoa.
	*
	* @return the idphongkham of this khoa
	*/
	@Override
	public java.lang.String getIdphongkham() {
		return _khoa.getIdphongkham();
	}

	/**
	* Sets the idphongkham of this khoa.
	*
	* @param Idphongkham the idphongkham of this khoa
	*/
	@Override
	public void setIdphongkham(java.lang.String Idphongkham) {
		_khoa.setIdphongkham(Idphongkham);
	}

	/**
	* Returns the ten p k of this khoa.
	*
	* @return the ten p k of this khoa
	*/
	@Override
	public java.lang.String getTenPK() {
		return _khoa.getTenPK();
	}

	/**
	* Sets the ten p k of this khoa.
	*
	* @param TenPK the ten p k of this khoa
	*/
	@Override
	public void setTenPK(java.lang.String TenPK) {
		_khoa.setTenPK(TenPK);
	}

	@Override
	public boolean isNew() {
		return _khoa.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_khoa.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _khoa.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_khoa.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _khoa.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _khoa.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_khoa.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _khoa.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_khoa.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_khoa.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_khoa.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new KhoaWrapper((Khoa)_khoa.clone());
	}

	@Override
	public int compareTo(com.dkcb.model.Khoa khoa) {
		return _khoa.compareTo(khoa);
	}

	@Override
	public int hashCode() {
		return _khoa.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.dkcb.model.Khoa> toCacheModel() {
		return _khoa.toCacheModel();
	}

	@Override
	public com.dkcb.model.Khoa toEscapedModel() {
		return new KhoaWrapper(_khoa.toEscapedModel());
	}

	@Override
	public com.dkcb.model.Khoa toUnescapedModel() {
		return new KhoaWrapper(_khoa.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _khoa.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _khoa.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_khoa.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof KhoaWrapper)) {
			return false;
		}

		KhoaWrapper khoaWrapper = (KhoaWrapper)obj;

		if (Validator.equals(_khoa, khoaWrapper._khoa)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Khoa getWrappedKhoa() {
		return _khoa;
	}

	@Override
	public Khoa getWrappedModel() {
		return _khoa;
	}

	@Override
	public void resetOriginalValues() {
		_khoa.resetOriginalValues();
	}

	private Khoa _khoa;
}