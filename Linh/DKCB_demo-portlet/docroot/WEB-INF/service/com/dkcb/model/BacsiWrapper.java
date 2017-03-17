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
 * This class is a wrapper for {@link Bacsi}.
 * </p>
 *
 * @author hoang_000
 * @see Bacsi
 * @generated
 */
public class BacsiWrapper implements Bacsi, ModelWrapper<Bacsi> {
	public BacsiWrapper(Bacsi bacsi) {
		_bacsi = bacsi;
	}

	@Override
	public Class<?> getModelClass() {
		return Bacsi.class;
	}

	@Override
	public String getModelClassName() {
		return Bacsi.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Idbacsi", getIdbacsi());
		attributes.put("TenBS", getTenBS());
		attributes.put("Idphongkham", getIdphongkham());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String Idbacsi = (String)attributes.get("Idbacsi");

		if (Idbacsi != null) {
			setIdbacsi(Idbacsi);
		}

		String TenBS = (String)attributes.get("TenBS");

		if (TenBS != null) {
			setTenBS(TenBS);
		}

		String Idphongkham = (String)attributes.get("Idphongkham");

		if (Idphongkham != null) {
			setIdphongkham(Idphongkham);
		}
	}

	/**
	* Returns the primary key of this bacsi.
	*
	* @return the primary key of this bacsi
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _bacsi.getPrimaryKey();
	}

	/**
	* Sets the primary key of this bacsi.
	*
	* @param primaryKey the primary key of this bacsi
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_bacsi.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the idbacsi of this bacsi.
	*
	* @return the idbacsi of this bacsi
	*/
	@Override
	public java.lang.String getIdbacsi() {
		return _bacsi.getIdbacsi();
	}

	/**
	* Sets the idbacsi of this bacsi.
	*
	* @param Idbacsi the idbacsi of this bacsi
	*/
	@Override
	public void setIdbacsi(java.lang.String Idbacsi) {
		_bacsi.setIdbacsi(Idbacsi);
	}

	/**
	* Returns the ten b s of this bacsi.
	*
	* @return the ten b s of this bacsi
	*/
	@Override
	public java.lang.String getTenBS() {
		return _bacsi.getTenBS();
	}

	/**
	* Sets the ten b s of this bacsi.
	*
	* @param TenBS the ten b s of this bacsi
	*/
	@Override
	public void setTenBS(java.lang.String TenBS) {
		_bacsi.setTenBS(TenBS);
	}

	/**
	* Returns the idphongkham of this bacsi.
	*
	* @return the idphongkham of this bacsi
	*/
	@Override
	public java.lang.String getIdphongkham() {
		return _bacsi.getIdphongkham();
	}

	/**
	* Sets the idphongkham of this bacsi.
	*
	* @param Idphongkham the idphongkham of this bacsi
	*/
	@Override
	public void setIdphongkham(java.lang.String Idphongkham) {
		_bacsi.setIdphongkham(Idphongkham);
	}

	@Override
	public boolean isNew() {
		return _bacsi.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_bacsi.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _bacsi.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_bacsi.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _bacsi.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _bacsi.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_bacsi.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _bacsi.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_bacsi.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_bacsi.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_bacsi.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new BacsiWrapper((Bacsi)_bacsi.clone());
	}

	@Override
	public int compareTo(com.dkcb.model.Bacsi bacsi) {
		return _bacsi.compareTo(bacsi);
	}

	@Override
	public int hashCode() {
		return _bacsi.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.dkcb.model.Bacsi> toCacheModel() {
		return _bacsi.toCacheModel();
	}

	@Override
	public com.dkcb.model.Bacsi toEscapedModel() {
		return new BacsiWrapper(_bacsi.toEscapedModel());
	}

	@Override
	public com.dkcb.model.Bacsi toUnescapedModel() {
		return new BacsiWrapper(_bacsi.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _bacsi.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _bacsi.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_bacsi.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BacsiWrapper)) {
			return false;
		}

		BacsiWrapper bacsiWrapper = (BacsiWrapper)obj;

		if (Validator.equals(_bacsi, bacsiWrapper._bacsi)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Bacsi getWrappedBacsi() {
		return _bacsi;
	}

	@Override
	public Bacsi getWrappedModel() {
		return _bacsi;
	}

	@Override
	public void resetOriginalValues() {
		_bacsi.resetOriginalValues();
	}

	private Bacsi _bacsi;
}