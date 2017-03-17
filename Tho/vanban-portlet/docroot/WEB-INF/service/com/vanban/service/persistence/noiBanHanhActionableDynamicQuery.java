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

package com.vanban.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.vanban.model.noiBanHanh;

import com.vanban.service.noiBanHanhLocalServiceUtil;

/**
 * @author nguye
 * @generated
 */
public abstract class noiBanHanhActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public noiBanHanhActionableDynamicQuery() throws SystemException {
		setBaseLocalService(noiBanHanhLocalServiceUtil.getService());
		setClass(noiBanHanh.class);

		setClassLoader(com.vanban.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("noiBHId");
	}
}