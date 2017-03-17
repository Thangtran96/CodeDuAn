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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.dkcb.service.http.DKCBServiceSoap}.
 *
 * @author hoang_000
 * @see com.dkcb.service.http.DKCBServiceSoap
 * @generated
 */
public class DKCBSoap implements Serializable {
	public static DKCBSoap toSoapModel(DKCB model) {
		DKCBSoap soapModel = new DKCBSoap();

		soapModel.setId(model.getId());
		soapModel.setHoten(model.getHoten());
		soapModel.setDiachi(model.getDiachi());
		soapModel.setGioitinh(model.getGioitinh());
		soapModel.setSodienthoai(model.getSodienthoai());
		soapModel.setNgaysinh(model.getNgaysinh());
		soapModel.setTrieuchung(model.getTrieuchung());

		return soapModel;
	}

	public static DKCBSoap[] toSoapModels(DKCB[] models) {
		DKCBSoap[] soapModels = new DKCBSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DKCBSoap[][] toSoapModels(DKCB[][] models) {
		DKCBSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DKCBSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DKCBSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DKCBSoap[] toSoapModels(List<DKCB> models) {
		List<DKCBSoap> soapModels = new ArrayList<DKCBSoap>(models.size());

		for (DKCB model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DKCBSoap[soapModels.size()]);
	}

	public DKCBSoap() {
	}

	public long getPrimaryKey() {
		return _Id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _Id;
	}

	public void setId(long Id) {
		_Id = Id;
	}

	public String getHoten() {
		return _Hoten;
	}

	public void setHoten(String Hoten) {
		_Hoten = Hoten;
	}

	public String getDiachi() {
		return _Diachi;
	}

	public void setDiachi(String Diachi) {
		_Diachi = Diachi;
	}

	public boolean getGioitinh() {
		return _Gioitinh;
	}

	public boolean isGioitinh() {
		return _Gioitinh;
	}

	public void setGioitinh(boolean Gioitinh) {
		_Gioitinh = Gioitinh;
	}

	public String getSodienthoai() {
		return _Sodienthoai;
	}

	public void setSodienthoai(String Sodienthoai) {
		_Sodienthoai = Sodienthoai;
	}

	public Date getNgaysinh() {
		return _Ngaysinh;
	}

	public void setNgaysinh(Date Ngaysinh) {
		_Ngaysinh = Ngaysinh;
	}

	public String getTrieuchung() {
		return _Trieuchung;
	}

	public void setTrieuchung(String Trieuchung) {
		_Trieuchung = Trieuchung;
	}

	private long _Id;
	private String _Hoten;
	private String _Diachi;
	private boolean _Gioitinh;
	private String _Sodienthoai;
	private Date _Ngaysinh;
	private String _Trieuchung;
}