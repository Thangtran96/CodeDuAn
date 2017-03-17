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

import com.vanban.NoSuchnoiBanHanhException;

import com.vanban.model.impl.noiBanHanhImpl;
import com.vanban.model.impl.noiBanHanhModelImpl;
import com.vanban.model.noiBanHanh;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the noi ban hanh service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author nguye
 * @see noiBanHanhPersistence
 * @see noiBanHanhUtil
 * @generated
 */
public class noiBanHanhPersistenceImpl extends BasePersistenceImpl<noiBanHanh>
	implements noiBanHanhPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link noiBanHanhUtil} to access the noi ban hanh persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = noiBanHanhImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(noiBanHanhModelImpl.ENTITY_CACHE_ENABLED,
			noiBanHanhModelImpl.FINDER_CACHE_ENABLED, noiBanHanhImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(noiBanHanhModelImpl.ENTITY_CACHE_ENABLED,
			noiBanHanhModelImpl.FINDER_CACHE_ENABLED, noiBanHanhImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(noiBanHanhModelImpl.ENTITY_CACHE_ENABLED,
			noiBanHanhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public noiBanHanhPersistenceImpl() {
		setModelClass(noiBanHanh.class);
	}

	/**
	 * Caches the noi ban hanh in the entity cache if it is enabled.
	 *
	 * @param noiBanHanh the noi ban hanh
	 */
	@Override
	public void cacheResult(noiBanHanh noiBanHanh) {
		EntityCacheUtil.putResult(noiBanHanhModelImpl.ENTITY_CACHE_ENABLED,
			noiBanHanhImpl.class, noiBanHanh.getPrimaryKey(), noiBanHanh);

		noiBanHanh.resetOriginalValues();
	}

	/**
	 * Caches the noi ban hanhs in the entity cache if it is enabled.
	 *
	 * @param noiBanHanhs the noi ban hanhs
	 */
	@Override
	public void cacheResult(List<noiBanHanh> noiBanHanhs) {
		for (noiBanHanh noiBanHanh : noiBanHanhs) {
			if (EntityCacheUtil.getResult(
						noiBanHanhModelImpl.ENTITY_CACHE_ENABLED,
						noiBanHanhImpl.class, noiBanHanh.getPrimaryKey()) == null) {
				cacheResult(noiBanHanh);
			}
			else {
				noiBanHanh.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all noi ban hanhs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(noiBanHanhImpl.class.getName());
		}

		EntityCacheUtil.clearCache(noiBanHanhImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the noi ban hanh.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(noiBanHanh noiBanHanh) {
		EntityCacheUtil.removeResult(noiBanHanhModelImpl.ENTITY_CACHE_ENABLED,
			noiBanHanhImpl.class, noiBanHanh.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<noiBanHanh> noiBanHanhs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (noiBanHanh noiBanHanh : noiBanHanhs) {
			EntityCacheUtil.removeResult(noiBanHanhModelImpl.ENTITY_CACHE_ENABLED,
				noiBanHanhImpl.class, noiBanHanh.getPrimaryKey());
		}
	}

	/**
	 * Creates a new noi ban hanh with the primary key. Does not add the noi ban hanh to the database.
	 *
	 * @param noiBHId the primary key for the new noi ban hanh
	 * @return the new noi ban hanh
	 */
	@Override
	public noiBanHanh create(long noiBHId) {
		noiBanHanh noiBanHanh = new noiBanHanhImpl();

		noiBanHanh.setNew(true);
		noiBanHanh.setPrimaryKey(noiBHId);

		return noiBanHanh;
	}

	/**
	 * Removes the noi ban hanh with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param noiBHId the primary key of the noi ban hanh
	 * @return the noi ban hanh that was removed
	 * @throws com.vanban.NoSuchnoiBanHanhException if a noi ban hanh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public noiBanHanh remove(long noiBHId)
		throws NoSuchnoiBanHanhException, SystemException {
		return remove((Serializable)noiBHId);
	}

	/**
	 * Removes the noi ban hanh with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the noi ban hanh
	 * @return the noi ban hanh that was removed
	 * @throws com.vanban.NoSuchnoiBanHanhException if a noi ban hanh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public noiBanHanh remove(Serializable primaryKey)
		throws NoSuchnoiBanHanhException, SystemException {
		Session session = null;

		try {
			session = openSession();

			noiBanHanh noiBanHanh = (noiBanHanh)session.get(noiBanHanhImpl.class,
					primaryKey);

			if (noiBanHanh == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchnoiBanHanhException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(noiBanHanh);
		}
		catch (NoSuchnoiBanHanhException nsee) {
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
	protected noiBanHanh removeImpl(noiBanHanh noiBanHanh)
		throws SystemException {
		noiBanHanh = toUnwrappedModel(noiBanHanh);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(noiBanHanh)) {
				noiBanHanh = (noiBanHanh)session.get(noiBanHanhImpl.class,
						noiBanHanh.getPrimaryKeyObj());
			}

			if (noiBanHanh != null) {
				session.delete(noiBanHanh);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (noiBanHanh != null) {
			clearCache(noiBanHanh);
		}

		return noiBanHanh;
	}

	@Override
	public noiBanHanh updateImpl(com.vanban.model.noiBanHanh noiBanHanh)
		throws SystemException {
		noiBanHanh = toUnwrappedModel(noiBanHanh);

		boolean isNew = noiBanHanh.isNew();

		Session session = null;

		try {
			session = openSession();

			if (noiBanHanh.isNew()) {
				session.save(noiBanHanh);

				noiBanHanh.setNew(false);
			}
			else {
				session.merge(noiBanHanh);
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

		EntityCacheUtil.putResult(noiBanHanhModelImpl.ENTITY_CACHE_ENABLED,
			noiBanHanhImpl.class, noiBanHanh.getPrimaryKey(), noiBanHanh);

		return noiBanHanh;
	}

	protected noiBanHanh toUnwrappedModel(noiBanHanh noiBanHanh) {
		if (noiBanHanh instanceof noiBanHanhImpl) {
			return noiBanHanh;
		}

		noiBanHanhImpl noiBanHanhImpl = new noiBanHanhImpl();

		noiBanHanhImpl.setNew(noiBanHanh.isNew());
		noiBanHanhImpl.setPrimaryKey(noiBanHanh.getPrimaryKey());

		noiBanHanhImpl.setNoiBHId(noiBanHanh.getNoiBHId());
		noiBanHanhImpl.setTennoibanhanh(noiBanHanh.getTennoibanhanh());
		noiBanHanhImpl.setGhichu(noiBanHanh.getGhichu());
		noiBanHanhImpl.setTinhtrang(noiBanHanh.isTinhtrang());

		return noiBanHanhImpl;
	}

	/**
	 * Returns the noi ban hanh with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the noi ban hanh
	 * @return the noi ban hanh
	 * @throws com.vanban.NoSuchnoiBanHanhException if a noi ban hanh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public noiBanHanh findByPrimaryKey(Serializable primaryKey)
		throws NoSuchnoiBanHanhException, SystemException {
		noiBanHanh noiBanHanh = fetchByPrimaryKey(primaryKey);

		if (noiBanHanh == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchnoiBanHanhException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return noiBanHanh;
	}

	/**
	 * Returns the noi ban hanh with the primary key or throws a {@link com.vanban.NoSuchnoiBanHanhException} if it could not be found.
	 *
	 * @param noiBHId the primary key of the noi ban hanh
	 * @return the noi ban hanh
	 * @throws com.vanban.NoSuchnoiBanHanhException if a noi ban hanh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public noiBanHanh findByPrimaryKey(long noiBHId)
		throws NoSuchnoiBanHanhException, SystemException {
		return findByPrimaryKey((Serializable)noiBHId);
	}

	/**
	 * Returns the noi ban hanh with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the noi ban hanh
	 * @return the noi ban hanh, or <code>null</code> if a noi ban hanh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public noiBanHanh fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		noiBanHanh noiBanHanh = (noiBanHanh)EntityCacheUtil.getResult(noiBanHanhModelImpl.ENTITY_CACHE_ENABLED,
				noiBanHanhImpl.class, primaryKey);

		if (noiBanHanh == _nullnoiBanHanh) {
			return null;
		}

		if (noiBanHanh == null) {
			Session session = null;

			try {
				session = openSession();

				noiBanHanh = (noiBanHanh)session.get(noiBanHanhImpl.class,
						primaryKey);

				if (noiBanHanh != null) {
					cacheResult(noiBanHanh);
				}
				else {
					EntityCacheUtil.putResult(noiBanHanhModelImpl.ENTITY_CACHE_ENABLED,
						noiBanHanhImpl.class, primaryKey, _nullnoiBanHanh);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(noiBanHanhModelImpl.ENTITY_CACHE_ENABLED,
					noiBanHanhImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return noiBanHanh;
	}

	/**
	 * Returns the noi ban hanh with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param noiBHId the primary key of the noi ban hanh
	 * @return the noi ban hanh, or <code>null</code> if a noi ban hanh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public noiBanHanh fetchByPrimaryKey(long noiBHId) throws SystemException {
		return fetchByPrimaryKey((Serializable)noiBHId);
	}

	/**
	 * Returns all the noi ban hanhs.
	 *
	 * @return the noi ban hanhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<noiBanHanh> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<noiBanHanh> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

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
	@Override
	public List<noiBanHanh> findAll(int start, int end,
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

		List<noiBanHanh> list = (List<noiBanHanh>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_NOIBANHANH);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_NOIBANHANH;

				if (pagination) {
					sql = sql.concat(noiBanHanhModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<noiBanHanh>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<noiBanHanh>(list);
				}
				else {
					list = (List<noiBanHanh>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes all the noi ban hanhs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (noiBanHanh noiBanHanh : findAll()) {
			remove(noiBanHanh);
		}
	}

	/**
	 * Returns the number of noi ban hanhs.
	 *
	 * @return the number of noi ban hanhs
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

				Query q = session.createQuery(_SQL_COUNT_NOIBANHANH);

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
	 * Initializes the noi ban hanh persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vanban.model.noiBanHanh")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<noiBanHanh>> listenersList = new ArrayList<ModelListener<noiBanHanh>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<noiBanHanh>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(noiBanHanhImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_NOIBANHANH = "SELECT noiBanHanh FROM noiBanHanh noiBanHanh";
	private static final String _SQL_COUNT_NOIBANHANH = "SELECT COUNT(noiBanHanh) FROM noiBanHanh noiBanHanh";
	private static final String _ORDER_BY_ENTITY_ALIAS = "noiBanHanh.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No noiBanHanh exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(noiBanHanhPersistenceImpl.class);
	private static noiBanHanh _nullnoiBanHanh = new noiBanHanhImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<noiBanHanh> toCacheModel() {
				return _nullnoiBanHanhCacheModel;
			}
		};

	private static CacheModel<noiBanHanh> _nullnoiBanHanhCacheModel = new CacheModel<noiBanHanh>() {
			@Override
			public noiBanHanh toEntityModel() {
				return _nullnoiBanHanh;
			}
		};
}