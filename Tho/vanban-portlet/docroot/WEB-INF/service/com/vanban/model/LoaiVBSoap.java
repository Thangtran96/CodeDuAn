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
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.vanban.service.http.LoaiVBServiceSoap}.
 *
 * @author nguye
 * @see com.vanban.service.http.LoaiVBServiceSoap
 * @generated
 */
public class LoaiVBSoap implements Serializable {
	public static LoaiVBSoap toSoapModel(LoaiVB model) {
		LoaiVBSoap soapModel = new LoaiVBSoap();

		soapModel.setLoaiId(model.getLoaiId());
		soapModel.setTenloai(model.getTenloai());
		soapModel.setGhichu(model.getGhichu());
		soapModel.setTinhtrang(model.getTinhtrang());

		return soapModel;
	}

	public static LoaiVBSoap[] toSoapModels(LoaiVB[] models) {
		LoaiVBSoap[] soapModels = new LoaiVBSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LoaiVBSoap[][] toSoapModels(LoaiVB[][] models) {
		LoaiVBSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LoaiVBSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LoaiVBSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LoaiVBSoap[] toSoapModels(List<LoaiVB> models) {
		List<LoaiVBSoap> soapModels = new ArrayList<LoaiVBSoap>(models.size());

		for (LoaiVB model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LoaiVBSoap[soapModels.size()]);
	}

	public LoaiVBSoap() {
	}

	public long getPrimaryKey() {
		return _loaiId;
	}

	public void setPrimaryKey(long pk) {
		setLoaiId(pk);
	}

	public long getLoaiId() {
		return _loaiId;
	}

	public void setLoaiId(long loaiId) {
		_loaiId = loaiId;
	}

	public String getTenloai() {
		return _tenloai;
	}

	public void setTenloai(String tenloai) {
		_tenloai = tenloai;
	}

	public String getGhichu() {
		return _ghichu;
	}

	public void setGhichu(String ghichu) {
		_ghichu = ghichu;
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

	private long _loaiId;
	private String _tenloai;
	private String _ghichu;
	private boolean _tinhtrang;
}