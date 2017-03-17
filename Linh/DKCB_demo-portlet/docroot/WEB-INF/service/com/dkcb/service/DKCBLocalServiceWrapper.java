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
 * Provides a wrapper for {@link DKCBLocalService}.
 *
 * @author hoang_000
 * @see DKCBLocalService
 * @generated
 */
public class DKCBLocalServiceWrapper implements DKCBLocalService,
	ServiceWrapper<DKCBLocalService> {
	public DKCBLocalServiceWrapper(DKCBLocalService dkcbLocalService) {
		_dkcbLocalService = dkcbLocalService;
	}

	/**
	* Adds the d k c b to the database. Also notifies the appropriate model listeners.
	*
	* @param dkcb the d k c b
	* @return the d k c b that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.dkcb.model.DKCB addDKCB(com.dkcb.model.DKCB dkcb)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dkcbLocalService.addDKCB(dkcb);
	}

	/**
	* Creates a new d k c b with the primary key. Does not add the d k c b to the database.
	*
	* @param Id the primary key for the new d k c b
	* @return the new d k c b
	*/
	@Override
	public com.dkcb.model.DKCB createDKCB(long Id) {
		return _dkcbLocalService.createDKCB(Id);
	}

	/**
	* Deletes the d k c b with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the d k c b
	* @return the d k c b that was removed
	* @throws PortalException if a d k c b with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.dkcb.model.DKCB deleteDKCB(long Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dkcbLocalService.deleteDKCB(Id);
	}

	/**
	* Deletes the d k c b from the database. Also notifies the appropriate model listeners.
	*
	* @param dkcb the d k c b
	* @return the d k c b that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.dkcb.model.DKCB deleteDKCB(com.dkcb.model.DKCB dkcb)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dkcbLocalService.deleteDKCB(dkcb);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dkcbLocalService.dynamicQuery();
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
		return _dkcbLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dkcb.model.impl.DKCBModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dkcbLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dkcb.model.impl.DKCBModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dkcbLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _dkcbLocalService.dynamicQueryCount(dynamicQuery);
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
		return _dkcbLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.dkcb.model.DKCB fetchDKCB(long Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dkcbLocalService.fetchDKCB(Id);
	}

	/**
	* Returns the d k c b with the primary key.
	*
	* @param Id the primary key of the d k c b
	* @return the d k c b
	* @throws PortalException if a d k c b with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.dkcb.model.DKCB getDKCB(long Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dkcbLocalService.getDKCB(Id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dkcbLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the d k c bs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dkcb.model.impl.DKCBModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of d k c bs
	* @param end the upper bound of the range of d k c bs (not inclusive)
	* @return the range of d k c bs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.dkcb.model.DKCB> getDKCBs(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dkcbLocalService.getDKCBs(start, end);
	}

	/**
	* Returns the number of d k c bs.
	*
	* @return the number of d k c bs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDKCBsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dkcbLocalService.getDKCBsCount();
	}

	/**
	* Updates the d k c b in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dkcb the d k c b
	* @return the d k c b that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.dkcb.model.DKCB updateDKCB(com.dkcb.model.DKCB dkcb)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dkcbLocalService.updateDKCB(dkcb);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dkcbLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dkcbLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dkcbLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DKCBLocalService getWrappedDKCBLocalService() {
		return _dkcbLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDKCBLocalService(DKCBLocalService dkcbLocalService) {
		_dkcbLocalService = dkcbLocalService;
	}

	@Override
	public DKCBLocalService getWrappedService() {
		return _dkcbLocalService;
	}

	@Override
	public void setWrappedService(DKCBLocalService dkcbLocalService) {
		_dkcbLocalService = dkcbLocalService;
	}

	private DKCBLocalService _dkcbLocalService;
}