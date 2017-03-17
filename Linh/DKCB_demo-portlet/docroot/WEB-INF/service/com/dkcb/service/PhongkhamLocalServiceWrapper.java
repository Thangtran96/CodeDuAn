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
 * Provides a wrapper for {@link PhongkhamLocalService}.
 *
 * @author hoang_000
 * @see PhongkhamLocalService
 * @generated
 */
public class PhongkhamLocalServiceWrapper implements PhongkhamLocalService,
	ServiceWrapper<PhongkhamLocalService> {
	public PhongkhamLocalServiceWrapper(
		PhongkhamLocalService phongkhamLocalService) {
		_phongkhamLocalService = phongkhamLocalService;
	}

	/**
	* Adds the phongkham to the database. Also notifies the appropriate model listeners.
	*
	* @param phongkham the phongkham
	* @return the phongkham that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.dkcb.model.Phongkham addPhongkham(
		com.dkcb.model.Phongkham phongkham)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phongkhamLocalService.addPhongkham(phongkham);
	}

	/**
	* Creates a new phongkham with the primary key. Does not add the phongkham to the database.
	*
	* @param Idphongkham the primary key for the new phongkham
	* @return the new phongkham
	*/
	@Override
	public com.dkcb.model.Phongkham createPhongkham(
		java.lang.String Idphongkham) {
		return _phongkhamLocalService.createPhongkham(Idphongkham);
	}

	/**
	* Deletes the phongkham with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Idphongkham the primary key of the phongkham
	* @return the phongkham that was removed
	* @throws PortalException if a phongkham with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.dkcb.model.Phongkham deletePhongkham(
		java.lang.String Idphongkham)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _phongkhamLocalService.deletePhongkham(Idphongkham);
	}

	/**
	* Deletes the phongkham from the database. Also notifies the appropriate model listeners.
	*
	* @param phongkham the phongkham
	* @return the phongkham that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.dkcb.model.Phongkham deletePhongkham(
		com.dkcb.model.Phongkham phongkham)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phongkhamLocalService.deletePhongkham(phongkham);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _phongkhamLocalService.dynamicQuery();
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
		return _phongkhamLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dkcb.model.impl.PhongkhamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _phongkhamLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dkcb.model.impl.PhongkhamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _phongkhamLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _phongkhamLocalService.dynamicQueryCount(dynamicQuery);
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
		return _phongkhamLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.dkcb.model.Phongkham fetchPhongkham(java.lang.String Idphongkham)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phongkhamLocalService.fetchPhongkham(Idphongkham);
	}

	/**
	* Returns the phongkham with the primary key.
	*
	* @param Idphongkham the primary key of the phongkham
	* @return the phongkham
	* @throws PortalException if a phongkham with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.dkcb.model.Phongkham getPhongkham(java.lang.String Idphongkham)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _phongkhamLocalService.getPhongkham(Idphongkham);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _phongkhamLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the phongkhams.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dkcb.model.impl.PhongkhamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of phongkhams
	* @param end the upper bound of the range of phongkhams (not inclusive)
	* @return the range of phongkhams
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.dkcb.model.Phongkham> getPhongkhams(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _phongkhamLocalService.getPhongkhams(start, end);
	}

	/**
	* Returns the number of phongkhams.
	*
	* @return the number of phongkhams
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getPhongkhamsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phongkhamLocalService.getPhongkhamsCount();
	}

	/**
	* Updates the phongkham in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param phongkham the phongkham
	* @return the phongkham that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.dkcb.model.Phongkham updatePhongkham(
		com.dkcb.model.Phongkham phongkham)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phongkhamLocalService.updatePhongkham(phongkham);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _phongkhamLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_phongkhamLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _phongkhamLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public PhongkhamLocalService getWrappedPhongkhamLocalService() {
		return _phongkhamLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedPhongkhamLocalService(
		PhongkhamLocalService phongkhamLocalService) {
		_phongkhamLocalService = phongkhamLocalService;
	}

	@Override
	public PhongkhamLocalService getWrappedService() {
		return _phongkhamLocalService;
	}

	@Override
	public void setWrappedService(PhongkhamLocalService phongkhamLocalService) {
		_phongkhamLocalService = phongkhamLocalService;
	}

	private PhongkhamLocalService _phongkhamLocalService;
}