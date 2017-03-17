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

package com.dkcb.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LichkhamService}.
 *
 * @author hoang_000
 * @see LichkhamService
 * @generated
 */
public class LichkhamServiceWrapper implements LichkhamService,
	ServiceWrapper<LichkhamService> {
	public LichkhamServiceWrapper(LichkhamService lichkhamService) {
		_lichkhamService = lichkhamService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _lichkhamService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_lichkhamService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _lichkhamService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public LichkhamService getWrappedLichkhamService() {
		return _lichkhamService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedLichkhamService(LichkhamService lichkhamService) {
		_lichkhamService = lichkhamService;
	}

	@Override
	public LichkhamService getWrappedService() {
		return _lichkhamService;
	}

	@Override
	public void setWrappedService(LichkhamService lichkhamService) {
		_lichkhamService = lichkhamService;
	}

	private LichkhamService _lichkhamService;
}