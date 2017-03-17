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

import com.liferay.portal.service.persistence.BasePersistence;

import com.vanban.model.vanban;

/**
 * The persistence interface for the vanban service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author nguye
 * @see vanbanPersistenceImpl
 * @see vanbanUtil
 * @generated
 */
public interface vanbanPersistence extends BasePersistence<vanban> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link vanbanUtil} to access the vanban persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the vanban in the entity cache if it is enabled.
	*
	* @param vanban the vanban
	*/
	public void cacheResult(com.vanban.model.vanban vanban);

	/**
	* Caches the vanbans in the entity cache if it is enabled.
	*
	* @param vanbans the vanbans
	*/
	public void cacheResult(java.util.List<com.vanban.model.vanban> vanbans);

	/**
	* Creates a new vanban with the primary key. Does not add the vanban to the database.
	*
	* @param vanbanId the primary key for the new vanban
	* @return the new vanban
	*/
	public com.vanban.model.vanban create(long vanbanId);

	/**
	* Removes the vanban with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vanbanId the primary key of the vanban
	* @return the vanban that was removed
	* @throws com.vanban.NoSuchvanbanException if a vanban with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vanban.model.vanban remove(long vanbanId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vanban.NoSuchvanbanException;

	public com.vanban.model.vanban updateImpl(com.vanban.model.vanban vanban)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the vanban with the primary key or throws a {@link com.vanban.NoSuchvanbanException} if it could not be found.
	*
	* @param vanbanId the primary key of the vanban
	* @return the vanban
	* @throws com.vanban.NoSuchvanbanException if a vanban with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vanban.model.vanban findByPrimaryKey(long vanbanId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vanban.NoSuchvanbanException;

	/**
	* Returns the vanban with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vanbanId the primary key of the vanban
	* @return the vanban, or <code>null</code> if a vanban with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vanban.model.vanban fetchByPrimaryKey(long vanbanId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the vanbans.
	*
	* @return the vanbans
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vanban.model.vanban> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the vanbans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vanban.model.impl.vanbanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vanbans
	* @param end the upper bound of the range of vanbans (not inclusive)
	* @return the range of vanbans
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vanban.model.vanban> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the vanbans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vanban.model.impl.vanbanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vanbans
	* @param end the upper bound of the range of vanbans (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vanbans
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vanban.model.vanban> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the vanbans from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of vanbans.
	*
	* @return the number of vanbans
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}