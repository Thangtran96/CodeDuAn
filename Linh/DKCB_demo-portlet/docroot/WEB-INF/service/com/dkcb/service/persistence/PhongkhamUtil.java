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

import com.dkcb.model.Phongkham;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the phongkham service. This utility wraps {@link PhongkhamPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author hoang_000
 * @see PhongkhamPersistence
 * @see PhongkhamPersistenceImpl
 * @generated
 */
public class PhongkhamUtil {
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
	public static void clearCache(Phongkham phongkham) {
		getPersistence().clearCache(phongkham);
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
	public static List<Phongkham> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Phongkham> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Phongkham> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Phongkham update(Phongkham phongkham)
		throws SystemException {
		return getPersistence().update(phongkham);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Phongkham update(Phongkham phongkham,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(phongkham, serviceContext);
	}

	/**
	* Caches the phongkham in the entity cache if it is enabled.
	*
	* @param phongkham the phongkham
	*/
	public static void cacheResult(com.dkcb.model.Phongkham phongkham) {
		getPersistence().cacheResult(phongkham);
	}

	/**
	* Caches the phongkhams in the entity cache if it is enabled.
	*
	* @param phongkhams the phongkhams
	*/
	public static void cacheResult(
		java.util.List<com.dkcb.model.Phongkham> phongkhams) {
		getPersistence().cacheResult(phongkhams);
	}

	/**
	* Creates a new phongkham with the primary key. Does not add the phongkham to the database.
	*
	* @param Idphongkham the primary key for the new phongkham
	* @return the new phongkham
	*/
	public static com.dkcb.model.Phongkham create(java.lang.String Idphongkham) {
		return getPersistence().create(Idphongkham);
	}

	/**
	* Removes the phongkham with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Idphongkham the primary key of the phongkham
	* @return the phongkham that was removed
	* @throws com.dkcb.NoSuchPhongkhamException if a phongkham with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.dkcb.model.Phongkham remove(java.lang.String Idphongkham)
		throws com.dkcb.NoSuchPhongkhamException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(Idphongkham);
	}

	public static com.dkcb.model.Phongkham updateImpl(
		com.dkcb.model.Phongkham phongkham)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(phongkham);
	}

	/**
	* Returns the phongkham with the primary key or throws a {@link com.dkcb.NoSuchPhongkhamException} if it could not be found.
	*
	* @param Idphongkham the primary key of the phongkham
	* @return the phongkham
	* @throws com.dkcb.NoSuchPhongkhamException if a phongkham with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.dkcb.model.Phongkham findByPrimaryKey(
		java.lang.String Idphongkham)
		throws com.dkcb.NoSuchPhongkhamException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(Idphongkham);
	}

	/**
	* Returns the phongkham with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Idphongkham the primary key of the phongkham
	* @return the phongkham, or <code>null</code> if a phongkham with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.dkcb.model.Phongkham fetchByPrimaryKey(
		java.lang.String Idphongkham)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(Idphongkham);
	}

	/**
	* Returns all the phongkhams.
	*
	* @return the phongkhams
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.dkcb.model.Phongkham> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the phongkhams.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dkcb.model.impl.PhongkhamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of phongkhams
	* @param end the upper bound of the range of phongkhams (not inclusive)
	* @return the range of phongkhams
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.dkcb.model.Phongkham> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the phongkhams.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dkcb.model.impl.PhongkhamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of phongkhams
	* @param end the upper bound of the range of phongkhams (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of phongkhams
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.dkcb.model.Phongkham> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the phongkhams from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of phongkhams.
	*
	* @return the number of phongkhams
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static PhongkhamPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (PhongkhamPersistence)PortletBeanLocatorUtil.locate(com.dkcb.service.ClpSerializer.getServletContextName(),
					PhongkhamPersistence.class.getName());

			ReferenceRegistry.registerReference(PhongkhamUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(PhongkhamPersistence persistence) {
	}

	private static PhongkhamPersistence _persistence;
}