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

package com.dkcb.service.base;

import com.dkcb.model.Dichvu;

import com.dkcb.service.DichvuService;
import com.dkcb.service.persistence.BacsiPersistence;
import com.dkcb.service.persistence.DKCBPersistence;
import com.dkcb.service.persistence.DichvuPersistence;
import com.dkcb.service.persistence.LichkhamPersistence;
import com.dkcb.service.persistence.PhongkhamPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the dichvu remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.dkcb.service.impl.DichvuServiceImpl}.
 * </p>
 *
 * @author hoang_000
 * @see com.dkcb.service.impl.DichvuServiceImpl
 * @see com.dkcb.service.DichvuServiceUtil
 * @generated
 */
public abstract class DichvuServiceBaseImpl extends BaseServiceImpl
	implements DichvuService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.dkcb.service.DichvuServiceUtil} to access the dichvu remote service.
	 */

	/**
	 * Returns the bacsi local service.
	 *
	 * @return the bacsi local service
	 */
	public com.dkcb.service.BacsiLocalService getBacsiLocalService() {
		return bacsiLocalService;
	}

	/**
	 * Sets the bacsi local service.
	 *
	 * @param bacsiLocalService the bacsi local service
	 */
	public void setBacsiLocalService(
		com.dkcb.service.BacsiLocalService bacsiLocalService) {
		this.bacsiLocalService = bacsiLocalService;
	}

	/**
	 * Returns the bacsi remote service.
	 *
	 * @return the bacsi remote service
	 */
	public com.dkcb.service.BacsiService getBacsiService() {
		return bacsiService;
	}

	/**
	 * Sets the bacsi remote service.
	 *
	 * @param bacsiService the bacsi remote service
	 */
	public void setBacsiService(com.dkcb.service.BacsiService bacsiService) {
		this.bacsiService = bacsiService;
	}

	/**
	 * Returns the bacsi persistence.
	 *
	 * @return the bacsi persistence
	 */
	public BacsiPersistence getBacsiPersistence() {
		return bacsiPersistence;
	}

	/**
	 * Sets the bacsi persistence.
	 *
	 * @param bacsiPersistence the bacsi persistence
	 */
	public void setBacsiPersistence(BacsiPersistence bacsiPersistence) {
		this.bacsiPersistence = bacsiPersistence;
	}

	/**
	 * Returns the dichvu local service.
	 *
	 * @return the dichvu local service
	 */
	public com.dkcb.service.DichvuLocalService getDichvuLocalService() {
		return dichvuLocalService;
	}

	/**
	 * Sets the dichvu local service.
	 *
	 * @param dichvuLocalService the dichvu local service
	 */
	public void setDichvuLocalService(
		com.dkcb.service.DichvuLocalService dichvuLocalService) {
		this.dichvuLocalService = dichvuLocalService;
	}

	/**
	 * Returns the dichvu remote service.
	 *
	 * @return the dichvu remote service
	 */
	public com.dkcb.service.DichvuService getDichvuService() {
		return dichvuService;
	}

	/**
	 * Sets the dichvu remote service.
	 *
	 * @param dichvuService the dichvu remote service
	 */
	public void setDichvuService(com.dkcb.service.DichvuService dichvuService) {
		this.dichvuService = dichvuService;
	}

	/**
	 * Returns the dichvu persistence.
	 *
	 * @return the dichvu persistence
	 */
	public DichvuPersistence getDichvuPersistence() {
		return dichvuPersistence;
	}

	/**
	 * Sets the dichvu persistence.
	 *
	 * @param dichvuPersistence the dichvu persistence
	 */
	public void setDichvuPersistence(DichvuPersistence dichvuPersistence) {
		this.dichvuPersistence = dichvuPersistence;
	}

	/**
	 * Returns the d k c b local service.
	 *
	 * @return the d k c b local service
	 */
	public com.dkcb.service.DKCBLocalService getDKCBLocalService() {
		return dkcbLocalService;
	}

	/**
	 * Sets the d k c b local service.
	 *
	 * @param dkcbLocalService the d k c b local service
	 */
	public void setDKCBLocalService(
		com.dkcb.service.DKCBLocalService dkcbLocalService) {
		this.dkcbLocalService = dkcbLocalService;
	}

	/**
	 * Returns the d k c b remote service.
	 *
	 * @return the d k c b remote service
	 */
	public com.dkcb.service.DKCBService getDKCBService() {
		return dkcbService;
	}

	/**
	 * Sets the d k c b remote service.
	 *
	 * @param dkcbService the d k c b remote service
	 */
	public void setDKCBService(com.dkcb.service.DKCBService dkcbService) {
		this.dkcbService = dkcbService;
	}

	/**
	 * Returns the d k c b persistence.
	 *
	 * @return the d k c b persistence
	 */
	public DKCBPersistence getDKCBPersistence() {
		return dkcbPersistence;
	}

	/**
	 * Sets the d k c b persistence.
	 *
	 * @param dkcbPersistence the d k c b persistence
	 */
	public void setDKCBPersistence(DKCBPersistence dkcbPersistence) {
		this.dkcbPersistence = dkcbPersistence;
	}

	/**
	 * Returns the lichkham local service.
	 *
	 * @return the lichkham local service
	 */
	public com.dkcb.service.LichkhamLocalService getLichkhamLocalService() {
		return lichkhamLocalService;
	}

	/**
	 * Sets the lichkham local service.
	 *
	 * @param lichkhamLocalService the lichkham local service
	 */
	public void setLichkhamLocalService(
		com.dkcb.service.LichkhamLocalService lichkhamLocalService) {
		this.lichkhamLocalService = lichkhamLocalService;
	}

	/**
	 * Returns the lichkham remote service.
	 *
	 * @return the lichkham remote service
	 */
	public com.dkcb.service.LichkhamService getLichkhamService() {
		return lichkhamService;
	}

	/**
	 * Sets the lichkham remote service.
	 *
	 * @param lichkhamService the lichkham remote service
	 */
	public void setLichkhamService(
		com.dkcb.service.LichkhamService lichkhamService) {
		this.lichkhamService = lichkhamService;
	}

	/**
	 * Returns the lichkham persistence.
	 *
	 * @return the lichkham persistence
	 */
	public LichkhamPersistence getLichkhamPersistence() {
		return lichkhamPersistence;
	}

	/**
	 * Sets the lichkham persistence.
	 *
	 * @param lichkhamPersistence the lichkham persistence
	 */
	public void setLichkhamPersistence(LichkhamPersistence lichkhamPersistence) {
		this.lichkhamPersistence = lichkhamPersistence;
	}

	/**
	 * Returns the phongkham local service.
	 *
	 * @return the phongkham local service
	 */
	public com.dkcb.service.PhongkhamLocalService getPhongkhamLocalService() {
		return phongkhamLocalService;
	}

	/**
	 * Sets the phongkham local service.
	 *
	 * @param phongkhamLocalService the phongkham local service
	 */
	public void setPhongkhamLocalService(
		com.dkcb.service.PhongkhamLocalService phongkhamLocalService) {
		this.phongkhamLocalService = phongkhamLocalService;
	}

	/**
	 * Returns the phongkham remote service.
	 *
	 * @return the phongkham remote service
	 */
	public com.dkcb.service.PhongkhamService getPhongkhamService() {
		return phongkhamService;
	}

	/**
	 * Sets the phongkham remote service.
	 *
	 * @param phongkhamService the phongkham remote service
	 */
	public void setPhongkhamService(
		com.dkcb.service.PhongkhamService phongkhamService) {
		this.phongkhamService = phongkhamService;
	}

	/**
	 * Returns the phongkham persistence.
	 *
	 * @return the phongkham persistence
	 */
	public PhongkhamPersistence getPhongkhamPersistence() {
		return phongkhamPersistence;
	}

	/**
	 * Sets the phongkham persistence.
	 *
	 * @param phongkhamPersistence the phongkham persistence
	 */
	public void setPhongkhamPersistence(
		PhongkhamPersistence phongkhamPersistence) {
		this.phongkhamPersistence = phongkhamPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();
	}

	public void destroy() {
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return Dichvu.class;
	}

	protected String getModelClassName() {
		return Dichvu.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = dichvuPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.dkcb.service.BacsiLocalService.class)
	protected com.dkcb.service.BacsiLocalService bacsiLocalService;
	@BeanReference(type = com.dkcb.service.BacsiService.class)
	protected com.dkcb.service.BacsiService bacsiService;
	@BeanReference(type = BacsiPersistence.class)
	protected BacsiPersistence bacsiPersistence;
	@BeanReference(type = com.dkcb.service.DichvuLocalService.class)
	protected com.dkcb.service.DichvuLocalService dichvuLocalService;
	@BeanReference(type = com.dkcb.service.DichvuService.class)
	protected com.dkcb.service.DichvuService dichvuService;
	@BeanReference(type = DichvuPersistence.class)
	protected DichvuPersistence dichvuPersistence;
	@BeanReference(type = com.dkcb.service.DKCBLocalService.class)
	protected com.dkcb.service.DKCBLocalService dkcbLocalService;
	@BeanReference(type = com.dkcb.service.DKCBService.class)
	protected com.dkcb.service.DKCBService dkcbService;
	@BeanReference(type = DKCBPersistence.class)
	protected DKCBPersistence dkcbPersistence;
	@BeanReference(type = com.dkcb.service.LichkhamLocalService.class)
	protected com.dkcb.service.LichkhamLocalService lichkhamLocalService;
	@BeanReference(type = com.dkcb.service.LichkhamService.class)
	protected com.dkcb.service.LichkhamService lichkhamService;
	@BeanReference(type = LichkhamPersistence.class)
	protected LichkhamPersistence lichkhamPersistence;
	@BeanReference(type = com.dkcb.service.PhongkhamLocalService.class)
	protected com.dkcb.service.PhongkhamLocalService phongkhamLocalService;
	@BeanReference(type = com.dkcb.service.PhongkhamService.class)
	protected com.dkcb.service.PhongkhamService phongkhamService;
	@BeanReference(type = PhongkhamPersistence.class)
	protected PhongkhamPersistence phongkhamPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private DichvuServiceClpInvoker _clpInvoker = new DichvuServiceClpInvoker();
}