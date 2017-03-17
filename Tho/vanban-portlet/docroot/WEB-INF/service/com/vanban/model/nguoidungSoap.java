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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.vanban.service.http.nguoidungServiceSoap}.
 *
 * @author nguye
 * @see com.vanban.service.http.nguoidungServiceSoap
 * @generated
 */
public class nguoidungSoap implements Serializable {
	public static nguoidungSoap toSoapModel(nguoidung model) {
		nguoidungSoap soapModel = new nguoidungSoap();

		soapModel.setUserId(model.getUserId());
		soapModel.setHoten(model.getHoten());
		soapModel.setNgaysinh(model.getNgaysinh());
		soapModel.setGioitinh(model.getGioitinh());
		soapModel.setDiachi(model.getDiachi());
		soapModel.setSdt(model.getSdt());
		soapModel.setDonvi(model.getDonvi());
		soapModel.setMail(model.getMail());
		soapModel.setMatkhau(model.getMatkhau());
		soapModel.setTinhtrang(model.getTinhtrang());

		return soapModel;
	}

	public static nguoidungSoap[] toSoapModels(nguoidung[] models) {
		nguoidungSoap[] soapModels = new nguoidungSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static nguoidungSoap[][] toSoapModels(nguoidung[][] models) {
		nguoidungSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new nguoidungSoap[models.length][models[0].length];
		}
		else {
			soapModels = new nguoidungSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static nguoidungSoap[] toSoapModels(List<nguoidung> models) {
		List<nguoidungSoap> soapModels = new ArrayList<nguoidungSoap>(models.size());

		for (nguoidung model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new nguoidungSoap[soapModels.size()]);
	}

	public nguoidungSoap() {
	}

	public long getPrimaryKey() {
		return _userId;
	}

	public void setPrimaryKey(long pk) {
		setUserId(pk);
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getHoten() {
		return _hoten;
	}

	public void setHoten(String hoten) {
		_hoten = hoten;
	}

	public Date getNgaysinh() {
		return _ngaysinh;
	}

	public void setNgaysinh(Date ngaysinh) {
		_ngaysinh = ngaysinh;
	}

	public int getGioitinh() {
		return _gioitinh;
	}

	public void setGioitinh(int gioitinh) {
		_gioitinh = gioitinh;
	}

	public String getDiachi() {
		return _diachi;
	}

	public void setDiachi(String diachi) {
		_diachi = diachi;
	}

	public String getSdt() {
		return _sdt;
	}

	public void setSdt(String sdt) {
		_sdt = sdt;
	}

	public String getDonvi() {
		return _donvi;
	}

	public void setDonvi(String donvi) {
		_donvi = donvi;
	}

	public String getMail() {
		return _mail;
	}

	public void setMail(String mail) {
		_mail = mail;
	}

	public String getMatkhau() {
		return _matkhau;
	}

	public void setMatkhau(String matkhau) {
		_matkhau = matkhau;
	}

	public boolean getTinhtrang() {
		return _tinhtrang;
	}

	public boolean isTinhtrang() {
		return _tinhtrang;
	}

	public void setTinhtrang(boolean tinhtrang) {
		_tinhtrang = tinhtrang;
	}

	private long _userId;
	private String _hoten;
	private Date _ngaysinh;
	private int _gioitinh;
	private String _diachi;
	private String _sdt;
	private String _donvi;
	private String _mail;
	private String _matkhau;
	private boolean _tinhtrang;
}