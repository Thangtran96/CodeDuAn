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
 * This class is used by SOAP remote services, specifically {@link com.vanban.service.http.nguoikiServiceSoap}.
 *
 * @author nguye
 * @see com.vanban.service.http.nguoikiServiceSoap
 * @generated
 */
public class nguoikiSoap implements Serializable {
	public static nguoikiSoap toSoapModel(nguoiki model) {
		nguoikiSoap soapModel = new nguoikiSoap();

		soapModel.setNguoikiID(model.getNguoikiID());
		soapModel.setHoten(model.getHoten());
		soapModel.setNgaysinh(model.getNgaysinh());
		soapModel.setGioitinh(model.getGioitinh());
		soapModel.setDonvi(model.getDonvi());
		soapModel.setChucvu(model.getChucvu());
		soapModel.setTinhtrang(model.getTinhtrang());

		return soapModel;
	}

	public static nguoikiSoap[] toSoapModels(nguoiki[] models) {
		nguoikiSoap[] soapModels = new nguoikiSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static nguoikiSoap[][] toSoapModels(nguoiki[][] models) {
		nguoikiSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new nguoikiSoap[models.length][models[0].length];
		}
		else {
			soapModels = new nguoikiSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static nguoikiSoap[] toSoapModels(List<nguoiki> models) {
		List<nguoikiSoap> soapModels = new ArrayList<nguoikiSoap>(models.size());

		for (nguoiki model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new nguoikiSoap[soapModels.size()]);
	}

	public nguoikiSoap() {
	}

	public long getPrimaryKey() {
		return _nguoikiID;
	}

	public void setPrimaryKey(long pk) {
		setNguoikiID(pk);
	}

	public long getNguoikiID() {
		return _nguoikiID;
	}

	public void setNguoikiID(long nguoikiID) {
		_nguoikiID = nguoikiID;
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

	public String getDonvi() {
		return _donvi;
	}

	public void setDonvi(String donvi) {
		_donvi = donvi;
	}

	public String getChucvu() {
		return _chucvu;
	}

	public void setChucvu(String chucvu) {
		_chucvu = chucvu;
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

	private long _nguoikiID;
	private String _hoten;
	private Date _ngaysinh;
	private int _gioitinh;
	private String _donvi;
	private String _chucvu;
	private boolean _tinhtrang;
}