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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Bacsi service. Represents a row in the &quot;u_Bacsi&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.dkcb.model.impl.BacsiModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.dkcb.model.impl.BacsiImpl}.
 * </p>
 *
 * @author hoang_000
 * @see Bacsi
 * @see com.dkcb.model.impl.BacsiImpl
 * @see com.dkcb.model.impl.BacsiModelImpl
 * @generated
 */
public interface BacsiModel extends BaseModel<Bacsi> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a bacsi model instance should use the {@link Bacsi} interface instead.
	 */

	/**
	 * Returns the primary key of this bacsi.
	 *
	 * @return the primary key of this bacsi
	 */
	public String getPrimaryKey();

	/**
	 * Sets the primary key of this bacsi.
	 *
	 * @param primaryKey the primary key of this bacsi
	 */
	public void setPrimaryKey(String primaryKey);

	/**
	 * Returns the idbacsi of this bacsi.
	 *
	 * @return the idbacsi of this bacsi
	 */
	@AutoEscape
	public String getIdbacsi();

	/**
	 * Sets the idbacsi of this bacsi.
	 *
	 * @param Idbacsi the idbacsi of this bacsi
	 */
	public void setIdbacsi(String Idbacsi);

	/**
	 * Returns the ten b s of this bacsi.
	 *
	 * @return the ten b s of this bacsi
	 */
	@AutoEscape
	public String getTenBS();

	/**
	 * Sets the ten b s of this bacsi.
	 *
	 * @param TenBS the ten b s of this bacsi
	 */
	public void setTenBS(String TenBS);

	/**
	 * Returns the idphongkham of this bacsi.
	 *
	 * @return the idphongkham of this bacsi
	 */
	@AutoEscape
	public String getIdphongkham();

	/**
	 * Sets the idphongkham of this bacsi.
	 *
	 * @param Idphongkham the idphongkham of this bacsi
	 */
	public void setIdphongkham(String Idphongkham);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(com.dkcb.model.Bacsi bacsi);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.dkcb.model.Bacsi> toCacheModel();

	@Override
	public com.dkcb.model.Bacsi toEscapedModel();

	@Override
	public com.dkcb.model.Bacsi toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}