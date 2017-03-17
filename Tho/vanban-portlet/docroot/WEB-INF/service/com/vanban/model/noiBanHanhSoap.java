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
 * This class is used by SOAP remote services, specifically {@link com.vanban.service.http.noiBanHanhServiceSoap}.
 *
 * @author nguye
 * @see com.vanban.service.http.noiBanHanhServiceSoap
 * @generated
 */
public class noiBanHanhSoap implements Serializable {
	public static noiBanHanhSoap toSoapModel(noiBanHanh model) {
		noiBanHanhSoap soapModel = new noiBanHanhSoap();

		soapModel.setNoiBHId(model.getNoiBHId());
		soapModel.setTennoibanhanh(model.getTennoibanhanh());
		soapModel.setGhichu(model.getGhichu());
		soapModel.setTinhtrang(model.getTinhtrang());

		return soapModel;
	}

	public static noiBanHanhSoap[] toSoapModels(noiBanHanh[] models) {
		noiBanHanhSoap[] soapModels = new noiBanHanhSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static noiBanHanhSoap[][] toSoapModels(noiBanHanh[][] models) {
		noiBanHanhSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new noiBanHanhSoap[models.length][models[0].length];
		}
		else {
			soapModels = new noiBanHanhSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static noiBanHanhSoap[] toSoapModels(List<noiBanHanh> models) {
		List<noiBanHanhSoap> soapModels = new ArrayList<noiBanHanhSoap>(models.size());

		for (noiBanHanh model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new noiBanHanhSoap[soapModels.size()]);
	}

	public noiBanHanhSoap() {
	}

	public long getPrimaryKey() {
		return _noiBHId;
	}

	public void setPrimaryKey(long pk) {
		setNoiBHId(pk);
	}

	public long getNoiBHId() {
		return _noiBHId;
	}

	public void setNoiBHId(long noiBHId) {
		_noiBHId = noiBHId;
	}

	public String getTennoibanhanh() {
		return _tennoibanhanh;
	}

	public void setTennoibanhanh(String tennoibanhanh) {
		_tennoibanhanh = tennoibanhanh;
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

	private long _noiBHId;
	private String _tennoibanhanh;
	private String _ghichu;
	private boolean _tinhtrang;
}