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

package com.vanban.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link vanbanService}.
 *
 * @author nguye
 * @see vanbanService
 * @generated
 */
public class vanbanServiceWrapper implements vanbanService,
	ServiceWrapper<vanbanService> {
	public vanbanServiceWrapper(vanbanService vanbanService) {
		_vanbanService = vanbanService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _vanbanService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_vanbanService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _vanbanService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public vanbanService getWrappedvanbanService() {
		return _vanbanService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedvanbanService(vanbanService vanbanService) {
		_vanbanService = vanbanService;
	}

	@Override
	public vanbanService getWrappedService() {
		return _vanbanService;
	}

	@Override
	public void setWrappedService(vanbanService vanbanService) {
		_vanbanService = vanbanService;
	}

	private vanbanService _vanbanService;
}