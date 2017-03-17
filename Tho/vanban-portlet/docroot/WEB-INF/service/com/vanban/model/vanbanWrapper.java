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
 * This class is a wrapper for {@link vanban}.
 * </p>
 *
 * @author nguye
 * @see vanban
 * @generated
 */
public class vanbanWrapper implements vanban, ModelWrapper<vanban> {
	public vanbanWrapper(vanban vanban) {
		_vanban = vanban;
	}

	@Override
	public Class<?> getModelClass() {
		return vanban.class;
	}

	@Override
	public String getModelClassName() {
		return vanban.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("vanbanId", getVanbanId());
		attributes.put("kihieu", getKihieu());
		attributes.put("trichyeu", getTrichyeu());
		attributes.put("ngaybanhanh", getNgaybanhanh());
		attributes.put("ngaytao", getNgaytao());
		attributes.put("nguoikiID", getNguoikiID());
		attributes.put("userID", getUserID());
		attributes.put("loaiID", getLoaiID());
		attributes.put("noiBHID", getNoiBHID());
		attributes.put("tinhtrang", getTinhtrang());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long vanbanId = (Long)attributes.get("vanbanId");

		if (vanbanId != null) {
			setVanbanId(vanbanId);
		}

		String kihieu = (String)attributes.get("kihieu");

		if (kihieu != null) {
			setKihieu(kihieu);
		}

		String trichyeu = (String)attributes.get("trichyeu");

		if (trichyeu != null) {
			setTrichyeu(trichyeu);
		}

		Date ngaybanhanh = (Date)attributes.get("ngaybanhanh");

		if (ngaybanhanh != null) {
			setNgaybanhanh(ngaybanhanh);
		}

		Date ngaytao = (Date)attributes.get("ngaytao");

		if (ngaytao != null) {
			setNgaytao(ngaytao);
		}

		Long nguoikiID = (Long)attributes.get("nguoikiID");

		if (nguoikiID != null) {
			setNguoikiID(nguoikiID);
		}

		Long userID = (Long)attributes.get("userID");

		if (userID != null) {
			setUserID(userID);
		}

		Long loaiID = (Long)attributes.get("loaiID");

		if (loaiID != null) {
			setLoaiID(loaiID);
		}

		Long noiBHID = (Long)attributes.get("noiBHID");

		if (noiBHID != null) {
			setNoiBHID(noiBHID);
		}

		Boolean tinhtrang = (Boolean)attributes.get("tinhtrang");

		if (tinhtrang != null) {
			setTinhtrang(tinhtrang);
		}
	}

	/**
	* Returns the primary key of this vanban.
	*
	* @return the primary key of this vanban
	*/
	@Override
	public long getPrimaryKey() {
		return _vanban.getPrimaryKey();
	}

	/**
	* Sets the primary key of this vanban.
	*
	* @param primaryKey the primary key of this vanban
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vanban.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the vanban ID of this vanban.
	*
	* @return the vanban ID of this vanban
	*/
	@Override
	public long getVanbanId() {
		return _vanban.getVanbanId();
	}

	/**
	* Sets the vanban ID of this vanban.
	*
	* @param vanbanId the vanban ID of this vanban
	*/
	@Override
	public void setVanbanId(long vanbanId) {
		_vanban.setVanbanId(vanbanId);
	}

	/**
	* Returns the kihieu of this vanban.
	*
	* @return the kihieu of this vanban
	*/
	@Override
	public java.lang.String getKihieu() {
		return _vanban.getKihieu();
	}

	/**
	* Sets the kihieu of this vanban.
	*
	* @param kihieu the kihieu of this vanban
	*/
	@Override
	public void setKihieu(java.lang.String kihieu) {
		_vanban.setKihieu(kihieu);
	}

	/**
	* Returns the trichyeu of this vanban.
	*
	* @return the trichyeu of this vanban
	*/
	@Override
	public java.lang.String getTrichyeu() {
		return _vanban.getTrichyeu();
	}

	/**
	* Sets the trichyeu of this vanban.
	*
	* @param trichyeu the trichyeu of this vanban
	*/
	@Override
	public void setTrichyeu(java.lang.String trichyeu) {
		_vanban.setTrichyeu(trichyeu);
	}

	/**
	* Returns the ngaybanhanh of this vanban.
	*
	* @return the ngaybanhanh of this vanban
	*/
	@Override
	public java.util.Date getNgaybanhanh() {
		return _vanban.getNgaybanhanh();
	}

