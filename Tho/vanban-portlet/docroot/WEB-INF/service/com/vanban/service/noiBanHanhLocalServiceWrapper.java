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
 * Provides a wrapper for {@link noiBanHanhLocalService}.
 *
 * @author nguye
 * @see noiBanHanhLocalService
 * @generated
 */
public class noiBanHanhLocalServiceWrapper implements noiBanHanhLocalService,
	ServiceWrapper<noiBanHanhLocalService> {
	public noiBanHanhLocalServiceWrapper(
		noiBanHanhLocalService noiBanHanhLocalService) {
		_noiBanHanhLocalService = noiBanHanhLocalService;
	}

	/**
	* Adds the noi ban hanh to the database. Also notifies the appropriate model listeners.
	*
	* @param noiBanHanh the noi ban hanh
	* @return the noi ban hanh that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vanban.model.noiBanHanh addnoiBanHanh(
		com.vanban.model.noiBanHanh noiBanHanh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _noiBanHanhLocalService.addnoiBanHanh(noiBanHanh);
	}

	/**
	* Creates a new noi ban hanh with the primary key. Does not add the noi ban hanh to the database.
	*
	* @param noiBHId the primary key for the new noi ban hanh
	* @return the new noi ban hanh
	*/
	@Override
	public com.vanban.model.noiBanHanh createnoiBanHanh(long noiBHId) {
		return _noiBanHanhLocalService.createnoiBanHanh(noiBHId);
	}

	/**
	* Deletes the noi ban hanh with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param noiBHId the primary key of the noi ban hanh
	* @return the noi ban hanh that was removed
	* @throws PortalException if a noi ban hanh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vanban.model.noiBanHanh deletenoiBanHanh(long noiBHId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _noiBanHanhLocalService.deletenoiBanHanh(noiBHId);
	}

	/**
	* Deletes the noi ban hanh from the database. Also notifies the appropriate model listeners.
	*
	* @param noiBanHanh the noi ban hanh
	* @return the noi ban hanh that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vanban.model.noiBanHanh deletenoiBanHanh(
		com.vanban.model.noiBanHanh noiBanHanh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _noiBanHanhLocalService.deletenoiBanHanh(noiBanHanh);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _noiBanHanhLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _noiBanHanhLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vanban.model.impl.noiBanHanhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _noiBanHanhLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vanban.model.impl.noiBanHanhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _noiBanHanhLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _noiBanHanhLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _noiBanHanhLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.vanban.model.noiBanHanh fetchnoiBanHanh(long noiBHId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _noiBanHanhLocalService.fetchnoiBanHanh(noiBHId);
	}

	/**
	* Returns the noi ban hanh with the primary key.
	*
	* @param noiBHId the primary key of the noi ban hanh
	* @return the noi ban hanh
	* @throws PortalException if a noi ban hanh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vanban.model.noiBanHanh getnoiBanHanh(long noiBHId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _noiBanHanhLocalService.getnoiBanHanh(noiBHId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _noiBanHanhLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the noi ban hanhs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vanban.model.impl.noiBanHanhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of noi ban hanhs
	* @param end the upper bound of the range of noi ban hanhs (not inclusive)
	* @return the range of noi ban hanhs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.vanban.model.noiBanHanh> getnoiBanHanhs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _noiBanHanhLocalService.getnoiBanHanhs(start, end);
	}

	/**
	* Returns the number of noi ban hanhs.
	*
	* @return the number of noi ban hanhs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getnoiBanHanhsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _noiBanHanhLocalService.getnoiBanHanhsCount();
	}

	/**
	* Updates the noi ban hanh in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param noiBanHanh the noi ban hanh
	* @return the noi ban hanh that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vanban.model.noiBanHanh updatenoiBanHanh(
		com.vanban.model.noiBanHanh noiBanHanh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _noiBanHanhLocalService.updatenoiBanHanh(noiBanHanh);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _noiBanHanhLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_noiBanHanhLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _noiBanHanhLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public noiBanHanhLocalService getWrappednoiBanHanhLocalService() {
		return _noiBanHanhLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappednoiBanHanhLocalService(
		noiBanHanhLocalService noiBanHanhLocalService) {
		_noiBanHanhLocalService = noiBanHanhLocalService;
	}

	@Override
	public noiBanHanhLocalService getWrappedService() {
		return _noiBanHanhLocalService;
	}

	@Override
	public void setWrappedService(noiBanHanhLocalService noiBanHanhLocalService) {
		_noiBanHanhLocalService = noiBanHanhLocalService;
	}

	private noiBanHanhLocalService _noiBanHanhLocalService;
}