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

import com.vanban.model.nguoidung;

/**
 * The persistence interface for the nguoidung service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author nguye
 * @see nguoidungPersistenceImpl
 * @see nguoidungUtil
 * @generated
 */
public interface nguoidungPersistence extends BasePersistence<nguoidung> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link nguoidungUtil} to access the nguoidung persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the nguoidung in the entity cache if it is enabled.
	*
	* @param nguoidung the nguoidung
	*/
	public void cacheResult(com.vanban.model.nguoidung nguoidung);

	/**
	* Caches the nguoidungs in the entity cache if it is enabled.
	*
	* @param nguoidungs the nguoidungs
	*/
	public void cacheResult(
		java.util.List<com.vanban.model.nguoidung> nguoidungs);

	/**
	* Creates a new nguoidung with the primary key. Does not add the nguoidung to the database.
	*
	* @param userId the primary key for the new nguoidung
	* @return the new nguoidung
	*/
	public com.vanban.model.nguoidung create(long userId);

	/**
	* Removes the nguoidung with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param userId the primary key of the nguoidung
	* @return the nguoidung that was removed
	* @throws com.vanban.NoSuchnguoidungException if a nguoidung with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vanban.model.nguoidung remove(long userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vanban.NoSuchnguoidungException;

	public com.vanban.model.nguoidung updateImpl(
		com.vanban.model.nguoidung nguoidung)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the nguoidung with the primary key or throws a {@link com.vanban.NoSuchnguoidungException} if it could not be found.
	*
	* @param userId the primary key of the nguoidung
	* @return the nguoidung
	* @throws com.vanban.NoSuchnguoidungException if a nguoidung with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vanban.model.nguoidung findByPrimaryKey(long userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vanban.NoSuchnguoidungException;

	/**
	* Returns the nguoidung with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param userId the primary key of the nguoidung
	* @return the nguoidung, or <code>null</code> if a nguoidung with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vanban.model.nguoidung fetchByPrimaryKey(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the nguoidungs.
	*
	* @return the nguoidungs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vanban.model.nguoidung> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the nguoidungs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vanban.model.impl.nguoidungModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of nguoidungs
	* @param end the upper bound of the range of nguoidungs (not inclusive)
	* @return the range of nguoidungs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vanban.model.nguoidung> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the nguoidungs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vanban.model.impl.nguoidungModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of nguoidungs
	* @param end the upper bound of the range of nguoidungs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of nguoidungs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vanban.model.nguoidung> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the nguoidungs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of nguoidungs.
	*
	* @return the number of nguoidungs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}