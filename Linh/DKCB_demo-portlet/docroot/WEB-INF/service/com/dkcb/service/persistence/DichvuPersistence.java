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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the dichvu service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author hoang_000
 * @see DichvuPersistenceImpl
 * @see DichvuUtil
 * @generated
 */
public interface DichvuPersistence extends BasePersistence<Dichvu> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DichvuUtil} to access the dichvu persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the dichvu in the entity cache if it is enabled.
	*
	* @param dichvu the dichvu
	*/
	public void cacheResult(com.dkcb.model.Dichvu dichvu);

	/**
	* Caches the dichvus in the entity cache if it is enabled.
	*
	* @param dichvus the dichvus
	*/
	public void cacheResult(java.util.List<com.dkcb.model.Dichvu> dichvus);

	/**
	* Creates a new dichvu with the primary key. Does not add the dichvu to the database.
	*
	* @param Iddichvu the primary key for the new dichvu
	* @return the new dichvu
	*/
	public com.dkcb.model.Dichvu create(long Iddichvu);

	/**
	* Removes the dichvu with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Iddichvu the primary key of the dichvu
	* @return the dichvu that was removed
	* @throws com.dkcb.NoSuchDichvuException if a dichvu with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.dkcb.model.Dichvu remove(long Iddichvu)
		throws com.dkcb.NoSuchDichvuException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.dkcb.model.Dichvu updateImpl(com.dkcb.model.Dichvu dichvu)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dichvu with the primary key or throws a {@link com.dkcb.NoSuchDichvuException} if it could not be found.
	*
	* @param Iddichvu the primary key of the dichvu
	* @return the dichvu
	* @throws com.dkcb.NoSuchDichvuException if a dichvu with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.dkcb.model.Dichvu findByPrimaryKey(long Iddichvu)
		throws com.dkcb.NoSuchDichvuException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dichvu with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Iddichvu the primary key of the dichvu
	* @return the dichvu, or <code>null</code> if a dichvu with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.dkcb.model.Dichvu fetchByPrimaryKey(long Iddichvu)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dichvus.
	*
	* @return the dichvus
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.dkcb.model.Dichvu> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.dkcb.model.Dichvu> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.dkcb.model.Dichvu> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dichvus from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dichvus.
	*
	* @return the number of dichvus
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}