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

import com.vanban.model.user;

/**
 * The persistence interface for the user service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author nguye
 * @see userPersistenceImpl
 * @see userUtil
 * @generated
 */
public interface userPersistence extends BasePersistence<user> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link userUtil} to access the user persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the user in the entity cache if it is enabled.
	*
	* @param user the user
	*/
	public void cacheResult(com.vanban.model.user user);

	/**
	* Caches the users in the entity cache if it is enabled.
	*
	* @param users the users
	*/
	public void cacheResult(java.util.List<com.vanban.model.user> users);

	/**
	* Creates a new user with the primary key. Does not add the user to the database.
	*
	* @param userId the primary key for the new user
	* @return the new user
	*/
	public com.vanban.model.user create(long userId);

	/**
	* Removes the user with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param userId the primary key of the user
	* @return the user that was removed
	* @throws com.vanban.NoSuchuserException if a user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vanban.model.user remove(long userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vanban.NoSuchuserException;

	public com.vanban.model.user updateImpl(com.vanban.model.user user)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the user with the primary key or throws a {@link com.vanban.NoSuchuserException} if it could not be found.
	*
	* @param userId the primary key of the user
	* @return the user
	* @throws com.vanban.NoSuchuserException if a user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vanban.model.user findByPrimaryKey(long userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vanban.NoSuchuserException;

	/**
	* Returns the user with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param userId the primary key of the user
	* @return the user, or <code>null</code> if a user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vanban.model.user fetchByPrimaryKey(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the users.
	*
	* @return the users
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vanban.model.user> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the users.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vanban.model.impl.userModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of users
	* @param end the upper bound of the range of users (not inclusive)
	* @return the range of users
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vanban.model.user> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the users.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vanban.model.impl.userModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of users
	* @param end the upper bound of the range of users (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of users
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vanban.model.user> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the users from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of users.
	*
	* @return the number of users
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}