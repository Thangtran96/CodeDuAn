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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the bacsi service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author hoang_000
 * @see BacsiPersistenceImpl
 * @see BacsiUtil
 * @generated
 */
public interface BacsiPersistence extends BasePersistence<Bacsi> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BacsiUtil} to access the bacsi persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the bacsi in the entity cache if it is enabled.
	*
	* @param bacsi the bacsi
	*/
	public void cacheResult(com.dkcb.model.Bacsi bacsi);

	/**
	* Caches the bacsis in the entity cache if it is enabled.
	*
	* @param bacsis the bacsis
	*/
	public void cacheResult(java.util.List<com.dkcb.model.Bacsi> bacsis);

	/**
	* Creates a new bacsi with the primary key. Does not add the bacsi to the database.
	*
	* @param Idbacsi the primary key for the new bacsi
	* @return the new bacsi
	*/
	public com.dkcb.model.Bacsi create(java.lang.String Idbacsi);

	/**
	* Removes the bacsi with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Idbacsi the primary key of the bacsi
	* @return the bacsi that was removed
	* @throws com.dkcb.NoSuchBacsiException if a bacsi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.dkcb.model.Bacsi remove(java.lang.String Idbacsi)
		throws com.dkcb.NoSuchBacsiException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.dkcb.model.Bacsi updateImpl(com.dkcb.model.Bacsi bacsi)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the bacsi with the primary key or throws a {@link com.dkcb.NoSuchBacsiException} if it could not be found.
	*
	* @param Idbacsi the primary key of the bacsi
	* @return the bacsi
	* @throws com.dkcb.NoSuchBacsiException if a bacsi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.dkcb.model.Bacsi findByPrimaryKey(java.lang.String Idbacsi)
		throws com.dkcb.NoSuchBacsiException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the bacsi with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Idbacsi the primary key of the bacsi
	* @return the bacsi, or <code>null</code> if a bacsi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.dkcb.model.Bacsi fetchByPrimaryKey(java.lang.String Idbacsi)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the bacsis.
	*
	* @return the bacsis
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.dkcb.model.Bacsi> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.dkcb.model.Bacsi> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.dkcb.model.Bacsi> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the bacsis from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of bacsis.
	*
	* @return the number of bacsis
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}