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
 * This class is used by SOAP remote services, specifically {@link com.vanban.service.http.vanbanServiceSoap}.
 *
 * @author nguye
 * @see com.vanban.service.http.vanbanServiceSoap
 * @generated
 */
public class vanbanSoap implements Serializable {
	public static vanbanSoap toSoapModel(vanban model) {
		vanbanSoap soapModel = new vanbanSoap();

		soapModel.setVanbanId(model.getVanbanId());
		soapModel.setKihieu(model.getKihieu());
		soapModel.setTrichyeu(model.getTrichyeu());
		soapModel.setNgaybanhanh(model.getNgaybanhanh());
		soapModel.setNgaytao(model.getNgaytao());
		soapModel.setNguoikiID(model.getNguoikiID());
		soapModel.setUserID(model.getUserID());
		soapModel.setLoaiID(model.getLoaiID());
		soapModel.setNoiBHID(model.getNoiBHID());
		soapModel.setTinhtrang(model.getTinhtrang());

		return soapModel;
	}

	public static vanbanSoap[] toSoapModels(vanban[] models) {
		vanbanSoap[] soapModels = new vanbanSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static vanbanSoap[][] toSoapModels(vanban[][] models) {
		vanbanSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new vanbanSoap[models.length][models[0].length];
		}
		else {
			soapModels = new vanbanSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static vanbanSoap[] toSoapModels(List<vanban> models) {
		List<vanbanSoap> soapModels = new ArrayList<vanbanSoap>(models.size());

		for (vanban model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new vanbanSoap[soapModels.size()]);
	}

	public vanbanSoap() {
	}

	public long getPrimaryKey() {
		return _vanbanId;
	}

	public void setPrimaryKey(long pk) {
		setVanbanId(pk);
	}

	public long getVanbanId() {
		return _vanbanId;
	}

	public void setVanbanId(long vanbanId) {
		_vanbanId = vanbanId;
	}

	public String getKihieu() {
		return _kihieu;
	}

	public void setKihieu(String kihieu) {
		_kihieu = kihieu;
	}

	public String getTrichyeu() {
		return _trichyeu;
	}

	public void setTrichyeu(String trichyeu) {
		_trichyeu = trichyeu;
	}

	public Date getNgaybanhanh() {
		return _ngaybanhanh;
	}

	public void setNgaybanhanh(Date ngaybanhanh) {
		_ngaybanhanh = ngaybanhanh;
	}

	public Date getNgaytao() {
		return _ngaytao;
	}

	public void setNgaytao(Date ngaytao) {
		_ngaytao = ngaytao;
	}

	public long getNguoikiID() {
		return _nguoikiID;
	}

	public void setNguoikiID(long nguoikiID) {
		_nguoikiID = nguoikiID;
	}

	public long getUserID() {
		return _userID;
	}

	public void setUserID(long userID) {
		_userID = userID;
	}

	public long getLoaiID() {
		return _loaiID;
	}

	public void setLoaiID(long loaiID) {
		_loaiID = loaiID;
	}

	public long getNoiBHID() {
		return _noiBHID;
	}

	public void setNoiBHID(long noiBHID) {
		_noiBHID = noiBHID;
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

	private long _vanbanId;
	private String _kihieu;
	private String _trichyeu;
	private Date _ngaybanhanh;
	private Date _ngaytao;
	private long _nguoikiID;
	private long _userID;
	private long _loaiID;
	private long _noiBHID;
	private boolean _tinhtrang;
}