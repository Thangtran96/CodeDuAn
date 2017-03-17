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

package com.dkcb.service.persistence;

import com.dkcb.model.Khoa;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the khoa service. This utility wraps {@link KhoaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author hoang_000
 * @see KhoaPersistence
 * @see KhoaPersistenceImpl
 * @generated
 */
public class KhoaUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Khoa khoa) {
		getPersistence().clearCache(khoa);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Khoa> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Khoa> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Khoa> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Khoa update(Khoa khoa) throws SystemException {
		return getPersistence().update(khoa);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Khoa update(Khoa khoa, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(khoa, serviceContext);
	}

	/**
	* Caches the khoa in the entity cache if it is enabled.
	*
	* @param khoa the khoa
	*/
	public static void cacheResult(com.dkcb.model.Khoa khoa) {
		getPersistence().cacheResult(khoa);
	}

	/**
	* Caches the khoas in the entity cache if it is enabled.
	*
	* @param khoas the khoas
	*/
	public static void cacheResult(java.util.List<com.dkcb.model.Khoa> khoas) {
		getPersistence().cacheResult(khoas);
	}

	/**
	* Creates a new khoa with the primary key. Does not add the khoa to the database.
	*
	* @param Idphongkham the primary key for the new khoa
	* @return the new khoa
	*/
	public static com.dkcb.model.Khoa create(java.lang.String Idphongkham) {
		return getPersistence().create(Idphongkham);
	}

	/**
	* Removes the khoa with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Idphongkham the primary key of the khoa
	* @return the khoa that was removed
	* @throws com.dkcb.NoSuchKhoaException if a khoa with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.dkcb.model.Khoa remove(java.lang.String Idphongkham)
		throws com.dkcb.NoSuchKhoaException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(Idphongkham);
	}

	public static com.dkcb.model.Khoa updateImpl(com.dkcb.model.Khoa khoa)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(khoa);
	}

	/**
	* Returns the khoa with the primary key or throws a {@link com.dkcb.NoSuchKhoaException} if it could not be found.
	*
	* @param Idphongkham the primary key of the khoa
	* @return the khoa
	* @throws com.dkcb.NoSuchKhoaException if a khoa with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.dkcb.model.Khoa findByPrimaryKey(
		java.lang.String Idphongkham)
		throws com.dkcb.NoSuchKhoaException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(Idphongkham);
	}

	/**
	* Returns the khoa with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Idphongkham the primary key of the khoa
	* @return the khoa, or <code>null</code> if a khoa with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.dkcb.model.Khoa fetchByPrimaryKey(
		java.lang.String Idphongkham)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(Idphongkham);
	}

	/**
	* Returns all the khoas.
	*
	* @return the khoas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.dkcb.model.Khoa> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.dkcb.model.Khoa> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the khoas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dkcb.model.impl.KhoaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of khoas
	* @param end the upper bound of the range of khoas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of khoas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.dkcb.model.Khoa> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the khoas from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of khoas.
	*
	* @return the number of khoas
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static KhoaPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (KhoaPersistence)PortletBeanLocatorUtil.locate(com.dkcb.service.ClpSerializer.getServletContextName(),
					KhoaPersistence.class.getName());

			ReferenceRegistry.registerReference(KhoaUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(KhoaPersistence persistence) {
	}

	private static KhoaPersistence _persistence;
}