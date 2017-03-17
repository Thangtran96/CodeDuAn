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
 * This class is used by SOAP remote services, specifically {@link com.dkcb.service.http.LichkhamServiceSoap}.
 *
 * @author hoang_000
 * @see com.dkcb.service.http.LichkhamServiceSoap
 * @generated
 */
public class LichkhamSoap implements Serializable {
	public static LichkhamSoap toSoapModel(Lichkham model) {
		LichkhamSoap soapModel = new LichkhamSoap();

		soapModel.setIdbacsi(model.getIdbacsi());
		soapModel.setId(model.getId());
		soapModel.setIdphongkham(model.getIdphongkham());
		soapModel.setIddichvu(model.getIddichvu());
		soapModel.setGiodukien(model.getGiodukien());
		soapModel.setNgaykham(model.getNgaykham());
		soapModel.setIdlichkham(model.getIdlichkham());

		return soapModel;
	}

	public static LichkhamSoap[] toSoapModels(Lichkham[] models) {
		LichkhamSoap[] soapModels = new LichkhamSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LichkhamSoap[][] toSoapModels(Lichkham[][] models) {
		LichkhamSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LichkhamSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LichkhamSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LichkhamSoap[] toSoapModels(List<Lichkham> models) {
		List<LichkhamSoap> soapModels = new ArrayList<LichkhamSoap>(models.size());

		for (Lichkham model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LichkhamSoap[soapModels.size()]);
	}

	public LichkhamSoap() {
	}

	public int getPrimaryKey() {
		return _Idlichkham;
	}

	public void setPrimaryKey(int pk) {
		setIdlichkham(pk);
	}

	public String getIdbacsi() {
		return _Idbacsi;
	}

	public void setIdbacsi(String Idbacsi) {
		_Idbacsi = Idbacsi;
	}

	public long getId() {
		return _Id;
	}

	public void setId(long Id) {
		_Id = Id;
	}

	public String getIdphongkham() {
		return _Idphongkham;
	}

	public void setIdphongkham(String Idphongkham) {
		_Idphongkham = Idphongkham;
	}

	public long getIddichvu() {
		return _Iddichvu;
	}

	public void setIddichvu(long Iddichvu) {
		_Iddichvu = Iddichvu;
	}

	public String getGiodukien() {
		return _Giodukien;
	}

	public void setGiodukien(String Giodukien) {
		_Giodukien = Giodukien;
	}

	public Date getNgaykham() {
		return _Ngaykham;
	}

	public void setNgaykham(Date Ngaykham) {
		_Ngaykham = Ngaykham;
	}

	public int getIdlichkham() {
		return _Idlichkham;
	}

	public void setIdlichkham(int Idlichkham) {
		_Idlichkham = Idlichkham;
	}

	private String _Idbacsi;
	private long _Id;
	private String _Idphongkham;
	private long _Iddichvu;
	private String _Giodukien;
	private Date _Ngaykham;
	private int _Idlichkham;
}