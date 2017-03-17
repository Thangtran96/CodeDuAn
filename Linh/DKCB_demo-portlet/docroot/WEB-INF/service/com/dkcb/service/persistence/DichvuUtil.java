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

import com.dkcb.model.Dichvu;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the dichvu service. This utility wraps {@link DichvuPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author hoang_000
 * @see DichvuPersistence
 * @see DichvuPersistenceImpl
 * @generated
 */
public class DichvuUtil {
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
	public static void clearCache(Dichvu dichvu) {
		getPersistence().clearCache(dichvu);
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
	public static List<Dichvu> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Dichvu> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Dichvu> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Dichvu update(Dichvu dichvu) throws SystemException {
		return getPersistence().update(dichvu);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Dichvu update(Dichvu dichvu, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(dichvu, serviceContext);
	}

	/**
	* Caches the dichvu in the entity cache if it is enabled.
	*
	* @param dichvu the dichvu
	*/
	public static void cacheResult(com.dkcb.model.Dichvu dichvu) {
		getPersistence().cacheResult(dichvu);
	}

	/**
	* Caches the dichvus in the entity cache if it is enabled.
	*
	* @param dichvus the dichvus
	*/
	public static void cacheResult(
		java.util.List<com.dkcb.model.Dichvu> dichvus) {
		getPersistence().cacheResult(dichvus);
	}

	/**
	* Creates a new dichvu with the primary key. Does not add the dichvu to the database.
	*
	* @param Iddichvu the primary key for the new dichvu
	* @return the new dichvu
	*/
	public static com.dkcb.model.Dichvu create(long Iddichvu) {
		return getPersistence().create(Iddichvu);
	}

	/**
	* Removes the dichvu with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Iddichvu the primary key of the dichvu
	* @return the dichvu that was removed
	* @throws com.dkcb.NoSuchDichvuException if a dichvu with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.dkcb.model.Dichvu remove(long Iddichvu)
		throws com.dkcb.NoSuchDichvuException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(Iddichvu);
	}

	public static com.dkcb.model.Dichvu updateImpl(com.dkcb.model.Dichvu dichvu)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dichvu);
	}

	/**
	* Returns the dichvu with the primary key or throws a {@link com.dkcb.NoSuchDichvuException} if it could not be found.
	*
	* @param Iddichvu the primary key of the dichvu
	* @return the dichvu
	* @throws com.dkcb.NoSuchDichvuException if a dichvu with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.dkcb.model.Dichvu findByPrimaryKey(long Iddichvu)
		throws com.dkcb.NoSuchDichvuException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(Iddichvu);
	}

	/**
	* Returns the dichvu with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Iddichvu the primary key of the dichvu
	* @return the dichvu, or <code>null</code> if a dichvu with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.dkcb.model.Dichvu fetchByPrimaryKey(long Iddichvu)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(Iddichvu);
	}

	/**
	* Returns all the dichvus.
	*
	* @return the dichvus
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.dkcb.model.Dichvu> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.dkcb.model.Dichvu> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dichvus.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dkcb.model.impl.DichvuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dichvus
	* @param end the upper bound of the range of dichvus (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dichvus
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.dkcb.model.Dichvu> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dichvus from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dichvus.
	*
	* @return the number of dichvus
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DichvuPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DichvuPersistence)PortletBeanLocatorUtil.locate(com.dkcb.service.ClpSerializer.getServletContextName(),
					DichvuPersistence.class.getName());

			ReferenceRegistry.registerReference(DichvuUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DichvuPersistence persistence) {
	}

	private static DichvuPersistence _persistence;
}