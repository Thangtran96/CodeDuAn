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

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.vanban.NoSuchvanbanException;

import com.vanban.model.impl.vanbanImpl;
import com.vanban.model.impl.vanbanModelImpl;
import com.vanban.model.vanban;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the vanban service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author nguye
 * @see vanbanPersistence
 * @see vanbanUtil
 * @generated
 */
public class vanbanPersistenceImpl extends BasePersistenceImpl<vanban>
	implements vanbanPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link vanbanUtil} to access the vanban persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = vanbanImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(vanbanModelImpl.ENTITY_CACHE_ENABLED,
			vanbanModelImpl.FINDER_CACHE_ENABLED, vanbanImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(vanbanModelImpl.ENTITY_CACHE_ENABLED,
			vanbanModelImpl.FINDER_CACHE_ENABLED, vanbanImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(vanbanModelImpl.ENTITY_CACHE_ENABLED,
			vanbanModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public vanbanPersistenceImpl() {
		setModelClass(vanban.class);
	}

	/**
	 * Caches the vanban in the entity cache if it is enabled.
	 *
	 * @param vanban the vanban
	 */
	@Override
	public void cacheResult(vanban vanban) {
		EntityCacheUtil.putResult(vanbanModelImpl.ENTITY_CACHE_ENABLED,
			vanbanImpl.class, vanban.getPrimaryKey(), vanban);

		vanban.resetOriginalValues();
	}

	/**
	 * Caches the vanbans in the entity cache if it is enabled.
	 *
	 * @param vanbans the vanbans
	 */
	@Override
	public void cacheResult(List<vanban> vanbans) {
		for (vanban vanban : vanbans) {
			if (EntityCacheUtil.getResult(
						vanbanModelImpl.ENTITY_CACHE_ENABLED, vanbanImpl.class,
						vanban.getPrimaryKey()) == null) {
				cacheResult(vanban);
			}
			else {
				vanban.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vanbans.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(vanbanImpl.class.getName());
		}

		EntityCacheUtil.clearCache(vanbanImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vanban.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(vanban vanban) {
		EntityCacheUtil.removeResult(vanbanModelImpl.ENTITY_CACHE_ENABLED,
			vanbanImpl.class, vanban.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<vanban> vanbans) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (vanban vanban : vanbans) {
			EntityCacheUtil.removeResult(vanbanModelImpl.ENTITY_CACHE_ENABLED,
				vanbanImpl.class, vanban.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vanban with the primary key. Does not add the vanban to the database.
	 *
	 * @param vanbanId the primary key for the new vanban
	 * @return the new vanban
	 */
	@Override
	public vanban create(long vanbanId) {
		vanban vanban = new vanbanImpl();

		vanban.setNew(true);
		vanban.setPrimaryKey(vanbanId);

		return vanban;
	}

	/**
	 * Removes the vanban with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param vanbanId the primary key of the vanban
	 * @return the vanban that was removed
	 * @throws com.vanban.NoSuchvanbanException if a vanban with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public vanban remove(long vanbanId)
		throws NoSuchvanbanException, SystemException {
		return remove((Serializable)vanbanId);
	}

	/**
	 * Removes the vanban with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vanban
	 * @return the vanban that was removed
	 * @throws com.vanban.NoSuchvanbanException if a vanban with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public vanban remove(Serializable primaryKey)
		throws NoSuchvanbanException, SystemException {
		Session session = null;

		try {
			session = openSession();

			vanban vanban = (vanban)session.get(vanbanImpl.class, primaryKey);

			if (vanban == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchvanbanException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vanban);
		}
		catch (NoSuchvanbanException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected vanban removeImpl(vanban vanban) throws SystemException {
		vanban = toUnwrappedModel(vanban);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vanban)) {
				vanban = (vanban)session.get(vanbanImpl.class,
						vanban.getPrimaryKeyObj());
			}

			if (vanban != null) {
				session.delete(vanban);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vanban != null) {
			clearCache(vanban);
		}

		return vanban;
	}

	@Override
	public vanban updateImpl(com.vanban.model.vanban vanban)
		throws SystemException {
		vanban = toUnwrappedModel(vanban);

		boolean isNew = vanban.isNew();

		Session session = null;

		try {
			session = openSession();

			if (vanban.isNew()) {
				session.save(vanban);

				vanban.setNew(false);
			}
			else {
				session.merge(vanban);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(vanbanModelImpl.ENTITY_CACHE_ENABLED,
			vanbanImpl.class, vanban.getPrimaryKey(), vanban);

		return vanban;
	}

	protected vanban toUnwrappedModel(vanban vanban) {
		if (vanban instanceof vanbanImpl) {
			return vanban;
		}

		vanbanImpl vanbanImpl = new vanbanImpl();

		vanbanImpl.setNew(vanban.isNew());
		vanbanImpl.setPrimaryKey(vanban.getPrimaryKey());

		vanbanImpl.setVanbanId(vanban.getVanbanId());
		vanbanImpl.setKihieu(vanban.getKihieu());
		vanbanImpl.setTrichyeu(vanban.getTrichyeu());
		vanbanImpl.setNgaybanhanh(vanban.getNgaybanhanh());
		vanbanImpl.setNgaytao(vanban.getNgaytao());
		vanbanImpl.setNguoikiID(vanban.getNguoikiID());
		vanbanImpl.setUserID(vanban.getUserID());
		vanbanImpl.setLoaiID(vanban.getLoaiID());
		vanbanImpl.setNoiBHID(vanban.getNoiBHID());
		vanbanImpl.setTinhtrang(vanban.isTinhtrang());

		return vanbanImpl;
	}

	/**
	 * Returns the vanban with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vanban
	 * @return the vanban
	 * @throws com.vanban.NoSuchvanbanException if a vanban with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public vanban findByPrimaryKey(Serializable primaryKey)
		throws NoSuchvanbanException, SystemException {
		vanban vanban = fetchByPrimaryKey(primaryKey);

		if (vanban == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchvanbanException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vanban;
	}

	/**
	 * Returns the vanban with the primary key or throws a {@link com.vanban.NoSuchvanbanException} if it could not be found.
	 *
	 * @param vanbanId the primary key of the vanban
	 * @return the vanban
	 * @throws com.vanban.NoSuchvanbanException if a vanban with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public vanban findByPrimaryKey(long vanbanId)
		throws NoSuchvanbanException, SystemException {
		return findByPrimaryKey((Serializable)vanbanId);
	}

	/**
	 * Returns the vanban with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vanban
	 * @return the vanban, or <code>null</code> if a vanban with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public vanban fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		vanban vanban = (vanban)EntityCacheUtil.getResult(vanbanModelImpl.ENTITY_CACHE_ENABLED,
				vanbanImpl.class, primaryKey);

		if (vanban == _nullvanban) {
			return null;
		}

		if (vanban == null) {
			Session session = null;

			try {
				session = openSession();

				vanban = (vanban)session.get(vanbanImpl.class, primaryKey);

				if (vanban != null) {
					cacheResult(vanban);
				}
				else {
					EntityCacheUtil.putResult(vanbanModelImpl.ENTITY_CACHE_ENABLED,
						vanbanImpl.class, primaryKey, _nullvanban);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(vanbanModelImpl.ENTITY_CACHE_ENABLED,
					vanbanImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vanban;
	}

	/**
	 * Returns the vanban with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param vanbanId the primary key of the vanban
	 * @return the vanban, or <code>null</code> if a vanban with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public vanban fetchByPrimaryKey(long vanbanId) throws SystemException {
		return fetchByPrimaryKey((Serializable)vanbanId);
	}

	/**
	 * Returns all the vanbans.
	 *
	 * @return the vanbans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<vanban> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<vanban> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

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
	@Override
	public List<vanban> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<vanban> list = (List<vanban>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VANBAN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VANBAN;

				if (pagination) {
					sql = sql.concat(vanbanModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<vanban>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<vanban>(list);
				}
				else {
					list = (List<vanban>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the vanbans from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (vanban vanban : findAll()) {
			remove(vanban);
		}
	}

	/**
	 * Returns the number of vanbans.
	 *
	 * @return the number of vanbans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VANBAN);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the vanban persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vanban.model.vanban")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<vanban>> listenersList = new ArrayList<ModelListener<vanban>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<vanban>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(vanbanImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_VANBAN = "SELECT vanban FROM vanban vanban";
	private static final String _SQL_COUNT_VANBAN = "SELECT COUNT(vanban) FROM vanban vanban";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vanban.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No vanban exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(vanbanPersistenceImpl.class);
	private static vanban _nullvanban = new vanbanImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<vanban> toCacheModel() {
				return _nullvanbanCacheModel;
			}
		};

	private static CacheModel<vanban> _nullvanbanCacheModel = new CacheModel<vanban>() {
			@Override
			public vanban toEntityModel() {
				return _nullvanban;
			}
		};
}