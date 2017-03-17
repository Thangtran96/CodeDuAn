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

import com.dkcb.model.Lichkham;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the lichkham service. This utility wraps {@link LichkhamPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author hoang_000
 * @see LichkhamPersistence
 * @see LichkhamPersistenceImpl
 * @generated
 */
public class LichkhamUtil {
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
	public static void clearCache(Lichkham lichkham) {
		getPersistence().clearCache(lichkham);
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
	public static List<Lichkham> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Lichkham> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Lichkham> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Lichkham update(Lichkham lichkham) throws SystemException {
		return getPersistence().update(lichkham);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Lichkham update(Lichkham lichkham,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(lichkham, serviceContext);
	}

	/**
	* Caches the lichkham in the entity cache if it is enabled.
	*
	* @param lichkham the lichkham
	*/
	public static void cacheResult(com.dkcb.model.Lichkham lichkham) {
		getPersistence().cacheResult(lichkham);
	}

	/**
	* Caches the lichkhams in the entity cache if it is enabled.
	*
	* @param lichkhams the lichkhams
	*/
	public static void cacheResult(
		java.util.List<com.dkcb.model.Lichkham> lichkhams) {
		getPersistence().cacheResult(lichkhams);
	}

	/**
	* Creates a new lichkham with the primary key. Does not add the lichkham to the database.
	*
	* @param Idlichkham the primary key for the new lichkham
	* @return the new lichkham
	*/
	public static com.dkcb.model.Lichkham create(int Idlichkham) {
		return getPersistence().create(Idlichkham);
	}

	/**
	* Removes the lichkham with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Idlichkham the primary key of the lichkham
	* @return the lichkham that was removed
	* @throws com.dkcb.NoSuchLichkhamException if a lichkham with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.dkcb.model.Lichkham remove(int Idlichkham)
		throws com.dkcb.NoSuchLichkhamException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(Idlichkham);
	}

	public static com.dkcb.model.Lichkham updateImpl(
		com.dkcb.model.Lichkham lichkham)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(lichkham);
	}

	/**
	* Returns the lichkham with the primary key or throws a {@link com.dkcb.NoSuchLichkhamException} if it could not be found.
	*
	* @param Idlichkham the primary key of the lichkham
	* @return the lichkham
	* @throws com.dkcb.NoSuchLichkhamException if a lichkham with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.dkcb.model.Lichkham findByPrimaryKey(int Idlichkham)
		throws com.dkcb.NoSuchLichkhamException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(Idlichkham);
	}

	/**
	* Returns the lichkham with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Idlichkham the primary key of the lichkham
	* @return the lichkham, or <code>null</code> if a lichkham with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.dkcb.model.Lichkham fetchByPrimaryKey(int Idlichkham)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(Idlichkham);
	}

	/**
	* Returns all the lichkhams.
	*
	* @return the lichkhams
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.dkcb.model.Lichkham> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the lichkhams.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dkcb.model.impl.LichkhamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of lichkhams
	* @param end the upper bound of the range of lichkhams (not inclusive)
	* @return the range of lichkhams
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.dkcb.model.Lichkham> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the lichkhams.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dkcb.model.impl.LichkhamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of lichkhams
	* @param end the upper bound of the range of lichkhams (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of lichkhams
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.dkcb.model.Lichkham> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the lichkhams from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of lichkhams.
	*
	* @return the number of lichkhams
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static LichkhamPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (LichkhamPersistence)PortletBeanLocatorUtil.locate(com.dkcb.service.ClpSerializer.getServletContextName(),
					LichkhamPersistence.class.getName());

			ReferenceRegistry.registerReference(LichkhamUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(LichkhamPersistence persistence) {
	}

	private static LichkhamPersistence _persistence;
}