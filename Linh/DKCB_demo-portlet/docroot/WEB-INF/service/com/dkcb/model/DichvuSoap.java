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
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.dkcb.service.http.DichvuServiceSoap}.
 *
 * @author hoang_000
 * @see com.dkcb.service.http.DichvuServiceSoap
 * @generated
 */
public class DichvuSoap implements Serializable {
	public static DichvuSoap toSoapModel(Dichvu model) {
		DichvuSoap soapModel = new DichvuSoap();

		soapModel.setIddichvu(model.getIddichvu());
		soapModel.setTendichvu(model.getTendichvu());
		soapModel.setMucthu(model.getMucthu());
		soapModel.setGhichi(model.getGhichi());
		soapModel.setIdphongkham(model.getIdphongkham());

		return soapModel;
	}

	public static DichvuSoap[] toSoapModels(Dichvu[] models) {
		DichvuSoap[] soapModels = new DichvuSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DichvuSoap[][] toSoapModels(Dichvu[][] models) {
		DichvuSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DichvuSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DichvuSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DichvuSoap[] toSoapModels(List<Dichvu> models) {
		List<DichvuSoap> soapModels = new ArrayList<DichvuSoap>(models.size());

		for (Dichvu model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DichvuSoap[soapModels.size()]);
	}

	public DichvuSoap() {
	}

	public long getPrimaryKey() {
		return _Iddichvu;
	}

	public void setPrimaryKey(long pk) {
		setIddichvu(pk);
	}

	public long getIddichvu() {
		return _Iddichvu;
	}

	public void setIddichvu(long Iddichvu) {
		_Iddichvu = Iddichvu;
	}

	public String getTendichvu() {
		return _Tendichvu;
	}

	public void setTendichvu(String Tendichvu) {
		_Tendichvu = Tendichvu;
	}

	public double getMucthu() {
		return _Mucthu;
	}

	public void setMucthu(double Mucthu) {
		_Mucthu = Mucthu;
	}

	public String getGhichi() {
		return _Ghichi;
	}

	public void setGhichi(String Ghichi) {
		_Ghichi = Ghichi;
	}

	public String getIdphongkham() {
		return _Idphongkham;
	}

	public void setIdphongkham(String Idphongkham) {
		_Idphongkham = Idphongkham;
	}

	private long _Iddichvu;
	private String _Tendichvu;
	private double _Mucthu;
	private String _Ghichi;
	private String _Idphongkham;
}