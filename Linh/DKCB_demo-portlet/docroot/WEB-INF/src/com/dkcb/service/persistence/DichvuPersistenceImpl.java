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

import com.dkcb.NoSuchDichvuException;

import com.dkcb.model.Dichvu;
import com.dkcb.model.impl.DichvuImpl;
import com.dkcb.model.impl.DichvuModelImpl;

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
 * The persistence implementation for the dichvu service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author hoang_000
 * @see DichvuPersistence
 * @see DichvuUtil
 * @generated
 */
public class DichvuPersistenceImpl extends BasePersistenceImpl<Dichvu>
	implements DichvuPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DichvuUtil} to access the dichvu persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DichvuImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DichvuModelImpl.ENTITY_CACHE_ENABLED,
			DichvuModelImpl.FINDER_CACHE_ENABLED, DichvuImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DichvuModelImpl.ENTITY_CACHE_ENABLED,
			DichvuModelImpl.FINDER_CACHE_ENABLED, DichvuImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DichvuModelImpl.ENTITY_CACHE_ENABLED,
			DichvuModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public DichvuPersistenceImpl() {
		setModelClass(Dichvu.class);
	}

	/**
	 * Caches the dichvu in the entity cache if it is enabled.
	 *
	 * @param dichvu the dichvu
	 */
	@Override
	public void cacheResult(Dichvu dichvu) {
		EntityCacheUtil.putResult(DichvuModelImpl.ENTITY_CACHE_ENABLED,
			DichvuImpl.class, dichvu.getPrimaryKey(), dichvu);

		dichvu.resetOriginalValues();
	}

	/**
	 * Caches the dichvus in the entity cache if it is enabled.
	 *
	 * @param dichvus the dichvus
	 */
	@Override
	public void cacheResult(List<Dichvu> dichvus) {
		for (Dichvu dichvu : dichvus) {
			if (EntityCacheUtil.getResult(
						DichvuModelImpl.ENTITY_CACHE_ENABLED, DichvuImpl.class,
						dichvu.getPrimaryKey()) == null) {
				cacheResult(dichvu);
			}
			else {
				dichvu.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dichvus.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DichvuImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DichvuImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dichvu.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Dichvu dichvu) {
		EntityCacheUtil.removeResult(DichvuModelImpl.ENTITY_CACHE_ENABLED,
			DichvuImpl.class, dichvu.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Dichvu> dichvus) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Dichvu dichvu : dichvus) {
			EntityCacheUtil.removeResult(DichvuModelImpl.ENTITY_CACHE_ENABLED,
				DichvuImpl.class, dichvu.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dichvu with the primary key. Does not add the dichvu to the database.
	 *
	 * @param Iddichvu the primary key for the new dichvu
	 * @return the new dichvu
	 */
	@Override
	public Dichvu create(long Iddichvu) {
		Dichvu dichvu = new DichvuImpl();

		dichvu.setNew(true);
		dichvu.setPrimaryKey(Iddichvu);

		return dichvu;
	}

	/**
	 * Removes the dichvu with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Iddichvu the primary key of the dichvu
	 * @return the dichvu that was removed
	 * @throws com.dkcb.NoSuchDichvuException if a dichvu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Dichvu remove(long Iddichvu)
		throws NoSuchDichvuException, SystemException {
		return remove((Serializable)Iddichvu);
	}

	/**
	 * Removes the dichvu with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dichvu
	 * @return the dichvu that was removed
	 * @throws com.dkcb.NoSuchDichvuException if a dichvu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Dichvu remove(Serializable primaryKey)
		throws NoSuchDichvuException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Dichvu dichvu = (Dichvu)session.get(DichvuImpl.class, primaryKey);

			if (dichvu == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDichvuException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dichvu);
		}
		catch (NoSuchDichvuException nsee) {
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
	protected Dichvu removeImpl(Dichvu dichvu) throws SystemException {
		dichvu = toUnwrappedModel(dichvu);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dichvu)) {
				dichvu = (Dichvu)session.get(DichvuImpl.class,
						dichvu.getPrimaryKeyObj());
			}

			if (dichvu != null) {
				session.delete(dichvu);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dichvu != null) {
			clearCache(dichvu);
		}

		return dichvu;
	}

	@Override
	public Dichvu updateImpl(com.dkcb.model.Dichvu dichvu)
		throws SystemException {
		dichvu = toUnwrappedModel(dichvu);

		boolean isNew = dichvu.isNew();

		Session session = null;

		try {
			session = openSession();

			if (dichvu.isNew()) {
				session.save(dichvu);

				dichvu.setNew(false);
			}
			else {
				session.merge(dichvu);
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

		EntityCacheUtil.putResult(DichvuModelImpl.ENTITY_CACHE_ENABLED,
			DichvuImpl.class, dichvu.getPrimaryKey(), dichvu);

		return dichvu;
	}

	protected Dichvu toUnwrappedModel(Dichvu dichvu) {
		if (dichvu instanceof DichvuImpl) {
			return dichvu;
		}

		DichvuImpl dichvuImpl = new DichvuImpl();

		dichvuImpl.setNew(dichvu.isNew());
		dichvuImpl.setPrimaryKey(dichvu.getPrimaryKey());

		dichvuImpl.setIddichvu(dichvu.getIddichvu());
		dichvuImpl.setTendichvu(dichvu.getTendichvu());
		dichvuImpl.setMucthu(dichvu.getMucthu());
		dichvuImpl.setGhichi(dichvu.getGhichi());
		dichvuImpl.setIdphongkham(dichvu.getIdphongkham());

		return dichvuImpl;
	}

	/**
	 * Returns the dichvu with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dichvu
	 * @return the dichvu
	 * @throws com.dkcb.NoSuchDichvuException if a dichvu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Dichvu findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDichvuException, SystemException {
		Dichvu dichvu = fetchByPrimaryKey(primaryKey);

		if (dichvu == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDichvuException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dichvu;
	}

	/**
	 * Returns the dichvu with the primary key or throws a {@link com.dkcb.NoSuchDichvuException} if it could not be found.
	 *
	 * @param Iddichvu the primary key of the dichvu
	 * @return the dichvu
	 * @throws com.dkcb.NoSuchDichvuException if a dichvu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Dichvu findByPrimaryKey(long Iddichvu)
		throws NoSuchDichvuException, SystemException {
		return findByPrimaryKey((Serializable)Iddichvu);
	}

	/**
	 * Returns the dichvu with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dichvu
	 * @return the dichvu, or <code>null</code> if a dichvu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Dichvu fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Dichvu dichvu = (Dichvu)EntityCacheUtil.getResult(DichvuModelImpl.ENTITY_CACHE_ENABLED,
				DichvuImpl.class, primaryKey);

		if (dichvu == _nullDichvu) {
			return null;
		}

		if (dichvu == null) {
			Session session = null;

			try {
				session = openSession();

				dichvu = (Dichvu)session.get(DichvuImpl.class, primaryKey);

				if (dichvu != null) {
					cacheResult(dichvu);
				}
				else {
					EntityCacheUtil.putResult(DichvuModelImpl.ENTITY_CACHE_ENABLED,
						DichvuImpl.class, primaryKey, _nullDichvu);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DichvuModelImpl.ENTITY_CACHE_ENABLED,
					DichvuImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dichvu;
	}

	/**
	 * Returns the dichvu with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Iddichvu the primary key of the dichvu
	 * @return the dichvu, or <code>null</code> if a dichvu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Dichvu fetchByPrimaryKey(long Iddichvu) throws SystemException {
		return fetchByPrimaryKey((Serializable)Iddichvu);
	}

	/**
	 * Returns all the dichvus.
	 *
	 * @return the dichvus
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Dichvu> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dichvus.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dkcb.model.impl.DichvuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dichvus
	 * @param end the upper bound of the range of dichvus (not inclusive)
	 * @return the range of dichvus
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Dichvu> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dichvus.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dkcb.model.impl.DichvuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dichvus
	 * @param end the upper bound of the range of dichvus (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dichvus
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Dichvu> findAll(int start, int end,
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

		List<Dichvu> list = (List<Dichvu>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DICHVU);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DICHVU;

				if (pagination) {
					sql = sql.concat(DichvuModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Dichvu>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Dichvu>(list);
				}
				else {
					list = (List<Dichvu>)QueryUtil.list(q, getDialect(), start,
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
	 * Removes all the dichvus from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Dichvu dichvu : findAll()) {
			remove(dichvu);
		}
	}

	/**
	 * Returns the number of dichvus.
	 *
	 * @return the number of dichvus
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

				Query q = session.createQuery(_SQL_COUNT_DICHVU);

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
	 * Initializes the dichvu persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.dkcb.model.Dichvu")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Dichvu>> listenersList = new ArrayList<ModelListener<Dichvu>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Dichvu>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DichvuImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DICHVU = "SELECT dichvu FROM Dichvu dichvu";
	private static final String _SQL_COUNT_DICHVU = "SELECT COUNT(dichvu) FROM Dichvu dichvu";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dichvu.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Dichvu exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DichvuPersistenceImpl.class);
	private static Dichvu _nullDichvu = new DichvuImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Dichvu> toCacheModel() {
				return _nullDichvuCacheModel;
			}
		};

	private static CacheModel<Dichvu> _nullDichvuCacheModel = new CacheModel<Dichvu>() {
			@Override
			public Dichvu toEntityModel() {
				return _nullDichvu;
			}
		};
}