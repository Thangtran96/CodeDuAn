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

import com.vanban.NoSuchnguoikiException;

import com.vanban.model.impl.nguoikiImpl;
import com.vanban.model.impl.nguoikiModelImpl;
import com.vanban.model.nguoiki;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the nguoiki service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author nguye
 * @see nguoikiPersistence
 * @see nguoikiUtil
 * @generated
 */
public class nguoikiPersistenceImpl extends BasePersistenceImpl<nguoiki>
	implements nguoikiPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link nguoikiUtil} to access the nguoiki persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = nguoikiImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(nguoikiModelImpl.ENTITY_CACHE_ENABLED,
			nguoikiModelImpl.FINDER_CACHE_ENABLED, nguoikiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(nguoikiModelImpl.ENTITY_CACHE_ENABLED,
			nguoikiModelImpl.FINDER_CACHE_ENABLED, nguoikiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(nguoikiModelImpl.ENTITY_CACHE_ENABLED,
			nguoikiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public nguoikiPersistenceImpl() {
		setModelClass(nguoiki.class);
	}

	/**
	 * Caches the nguoiki in the entity cache if it is enabled.
	 *
	 * @param nguoiki the nguoiki
	 */
	@Override
	public void cacheResult(nguoiki nguoiki) {
		EntityCacheUtil.putResult(nguoikiModelImpl.ENTITY_CACHE_ENABLED,
			nguoikiImpl.class, nguoiki.getPrimaryKey(), nguoiki);

		nguoiki.resetOriginalValues();
	}

	/**
	 * Caches the nguoikis in the entity cache if it is enabled.
	 *
	 * @param nguoikis the nguoikis
	 */
	@Override
	public void cacheResult(List<nguoiki> nguoikis) {
		for (nguoiki nguoiki : nguoikis) {
			if (EntityCacheUtil.getResult(
						nguoikiModelImpl.ENTITY_CACHE_ENABLED,
						nguoikiImpl.class, nguoiki.getPrimaryKey()) == null) {
				cacheResult(nguoiki);
			}
			else {
				nguoiki.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all nguoikis.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(nguoikiImpl.class.getName());
		}

		EntityCacheUtil.clearCache(nguoikiImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the nguoiki.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(nguoiki nguoiki) {
		EntityCacheUtil.removeResult(nguoikiModelImpl.ENTITY_CACHE_ENABLED,
			nguoikiImpl.class, nguoiki.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<nguoiki> nguoikis) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (nguoiki nguoiki : nguoikis) {
			EntityCacheUtil.removeResult(nguoikiModelImpl.ENTITY_CACHE_ENABLED,
				nguoikiImpl.class, nguoiki.getPrimaryKey());
		}
	}

	/**
	 * Creates a new nguoiki with the primary key. Does not add the nguoiki to the database.
	 *
	 * @param nguoikiID the primary key for the new nguoiki
	 * @return the new nguoiki
	 */
	@Override
	public nguoiki create(long nguoikiID) {
		nguoiki nguoiki = new nguoikiImpl();

		nguoiki.setNew(true);
		nguoiki.setPrimaryKey(nguoikiID);

		return nguoiki;
	}

	/**
	 * Removes the nguoiki with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param nguoikiID the primary key of the nguoiki
	 * @return the nguoiki that was removed
	 * @throws com.vanban.NoSuchnguoikiException if a nguoiki with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public nguoiki remove(long nguoikiID)
		throws NoSuchnguoikiException, SystemException {
		return remove((Serializable)nguoikiID);
	}

	/**
	 * Removes the nguoiki with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the nguoiki
	 * @return the nguoiki that was removed
	 * @throws com.vanban.NoSuchnguoikiException if a nguoiki with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public nguoiki remove(Serializable primaryKey)
		throws NoSuchnguoikiException, SystemException {
		Session session = null;

		try {
			session = openSession();

			nguoiki nguoiki = (nguoiki)session.get(nguoikiImpl.class, primaryKey);

			if (nguoiki == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchnguoikiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(nguoiki);
		}
		catch (NoSuchnguoikiException nsee) {
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
	protected nguoiki removeImpl(nguoiki nguoiki) throws SystemException {
		nguoiki = toUnwrappedModel(nguoiki);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(nguoiki)) {
				nguoiki = (nguoiki)session.get(nguoikiImpl.class,
						nguoiki.getPrimaryKeyObj());
			}

			if (nguoiki != null) {
				session.delete(nguoiki);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (nguoiki != null) {
			clearCache(nguoiki);
		}

		return nguoiki;
	}

	@Override
	public nguoiki updateImpl(com.vanban.model.nguoiki nguoiki)
		throws SystemException {
		nguoiki = toUnwrappedModel(nguoiki);

		boolean isNew = nguoiki.isNew();

		Session session = null;

		try {
			session = openSession();

			if (nguoiki.isNew()) {
				session.save(nguoiki);

				nguoiki.setNew(false);
			}
			else {
				session.merge(nguoiki);
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

		EntityCacheUtil.putResult(nguoikiModelImpl.ENTITY_CACHE_ENABLED,
			nguoikiImpl.class, nguoiki.getPrimaryKey(), nguoiki);

		return nguoiki;
	}

	protected nguoiki toUnwrappedModel(nguoiki nguoiki) {
		if (nguoiki instanceof nguoikiImpl) {
			return nguoiki;
		}

		nguoikiImpl nguoikiImpl = new nguoikiImpl();

		nguoikiImpl.setNew(nguoiki.isNew());
		nguoikiImpl.setPrimaryKey(nguoiki.getPrimaryKey());

		nguoikiImpl.setNguoikiID(nguoiki.getNguoikiID());
		nguoikiImpl.setHoten(nguoiki.getHoten());
		nguoikiImpl.setNgaysinh(nguoiki.getNgaysinh());
		nguoikiImpl.setGioitinh(nguoiki.getGioitinh());
		nguoikiImpl.setDonvi(nguoiki.getDonvi());
		nguoikiImpl.setChucvu(nguoiki.getChucvu());
		nguoikiImpl.setTinhtrang(nguoiki.isTinhtrang());

		return nguoikiImpl;
	}

	/**
	 * Returns the nguoiki with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the nguoiki
	 * @return the nguoiki
	 * @throws com.vanban.NoSuchnguoikiException if a nguoiki with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public nguoiki findByPrimaryKey(Serializable primaryKey)
		throws NoSuchnguoikiException, SystemException {
		nguoiki nguoiki = fetchByPrimaryKey(primaryKey);

		if (nguoiki == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchnguoikiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return nguoiki;
	}

	/**
	 * Returns the nguoiki with the primary key or throws a {@link com.vanban.NoSuchnguoikiException} if it could not be found.
	 *
	 * @param nguoikiID the primary key of the nguoiki
	 * @return the nguoiki
	 * @throws com.vanban.NoSuchnguoikiException if a nguoiki with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public nguoiki findByPrimaryKey(long nguoikiID)
		throws NoSuchnguoikiException, SystemException {
		return findByPrimaryKey((Serializable)nguoikiID);
	}

	/**
	 * Returns the nguoiki with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the nguoiki
	 * @return the nguoiki, or <code>null</code> if a nguoiki with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public nguoiki fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		nguoiki nguoiki = (nguoiki)EntityCacheUtil.getResult(nguoikiModelImpl.ENTITY_CACHE_ENABLED,
				nguoikiImpl.class, primaryKey);

		if (nguoiki == _nullnguoiki) {
			return null;
		}

		if (nguoiki == null) {
			Session session = null;

			try {
				session = openSession();

				nguoiki = (nguoiki)session.get(nguoikiImpl.class, primaryKey);

				if (nguoiki != null) {
					cacheResult(nguoiki);
				}
				else {
					EntityCacheUtil.putResult(nguoikiModelImpl.ENTITY_CACHE_ENABLED,
						nguoikiImpl.class, primaryKey, _nullnguoiki);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(nguoikiModelImpl.ENTITY_CACHE_ENABLED,
					nguoikiImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return nguoiki;
	}

	/**
	 * Returns the nguoiki with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param nguoikiID the primary key of the nguoiki
	 * @return the nguoiki, or <code>null</code> if a nguoiki with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public nguoiki fetchByPrimaryKey(long nguoikiID) throws SystemException {
		return fetchByPrimaryKey((Serializable)nguoikiID);
	}

	/**
	 * Returns all the nguoikis.
	 *
	 * @return the nguoikis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<nguoiki> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the nguoikis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vanban.model.impl.nguoikiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of nguoikis
	 * @param end the upper bound of the range of nguoikis (not inclusive)
	 * @return the range of nguoikis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<nguoiki> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the nguoikis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vanban.model.impl.nguoikiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of nguoikis
	 * @param end the upper bound of the range of nguoikis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of nguoikis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<nguoiki> findAll(int start, int end,
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

		List<nguoiki> list = (List<nguoiki>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_NGUOIKI);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_NGUOIKI;

				if (pagination) {
					sql = sql.concat(nguoikiModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<nguoiki>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<nguoiki>(list);
				}
				else {
					list = (List<nguoiki>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the nguoikis from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (nguoiki nguoiki : findAll()) {
			remove(nguoiki);
		}
	}

	/**
	 * Returns the number of nguoikis.
	 *
	 * @return the number of nguoikis
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

				Query q = session.createQuery(_SQL_COUNT_NGUOIKI);

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
	 * Initializes the nguoiki persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vanban.model.nguoiki")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<nguoiki>> listenersList = new ArrayList<ModelListener<nguoiki>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<nguoiki>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(nguoikiImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_NGUOIKI = "SELECT nguoiki FROM nguoiki nguoiki";
	private static final String _SQL_COUNT_NGUOIKI = "SELECT COUNT(nguoiki) FROM nguoiki nguoiki";
	private static final String _ORDER_BY_ENTITY_ALIAS = "nguoiki.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No nguoiki exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(nguoikiPersistenceImpl.class);
	private static nguoiki _nullnguoiki = new nguoikiImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<nguoiki> toCacheModel() {
				return _nullnguoikiCacheModel;
			}
		};

	private static CacheModel<nguoiki> _nullnguoikiCacheModel = new CacheModel<nguoiki>() {
			@Override
			public nguoiki toEntityModel() {
				return _nullnguoiki;
			}
		};
}