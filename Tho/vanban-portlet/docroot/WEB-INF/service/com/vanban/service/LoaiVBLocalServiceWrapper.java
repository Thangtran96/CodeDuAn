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
 * Provides a wrapper for {@link LoaiVBLocalService}.
 *
 * @author nguye
 * @see LoaiVBLocalService
 * @generated
 */
public class LoaiVBLocalServiceWrapper implements LoaiVBLocalService,
	ServiceWrapper<LoaiVBLocalService> {
	public LoaiVBLocalServiceWrapper(LoaiVBLocalService loaiVBLocalService) {
		_loaiVBLocalService = loaiVBLocalService;
	}

	/**
	* Adds the loai v b to the database. Also notifies the appropriate model listeners.
	*
	* @param loaiVB the loai v b
	* @return the loai v b that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vanban.model.LoaiVB addLoaiVB(com.vanban.model.LoaiVB loaiVB)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaiVBLocalService.addLoaiVB(loaiVB);
	}

	/**
	* Creates a new loai v b with the primary key. Does not add the loai v b to the database.
	*
	* @param loaiId the primary key for the new loai v b
	* @return the new loai v b
	*/
	@Override
	public com.vanban.model.LoaiVB createLoaiVB(long loaiId) {
		return _loaiVBLocalService.createLoaiVB(loaiId);
	}

	/**
	* Deletes the loai v b with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param loaiId the primary key of the loai v b
	* @return the loai v b that was removed
	* @throws PortalException if a loai v b with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vanban.model.LoaiVB deleteLoaiVB(long loaiId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _loaiVBLocalService.deleteLoaiVB(loaiId);
	}

	/**
	* Deletes the loai v b from the database. Also notifies the appropriate model listeners.
	*
	* @param loaiVB the loai v b
	* @return the loai v b that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vanban.model.LoaiVB deleteLoaiVB(com.vanban.model.LoaiVB loaiVB)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaiVBLocalService.deleteLoaiVB(loaiVB);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _loaiVBLocalService.dynamicQuery();
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
		return _loaiVBLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vanban.model.impl.LoaiVBModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _loaiVBLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vanban.model.impl.LoaiVBModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _loaiVBLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _loaiVBLocalService.dynamicQueryCount(dynamicQuery);
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
		return _loaiVBLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.vanban.model.LoaiVB fetchLoaiVB(long loaiId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaiVBLocalService.fetchLoaiVB(loaiId);
	}

	/**
	* Returns the loai v b with the primary key.
	*
	* @param loaiId the primary key of the loai v b
	* @return the loai v b
	* @throws PortalException if a loai v b with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vanban.model.LoaiVB getLoaiVB(long loaiId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _loaiVBLocalService.getLoaiVB(loaiId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _loaiVBLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the loai v bs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vanban.model.impl.LoaiVBModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of loai v bs
	* @param end the upper bound of the range of loai v bs (not inclusive)
	* @return the range of loai v bs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.vanban.model.LoaiVB> getLoaiVBs(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaiVBLocalService.getLoaiVBs(start, end);
	}

	/**
	* Returns the number of loai v bs.
	*
	* @return the number of loai v bs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getLoaiVBsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaiVBLocalService.getLoaiVBsCount();
	}

	/**
	* Updates the loai v b in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param loaiVB the loai v b
	* @return the loai v b that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.vanban.model.LoaiVB updateLoaiVB(com.vanban.model.LoaiVB loaiVB)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaiVBLocalService.updateLoaiVB(loaiVB);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _loaiVBLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_loaiVBLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _loaiVBLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public LoaiVBLocalService getWrappedLoaiVBLocalService() {
		return _loaiVBLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedLoaiVBLocalService(
		LoaiVBLocalService loaiVBLocalService) {
		_loaiVBLocalService = loaiVBLocalService;
	}

	@Override
	public LoaiVBLocalService getWrappedService() {
		return _loaiVBLocalService;
	}

	@Override
	public void setWrappedService(LoaiVBLocalService loaiVBLocalService) {
		_loaiVBLocalService = loaiVBLocalService;
	}

	private LoaiVBLocalService _loaiVBLocalService;
}