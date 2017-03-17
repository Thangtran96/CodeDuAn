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

import com.dkcb.model.Bacsi;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the bacsi service. This utility wraps {@link BacsiPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author hoang_000
 * @see BacsiPersistence
 * @see BacsiPersistenceImpl
 * @generated
 */
public class BacsiUtil {
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
	public static void clearCache(Bacsi bacsi) {
		getPersistence().clearCache(bacsi);
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
	public static List<Bacsi> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Bacsi> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Bacsi> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Bacsi update(Bacsi bacsi) throws SystemException {
		return getPersistence().update(bacsi);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Bacsi update(Bacsi bacsi, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(bacsi, serviceContext);
	}

	/**
	* Caches the bacsi in the entity cache if it is enabled.
	*
	* @param bacsi the bacsi
	*/
	public static void cacheResult(com.dkcb.model.Bacsi bacsi) {
		getPersistence().cacheResult(bacsi);
	}

	/**
	* Caches the bacsis in the entity cache if it is enabled.
	*
	* @param bacsis the bacsis
	*/
	public static void cacheResult(java.util.List<com.dkcb.model.Bacsi> bacsis) {
		getPersistence().cacheResult(bacsis);
	}

	/**
	* Creates a new bacsi with the primary key. Does not add the bacsi to the database.
	*
	* @param Idbacsi the primary key for the new bacsi
	* @return the new bacsi
	*/
	public static com.dkcb.model.Bacsi create(java.lang.String Idbacsi) {
		return getPersistence().create(Idbacsi);
	}

	/**
	* Removes the bacsi with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Idbacsi the primary key of the bacsi
	* @return the bacsi that was removed
	* @throws com.dkcb.NoSuchBacsiException if a bacsi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.dkcb.model.Bacsi remove(java.lang.String Idbacsi)
		throws com.dkcb.NoSuchBacsiException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(Idbacsi);
	}

	public static com.dkcb.model.Bacsi updateImpl(com.dkcb.model.Bacsi bacsi)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(bacsi);
	}

	/**
	* Returns the bacsi with the primary key or throws a {@link com.dkcb.NoSuchBacsiException} if it could not be found.
	*
	* @param Idbacsi the primary key of the bacsi
	* @return the bacsi
	* @throws com.dkcb.NoSuchBacsiException if a bacsi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.dkcb.model.Bacsi findByPrimaryKey(
		java.lang.String Idbacsi)
		throws com.dkcb.NoSuchBacsiException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(Idbacsi);
	}

	/**
	* Returns the bacsi with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Idbacsi the primary key of the bacsi
	* @return the bacsi, or <code>null</code> if a bacsi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.dkcb.model.Bacsi fetchByPrimaryKey(
		java.lang.String Idbacsi)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(Idbacsi);
	}

	/**
	* Returns all the bacsis.
	*
	* @return the bacsis
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.dkcb.model.Bacsi> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.dkcb.model.Bacsi> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the bacsis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dkcb.model.impl.BacsiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bacsis
	* @param end the upper bound of the range of bacsis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of bacsis
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.dkcb.model.Bacsi> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the bacsis from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of bacsis.
	*
	* @return the number of bacsis
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static BacsiPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (BacsiPersistence)PortletBeanLocatorUtil.locate(com.dkcb.service.ClpSerializer.getServletContextName(),
					BacsiPersistence.class.getName());

			ReferenceRegistry.registerReference(BacsiUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(BacsiPersistence persistence) {
	}

	private static BacsiPersistence _persistence;
}