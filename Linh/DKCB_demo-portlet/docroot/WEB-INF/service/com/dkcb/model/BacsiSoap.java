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
 * This class is used by SOAP remote services, specifically {@link com.dkcb.service.http.BacsiServiceSoap}.
 *
 * @author hoang_000
 * @see com.dkcb.service.http.BacsiServiceSoap
 * @generated
 */
public class BacsiSoap implements Serializable {
	public static BacsiSoap toSoapModel(Bacsi model) {
		BacsiSoap soapModel = new BacsiSoap();

		soapModel.setIdbacsi(model.getIdbacsi());
		soapModel.setTenBS(model.getTenBS());
		soapModel.setIdphongkham(model.getIdphongkham());

		return soapModel;
	}

	public static BacsiSoap[] toSoapModels(Bacsi[] models) {
		BacsiSoap[] soapModels = new BacsiSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static BacsiSoap[][] toSoapModels(Bacsi[][] models) {
		BacsiSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new BacsiSoap[models.length][models[0].length];
		}
		else {
			soapModels = new BacsiSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static BacsiSoap[] toSoapModels(List<Bacsi> models) {
		List<BacsiSoap> soapModels = new ArrayList<BacsiSoap>(models.size());

		for (Bacsi model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new BacsiSoap[soapModels.size()]);
	}

	public BacsiSoap() {
	}

	public String getPrimaryKey() {
		return _Idbacsi;
	}

	public void setPrimaryKey(String pk) {
		setIdbacsi(pk);
	}

	public String getIdbacsi() {
		return _Idbacsi;
	}

	public void setIdbacsi(String Idbacsi) {
		_Idbacsi = Idbacsi;
	}

	public String getTenBS() {
		return _TenBS;
	}

	public void setTenBS(String TenBS) {
		_TenBS = TenBS;
	}

	public String getIdphongkham() {
		return _Idphongkham;
	}

	public void setIdphongkham(String Idphongkham) {
		_Idphongkham = Idphongkham;
	}

	private String _Idbacsi;
	private String _TenBS;
	private String _Idphongkham;
}