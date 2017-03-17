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
 * This class is a wrapper for {@link Lichkham}.
 * </p>
 *
 * @author hoang_000
 * @see Lichkham
 * @generated
 */
public class LichkhamWrapper implements Lichkham, ModelWrapper<Lichkham> {
	public LichkhamWrapper(Lichkham lichkham) {
		_lichkham = lichkham;
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

	/**
	* Returns the primary key of this lichkham.
	*
	* @return the primary key of this lichkham
	*/
	@Override
	public int getPrimaryKey() {
		return _lichkham.getPrimaryKey();
	}

	/**
	* Sets the primary key of this lichkham.
	*
	* @param primaryKey the primary key of this lichkham
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_lichkham.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the idbacsi of this lichkham.
	*
	* @return the idbacsi of this lichkham
	*/
	@Override
	public java.lang.String getIdbacsi() {
		return _lichkham.getIdbacsi();
	}

	/**
	* Sets the idbacsi of this lichkham.
	*
	* @param Idbacsi the idbacsi of this lichkham
	*/
	@Override
	public void setIdbacsi(java.lang.String Idbacsi) {
		_lichkham.setIdbacsi(Idbacsi);
	}

	/**
	* Returns the ID of this lichkham.
	*
	* @return the ID of this lichkham
	*/
	@Override
	public long getId() {
		return _lichkham.getId();
	}

	/**
	* Sets the ID of this lichkham.
	*
	* @param Id the ID of this lichkham
	*/
	@Override
	public void setId(long Id) {
		_lichkham.setId(Id);
	}

	/**
	* Returns the idphongkham of this lichkham.
	*
	* @return the idphongkham of this lichkham
	*/
	@Override
	public java.lang.String getIdphongkham() {
		return _lichkham.getIdphongkham();
	}

	/**
	* Sets the idphongkham of this lichkham.
	*
	* @param Idphongkham the idphongkham of this lichkham
	*/
	@Override
	public void setIdphongkham(java.lang.String Idphongkham) {
		_lichkham.setIdphongkham(Idphongkham);
	}

	/**
	* Returns the iddichvu of this lichkham.
	*
	* @return the iddichvu of this lichkham
	*/
	@Override
	public long getIddichvu() {
		return _lichkham.getIddichvu();
	}

	/**
	* Sets the iddichvu of this lichkham.
	*
	* @param Iddichvu the iddichvu of this lichkham
	*/
	@Override
	public void setIddichvu(long Iddichvu) {
		_lichkham.setIddichvu(Iddichvu);
	}

	/**
	* Returns the giodukien of this lichkham.
	*
	* @return the giodukien of this lichkham
	*/
	@Override
	public java.lang.String getGiodukien() {
		return _lichkham.getGiodukien();
	}

	/**
	* Sets the giodukien of this lichkham.
	*
	* @param Giodukien the giodukien of this lichkham
	*/
	@Override
	public void setGiodukien(java.lang.String Giodukien) {
		_lichkham.setGiodukien(Giodukien);
	}

	/**
	* Returns the ngaykham of this lichkham.
	*
	* @return the ngaykham of this lichkham
	*/
	@Override
	public java.util.Date getNgaykham() {
		return _lichkham.getNgaykham();
	}

	/**
	* Sets the ngaykham of this lichkham.
	*
	* @param Ngaykham the ngaykham of this lichkham
	*/
	@Override
	public void setNgaykham(java.util.Date Ngaykham) {
		_lichkham.setNgaykham(Ngaykham);
	}

	/**
	* Returns the idlichkham of this lichkham.
	*
	* @return the idlichkham of this lichkham
	*/
	@Override
	public int getIdlichkham() {
		return _lichkham.getIdlichkham();
	}

	/**
	* Sets the idlichkham of this lichkham.
	*
	* @param Idlichkham the idlichkham of this lichkham
	*/
	@Override
	public void setIdlichkham(int Idlichkham) {
		_lichkham.setIdlichkham(Idlichkham);
	}

	@Override
	public boolean isNew() {
		return _lichkham.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_lichkham.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _lichkham.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_lichkham.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _lichkham.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _lichkham.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_lichkham.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _lichkham.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_lichkham.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_lichkham.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_lichkham.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new LichkhamWrapper((Lichkham)_lichkham.clone());
	}

	@Override
	public int compareTo(com.dkcb.model.Lichkham lichkham) {
		return _lichkham.compareTo(lichkham);
	}

	@Override
	public int hashCode() {
		return _lichkham.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.dkcb.model.Lichkham> toCacheModel() {
		return _lichkham.toCacheModel();
	}

	@Override
	public com.dkcb.model.Lichkham toEscapedModel() {
		return new LichkhamWrapper(_lichkham.toEscapedModel());
	}

	@Override
	public com.dkcb.model.Lichkham toUnescapedModel() {
		return new LichkhamWrapper(_lichkham.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _lichkham.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _lichkham.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_lichkham.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LichkhamWrapper)) {
			return false;
		}

		LichkhamWrapper lichkhamWrapper = (LichkhamWrapper)obj;

		if (Validator.equals(_lichkham, lichkhamWrapper._lichkham)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Lichkham getWrappedLichkham() {
		return _lichkham;
	}

	@Override
	public Lichkham getWrappedModel() {
		return _lichkham;
	}

	@Override
	public void resetOriginalValues() {
		_lichkham.resetOriginalValues();
	}

	private Lichkham _lichkham;
}