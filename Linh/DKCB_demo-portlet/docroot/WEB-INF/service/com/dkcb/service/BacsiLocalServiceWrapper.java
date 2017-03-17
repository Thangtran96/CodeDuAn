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
 * Provides a wrapper for {@link BacsiLocalService}.
 *
 * @author hoang_000
 * @see BacsiLocalService
 * @generated
 */
public class BacsiLocalServiceWrapper implements BacsiLocalService,
	ServiceWrapper<BacsiLocalService> {
	public BacsiLocalServiceWrapper(BacsiLocalService bacsiLocalService) {
		_bacsiLocalService = bacsiLocalService;
	}

	/**
	* Adds the bacsi to the database. Also notifies the appropriate model listeners.
	*
	* @param bacsi the bacsi
	* @return the bacsi that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.dkcb.model.Bacsi addBacsi(com.dkcb.model.Bacsi bacsi)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _bacsiLocalService.addBacsi(bacsi);
	}

	/**
	* Creates a new bacsi with the primary key. Does not add the bacsi to the database.
	*
	* @param Idbacsi the primary key for the new bacsi
	* @return the new bacsi
	*/
	@Override
	public com.dkcb.model.Bacsi createBacsi(java.lang.String Idbacsi) {
		return _bacsiLocalService.createBacsi(Idbacsi);
	}

	/**
	* Deletes the bacsi with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Idbacsi the primary key of the bacsi
	* @return the bacsi that was removed
	* @throws PortalException if a bacsi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.dkcb.model.Bacsi deleteBacsi(java.lang.String Idbacsi)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _bacsiLocalService.deleteBacsi(Idbacsi);
	}

	/**
	* Deletes the bacsi from the database. Also notifies the appropriate model listeners.
	*
	* @param bacsi the bacsi
	* @return the bacsi that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.dkcb.model.Bacsi deleteBacsi(com.dkcb.model.Bacsi bacsi)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _bacsiLocalService.deleteBacsi(bacsi);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _bacsiLocalService.dynamicQuery();
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
		return _bacsiLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dkcb.model.impl.BacsiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _bacsiLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dkcb.model.impl.BacsiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _bacsiLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _bacsiLocalService.dynamicQueryCount(dynamicQuery);
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
		return _bacsiLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.dkcb.model.Bacsi fetchBacsi(java.lang.String Idbacsi)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _bacsiLocalService.fetchBacsi(Idbacsi);
	}

	/**
	* Returns the bacsi with the primary key.
	*
	* @param Idbacsi the primary key of the bacsi
	* @return the bacsi
	* @throws PortalException if a bacsi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.dkcb.model.Bacsi getBacsi(java.lang.String Idbacsi)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _bacsiLocalService.getBacsi(Idbacsi);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _bacsiLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the bacsis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dkcb.model.impl.BacsiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bacsis
	* @param end the upper bound of the range of bacsis (not inclusive)
	* @return the range of bacsis
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.dkcb.model.Bacsi> getBacsis(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _bacsiLocalService.getBacsis(start, end);
	}

	/**
	* Returns the number of bacsis.
	*
	* @return the number of bacsis
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getBacsisCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _bacsiLocalService.getBacsisCount();
	}

	/**
	* Updates the bacsi in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param bacsi the bacsi
	* @return the bacsi that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.dkcb.model.Bacsi updateBacsi(com.dkcb.model.Bacsi bacsi)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _bacsiLocalService.updateBacsi(bacsi);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _bacsiLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_bacsiLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _bacsiLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public BacsiLocalService getWrappedBacsiLocalService() {
		return _bacsiLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedBacsiLocalService(BacsiLocalService bacsiLocalService) {
		_bacsiLocalService = bacsiLocalService;
	}

	@Override
	public BacsiLocalService getWrappedService() {
		return _bacsiLocalService;
	}

	@Override
	public void setWrappedService(BacsiLocalService bacsiLocalService) {
		_bacsiLocalService = bacsiLocalService;
	}

	private BacsiLocalService _bacsiLocalService;
}