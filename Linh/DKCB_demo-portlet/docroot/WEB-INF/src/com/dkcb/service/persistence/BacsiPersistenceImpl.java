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

import com.dkcb.NoSuchBacsiException;

import com.dkcb.model.Bacsi;
import com.dkcb.model.impl.BacsiImpl;
import com.dkcb.model.impl.BacsiModelImpl;

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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the bacsi service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author hoang_000
 * @see BacsiPersistence
 * @see BacsiUtil
 * @generated
 */
public class BacsiPersistenceImpl extends BasePersistenceImpl<Bacsi>
	implements BacsiPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link BacsiUtil} to access the bacsi persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = BacsiImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(BacsiModelImpl.ENTITY_CACHE_ENABLED,
			BacsiModelImpl.FINDER_CACHE_ENABLED, BacsiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(BacsiModelImpl.ENTITY_CACHE_ENABLED,
			BacsiModelImpl.FINDER_CACHE_ENABLED, BacsiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(BacsiModelImpl.ENTITY_CACHE_ENABLED,
			BacsiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public BacsiPersistenceImpl() {
		setModelClass(Bacsi.class);
	}

	/**
	 * Caches the bacsi in the entity cache if it is enabled.
	 *
	 * @param bacsi the bacsi
	 */
	@Override
	public void cacheResult(Bacsi bacsi) {
		EntityCacheUtil.putResult(BacsiModelImpl.ENTITY_CACHE_ENABLED,
			BacsiImpl.class, bacsi.getPrimaryKey(), bacsi);

		bacsi.resetOriginalValues();
	}

	/**
	 * Caches the bacsis in the entity cache if it is enabled.
	 *
	 * @param bacsis the bacsis
	 */
	@Override
	public void cacheResult(List<Bacsi> bacsis) {
		for (Bacsi bacsi : bacsis) {
			if (EntityCacheUtil.getResult(BacsiModelImpl.ENTITY_CACHE_ENABLED,
						BacsiImpl.class, bacsi.getPrimaryKey()) == null) {
				cacheResult(bacsi);
			}
			else {
				bacsi.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all bacsis.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(BacsiImpl.class.getName());
		}

		EntityCacheUtil.clearCache(BacsiImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the bacsi.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Bacsi bacsi) {
		EntityCacheUtil.removeResult(BacsiModelImpl.ENTITY_CACHE_ENABLED,
			BacsiImpl.class, bacsi.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Bacsi> bacsis) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Bacsi bacsi : bacsis) {
			EntityCacheUtil.removeResult(BacsiModelImpl.ENTITY_CACHE_ENABLED,
				BacsiImpl.class, bacsi.getPrimaryKey());
		}
	}

	/**
	 * Creates a new bacsi with the primary key. Does not add the bacsi to the database.
	 *
	 * @param Idbacsi the primary key for the new bacsi
	 * @return the new bacsi
	 */
	@Override
	public Bacsi create(String Idbacsi) {
		Bacsi bacsi = new BacsiImpl();

		bacsi.setNew(true);
		bacsi.setPrimaryKey(Idbacsi);

		return bacsi;
	}

	/**
	 * Removes the bacsi with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Idbacsi the primary key of the bacsi
	 * @return the bacsi that was removed
	 * @throws com.dkcb.NoSuchBacsiException if a bacsi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Bacsi remove(String Idbacsi)
		throws NoSuchBacsiException, SystemException {
		return remove((Serializable)Idbacsi);
	}

	/**
	 * Removes the bacsi with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the bacsi
	 * @return the bacsi that was removed
	 * @throws com.dkcb.NoSuchBacsiException if a bacsi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Bacsi remove(Serializable primaryKey)
		throws NoSuchBacsiException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Bacsi bacsi = (Bacsi)session.get(BacsiImpl.class, primaryKey);

			if (bacsi == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchBacsiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(bacsi);
		}
		catch (NoSuchBacsiException nsee) {
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
	protected Bacsi removeImpl(Bacsi bacsi) throws SystemException {
		bacsi = toUnwrappedModel(bacsi);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(bacsi)) {
				bacsi = (Bacsi)session.get(BacsiImpl.class,
						bacsi.getPrimaryKeyObj());
			}

			if (bacsi != null) {
				session.delete(bacsi);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (bacsi != null) {
			clearCache(bacsi);
		}

		return bacsi;
	}

	@Override
	public Bacsi updateImpl(com.dkcb.model.Bacsi bacsi)
		throws SystemException {
		bacsi = toUnwrappedModel(bacsi);

		boolean isNew = bacsi.isNew();

		Session session = null;

		try {
			session = openSession();

			if (bacsi.isNew()) {
				session.save(bacsi);

				bacsi.setNew(false);
			}
			else {
				session.merge(bacsi);
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

		EntityCacheUtil.putResult(BacsiModelImpl.ENTITY_CACHE_ENABLED,
			BacsiImpl.class, bacsi.getPrimaryKey(), bacsi);

		return bacsi;
	}

	protected Bacsi toUnwrappedModel(Bacsi bacsi) {
		if (bacsi instanceof BacsiImpl) {
			return bacsi;
		}

		BacsiImpl bacsiImpl = new BacsiImpl();

		bacsiImpl.setNew(bacsi.isNew());
		bacsiImpl.setPrimaryKey(bacsi.getPrimaryKey());

		bacsiImpl.setIdbacsi(bacsi.getIdbacsi());
		bacsiImpl.setTenBS(bacsi.getTenBS());
		bacsiImpl.setIdphongkham(bacsi.getIdphongkham());

		return bacsiImpl;
	}

	/**
	 * Returns the bacsi with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the bacsi
	 * @return the bacsi
	 * @throws com.dkcb.NoSuchBacsiException if a bacsi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Bacsi findByPrimaryKey(Serializable primaryKey)
		throws NoSuchBacsiException, SystemException {
		Bacsi bacsi = fetchByPrimaryKey(primaryKey);

		if (bacsi == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchBacsiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return bacsi;
	}

	/**
	 * Returns the bacsi with the primary key or throws a {@link com.dkcb.NoSuchBacsiException} if it could not be found.
	 *
	 * @param Idbacsi the primary key of the bacsi
	 * @return the bacsi
	 * @throws com.dkcb.NoSuchBacsiException if a bacsi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Bacsi findByPrimaryKey(String Idbacsi)
		throws NoSuchBacsiException, SystemException {
		return findByPrimaryKey((Serializable)Idbacsi);
	}

	/**
	 * Returns the bacsi with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the bacsi
	 * @return the bacsi, or <code>null</code> if a bacsi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Bacsi fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Bacsi bacsi = (Bacsi)EntityCacheUtil.getResult(BacsiModelImpl.ENTITY_CACHE_ENABLED,
				BacsiImpl.class, primaryKey);

		if (bacsi == _nullBacsi) {
			return null;
		}

		if (bacsi == null) {
			Session session = null;

			try {
				session = openSession();

				bacsi = (Bacsi)session.get(BacsiImpl.class, primaryKey);

				if (bacsi != null) {
					cacheResult(bacsi);
				}
				else {
					EntityCacheUtil.putResult(BacsiModelImpl.ENTITY_CACHE_ENABLED,
						BacsiImpl.class, primaryKey, _nullBacsi);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(BacsiModelImpl.ENTITY_CACHE_ENABLED,
					BacsiImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return bacsi;
	}

	/**
	 * Returns the bacsi with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Idbacsi the primary key of the bacsi
	 * @return the bacsi, or <code>null</code> if a bacsi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Bacsi fetchByPrimaryKey(String Idbacsi) throws SystemException {
		return fetchByPrimaryKey((Serializable)Idbacsi);
	}

	/**
	 * Returns all the bacsis.
	 *
	 * @return the bacsis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Bacsi> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the bacsis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dkcb.model.impl.BacsiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of bacsis
	 * @param end the upper bound of the range of bacsis (not inclusive)
	 * @return the range of bacsis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Bacsi> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the bacsis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dkcb.model.impl.BacsiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of bacsis
	 * @param end the upper bound of the range of bacsis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of bacsis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Bacsi> findAll(int start, int end,
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

		List<Bacsi> list = (List<Bacsi>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_BACSI);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BACSI;

				if (pagination) {
					sql = sql.concat(BacsiModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Bacsi>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Bacsi>(list);
				}
				else {
					list = (List<Bacsi>)QueryUtil.list(q, getDialect(), start,
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
	 * Removes all the bacsis from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Bacsi bacsi : findAll()) {
			remove(bacsi);
		}
	}

	/**
	 * Returns the number of bacsis.
	 *
	 * @return the number of bacsis
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

				Query q = session.createQuery(_SQL_COUNT_BACSI);

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
	 * Initializes the bacsi persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.dkcb.model.Bacsi")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Bacsi>> listenersList = new ArrayList<ModelListener<Bacsi>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Bacsi>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(BacsiImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_BACSI = "SELECT bacsi FROM Bacsi bacsi";
	private static final String _SQL_COUNT_BACSI = "SELECT COUNT(bacsi) FROM Bacsi bacsi";
	private static final String _ORDER_BY_ENTITY_ALIAS = "bacsi.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Bacsi exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(BacsiPersistenceImpl.class);
	private static Bacsi _nullBacsi = new BacsiImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Bacsi> toCacheModel() {
				return _nullBacsiCacheModel;
			}
		};

	private static CacheModel<Bacsi> _nullBacsiCacheModel = new CacheModel<Bacsi>() {
			@Override
			public Bacsi toEntityModel() {
				return _nullBacsi;
			}
		};
}