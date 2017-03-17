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
 * This class is a wrapper for {@link Dichvu}.
 * </p>
 *
 * @author hoang_000
 * @see Dichvu
 * @generated
 */
public class DichvuWrapper implements Dichvu, ModelWrapper<Dichvu> {
	public DichvuWrapper(Dichvu dichvu) {
		_dichvu = dichvu;
	}

	@Override
	public Class<?> getModelClass() {
		return Dichvu.class;
	}

	@Override
	public String getModelClassName() {
		return Dichvu.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Iddichvu", getIddichvu());
		attributes.put("Tendichvu", getTendichvu());
		attributes.put("Mucthu", getMucthu());
		attributes.put("Ghichi", getGhichi());
		attributes.put("Idphongkham", getIdphongkham());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Iddichvu = (Long)attributes.get("Iddichvu");

		if (Iddichvu != null) {
			setIddichvu(Iddichvu);
		}

		String Tendichvu = (String)attributes.get("Tendichvu");

		if (Tendichvu != null) {
			setTendichvu(Tendichvu);
		}

		Double Mucthu = (Double)attributes.get("Mucthu");

		if (Mucthu != null) {
			setMucthu(Mucthu);
		}

		String Ghichi = (String)attributes.get("Ghichi");

		if (Ghichi != null) {
			setGhichi(Ghichi);
		}

		String Idphongkham = (String)attributes.get("Idphongkham");

		if (Idphongkham != null) {
			setIdphongkham(Idphongkham);
		}
	}

	/**
	* Returns the primary key of this dichvu.
	*
	* @return the primary key of this dichvu
	*/
	@Override
	public long getPrimaryKey() {
		return _dichvu.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dichvu.
	*
	* @param primaryKey the primary key of this dichvu
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dichvu.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the iddichvu of this dichvu.
	*
	* @return the iddichvu of this dichvu
	*/
	@Override
	public long getIddichvu() {
		return _dichvu.getIddichvu();
	}

	/**
	* Sets the iddichvu of this dichvu.
	*
	* @param Iddichvu the iddichvu of this dichvu
	*/
	@Override
	public void setIddichvu(long Iddichvu) {
		_dichvu.setIddichvu(Iddichvu);
	}

	/**
	* Returns the tendichvu of this dichvu.
	*
	* @return the tendichvu of this dichvu
	*/
	@Override
	public java.lang.String getTendichvu() {
		return _dichvu.getTendichvu();
	}

	/**
	* Sets the tendichvu of this dichvu.
	*
	* @param Tendichvu the tendichvu of this dichvu
	*/
	@Override
	public void setTendichvu(java.lang.String Tendichvu) {
		_dichvu.setTendichvu(Tendichvu);
	}

	/**
	* Returns the mucthu of this dichvu.
	*
	* @return the mucthu of this dichvu
	*/
	@Override
	public double getMucthu() {
		return _dichvu.getMucthu();
	}

	/**
	* Sets the mucthu of this dichvu.
	*
	* @param Mucthu the mucthu of this dichvu
	*/
	@Override
	public void setMucthu(double Mucthu) {
		_dichvu.setMucthu(Mucthu);
	}

	/**
	* Returns the ghichi of this dichvu.
	*
	* @return the ghichi of this dichvu
	*/
	@Override
	public java.lang.String getGhichi() {
		return _dichvu.getGhichi();
	}

	/**
	* Sets the ghichi of this dichvu.
	*
	* @param Ghichi the ghichi of this dichvu
	*/
	@Override
	public void setGhichi(java.lang.String Ghichi) {
		_dichvu.setGhichi(Ghichi);
	}

	/**
	* Returns the idphongkham of this dichvu.
	*
	* @return the idphongkham of this dichvu
	*/
	@Override
	public java.lang.String getIdphongkham() {
		return _dichvu.getIdphongkham();
	}

	/**
	* Sets the idphongkham of this dichvu.
	*
	* @param Idphongkham the idphongkham of this dichvu
	*/
	@Override
	public void setIdphongkham(java.lang.String Idphongkham) {
		_dichvu.setIdphongkham(Idphongkham);
	}

	@Override
	public boolean isNew() {
		return _dichvu.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dichvu.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dichvu.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dichvu.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dichvu.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dichvu.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dichvu.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dichvu.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dichvu.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dichvu.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dichvu.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DichvuWrapper((Dichvu)_dichvu.clone());
	}

	@Override
	public int compareTo(com.dkcb.model.Dichvu dichvu) {
		return _dichvu.compareTo(dichvu);
	}

	@Override
	public int hashCode() {
		return _dichvu.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.dkcb.model.Dichvu> toCacheModel() {
		return _dichvu.toCacheModel();
	}

	@Override
	public com.dkcb.model.Dichvu toEscapedModel() {
		return new DichvuWrapper(_dichvu.toEscapedModel());
	}

	@Override
	public com.dkcb.model.Dichvu toUnescapedModel() {
		return new DichvuWrapper(_dichvu.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dichvu.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dichvu.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dichvu.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DichvuWrapper)) {
			return false;
		}

		DichvuWrapper dichvuWrapper = (DichvuWrapper)obj;

		if (Validator.equals(_dichvu, dichvuWrapper._dichvu)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Dichvu getWrappedDichvu() {
		return _dichvu;
	}

	@Override
	public Dichvu getWrappedModel() {
		return _dichvu;
	}

	@Override
	public void resetOriginalValues() {
		_dichvu.resetOriginalValues();
	}

	private Dichvu _dichvu;
}