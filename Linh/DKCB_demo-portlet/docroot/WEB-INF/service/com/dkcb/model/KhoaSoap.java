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
 * This class is used by SOAP remote services, specifically {@link com.dkcb.service.http.KhoaServiceSoap}.
 *
 * @author hoang_000
 * @see com.dkcb.service.http.KhoaServiceSoap
 * @generated
 */
public class KhoaSoap implements Serializable {
	public static KhoaSoap toSoapModel(Khoa model) {
		KhoaSoap soapModel = new KhoaSoap();

		soapModel.setIdphongkham(model.getIdphongkham());
		soapModel.setTenPK(model.getTenPK());

		return soapModel;
	}

	public static KhoaSoap[] toSoapModels(Khoa[] models) {
		KhoaSoap[] soapModels = new KhoaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static KhoaSoap[][] toSoapModels(Khoa[][] models) {
		KhoaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new KhoaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new KhoaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static KhoaSoap[] toSoapModels(List<Khoa> models) {
		List<KhoaSoap> soapModels = new ArrayList<KhoaSoap>(models.size());

		for (Khoa model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new KhoaSoap[soapModels.size()]);
	}

	public KhoaSoap() {
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