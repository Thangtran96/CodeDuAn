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
 * This class is a wrapper for {@link nguoidung}.
 * </p>
 *
 * @author nguye
 * @see nguoidung
 * @generated
 */
public class nguoidungWrapper implements nguoidung, ModelWrapper<nguoidung> {
	public nguoidungWrapper(nguoidung nguoidung) {
		_nguoidung = nguoidung;
	}

	@Override
	public Class<?> getModelClass() {
		return nguoidung.class;
	}

	@Override
	public String getModelClassName() {
		return nguoidung.class.getName();
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
		attributes.put("tinhtrang", getTinhtrang());

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

		Boolean tinhtrang = (Boolean)attributes.get("tinhtrang");

		if (tinhtrang != null) {
			setTinhtrang(tinhtrang);
		}
	}

	/**
	* Returns the primary key of this nguoidung.
	*
	* @return the primary key of this nguoidung
	*/
	@Override
	public long getPrimaryKey() {
		return _nguoidung.getPrimaryKey();
	}

	/**
	* Sets the primary key of this nguoidung.
	*
	* @param primaryKey the primary key of this nguoidung
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_nguoidung.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the user ID of this nguoidung.
	*
	* @return the user ID of this nguoidung
	*/
	@Override
	public long getUserId() {
		return _nguoidung.getUserId();
	}

	/**
	* Sets the user ID of this nguoidung.
	*
	* @param userId the user ID of this nguoidung
	*/
	@Override
	public void setUserId(long userId) {
		_nguoidung.setUserId(userId);
	}

	/**
	* Returns the user uuid of this nguoidung.
	*
	* @return the user uuid of this nguoidung
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _nguoidung.getUserUuid();
	}

	/**
	* Sets the user uuid of this nguoidung.
	*
	* @param userUuid the user uuid of this nguoidung
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_nguoidung.setUserUuid(userUuid);
	}

	/**
	* Returns the hoten of this nguoidung.
	*
	* @return the hoten of this nguoidung
	*/
	@Override
	public java.lang.String getHoten() {
		return _nguoidung.getHoten();
	}

	/**
	* Sets the hoten of this nguoidung.
	*
	* @param hoten the hoten of this nguoidung
	*/
	@Override
	public void setHoten(java.lang.String hoten) {
		_nguoidung.setHoten(hoten);
	}

	/**
	* Returns the ngaysinh of this nguoidung.
	*
	* @return the ngaysinh of this nguoidung
	*/
	@Override
	public java.util.Date getNgaysinh() {
		return _nguoidung.getNgaysinh();
	}

	/**
	* Sets the ngaysinh of this nguoidung.
	*
	* @param ngaysinh the ngaysinh of this nguoidung
	*/
	@Override
	public void setNgaysinh(java.util.Date ngaysinh) {
		_nguoidung.setNgaysinh(ngaysinh);
	}

	/**
	* Returns the gioitinh of this nguoidung.
	*
	* @return the gioitinh of this nguoidung
	*/
	@Override
	public int getGioitinh() {
		return _nguoidung.getGioitinh();
	}

	/**
	* Sets the gioitinh of this nguoidung.
	*
	* @param gioitinh the gioitinh of this nguoidung
	*/
	@Override
	public void setGioitinh(int gioitinh) {
		_nguoidung.setGioitinh(gioitinh);
	}

	/**
	* Returns the diachi of this nguoidung.
	*
	* @return the diachi of this nguoidung
	*/
	@Override
	public java.lang.String getDiachi() {
		return _nguoidung.getDiachi();
	}

	/**
	* Sets the diachi of this nguoidung.
	*
	* @param diachi the diachi of this nguoidung
	*/
	@Override
	public void setDiachi(java.lang.String diachi) {
		_nguoidung.setDiachi(diachi);
	}

	/**
	* Returns the sdt of this nguoidung.
	*
	* @return the sdt of this nguoidung
	*/
	@Override
	public java.lang.String getSdt() {
		return _nguoidung.getSdt();
	}

