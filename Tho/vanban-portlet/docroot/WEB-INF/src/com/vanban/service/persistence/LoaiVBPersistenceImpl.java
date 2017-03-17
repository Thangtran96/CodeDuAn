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

import com.vanban.NoSuchLoaiVBException;

import com.vanban.model.LoaiVB;
import com.vanban.model.impl.LoaiVBImpl;
import com.vanban.model.impl.LoaiVBModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the loai v b service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author nguye
 * @see LoaiVBPersistence
 * @see LoaiVBUtil
 * @generated
 */
public class LoaiVBPersistenceImpl extends BasePersistenceImpl<LoaiVB>
	implements LoaiVBPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link LoaiVBUtil} to access the loai v b persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = LoaiVBImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LoaiVBModelImpl.ENTITY_CACHE_ENABLED,
			LoaiVBModelImpl.FINDER_CACHE_ENABLED, LoaiVBImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LoaiVBModelImpl.ENTITY_CACHE_ENABLED,
			LoaiVBModelImpl.FINDER_CACHE_ENABLED, LoaiVBImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LoaiVBModelImpl.ENTITY_CACHE_ENABLED,
			LoaiVBModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public LoaiVBPersistenceImpl() {
		setModelClass(LoaiVB.class);
	}

	/**
	 * Caches the loai v b in the entity cache if it is enabled.
	 *
	 * @param loaiVB the loai v b
	 */
	@Override
	public void cacheResult(LoaiVB loaiVB) {
		EntityCacheUtil.putResult(LoaiVBModelImpl.ENTITY_CACHE_ENABLED,
			LoaiVBImpl.class, loaiVB.getPrimaryKey(), loaiVB);

		loaiVB.resetOriginalValues();
	}

	/**
	 * Caches the loai v bs in the entity cache if it is enabled.
	 *
	 * @param loaiVBs the loai v bs
	 */
	@Override
	public void cacheResult(List<LoaiVB> loaiVBs) {
		for (LoaiVB loaiVB : loaiVBs) {
			if (EntityCacheUtil.getResult(
						LoaiVBModelImpl.ENTITY_CACHE_ENABLED, LoaiVBImpl.class,
						loaiVB.getPrimaryKey()) == null) {
				cacheResult(loaiVB);
			}
			else {
				loaiVB.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all loai v bs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(LoaiVBImpl.class.getName());
		}

		EntityCacheUtil.clearCache(LoaiVBImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the loai v b.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(LoaiVB loaiVB) {
		EntityCacheUtil.removeResult(LoaiVBModelImpl.ENTITY_CACHE_ENABLED,
			LoaiVBImpl.class, loaiVB.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<LoaiVB> loaiVBs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (LoaiVB loaiVB : loaiVBs) {
			EntityCacheUtil.removeResult(LoaiVBModelImpl.ENTITY_CACHE_ENABLED,
				LoaiVBImpl.class, loaiVB.getPrimaryKey());
		}
	}

	/**
	 * Creates a new loai v b with the primary key. Does not add the loai v b to the database.
	 *
	 * @param loaiId the primary key for the new loai v b
	 * @return the new loai v b
	 */
	@Override
	public LoaiVB create(long loaiId) {
		LoaiVB loaiVB = new LoaiVBImpl();

		loaiVB.setNew(true);
		loaiVB.setPrimaryKey(loaiId);

		return loaiVB;
	}

	/**
	 * Removes the loai v b with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param loaiId the primary key of the loai v b
	 * @return the loai v b that was removed
	 * @throws com.vanban.NoSuchLoaiVBException if a loai v b with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiVB remove(long loaiId)
		throws NoSuchLoaiVBException, SystemException {
		return remove((Serializable)loaiId);
	}

	/**
	 * Removes the loai v b with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the loai v b
	 * @return the loai v b that was removed
	 * @throws com.vanban.NoSuchLoaiVBException if a loai v b with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiVB remove(Serializable primaryKey)
		throws NoSuchLoaiVBException, SystemException {
		Session session = null;

		try {
			session = openSession();

			LoaiVB loaiVB = (LoaiVB)session.get(LoaiVBImpl.class, primaryKey);

			if (loaiVB == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLoaiVBException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(loaiVB);
		}
		catch (NoSuchLoaiVBException nsee) {
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
	protected LoaiVB removeImpl(LoaiVB loaiVB) throws SystemException {
		loaiVB = toUnwrappedModel(loaiVB);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(loaiVB)) {
				loaiVB = (LoaiVB)session.get(LoaiVBImpl.class,
						loaiVB.getPrimaryKeyObj());
			}

			if (loaiVB != null) {
				session.delete(loaiVB);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (loaiVB != null) {
			clearCache(loaiVB);
		}

		return loaiVB;
	}

	@Override
	public LoaiVB updateImpl(com.vanban.model.LoaiVB loaiVB)
		throws SystemException {
		loaiVB = toUnwrappedModel(loaiVB);

		boolean isNew = loaiVB.isNew();

		Session session = null;

		try {
			session = openSession();

			if (loaiVB.isNew()) {
				session.save(loaiVB);

				loaiVB.setNew(false);
			}
			else {
				session.merge(loaiVB);
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

		EntityCacheUtil.putResult(LoaiVBModelImpl.ENTITY_CACHE_ENABLED,
			LoaiVBImpl.class, loaiVB.getPrimaryKey(), loaiVB);

		return loaiVB;
	}

	protected LoaiVB toUnwrappedModel(LoaiVB loaiVB) {
		if (loaiVB instanceof LoaiVBImpl) {
			return loaiVB;
		}

		LoaiVBImpl loaiVBImpl = new LoaiVBImpl();

		loaiVBImpl.setNew(loaiVB.isNew());
		loaiVBImpl.setPrimaryKey(loaiVB.getPrimaryKey());

		loaiVBImpl.setLoaiId(loaiVB.getLoaiId());
		loaiVBImpl.setTenloai(loaiVB.getTenloai());
		loaiVBImpl.setGhichu(loaiVB.getGhichu());
		loaiVBImpl.setTinhtrang(loaiVB.isTinhtrang());

		return loaiVBImpl;
	}

	/**
	 * Returns the loai v b with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the loai v b
	 * @return the loai v b
	 * @throws com.vanban.NoSuchLoaiVBException if a loai v b with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiVB findByPrimaryKey(Serializable primaryKey)
		throws NoSuchLoaiVBException, SystemException {
		LoaiVB loaiVB = fetchByPrimaryKey(primaryKey);

		if (loaiVB == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchLoaiVBException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return loaiVB;
	}

	/**
	 * Returns the loai v b with the primary key or throws a {@link com.vanban.NoSuchLoaiVBException} if it could not be found.
	 *
	 * @param loaiId the primary key of the loai v b
	 * @return the loai v b
	 * @throws com.vanban.NoSuchLoaiVBException if a loai v b with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiVB findByPrimaryKey(long loaiId)
		throws NoSuchLoaiVBException, SystemException {
		return findByPrimaryKey((Serializable)loaiId);
	}

	/**
	 * Returns the loai v b with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the loai v b
	 * @return the loai v b, or <code>null</code> if a loai v b with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiVB fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		LoaiVB loaiVB = (LoaiVB)EntityCacheUtil.getResult(LoaiVBModelImpl.ENTITY_CACHE_ENABLED,
				LoaiVBImpl.class, primaryKey);

		if (loaiVB == _nullLoaiVB) {
			return null;
		}

		if (loaiVB == null) {
			Session session = null;

			try {
				session = openSession();

				loaiVB = (LoaiVB)session.get(LoaiVBImpl.class, primaryKey);

				if (loaiVB != null) {
					cacheResult(loaiVB);
				}
				else {
					EntityCacheUtil.putResult(LoaiVBModelImpl.ENTITY_CACHE_ENABLED,
						LoaiVBImpl.class, primaryKey, _nullLoaiVB);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(LoaiVBModelImpl.ENTITY_CACHE_ENABLED,
					LoaiVBImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return loaiVB;
	}

	/**
	 * Returns the loai v b with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param loaiId the primary key of the loai v b
	 * @return the loai v b, or <code>null</code> if a loai v b with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public LoaiVB fetchByPrimaryKey(long loaiId) throws SystemException {
		return fetchByPrimaryKey((Serializable)loaiId);
	}

	/**
	 * Returns all the loai v bs.
	 *
	 * @return the loai v bs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<LoaiVB> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<LoaiVB> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

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
	@Override
	public List<LoaiVB> findAll(int start, int end,
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

		List<LoaiVB> list = (List<LoaiVB>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_LOAIVB);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LOAIVB;

				if (pagination) {
					sql = sql.concat(LoaiVBModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<LoaiVB>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<LoaiVB>(list);
				}
				else {
					list = (List<LoaiVB>)QueryUtil.list(q, getDialect(), start,
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
	 * Removes all the loai v bs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (LoaiVB loaiVB : findAll()) {
			remove(loaiVB);
		}
	}

	/**
	 * Returns the number of loai v bs.
	 *
	 * @return the number of loai v bs
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

				Query q = session.createQuery(_SQL_COUNT_LOAIVB);

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
	 * Initializes the loai v b persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vanban.model.LoaiVB")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<LoaiVB>> listenersList = new ArrayList<ModelListener<LoaiVB>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<LoaiVB>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(LoaiVBImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_LOAIVB = "SELECT loaiVB FROM LoaiVB loaiVB";
	private static final String _SQL_COUNT_LOAIVB = "SELECT COUNT(loaiVB) FROM LoaiVB loaiVB";
	private static final String _ORDER_BY_ENTITY_ALIAS = "loaiVB.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No LoaiVB exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(LoaiVBPersistenceImpl.class);
	private static LoaiVB _nullLoaiVB = new LoaiVBImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<LoaiVB> toCacheModel() {
				return _nullLoaiVBCacheModel;
			}
		};

	private static CacheModel<LoaiVB> _nullLoaiVBCacheModel = new CacheModel<LoaiVB>() {
			@Override
			public LoaiVB toEntityModel() {
				return _nullLoaiVB;
			}
		};
}