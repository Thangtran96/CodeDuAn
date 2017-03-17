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

import com.vanban.model.LoaiVB;

/**
 * The persistence interface for the loai v b service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author nguye
 * @see LoaiVBPersistenceImpl
 * @see LoaiVBUtil
 * @generated
 */
public interface LoaiVBPersistence extends BasePersistence<LoaiVB> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LoaiVBUtil} to access the loai v b persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the loai v b in the entity cache if it is enabled.
	*
	* @param loaiVB the loai v b
	*/
	public void cacheResult(com.vanban.model.LoaiVB loaiVB);

	/**
	* Caches the loai v bs in the entity cache if it is enabled.
	*
	* @param loaiVBs the loai v bs
	*/
	public void cacheResult(java.util.List<com.vanban.model.LoaiVB> loaiVBs);

	/**
	* Creates a new loai v b with the primary key. Does not add the loai v b to the database.
	*
	* @param loaiId the primary key for the new loai v b
	* @return the new loai v b
	*/
	public com.vanban.model.LoaiVB create(long loaiId);

	/**
	* Removes the loai v b with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param loaiId the primary key of the loai v b
	* @return the loai v b that was removed
	* @throws com.vanban.NoSuchLoaiVBException if a loai v b with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vanban.model.LoaiVB remove(long loaiId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vanban.NoSuchLoaiVBException;

	public com.vanban.model.LoaiVB updateImpl(com.vanban.model.LoaiVB loaiVB)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the loai v b with the primary key or throws a {@link com.vanban.NoSuchLoaiVBException} if it could not be found.
	*
	* @param loaiId the primary key of the loai v b
	* @return the loai v b
	* @throws com.vanban.NoSuchLoaiVBException if a loai v b with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vanban.model.LoaiVB findByPrimaryKey(long loaiId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vanban.NoSuchLoaiVBException;

	/**
	* Returns the loai v b with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param loaiId the primary key of the loai v b
	* @return the loai v b, or <code>null</code> if a loai v b with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vanban.model.LoaiVB fetchByPrimaryKey(long loaiId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the loai v bs.
	*
	* @return the loai v bs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vanban.model.LoaiVB> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the loai v bs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vanban.model.impl.LoaiVBModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of loai v bs
	* @param end the upper bound of the range of loai v bs (not inclusive)
	* @return the range of loai v bs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vanban.model.LoaiVB> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the loai v bs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vanban.model.impl.LoaiVBModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of loai v bs
	* @param end the upper bound of the range of loai v bs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of loai v bs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vanban.model.LoaiVB> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the loai v bs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of loai v bs.
	*
	* @return the number of loai v bs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}