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
 * This class is used by SOAP remote services, specifically {@link com.dkcb.service.http.PhongkhamServiceSoap}.
 *
 * @author hoang_000
 * @see com.dkcb.service.http.PhongkhamServiceSoap
 * @generated
 */
public class PhongkhamSoap implements Serializable {
	public static PhongkhamSoap toSoapModel(Phongkham model) {
		PhongkhamSoap soapModel = new PhongkhamSoap();

		soapModel.setIdphongkham(model.getIdphongkham());
		soapModel.setTenPK(model.getTenPK());

		return soapModel;
	}

	public static PhongkhamSoap[] toSoapModels(Phongkham[] models) {
		PhongkhamSoap[] soapModels = new PhongkhamSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PhongkhamSoap[][] toSoapModels(Phongkham[][] models) {
		PhongkhamSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PhongkhamSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PhongkhamSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PhongkhamSoap[] toSoapModels(List<Phongkham> models) {
		List<PhongkhamSoap> soapModels = new ArrayList<PhongkhamSoap>(models.size());

		for (Phongkham model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PhongkhamSoap[soapModels.size()]);
	}

	public PhongkhamSoap() {
	}

	public String getPrimaryKey() {
		return _Idphongkham;
	}

	public void setPrimaryKey(String pk) {
		setIdphongkham(pk);
	}

	public String getIdphongkham() {
		return _Idphongkham;
	}

	public void setIdphongkham(String Idphongkham) {
		_Idphongkham = Idphongkham;
	}

	public String getTenPK() {
		return _TenPK;
	}

	public void setTenPK(String TenPK) {
		_TenPK = TenPK;
	}

	private String _Idphongkham;
	private String _TenPK;
}