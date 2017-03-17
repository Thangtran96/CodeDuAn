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
 * Provides a wrapper for {@link vanbanLocalService}.
 *
 * @author nguye
 * @see vanbanLocalService
 * @generated
 */
public class vanbanLocalServiceWrapper implements vanbanLocalService,
	ServiceWrapper<vanbanLocalService> {
	public vanbanLocalServiceWrapper(vanbanLocalService vanbanLocalService) {
		_vanbanLocalService = vanbanLocalService;
	}

	/**
	* Adds the vanban to the database. Also notifies the appropriate model listeners.
	*
	* @param vanban the vanban
	* @return the vanban that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vanban.model.vanban addvanban(com.vanban.model.vanban vanban)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vanbanLocalService.addvanban(vanban);
	}

	/**
	* Creates a new vanban with the primary key. Does not add the vanban to the database.
	*
	* @param vanbanId the primary key for the new vanban
	* @return the new vanban
	*/
	@Override
	public com.vanban.model.vanban createvanban(long vanbanId) {
		return _vanbanLocalService.createvanban(vanbanId);
	}

	/**
	* Deletes the vanban with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vanbanId the primary key of the vanban
	* @return the vanban that was removed
	* @throws PortalException if a vanban with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vanban.model.vanban deletevanban(long vanbanId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vanbanLocalService.deletevanban(vanbanId);
	}

	/**
	* Deletes the vanban from the database. Also notifies the appropriate model listeners.
	*
	* @param vanban the vanban
	* @return the vanban that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vanban.model.vanban deletevanban(com.vanban.model.vanban vanban)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vanbanLocalService.deletevanban(vanban);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vanbanLocalService.dynamicQuery();
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
		return _vanbanLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vanban.model.impl.vanbanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vanbanLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vanban.model.impl.vanbanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vanbanLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _vanbanLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vanbanLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.vanban.model.vanban fetchvanban(long vanbanId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vanbanLocalService.fetchvanban(vanbanId);
	}

	/**
	* Returns the vanban with the primary key.
	*
	* @param vanbanId the primary key of the vanban
	* @return the vanban
	* @throws PortalException if a vanban with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vanban.model.vanban getvanban(long vanbanId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vanbanLocalService.getvanban(vanbanId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vanbanLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the vanbans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vanban.model.impl.vanbanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vanbans
	* @param end the upper bound of the range of vanbans (not inclusive)
	* @return the range of vanbans
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.vanban.model.vanban> getvanbans(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vanbanLocalService.getvanbans(start, end);
	}

	/**
	* Returns the number of vanbans.
	*
	* @return the number of vanbans
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getvanbansCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vanbanLocalService.getvanbansCount();
	}

	/**
	* Updates the vanban in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vanban the vanban
	* @return the vanban that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vanban.model.vanban updatevanban(com.vanban.model.vanban vanban)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vanbanLocalService.updatevanban(vanban);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _vanbanLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_vanbanLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _vanbanLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public vanbanLocalService getWrappedvanbanLocalService() {
		return _vanbanLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedvanbanLocalService(
		vanbanLocalService vanbanLocalService) {
		_vanbanLocalService = vanbanLocalService;
	}

	@Override
	public vanbanLocalService getWrappedService() {
		return _vanbanLocalService;
	}

	@Override
	public void setWrappedService(vanbanLocalService vanbanLocalService) {
		_vanbanLocalService = vanbanLocalService;
	}

	private vanbanLocalService _vanbanLocalService;
}