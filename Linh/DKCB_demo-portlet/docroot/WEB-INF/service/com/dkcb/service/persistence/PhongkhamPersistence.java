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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the phongkham service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author hoang_000
 * @see PhongkhamPersistenceImpl
 * @see PhongkhamUtil
 * @generated
 */
public interface PhongkhamPersistence extends BasePersistence<Phongkham> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PhongkhamUtil} to access the phongkham persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the phongkham in the entity cache if it is enabled.
	*
	* @param phongkham the phongkham
	*/
	public void cacheResult(com.dkcb.model.Phongkham phongkham);

	/**
	* Caches the phongkhams in the entity cache if it is enabled.
	*
	* @param phongkhams the phongkhams
	*/
	public void cacheResult(java.util.List<com.dkcb.model.Phongkham> phongkhams);

	/**
	* Creates a new phongkham with the primary key. Does not add the phongkham to the database.
	*
	* @param Idphongkham the primary key for the new phongkham
	* @return the new phongkham
	*/
	public com.dkcb.model.Phongkham create(java.lang.String Idphongkham);

	/**
	* Removes the phongkham with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Idphongkham the primary key of the phongkham
	* @return the phongkham that was removed
	* @throws com.dkcb.NoSuchPhongkhamException if a phongkham with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.dkcb.model.Phongkham remove(java.lang.String Idphongkham)
		throws com.dkcb.NoSuchPhongkhamException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.dkcb.model.Phongkham updateImpl(
		com.dkcb.model.Phongkham phongkham)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the phongkham with the primary key or throws a {@link com.dkcb.NoSuchPhongkhamException} if it could not be found.
	*
	* @param Idphongkham the primary key of the phongkham
	* @return the phongkham
	* @throws com.dkcb.NoSuchPhongkhamException if a phongkham with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.dkcb.model.Phongkham findByPrimaryKey(
		java.lang.String Idphongkham)
		throws com.dkcb.NoSuchPhongkhamException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the phongkham with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Idphongkham the primary key of the phongkham
	* @return the phongkham, or <code>null</code> if a phongkham with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.dkcb.model.Phongkham fetchByPrimaryKey(
		java.lang.String Idphongkham)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the phongkhams.
	*
	* @return the phongkhams
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.dkcb.model.Phongkham> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.dkcb.model.Phongkham> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.dkcb.model.Phongkham> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the phongkhams from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of phongkhams.
	*
	* @return the number of phongkhams
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}