	/**
	* Sets the sdt of this nguoidung.
	*
	* @param sdt the sdt of this nguoidung
	*/
	@Override
	public void setSdt(java.lang.String sdt) {
		_nguoidung.setSdt(sdt);
	}

	/**
	* Returns the donvi of this nguoidung.
	*
	* @return the donvi of this nguoidung
	*/
	@Override
	public java.lang.String getDonvi() {
		return _nguoidung.getDonvi();
	}

	/**
	* Sets the donvi of this nguoidung.
	*
	* @param donvi the donvi of this nguoidung
	*/
	@Override
	public void setDonvi(java.lang.String donvi) {
		_nguoidung.setDonvi(donvi);
	}

	/**
	* Returns the mail of this nguoidung.
	*
	* @return the mail of this nguoidung
	*/
	@Override
	public java.lang.String getMail() {
		return _nguoidung.getMail();
	}

	/**
	* Sets the mail of this nguoidung.
	*
	* @param mail the mail of this nguoidung
	*/
	@Override
	public void setMail(java.lang.String mail) {
		_nguoidung.setMail(mail);
	}

	/**
	* Returns the matkhau of this nguoidung.
	*
	* @return the matkhau of this nguoidung
	*/
	@Override
	public java.lang.String getMatkhau() {
		return _nguoidung.getMatkhau();
	}

	/**
	* Sets the matkhau of this nguoidung.
	*
	* @param matkhau the matkhau of this nguoidung
	*/
	@Override
	public void setMatkhau(java.lang.String matkhau) {
		_nguoidung.setMatkhau(matkhau);
	}

	/**
	* Returns the tinhtrang of this nguoidung.
	*
	* @return the tinhtrang of this nguoidung
	*/
	@Override
	public boolean getTinhtrang() {
		return _nguoidung.getTinhtrang();
	}

	/**
	* Returns <code>true</code> if this nguoidung is tinhtrang.
	*
	* @return <code>true</code> if this nguoidung is tinhtrang; <code>false</code> otherwise
	*/
	@Override
	public boolean isTinhtrang() {
		return _nguoidung.isTinhtrang();
	}

	/**
	* Sets whether this nguoidung is tinhtrang.
	*
	* @param tinhtrang the tinhtrang of this nguoidung
	*/
	@Override
	public void setTinhtrang(boolean tinhtrang) {
		_nguoidung.setTinhtrang(tinhtrang);
	}

	@Override
	public boolean isNew() {
		return _nguoidung.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_nguoidung.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _nguoidung.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_nguoidung.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _nguoidung.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _nguoidung.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_nguoidung.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _nguoidung.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_nguoidung.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_nguoidung.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_nguoidung.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new nguoidungWrapper((nguoidung)_nguoidung.clone());
	}

	@Override
	public int compareTo(com.vanban.model.nguoidung nguoidung) {
		return _nguoidung.compareTo(nguoidung);
	}

	@Override
	public int hashCode() {
		return _nguoidung.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.vanban.model.nguoidung> toCacheModel() {
		return _nguoidung.toCacheModel();
	}

	@Override
	public com.vanban.model.nguoidung toEscapedModel() {
		return new nguoidungWrapper(_nguoidung.toEscapedModel());
	}

	@Override
	public com.vanban.model.nguoidung toUnescapedModel() {
		return new nguoidungWrapper(_nguoidung.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _nguoidung.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _nguoidung.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_nguoidung.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof nguoidungWrapper)) {
			return false;
		}

		nguoidungWrapper nguoidungWrapper = (nguoidungWrapper)obj;

		if (Validator.equals(_nguoidung, nguoidungWrapper._nguoidung)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public nguoidung getWrappednguoidung() {
		return _nguoidung;
	}

	@Override
	public nguoidung getWrappedModel() {
		return _nguoidung;
	}

	@Override
	public void resetOriginalValues() {
		_nguoidung.resetOriginalValues();
	}

	private nguoidung _nguoidung;
}