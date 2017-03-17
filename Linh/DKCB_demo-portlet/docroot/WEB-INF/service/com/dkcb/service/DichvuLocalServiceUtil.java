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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Dichvu. This utility wraps
 * {@link com.dkcb.service.impl.DichvuLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author hoang_000
 * @see DichvuLocalService
 * @see com.dkcb.service.base.DichvuLocalServiceBaseImpl
 * @see com.dkcb.service.impl.DichvuLocalServiceImpl
 * @generated
 */
public class DichvuLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.dkcb.service.impl.DichvuLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the dichvu to the database. Also notifies the appropriate model listeners.
	*
	* @param dichvu the dichvu
	* @return the dichvu that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.dkcb.model.Dichvu addDichvu(com.dkcb.model.Dichvu dichvu)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDichvu(dichvu);
	}

	/**
	* Creates a new dichvu with the primary key. Does not add the dichvu to the database.
	*
	* @param Iddichvu the primary key for the new dichvu
	* @return the new dichvu
	*/
	public static com.dkcb.model.Dichvu createDichvu(long Iddichvu) {
		return getService().createDichvu(Iddichvu);
	}

	/**
	* Deletes the dichvu with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Iddichvu the primary key of the dichvu
	* @return the dichvu that was removed
	* @throws PortalException if a dichvu with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.dkcb.model.Dichvu deleteDichvu(long Iddichvu)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDichvu(Iddichvu);
	}

	/**
	* Deletes the dichvu from the database. Also notifies the appropriate model listeners.
	*
	* @param dichvu the dichvu
	* @return the dichvu that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.dkcb.model.Dichvu deleteDichvu(
		com.dkcb.model.Dichvu dichvu)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDichvu(dichvu);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.dkcb.model.Dichvu fetchDichvu(long Iddichvu)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDichvu(Iddichvu);
	}

	/**
	* Returns the dichvu with the primary key.
	*
	* @param Iddichvu the primary key of the dichvu
	* @return the dichvu
	* @throws PortalException if a dichvu with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.dkcb.model.Dichvu getDichvu(long Iddichvu)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDichvu(Iddichvu);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<com.dkcb.model.Dichvu> getDichvus(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDichvus(start, end);
	}

	/**
	* Returns the number of dichvus.
	*
	* @return the number of dichvus
	* @throws SystemException if a system exception occurred
	*/
	public static int getDichvusCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDichvusCount();
	}

	/**
	* Updates the dichvu in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dichvu the dichvu
	* @return the dichvu that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.dkcb.model.Dichvu updateDichvu(
		com.dkcb.model.Dichvu dichvu)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDichvu(dichvu);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void clearService() {
		_service = null;
	}

	public static DichvuLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DichvuLocalService.class.getName());

			if (invokableLocalService instanceof DichvuLocalService) {
				_service = (DichvuLocalService)invokableLocalService;
			}
			else {
				_service = new DichvuLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(DichvuLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(DichvuLocalService service) {
	}

	private static DichvuLocalService _service;
}