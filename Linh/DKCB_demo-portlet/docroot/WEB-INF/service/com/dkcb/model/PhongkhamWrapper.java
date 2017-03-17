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
 * This class is a wrapper for {@link Phongkham}.
 * </p>
 *
 * @author hoang_000
 * @see Phongkham
 * @generated
 */
public class PhongkhamWrapper implements Phongkham, ModelWrapper<Phongkham> {
	public PhongkhamWrapper(Phongkham phongkham) {
		_phongkham = phongkham;
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

	/**
	* Returns the primary key of this phongkham.
	*
	* @return the primary key of this phongkham
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _phongkham.getPrimaryKey();
	}

	/**
	* Sets the primary key of this phongkham.
	*
	* @param primaryKey the primary key of this phongkham
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_phongkham.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the idphongkham of this phongkham.
	*
	* @return the idphongkham of this phongkham
	*/
	@Override
	public java.lang.String getIdphongkham() {
		return _phongkham.getIdphongkham();
	}

	/**
	* Sets the idphongkham of this phongkham.
	*
	* @param Idphongkham the idphongkham of this phongkham
	*/
	@Override
	public void setIdphongkham(java.lang.String Idphongkham) {
		_phongkham.setIdphongkham(Idphongkham);
	}

	/**
	* Returns the ten p k of this phongkham.
	*
	* @return the ten p k of this phongkham
	*/
	@Override
	public java.lang.String getTenPK() {
		return _phongkham.getTenPK();
	}

	/**
	* Sets the ten p k of this phongkham.
	*
	* @param TenPK the ten p k of this phongkham
	*/
	@Override
	public void setTenPK(java.lang.String TenPK) {
		_phongkham.setTenPK(TenPK);
	}

	@Override
	public boolean isNew() {
		return _phongkham.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_phongkham.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _phongkham.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_phongkham.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _phongkham.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _phongkham.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_phongkham.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _phongkham.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_phongkham.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_phongkham.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_phongkham.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PhongkhamWrapper((Phongkham)_phongkham.clone());
	}

	@Override
	public int compareTo(com.dkcb.model.Phongkham phongkham) {
		return _phongkham.compareTo(phongkham);
	}

	@Override
	public int hashCode() {
		return _phongkham.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.dkcb.model.Phongkham> toCacheModel() {
		return _phongkham.toCacheModel();
	}

	@Override
	public com.dkcb.model.Phongkham toEscapedModel() {
		return new PhongkhamWrapper(_phongkham.toEscapedModel());
	}

	@Override
	public com.dkcb.model.Phongkham toUnescapedModel() {
		return new PhongkhamWrapper(_phongkham.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _phongkham.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _phongkham.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_phongkham.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PhongkhamWrapper)) {
			return false;
		}

		PhongkhamWrapper phongkhamWrapper = (PhongkhamWrapper)obj;

		if (Validator.equals(_phongkham, phongkhamWrapper._phongkham)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Phongkham getWrappedPhongkham() {
		return _phongkham;
	}

	@Override
	public Phongkham getWrappedModel() {
		return _phongkham;
	}

	@Override
	public void resetOriginalValues() {
		_phongkham.resetOriginalValues();
	}

	private Phongkham _phongkham;
}