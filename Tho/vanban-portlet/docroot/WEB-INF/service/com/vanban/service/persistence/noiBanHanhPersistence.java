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

import com.vanban.model.noiBanHanh;

/**
 * The persistence interface for the noi ban hanh service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author nguye
 * @see noiBanHanhPersistenceImpl
 * @see noiBanHanhUtil
 * @generated
 */
public interface noiBanHanhPersistence extends BasePersistence<noiBanHanh> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link noiBanHanhUtil} to access the noi ban hanh persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the noi ban hanh in the entity cache if it is enabled.
	*
	* @param noiBanHanh the noi ban hanh
	*/
	public void cacheResult(com.vanban.model.noiBanHanh noiBanHanh);

	/**
	* Caches the noi ban hanhs in the entity cache if it is enabled.
	*
	* @param noiBanHanhs the noi ban hanhs
	*/
	public void cacheResult(
		java.util.List<com.vanban.model.noiBanHanh> noiBanHanhs);

	/**
	* Creates a new noi ban hanh with the primary key. Does not add the noi ban hanh to the database.
	*
	* @param noiBHId the primary key for the new noi ban hanh
	* @return the new noi ban hanh
	*/
	public com.vanban.model.noiBanHanh create(long noiBHId);

	/**
	* Removes the noi ban hanh with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param noiBHId the primary key of the noi ban hanh
	* @return the noi ban hanh that was removed
	* @throws com.vanban.NoSuchnoiBanHanhException if a noi ban hanh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vanban.model.noiBanHanh remove(long noiBHId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vanban.NoSuchnoiBanHanhException;

	public com.vanban.model.noiBanHanh updateImpl(
		com.vanban.model.noiBanHanh noiBanHanh)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the noi ban hanh with the primary key or throws a {@link com.vanban.NoSuchnoiBanHanhException} if it could not be found.
	*
	* @param noiBHId the primary key of the noi ban hanh
	* @return the noi ban hanh
	* @throws com.vanban.NoSuchnoiBanHanhException if a noi ban hanh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vanban.model.noiBanHanh findByPrimaryKey(long noiBHId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vanban.NoSuchnoiBanHanhException;

	/**
	* Returns the noi ban hanh with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param noiBHId the primary key of the noi ban hanh
	* @return the noi ban hanh, or <code>null</code> if a noi ban hanh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vanban.model.noiBanHanh fetchByPrimaryKey(long noiBHId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the noi ban hanhs.
	*
	* @return the noi ban hanhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vanban.model.noiBanHanh> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the noi ban hanhs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vanban.model.impl.noiBanHanhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of noi ban hanhs
	* @param end the upper bound of the range of noi ban hanhs (not inclusive)
	* @return the range of noi ban hanhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vanban.model.noiBanHanh> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the noi ban hanhs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vanban.model.impl.noiBanHanhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of noi ban hanhs
	* @param end the upper bound of the range of noi ban hanhs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of noi ban hanhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vanban.model.noiBanHanh> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the noi ban hanhs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of noi ban hanhs.
	*
	* @return the number of noi ban hanhs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}