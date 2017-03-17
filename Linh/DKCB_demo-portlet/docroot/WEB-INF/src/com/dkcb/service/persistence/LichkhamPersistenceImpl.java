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

import com.dkcb.NoSuchLichkhamException;

import com.dkcb.model.Lichkham;
import com.dkcb.model.impl.LichkhamImpl;
import com.dkcb.model.impl.LichkhamModelImpl;

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
 * The persistence implementation for the lichkham service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author hoang_000
 * @see LichkhamPersistence
 * @see LichkhamUtil
 * @generated
 */
public class LichkhamPersistenceImpl extends BasePersistenceImpl<Lichkham>
	implements LichkhamPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link LichkhamUtil} to access the lichkham persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = LichkhamImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LichkhamModelImpl.ENTITY_CACHE_ENABLED,
			LichkhamModelImpl.FINDER_CACHE_ENABLED, LichkhamImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LichkhamModelImpl.ENTITY_CACHE_ENABLED,
			LichkhamModelImpl.FINDER_CACHE_ENABLED, LichkhamImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LichkhamModelImpl.ENTITY_CACHE_ENABLED,
			LichkhamModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public LichkhamPersistenceImpl() {
		setModelClass(Lichkham.class);
	}

	/**
	 * Caches the lichkham in the entity cache if it is enabled.
	 *
	 * @param lichkham the lichkham
	 */
	@Override
	public void cacheResult(Lichkham lichkham) {
		EntityCacheUtil.putResult(LichkhamModelImpl.ENTITY_CACHE_ENABLED,
			LichkhamImpl.class, lichkham.getPrimaryKey(), lichkham);

		lichkham.resetOriginalValues();
	}

	/**
	 * Caches the lichkhams in the entity cache if it is enabled.
	 *
	 * @param lichkhams the lichkhams
	 */
	@Override
	public void cacheResult(List<Lichkham> lichkhams) {
		for (Lichkham lichkham : lichkhams) {
			if (EntityCacheUtil.getResult(
						LichkhamModelImpl.ENTITY_CACHE_ENABLED,
						LichkhamImpl.class, lichkham.getPrimaryKey()) == null) {
				cacheResult(lichkham);
			}
			else {
				lichkham.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all lichkhams.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(LichkhamImpl.class.getName());
		}

		EntityCacheUtil.clearCache(LichkhamImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the lichkham.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Lichkham lichkham) {
		EntityCacheUtil.removeResult(LichkhamModelImpl.ENTITY_CACHE_ENABLED,
			LichkhamImpl.class, lichkham.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Lichkham> lichkhams) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Lichkham lichkham : lichkhams) {
			EntityCacheUtil.removeResult(LichkhamModelImpl.ENTITY_CACHE_ENABLED,
				LichkhamImpl.class, lichkham.getPrimaryKey());
		}
	}

	/**
	 * Creates a new lichkham with the primary key. Does not add the lichkham to the database.
	 *
	 * @param Idlichkham the primary key for the new lichkham
	 * @return the new lichkham
	 */
	@Override
	public Lichkham create(int Idlichkham) {
		Lichkham lichkham = new LichkhamImpl();

		lichkham.setNew(true);
		lichkham.setPrimaryKey(Idlichkham);

		return lichkham;
	}

	/**
	 * Removes the lichkham with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Idlichkham the primary key of the lichkham
	 * @return the lichkham that was removed
	 * @throws com.dkcb.NoSuchLichkhamException if a lichkham with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lichkham remove(int Idlichkham)
		throws NoSuchLichkhamException, SystemException {
		return remove((Serializable)Idlichkham);
	}

	/**
	 * Removes the lichkham with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the lichkham
	 * @return the lichkham that was removed
	 * @throws com.dkcb.NoSuchLichkhamException if a lichkham with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lichkham remove(Serializable primaryKey)
		throws NoSuchLichkhamException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Lichkham lichkham = (Lichkham)session.get(LichkhamImpl.class,
					primaryKey);

			if (lichkham == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLichkhamException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(lichkham);
		}
		catch (NoSuchLichkhamException nsee) {
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
	protected Lichkham removeImpl(Lichkham lichkham) throws SystemException {
		lichkham = toUnwrappedModel(lichkham);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(lichkham)) {
				lichkham = (Lichkham)session.get(LichkhamImpl.class,
						lichkham.getPrimaryKeyObj());
			}

			if (lichkham != null) {
				session.delete(lichkham);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (lichkham != null) {
			clearCache(lichkham);
		}

		return lichkham;
	}

	@Override
	public Lichkham updateImpl(com.dkcb.model.Lichkham lichkham)
		throws SystemException {
		lichkham = toUnwrappedModel(lichkham);

		boolean isNew = lichkham.isNew();

		Session session = null;

		try {
			session = openSession();

			if (lichkham.isNew()) {
				session.save(lichkham);

				lichkham.setNew(false);
			}
			else {
				session.merge(lichkham);
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

		EntityCacheUtil.putResult(LichkhamModelImpl.ENTITY_CACHE_ENABLED,
			LichkhamImpl.class, lichkham.getPrimaryKey(), lichkham);

		return lichkham;
	}

	protected Lichkham toUnwrappedModel(Lichkham lichkham) {
		if (lichkham instanceof LichkhamImpl) {
			return lichkham;
		}

		LichkhamImpl lichkhamImpl = new LichkhamImpl();

		lichkhamImpl.setNew(lichkham.isNew());
		lichkhamImpl.setPrimaryKey(lichkham.getPrimaryKey());

		lichkhamImpl.setIdbacsi(lichkham.getIdbacsi());
		lichkhamImpl.setId(lichkham.getId());
		lichkhamImpl.setIdphongkham(lichkham.getIdphongkham());
		lichkhamImpl.setIddichvu(lichkham.getIddichvu());
		lichkhamImpl.setGiodukien(lichkham.getGiodukien());
		lichkhamImpl.setNgaykham(lichkham.getNgaykham());
		lichkhamImpl.setIdlichkham(lichkham.getIdlichkham());

		return lichkhamImpl;
	}

	/**
	 * Returns the lichkham with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the lichkham
	 * @return the lichkham
	 * @throws com.dkcb.NoSuchLichkhamException if a lichkham with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lichkham findByPrimaryKey(Serializable primaryKey)
		throws NoSuchLichkhamException, SystemException {
		Lichkham lichkham = fetchByPrimaryKey(primaryKey);

		if (lichkham == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchLichkhamException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return lichkham;
	}

	/**
	 * Returns the lichkham with the primary key or throws a {@link com.dkcb.NoSuchLichkhamException} if it could not be found.
	 *
	 * @param Idlichkham the primary key of the lichkham
	 * @return the lichkham
	 * @throws com.dkcb.NoSuchLichkhamException if a lichkham with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lichkham findByPrimaryKey(int Idlichkham)
		throws NoSuchLichkhamException, SystemException {
		return findByPrimaryKey((Serializable)Idlichkham);
	}

	/**
	 * Returns the lichkham with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the lichkham
	 * @return the lichkham, or <code>null</code> if a lichkham with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lichkham fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Lichkham lichkham = (Lichkham)EntityCacheUtil.getResult(LichkhamModelImpl.ENTITY_CACHE_ENABLED,
				LichkhamImpl.class, primaryKey);

		if (lichkham == _nullLichkham) {
			return null;
		}

		if (lichkham == null) {
			Session session = null;

			try {
				session = openSession();

				lichkham = (Lichkham)session.get(LichkhamImpl.class, primaryKey);

				if (lichkham != null) {
					cacheResult(lichkham);
				}
				else {
					EntityCacheUtil.putResult(LichkhamModelImpl.ENTITY_CACHE_ENABLED,
						LichkhamImpl.class, primaryKey, _nullLichkham);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(LichkhamModelImpl.ENTITY_CACHE_ENABLED,
					LichkhamImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return lichkham;
	}

	/**
	 * Returns the lichkham with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Idlichkham the primary key of the lichkham
	 * @return the lichkham, or <code>null</code> if a lichkham with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Lichkham fetchByPrimaryKey(int Idlichkham) throws SystemException {
		return fetchByPrimaryKey((Serializable)Idlichkham);
	}

	/**
	 * Returns all the lichkhams.
	 *
	 * @return the lichkhams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lichkham> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the lichkhams.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dkcb.model.impl.LichkhamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of lichkhams
	 * @param end the upper bound of the range of lichkhams (not inclusive)
	 * @return the range of lichkhams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lichkham> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the lichkhams.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dkcb.model.impl.LichkhamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of lichkhams
	 * @param end the upper bound of the range of lichkhams (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of lichkhams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Lichkham> findAll(int start, int end,
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

		List<Lichkham> list = (List<Lichkham>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_LICHKHAM);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LICHKHAM;

				if (pagination) {
					sql = sql.concat(LichkhamModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Lichkham>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Lichkham>(list);
				}
				else {
					list = (List<Lichkham>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the lichkhams from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Lichkham lichkham : findAll()) {
			remove(lichkham);
		}
	}

	/**
	 * Returns the number of lichkhams.
	 *
	 * @return the number of lichkhams
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

				Query q = session.createQuery(_SQL_COUNT_LICHKHAM);

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
	 * Initializes the lichkham persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.dkcb.model.Lichkham")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Lichkham>> listenersList = new ArrayList<ModelListener<Lichkham>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Lichkham>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(LichkhamImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_LICHKHAM = "SELECT lichkham FROM Lichkham lichkham";
	private static final String _SQL_COUNT_LICHKHAM = "SELECT COUNT(lichkham) FROM Lichkham lichkham";
	private static final String _ORDER_BY_ENTITY_ALIAS = "lichkham.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Lichkham exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(LichkhamPersistenceImpl.class);
	private static Lichkham _nullLichkham = new LichkhamImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Lichkham> toCacheModel() {
				return _nullLichkhamCacheModel;
			}
		};

	private static CacheModel<Lichkham> _nullLichkhamCacheModel = new CacheModel<Lichkham>() {
			@Override
			public Lichkham toEntityModel() {
				return _nullLichkham;
			}
		};
}