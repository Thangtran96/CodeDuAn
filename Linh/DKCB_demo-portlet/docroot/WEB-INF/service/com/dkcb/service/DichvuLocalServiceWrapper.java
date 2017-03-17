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
 * Provides a wrapper for {@link DichvuLocalService}.
 *
 * @author hoang_000
 * @see DichvuLocalService
 * @generated
 */
public class DichvuLocalServiceWrapper implements DichvuLocalService,
	ServiceWrapper<DichvuLocalService> {
	public DichvuLocalServiceWrapper(DichvuLocalService dichvuLocalService) {
		_dichvuLocalService = dichvuLocalService;
	}

	/**
	* Adds the dichvu to the database. Also notifies the appropriate model listeners.
	*
	* @param dichvu the dichvu
	* @return the dichvu that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.dkcb.model.Dichvu addDichvu(com.dkcb.model.Dichvu dichvu)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dichvuLocalService.addDichvu(dichvu);
	}

	/**
	* Creates a new dichvu with the primary key. Does not add the dichvu to the database.
	*
	* @param Iddichvu the primary key for the new dichvu
	* @return the new dichvu
	*/
	@Override
	public com.dkcb.model.Dichvu createDichvu(long Iddichvu) {
		return _dichvuLocalService.createDichvu(Iddichvu);
	}

	/**
	* Deletes the dichvu with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Iddichvu the primary key of the dichvu
	* @return the dichvu that was removed
	* @throws PortalException if a dichvu with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.dkcb.model.Dichvu deleteDichvu(long Iddichvu)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dichvuLocalService.deleteDichvu(Iddichvu);
	}

	/**
	* Deletes the dichvu from the database. Also notifies the appropriate model listeners.
	*
	* @param dichvu the dichvu
	* @return the dichvu that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.dkcb.model.Dichvu deleteDichvu(com.dkcb.model.Dichvu dichvu)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dichvuLocalService.deleteDichvu(dichvu);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dichvuLocalService.dynamicQuery();
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
		return _dichvuLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dkcb.model.impl.DichvuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dichvuLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dkcb.model.impl.DichvuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dichvuLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _dichvuLocalService.dynamicQueryCount(dynamicQuery);
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
		return _dichvuLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.dkcb.model.Dichvu fetchDichvu(long Iddichvu)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dichvuLocalService.fetchDichvu(Iddichvu);
	}

	/**
	* Returns the dichvu with the primary key.
	*
	* @param Iddichvu the primary key of the dichvu
	* @return the dichvu
	* @throws PortalException if a dichvu with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.dkcb.model.Dichvu getDichvu(long Iddichvu)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dichvuLocalService.getDichvu(Iddichvu);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dichvuLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dichvus.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dkcb.model.impl.DichvuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dichvus
	* @param end the upper bound of the range of dichvus (not inclusive)
	* @return the range of dichvus
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.dkcb.model.Dichvu> getDichvus(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dichvuLocalService.getDichvus(start, end);
	}

	/**
	* Returns the number of dichvus.
	*
	* @return the number of dichvus
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDichvusCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dichvuLocalService.getDichvusCount();
	}

	/**
	* Updates the dichvu in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dichvu the dichvu
	* @return the dichvu that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.dkcb.model.Dichvu updateDichvu(com.dkcb.model.Dichvu dichvu)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dichvuLocalService.updateDichvu(dichvu);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dichvuLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dichvuLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dichvuLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DichvuLocalService getWrappedDichvuLocalService() {
		return _dichvuLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDichvuLocalService(
		DichvuLocalService dichvuLocalService) {
		_dichvuLocalService = dichvuLocalService;
	}

	@Override
	public DichvuLocalService getWrappedService() {
		return _dichvuLocalService;
	}

	@Override
	public void setWrappedService(DichvuLocalService dichvuLocalService) {
		_dichvuLocalService = dichvuLocalService;
	}

	private DichvuLocalService _dichvuLocalService;
}