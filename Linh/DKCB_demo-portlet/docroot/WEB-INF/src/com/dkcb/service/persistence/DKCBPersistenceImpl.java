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

import com.dkcb.NoSuchDKCBException;

import com.dkcb.model.DKCB;
import com.dkcb.model.impl.DKCBImpl;
import com.dkcb.model.impl.DKCBModelImpl;

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
 * The persistence implementation for the d k c b service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author hoang_000
 * @see DKCBPersistence
 * @see DKCBUtil
 * @generated
 */
public class DKCBPersistenceImpl extends BasePersistenceImpl<DKCB>
	implements DKCBPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DKCBUtil} to access the d k c b persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DKCBImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DKCBModelImpl.ENTITY_CACHE_ENABLED,
			DKCBModelImpl.FINDER_CACHE_ENABLED, DKCBImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DKCBModelImpl.ENTITY_CACHE_ENABLED,
			DKCBModelImpl.FINDER_CACHE_ENABLED, DKCBImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DKCBModelImpl.ENTITY_CACHE_ENABLED,
			DKCBModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public DKCBPersistenceImpl() {
		setModelClass(DKCB.class);
	}

	/**
	 * Caches the d k c b in the entity cache if it is enabled.
	 *
	 * @param dkcb the d k c b
	 */
	@Override
	public void cacheResult(DKCB dkcb) {
		EntityCacheUtil.putResult(DKCBModelImpl.ENTITY_CACHE_ENABLED,
			DKCBImpl.class, dkcb.getPrimaryKey(), dkcb);

		dkcb.resetOriginalValues();
	}

	/**
	 * Caches the d k c bs in the entity cache if it is enabled.
	 *
	 * @param dkcbs the d k c bs
	 */
	@Override
	public void cacheResult(List<DKCB> dkcbs) {
		for (DKCB dkcb : dkcbs) {
			if (EntityCacheUtil.getResult(DKCBModelImpl.ENTITY_CACHE_ENABLED,
						DKCBImpl.class, dkcb.getPrimaryKey()) == null) {
				cacheResult(dkcb);
			}
			else {
				dkcb.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all d k c bs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DKCBImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DKCBImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the d k c b.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DKCB dkcb) {
		EntityCacheUtil.removeResult(DKCBModelImpl.ENTITY_CACHE_ENABLED,
			DKCBImpl.class, dkcb.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DKCB> dkcbs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DKCB dkcb : dkcbs) {
			EntityCacheUtil.removeResult(DKCBModelImpl.ENTITY_CACHE_ENABLED,
				DKCBImpl.class, dkcb.getPrimaryKey());
		}
	}

	/**
	 * Creates a new d k c b with the primary key. Does not add the d k c b to the database.
	 *
	 * @param Id the primary key for the new d k c b
	 * @return the new d k c b
	 */
	@Override
	public DKCB create(long Id) {
		DKCB dkcb = new DKCBImpl();

		dkcb.setNew(true);
		dkcb.setPrimaryKey(Id);

		return dkcb;
	}

	/**
	 * Removes the d k c b with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id the primary key of the d k c b
	 * @return the d k c b that was removed
	 * @throws com.dkcb.NoSuchDKCBException if a d k c b with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DKCB remove(long Id) throws NoSuchDKCBException, SystemException {
		return remove((Serializable)Id);
	}

	/**
	 * Removes the d k c b with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the d k c b
	 * @return the d k c b that was removed
	 * @throws com.dkcb.NoSuchDKCBException if a d k c b with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DKCB remove(Serializable primaryKey)
		throws NoSuchDKCBException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DKCB dkcb = (DKCB)session.get(DKCBImpl.class, primaryKey);

			if (dkcb == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDKCBException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dkcb);
		}
		catch (NoSuchDKCBException nsee) {
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
	protected DKCB removeImpl(DKCB dkcb) throws SystemException {
		dkcb = toUnwrappedModel(dkcb);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dkcb)) {
				dkcb = (DKCB)session.get(DKCBImpl.class, dkcb.getPrimaryKeyObj());
			}

			if (dkcb != null) {
				session.delete(dkcb);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dkcb != null) {
			clearCache(dkcb);
		}

		return dkcb;
	}

	@Override
	public DKCB updateImpl(com.dkcb.model.DKCB dkcb) throws SystemException {
		dkcb = toUnwrappedModel(dkcb);

		boolean isNew = dkcb.isNew();

		Session session = null;

		try {
			session = openSession();

			if (dkcb.isNew()) {
				session.save(dkcb);

				dkcb.setNew(false);
			}
			else {
				session.merge(dkcb);
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

		EntityCacheUtil.putResult(DKCBModelImpl.ENTITY_CACHE_ENABLED,
			DKCBImpl.class, dkcb.getPrimaryKey(), dkcb);

		return dkcb;
	}

	protected DKCB toUnwrappedModel(DKCB dkcb) {
		if (dkcb instanceof DKCBImpl) {
			return dkcb;
		}

		DKCBImpl dkcbImpl = new DKCBImpl();

		dkcbImpl.setNew(dkcb.isNew());
		dkcbImpl.setPrimaryKey(dkcb.getPrimaryKey());

		dkcbImpl.setId(dkcb.getId());
		dkcbImpl.setHoten(dkcb.getHoten());
		dkcbImpl.setDiachi(dkcb.getDiachi());
		dkcbImpl.setGioitinh(dkcb.isGioitinh());
		dkcbImpl.setSodienthoai(dkcb.getSodienthoai());
		dkcbImpl.setNgaysinh(dkcb.getNgaysinh());
		dkcbImpl.setTrieuchung(dkcb.getTrieuchung());

		return dkcbImpl;
	}

	/**
	 * Returns the d k c b with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the d k c b
	 * @return the d k c b
	 * @throws com.dkcb.NoSuchDKCBException if a d k c b with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DKCB findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDKCBException, SystemException {
		DKCB dkcb = fetchByPrimaryKey(primaryKey);

		if (dkcb == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDKCBException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dkcb;
	}

	/**
	 * Returns the d k c b with the primary key or throws a {@link com.dkcb.NoSuchDKCBException} if it could not be found.
	 *
	 * @param Id the primary key of the d k c b
	 * @return the d k c b
	 * @throws com.dkcb.NoSuchDKCBException if a d k c b with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DKCB findByPrimaryKey(long Id)
		throws NoSuchDKCBException, SystemException {
		return findByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns the d k c b with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the d k c b
	 * @return the d k c b, or <code>null</code> if a d k c b with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DKCB fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DKCB dkcb = (DKCB)EntityCacheUtil.getResult(DKCBModelImpl.ENTITY_CACHE_ENABLED,
				DKCBImpl.class, primaryKey);

		if (dkcb == _nullDKCB) {
			return null;
		}

		if (dkcb == null) {
			Session session = null;

			try {
				session = openSession();

				dkcb = (DKCB)session.get(DKCBImpl.class, primaryKey);

				if (dkcb != null) {
					cacheResult(dkcb);
				}
				else {
					EntityCacheUtil.putResult(DKCBModelImpl.ENTITY_CACHE_ENABLED,
						DKCBImpl.class, primaryKey, _nullDKCB);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DKCBModelImpl.ENTITY_CACHE_ENABLED,
					DKCBImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dkcb;
	}

	/**
	 * Returns the d k c b with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id the primary key of the d k c b
	 * @return the d k c b, or <code>null</code> if a d k c b with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DKCB fetchByPrimaryKey(long Id) throws SystemException {
		return fetchByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns all the d k c bs.
	 *
	 * @return the d k c bs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DKCB> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the d k c bs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dkcb.model.impl.DKCBModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of d k c bs
	 * @param end the upper bound of the range of d k c bs (not inclusive)
	 * @return the range of d k c bs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DKCB> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the d k c bs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dkcb.model.impl.DKCBModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of d k c bs
	 * @param end the upper bound of the range of d k c bs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of d k c bs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DKCB> findAll(int start, int end,
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

		List<DKCB> list = (List<DKCB>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DKCB);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DKCB;

				if (pagination) {
					sql = sql.concat(DKCBModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DKCB>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DKCB>(list);
				}
				else {
					list = (List<DKCB>)QueryUtil.list(q, getDialect(), start,
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
	 * Removes all the d k c bs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DKCB dkcb : findAll()) {
			remove(dkcb);
		}
	}

	/**
	 * Returns the number of d k c bs.
	 *
	 * @return the number of d k c bs
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

				Query q = session.createQuery(_SQL_COUNT_DKCB);

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
	 * Initializes the d k c b persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.dkcb.model.DKCB")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DKCB>> listenersList = new ArrayList<ModelListener<DKCB>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DKCB>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DKCBImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DKCB = "SELECT dkcb FROM DKCB dkcb";
	private static final String _SQL_COUNT_DKCB = "SELECT COUNT(dkcb) FROM DKCB dkcb";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dkcb.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DKCB exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DKCBPersistenceImpl.class);
	private static DKCB _nullDKCB = new DKCBImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DKCB> toCacheModel() {
				return _nullDKCBCacheModel;
			}
		};

	private static CacheModel<DKCB> _nullDKCBCacheModel = new CacheModel<DKCB>() {
			@Override
			public DKCB toEntityModel() {
				return _nullDKCB;
			}
		};
}