	/**
	* Sets the ngaybanhanh of this vanban.
	*
	* @param ngaybanhanh the ngaybanhanh of this vanban
	*/
	@Override
	public void setNgaybanhanh(java.util.Date ngaybanhanh) {
		_vanban.setNgaybanhanh(ngaybanhanh);
	}

	/**
	* Returns the ngaytao of this vanban.
	*
	* @return the ngaytao of this vanban
	*/
	@Override
	public java.util.Date getNgaytao() {
		return _vanban.getNgaytao();
	}

	/**
	* Sets the ngaytao of this vanban.
	*
	* @param ngaytao the ngaytao of this vanban
	*/
	@Override
	public void setNgaytao(java.util.Date ngaytao) {
		_vanban.setNgaytao(ngaytao);
	}

	/**
	* Returns the nguoiki i d of this vanban.
	*
	* @return the nguoiki i d of this vanban
	*/
	@Override
	public long getNguoikiID() {
		return _vanban.getNguoikiID();
	}

	/**
	* Sets the nguoiki i d of this vanban.
	*
	* @param nguoikiID the nguoiki i d of this vanban
	*/
	@Override
	public void setNguoikiID(long nguoikiID) {
		_vanban.setNguoikiID(nguoikiID);
	}

	/**
	* Returns the user i d of this vanban.
	*
	* @return the user i d of this vanban
	*/
	@Override
	public long getUserID() {
		return _vanban.getUserID();
	}

	/**
	* Sets the user i d of this vanban.
	*
	* @param userID the user i d of this vanban
	*/
	@Override
	public void setUserID(long userID) {
		_vanban.setUserID(userID);
	}

	/**
	* Returns the loai i d of this vanban.
	*
	* @return the loai i d of this vanban
	*/
	@Override
	public long getLoaiID() {
		return _vanban.getLoaiID();
	}

	/**
	* Sets the loai i d of this vanban.
	*
	* @param loaiID the loai i d of this vanban
	*/
	@Override
	public void setLoaiID(long loaiID) {
		_vanban.setLoaiID(loaiID);
	}

	/**
	* Returns the noi b h i d of this vanban.
	*
	* @return the noi b h i d of this vanban
	*/
	@Override
	public long getNoiBHID() {
		return _vanban.getNoiBHID();
	}

	/**
	* Sets the noi b h i d of this vanban.
	*
	* @param noiBHID the noi b h i d of this vanban
	*/
	@Override
	public void setNoiBHID(long noiBHID) {
		_vanban.setNoiBHID(noiBHID);
	}

	/**
	* Returns the tinhtrang of this vanban.
	*
	* @return the tinhtrang of this vanban
	*/
	@Override
	public boolean getTinhtrang() {
		return _vanban.getTinhtrang();
	}

	/**
	* Returns <code>true</code> if this vanban is tinhtrang.
	*
	* @return <code>true</code> if this vanban is tinhtrang; <code>false</code> otherwise
	*/
	@Override
	public boolean isTinhtrang() {
		return _vanban.isTinhtrang();
	}

	/**
	* Sets whether this vanban is tinhtrang.
	*
	* @param tinhtrang the tinhtrang of this vanban
	*/
	@Override
	public void setTinhtrang(boolean tinhtrang) {
		_vanban.setTinhtrang(tinhtrang);
	}

	@Override
	public boolean isNew() {
		return _vanban.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_vanban.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _vanban.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vanban.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _vanban.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _vanban.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_vanban.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _vanban.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_vanban.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_vanban.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_vanban.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new vanbanWrapper((vanban)_vanban.clone());
	}

	@Override
	public int compareTo(com.vanban.model.vanban vanban) {
		return _vanban.compareTo(vanban);
	}

	@Override
	public int hashCode() {
		return _vanban.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.vanban.model.vanban> toCacheModel() {
		return _vanban.toCacheModel();
	}

	@Override
	public com.vanban.model.vanban toEscapedModel() {
		return new vanbanWrapper(_vanban.toEscapedModel());
	}

	@Override
	public com.vanban.model.vanban toUnescapedModel() {
		return new vanbanWrapper(_vanban.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _vanban.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vanban.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_vanban.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof vanbanWrapper)) {
			return false;
		}

		vanbanWrapper vanbanWrapper = (vanbanWrapper)obj;

		if (Validator.equals(_vanban, vanbanWrapper._vanban)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public vanban getWrappedvanban() {
		return _vanban;
	}

	@Override
	public vanban getWrappedModel() {
		return _vanban;
	}

	@Override
	public void resetOriginalValues() {
		_vanban.resetOriginalValues();
	}

	private vanban _vanban;
}