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

package com.vanban.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.vanban.model.nguoiki;

import java.util.List;

/**
 * The persistence utility for the nguoiki service. This utility wraps {@link nguoikiPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author nguye
 * @see nguoikiPersistence
 * @see nguoikiPersistenceImpl
 * @generated
 */
public class nguoikiUtil {
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
	public static void clearCache(nguoiki nguoiki) {
		getPersistence().clearCache(nguoiki);
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
	public static List<nguoiki> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<nguoiki> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<nguoiki> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static nguoiki update(nguoiki nguoiki) throws SystemException {
		return getPersistence().update(nguoiki);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static nguoiki update(nguoiki nguoiki, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(nguoiki, serviceContext);
	}

	/**
	* Caches the nguoiki in the entity cache if it is enabled.
	*
	* @param nguoiki the nguoiki
	*/
	public static void cacheResult(com.vanban.model.nguoiki nguoiki) {
		getPersistence().cacheResult(nguoiki);
	}

	/**
	* Caches the nguoikis in the entity cache if it is enabled.
	*
	* @param nguoikis the nguoikis
	*/
	public static void cacheResult(
		java.util.List<com.vanban.model.nguoiki> nguoikis) {
		getPersistence().cacheResult(nguoikis);
	}

	/**
	* Creates a new nguoiki with the primary key. Does not add the nguoiki to the database.
	*
	* @param nguoikiID the primary key for the new nguoiki
	* @return the new nguoiki
	*/
	public static com.vanban.model.nguoiki create(long nguoikiID) {
		return getPersistence().create(nguoikiID);
	}

	/**
	* Removes the nguoiki with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param nguoikiID the primary key of the nguoiki
	* @return the nguoiki that was removed
	* @throws com.vanban.NoSuchnguoikiException if a nguoiki with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vanban.model.nguoiki remove(long nguoikiID)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vanban.NoSuchnguoikiException {
		return getPersistence().remove(nguoikiID);
	}

	public static com.vanban.model.nguoiki updateImpl(
		com.vanban.model.nguoiki nguoiki)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(nguoiki);
	}

	/**
	* Returns the nguoiki with the primary key or throws a {@link com.vanban.NoSuchnguoikiException} if it could not be found.
	*
	* @param nguoikiID the primary key of the nguoiki
	* @return the nguoiki
	* @throws com.vanban.NoSuchnguoikiException if a nguoiki with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vanban.model.nguoiki findByPrimaryKey(long nguoikiID)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vanban.NoSuchnguoikiException {
		return getPersistence().findByPrimaryKey(nguoikiID);
	}

	/**
	* Returns the nguoiki with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param nguoikiID the primary key of the nguoiki
	* @return the nguoiki, or <code>null</code> if a nguoiki with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vanban.model.nguoiki fetchByPrimaryKey(long nguoikiID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(nguoikiID);
	}

	/**
	* Returns all the nguoikis.
	*
	* @return the nguoikis
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vanban.model.nguoiki> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the nguoikis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vanban.model.impl.nguoikiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of nguoikis
	* @param end the upper bound of the range of nguoikis (not inclusive)
	* @return the range of nguoikis
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vanban.model.nguoiki> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the nguoikis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vanban.model.impl.nguoikiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of nguoikis
	* @param end the upper bound of the range of nguoikis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of nguoikis
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vanban.model.nguoiki> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the nguoikis from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of nguoikis.
	*
	* @return the number of nguoikis
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static nguoikiPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (nguoikiPersistence)PortletBeanLocatorUtil.locate(com.vanban.service.ClpSerializer.getServletContextName(),
					nguoikiPersistence.class.getName());

			ReferenceRegistry.registerReference(nguoikiUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(nguoikiPersistence persistence) {
	}

	private static nguoikiPersistence _persistence;
}