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
 * Provides a wrapper for {@link KhoaLocalService}.
 *
 * @author hoang_000
 * @see KhoaLocalService
 * @generated
 */
public class KhoaLocalServiceWrapper implements KhoaLocalService,
	ServiceWrapper<KhoaLocalService> {
	public KhoaLocalServiceWrapper(KhoaLocalService khoaLocalService) {
		_khoaLocalService = khoaLocalService;
	}

	/**
	* Adds the khoa to the database. Also notifies the appropriate model listeners.
	*
	* @param khoa the khoa
	* @return the khoa that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.dkcb.model.Khoa addKhoa(com.dkcb.model.Khoa khoa)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _khoaLocalService.addKhoa(khoa);
	}

	/**
	* Creates a new khoa with the primary key. Does not add the khoa to the database.
	*
	* @param Idphongkham the primary key for the new khoa
	* @return the new khoa
	*/
	@Override
	public com.dkcb.model.Khoa createKhoa(java.lang.String Idphongkham) {
		return _khoaLocalService.createKhoa(Idphongkham);
	}

	/**
	* Deletes the khoa with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Idphongkham the primary key of the khoa
	* @return the khoa that was removed
	* @throws PortalException if a khoa with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.dkcb.model.Khoa deleteKhoa(java.lang.String Idphongkham)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _khoaLocalService.deleteKhoa(Idphongkham);
	}

	/**
	* Deletes the khoa from the database. Also notifies the appropriate model listeners.
	*
	* @param khoa the khoa
	* @return the khoa that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.dkcb.model.Khoa deleteKhoa(com.dkcb.model.Khoa khoa)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _khoaLocalService.deleteKhoa(khoa);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _khoaLocalService.dynamicQuery();
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
		return _khoaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dkcb.model.impl.KhoaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _khoaLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dkcb.model.impl.KhoaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _khoaLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _khoaLocalService.dynamicQueryCount(dynamicQuery);
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
		return _khoaLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.dkcb.model.Khoa fetchKhoa(java.lang.String Idphongkham)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _khoaLocalService.fetchKhoa(Idphongkham);
	}

	/**
	* Returns the khoa with the primary key.
	*
	* @param Idphongkham the primary key of the khoa
	* @return the khoa
	* @throws PortalException if a khoa with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.dkcb.model.Khoa getKhoa(java.lang.String Idphongkham)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _khoaLocalService.getKhoa(Idphongkham);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _khoaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the khoas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dkcb.model.impl.KhoaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of khoas
	* @param end the upper bound of the range of khoas (not inclusive)
	* @return the range of khoas
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.dkcb.model.Khoa> getKhoas(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _khoaLocalService.getKhoas(start, end);
	}

	/**
	* Returns the number of khoas.
	*
	* @return the number of khoas
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getKhoasCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _khoaLocalService.getKhoasCount();
	}

	/**
	* Updates the khoa in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param khoa the khoa
	* @return the khoa that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.dkcb.model.Khoa updateKhoa(com.dkcb.model.Khoa khoa)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _khoaLocalService.updateKhoa(khoa);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _khoaLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_khoaLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _khoaLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public KhoaLocalService getWrappedKhoaLocalService() {
		return _khoaLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedKhoaLocalService(KhoaLocalService khoaLocalService) {
		_khoaLocalService = khoaLocalService;
	}

	@Override
	public KhoaLocalService getWrappedService() {
		return _khoaLocalService;
	}

	@Override
	public void setWrappedService(KhoaLocalService khoaLocalService) {
		_khoaLocalService = khoaLocalService;
	}

	private KhoaLocalService _khoaLocalService;
}