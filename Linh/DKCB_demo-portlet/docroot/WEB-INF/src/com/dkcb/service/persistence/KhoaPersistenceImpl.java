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

import com.dkcb.NoSuchKhoaException;

import com.dkcb.model.Khoa;
import com.dkcb.model.impl.KhoaImpl;
import com.dkcb.model.impl.KhoaModelImpl;

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
 * The persistence implementation for the khoa service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author hoang_000
 * @see KhoaPersistence
 * @see KhoaUtil
 * @generated
 */
public class KhoaPersistenceImpl extends BasePersistenceImpl<Khoa>
	implements KhoaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link KhoaUtil} to access the khoa persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = KhoaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(KhoaModelImpl.ENTITY_CACHE_ENABLED,
			KhoaModelImpl.FINDER_CACHE_ENABLED, KhoaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(KhoaModelImpl.ENTITY_CACHE_ENABLED,
			KhoaModelImpl.FINDER_CACHE_ENABLED, KhoaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(KhoaModelImpl.ENTITY_CACHE_ENABLED,
			KhoaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public KhoaPersistenceImpl() {
		setModelClass(Khoa.class);
	}

	/**
	 * Caches the khoa in the entity cache if it is enabled.
	 *
	 * @param khoa the khoa
	 */
	@Override
	public void cacheResult(Khoa khoa) {
		EntityCacheUtil.putResult(KhoaModelImpl.ENTITY_CACHE_ENABLED,
			KhoaImpl.class, khoa.getPrimaryKey(), khoa);

		khoa.resetOriginalValues();
	}

	/**
	 * Caches the khoas in the entity cache if it is enabled.
	 *
	 * @param khoas the khoas
	 */
	@Override
	public void cacheResult(List<Khoa> khoas) {
		for (Khoa khoa : khoas) {
			if (EntityCacheUtil.getResult(KhoaModelImpl.ENTITY_CACHE_ENABLED,
						KhoaImpl.class, khoa.getPrimaryKey()) == null) {
				cacheResult(khoa);
			}
			else {
				khoa.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all khoas.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(KhoaImpl.class.getName());
		}

		EntityCacheUtil.clearCache(KhoaImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the khoa.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Khoa khoa) {
		EntityCacheUtil.removeResult(KhoaModelImpl.ENTITY_CACHE_ENABLED,
			KhoaImpl.class, khoa.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Khoa> khoas) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Khoa khoa : khoas) {
			EntityCacheUtil.removeResult(KhoaModelImpl.ENTITY_CACHE_ENABLED,
				KhoaImpl.class, khoa.getPrimaryKey());
		}
	}

	/**
	 * Creates a new khoa with the primary key. Does not add the khoa to the database.
	 *
	 * @param Idphongkham the primary key for the new khoa
	 * @return the new khoa
	 */
	@Override
	public Khoa create(String Idphongkham) {
		Khoa khoa = new KhoaImpl();

		khoa.setNew(true);
		khoa.setPrimaryKey(Idphongkham);

		return khoa;
	}

	/**
	 * Removes the khoa with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Idphongkham the primary key of the khoa
	 * @return the khoa that was removed
	 * @throws com.dkcb.NoSuchKhoaException if a khoa with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Khoa remove(String Idphongkham)
		throws NoSuchKhoaException, SystemException {
		return remove((Serializable)Idphongkham);
	}

	/**
	 * Removes the khoa with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the khoa
	 * @return the khoa that was removed
	 * @throws com.dkcb.NoSuchKhoaException if a khoa with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Khoa remove(Serializable primaryKey)
		throws NoSuchKhoaException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Khoa khoa = (Khoa)session.get(KhoaImpl.class, primaryKey);

			if (khoa == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchKhoaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(khoa);
		}
		catch (NoSuchKhoaException nsee) {
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
	protected Khoa removeImpl(Khoa khoa) throws SystemException {
		khoa = toUnwrappedModel(khoa);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(khoa)) {
				khoa = (Khoa)session.get(KhoaImpl.class, khoa.getPrimaryKeyObj());
			}

			if (khoa != null) {
				session.delete(khoa);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (khoa != null) {
			clearCache(khoa);
		}

		return khoa;
	}

	@Override
	public Khoa updateImpl(com.dkcb.model.Khoa khoa) throws SystemException {
		khoa = toUnwrappedModel(khoa);

		boolean isNew = khoa.isNew();

		Session session = null;

		try {
			session = openSession();

			if (khoa.isNew()) {
				session.save(khoa);

				khoa.setNew(false);
			}
			else {
				session.merge(khoa);
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

		EntityCacheUtil.putResult(KhoaModelImpl.ENTITY_CACHE_ENABLED,
			KhoaImpl.class, khoa.getPrimaryKey(), khoa);

		return khoa;
	}

	protected Khoa toUnwrappedModel(Khoa khoa) {
		if (khoa instanceof KhoaImpl) {
			return khoa;
		}

		KhoaImpl khoaImpl = new KhoaImpl();

		khoaImpl.setNew(khoa.isNew());
		khoaImpl.setPrimaryKey(khoa.getPrimaryKey());

		khoaImpl.setIdphongkham(khoa.getIdphongkham());
		khoaImpl.setTenPK(khoa.getTenPK());

		return khoaImpl;
	}

	/**
	 * Returns the khoa with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the khoa
	 * @return the khoa
	 * @throws com.dkcb.NoSuchKhoaException if a khoa with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Khoa findByPrimaryKey(Serializable primaryKey)
		throws NoSuchKhoaException, SystemException {
		Khoa khoa = fetchByPrimaryKey(primaryKey);

		if (khoa == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchKhoaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return khoa;
	}

	/**
	 * Returns the khoa with the primary key or throws a {@link com.dkcb.NoSuchKhoaException} if it could not be found.
	 *
	 * @param Idphongkham the primary key of the khoa
	 * @return the khoa
	 * @throws com.dkcb.NoSuchKhoaException if a khoa with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Khoa findByPrimaryKey(String Idphongkham)
		throws NoSuchKhoaException, SystemException {
		return findByPrimaryKey((Serializable)Idphongkham);
	}

	/**
	 * Returns the khoa with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the khoa
	 * @return the khoa, or <code>null</code> if a khoa with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Khoa fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Khoa khoa = (Khoa)EntityCacheUtil.getResult(KhoaModelImpl.ENTITY_CACHE_ENABLED,
				KhoaImpl.class, primaryKey);

		if (khoa == _nullKhoa) {
			return null;
		}

		if (khoa == null) {
			Session session = null;

			try {
				session = openSession();

				khoa = (Khoa)session.get(KhoaImpl.class, primaryKey);

				if (khoa != null) {
					cacheResult(khoa);
				}
				else {
					EntityCacheUtil.putResult(KhoaModelImpl.ENTITY_CACHE_ENABLED,
						KhoaImpl.class, primaryKey, _nullKhoa);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(KhoaModelImpl.ENTITY_CACHE_ENABLED,
					KhoaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return khoa;
	}

	/**
	 * Returns the khoa with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Idphongkham the primary key of the khoa
	 * @return the khoa, or <code>null</code> if a khoa with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Khoa fetchByPrimaryKey(String Idphongkham) throws SystemException {
		return fetchByPrimaryKey((Serializable)Idphongkham);
	}

	/**
	 * Returns all the khoas.
	 *
	 * @return the khoas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Khoa> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the khoas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dkcb.model.impl.KhoaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of khoas
	 * @param end the upper bound of the range of khoas (not inclusive)
	 * @return the range of khoas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Khoa> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the khoas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dkcb.model.impl.KhoaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of khoas
	 * @param end the upper bound of the range of khoas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of khoas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Khoa> findAll(int start, int end,
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

		List<Khoa> list = (List<Khoa>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_KHOA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_KHOA;

				if (pagination) {
					sql = sql.concat(KhoaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Khoa>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Khoa>(list);
				}
				else {
					list = (List<Khoa>)QueryUtil.list(q, getDialect(), start,
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
	 * Removes all the khoas from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Khoa khoa : findAll()) {
			remove(khoa);
		}
	}

	/**
	 * Returns the number of khoas.
	 *
	 * @return the number of khoas
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

				Query q = session.createQuery(_SQL_COUNT_KHOA);

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
	 * Initializes the khoa persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.dkcb.model.Khoa")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Khoa>> listenersList = new ArrayList<ModelListener<Khoa>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Khoa>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(KhoaImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_KHOA = "SELECT khoa FROM Khoa khoa";
	private static final String _SQL_COUNT_KHOA = "SELECT COUNT(khoa) FROM Khoa khoa";
	private static final String _ORDER_BY_ENTITY_ALIAS = "khoa.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Khoa exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(KhoaPersistenceImpl.class);
	private static Khoa _nullKhoa = new KhoaImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Khoa> toCacheModel() {
				return _nullKhoaCacheModel;
			}
		};

	private static CacheModel<Khoa> _nullKhoaCacheModel = new CacheModel<Khoa>() {
			@Override
			public Khoa toEntityModel() {
				return _nullKhoa;
			}
		};
}