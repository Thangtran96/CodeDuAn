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
 * This class is a wrapper for {@link user}.
 * </p>
 *
 * @author nguye
 * @see user
 * @generated
 */
public class userWrapper implements user, ModelWrapper<user> {
	public userWrapper(user user) {
		_user = user;
	}

	@Override
	public Class<?> getModelClass() {
		return user.class;
	}

	@Override
	public String getModelClassName() {
		return user.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("userId", getUserId());
		attributes.put("hoten", getHoten());
		attributes.put("ngaysinh", getNgaysinh());
		attributes.put("gioitinh", getGioitinh());
		attributes.put("diachi", getDiachi());
		attributes.put("sdt", getSdt());
		attributes.put("donvi", getDonvi());
		attributes.put("mail", getMail());
		attributes.put("matkhau", getMatkhau());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
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

		String diachi = (String)attributes.get("diachi");

		if (diachi != null) {
			setDiachi(diachi);
		}

		String sdt = (String)attributes.get("sdt");

		if (sdt != null) {
			setSdt(sdt);
		}

		String donvi = (String)attributes.get("donvi");

		if (donvi != null) {
			setDonvi(donvi);
		}

		String mail = (String)attributes.get("mail");

		if (mail != null) {
			setMail(mail);
		}

		String matkhau = (String)attributes.get("matkhau");

		if (matkhau != null) {
			setMatkhau(matkhau);
		}
	}

	/**
	* Returns the primary key of this user.
	*
	* @return the primary key of this user
	*/
	@Override
	public long getPrimaryKey() {
		return _user.getPrimaryKey();
	}

	/**
	* Sets the primary key of this user.
	*
	* @param primaryKey the primary key of this user
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_user.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the user ID of this user.
	*
	* @return the user ID of this user
	*/
	@Override
	public long getUserId() {
		return _user.getUserId();
	}

	/**
	* Sets the user ID of this user.
	*
	* @param userId the user ID of this user
	*/
	@Override
	public void setUserId(long userId) {
		_user.setUserId(userId);
	}

	/**
	* Returns the user uuid of this user.
	*
	* @return the user uuid of this user
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _user.getUserUuid();
	}

	/**
	* Sets the user uuid of this user.
	*
	* @param userUuid the user uuid of this user
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_user.setUserUuid(userUuid);
	}

	/**
	* Returns the hoten of this user.
	*
	* @return the hoten of this user
	*/
	@Override
	public java.lang.String getHoten() {
		return _user.getHoten();
	}

	/**
	* Sets the hoten of this user.
	*
	* @param hoten the hoten of this user
	*/
	@Override
	public void setHoten(java.lang.String hoten) {
		_user.setHoten(hoten);
	}

	/**
	* Returns the ngaysinh of this user.
	*
	* @return the ngaysinh of this user
	*/
	@Override
	public java.util.Date getNgaysinh() {
		return _user.getNgaysinh();
	}

	/**
	* Sets the ngaysinh of this user.
	*
	* @param ngaysinh the ngaysinh of this user
	*/
	@Override
	public void setNgaysinh(java.util.Date ngaysinh) {
		_user.setNgaysinh(ngaysinh);
	}

	/**
	* Returns the gioitinh of this user.
	*
	* @return the gioitinh of this user
	*/
	@Override
	public int getGioitinh() {
		return _user.getGioitinh();
	}

	/**
	* Sets the gioitinh of this user.
	*
	* @param gioitinh the gioitinh of this user
	*/
	@Override
	public void setGioitinh(int gioitinh) {
		_user.setGioitinh(gioitinh);
	}

	/**
	* Returns the diachi of this user.
	*
	* @return the diachi of this user
	*/
	@Override
	public java.lang.String getDiachi() {
		return _user.getDiachi();
	}

	/**
	* Sets the diachi of this user.
	*
	* @param diachi the diachi of this user
	*/
	@Override
	public void setDiachi(java.lang.String diachi) {
		_user.setDiachi(diachi);
	}

	/**
	* Returns the sdt of this user.
	*
	* @return the sdt of this user
	*/
	@Override
	public java.lang.String getSdt() {
		return _user.getSdt();
	}

	/**
	* Sets the sdt of this user.
	*
	* @param sdt the sdt of this user
	*/
	@Override
	public void setSdt(java.lang.String sdt) {
		_user.setSdt(sdt);
	}

	/**
	* Returns the donvi of this user.
	*
	* @return the donvi of this user
	*/
	@Override
	public java.lang.String getDonvi() {
		return _user.getDonvi();
	}

	/**
	* Sets the donvi of this user.
	*
	* @param donvi the donvi of this user
	*/
	@Override
	public void setDonvi(java.lang.String donvi) {
		_user.setDonvi(donvi);
	}

	/**
	* Returns the mail of this user.
	*
	* @return the mail of this user
	*/
	@Override
	public java.lang.String getMail() {
		return _user.getMail();
	}

	/**
	* Sets the mail of this user.
	*
	* @param mail the mail of this user
	*/
	@Override
	public void setMail(java.lang.String mail) {
		_user.setMail(mail);
	}

	/**
	* Returns the matkhau of this user.
	*
	* @return the matkhau of this user
	*/
	@Override
	public java.lang.String getMatkhau() {
		return _user.getMatkhau();
	}

	/**
	* Sets the matkhau of this user.
	*
	* @param matkhau the matkhau of this user
	*/
	@Override
	public void setMatkhau(java.lang.String matkhau) {
		_user.setMatkhau(matkhau);
	}

	@Override
	public boolean isNew() {
		return _user.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_user.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _user.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_user.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _user.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _user.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_user.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _user.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_user.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_user.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_user.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new userWrapper((user)_user.clone());
	}

	@Override
	public int compareTo(com.vanban.model.user user) {
		return _user.compareTo(user);
	}

	@Override
	public int hashCode() {
		return _user.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.vanban.model.user> toCacheModel() {
		return _user.toCacheModel();
	}

	@Override
	public com.vanban.model.user toEscapedModel() {
		return new userWrapper(_user.toEscapedModel());
	}

	@Override
	public com.vanban.model.user toUnescapedModel() {
		return new userWrapper(_user.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _user.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _user.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_user.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof userWrapper)) {
			return false;
		}

		userWrapper userWrapper = (userWrapper)obj;

		if (Validator.equals(_user, userWrapper._user)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public user getWrappeduser() {
		return _user;
	}

	@Override
	public user getWrappedModel() {
		return _user;
	}

	@Override
	public void resetOriginalValues() {
		_user.resetOriginalValues();
	}

	private user _user;
}