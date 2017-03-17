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

import com.dkcb.NoSuchPhongkhamException;

import com.dkcb.model.Phongkham;
import com.dkcb.model.impl.PhongkhamImpl;
import com.dkcb.model.impl.PhongkhamModelImpl;

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
 * The persistence implementation for the phongkham service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author hoang_000
 * @see PhongkhamPersistence
 * @see PhongkhamUtil
 * @generated
 */
public class PhongkhamPersistenceImpl extends BasePersistenceImpl<Phongkham>
	implements PhongkhamPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PhongkhamUtil} to access the phongkham persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PhongkhamImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PhongkhamModelImpl.ENTITY_CACHE_ENABLED,
			PhongkhamModelImpl.FINDER_CACHE_ENABLED, PhongkhamImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PhongkhamModelImpl.ENTITY_CACHE_ENABLED,
			PhongkhamModelImpl.FINDER_CACHE_ENABLED, PhongkhamImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PhongkhamModelImpl.ENTITY_CACHE_ENABLED,
			PhongkhamModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public PhongkhamPersistenceImpl() {
		setModelClass(Phongkham.class);
	}

	/**
	 * Caches the phongkham in the entity cache if it is enabled.
	 *
	 * @param phongkham the phongkham
	 */
	@Override
	public void cacheResult(Phongkham phongkham) {
		EntityCacheUtil.putResult(PhongkhamModelImpl.ENTITY_CACHE_ENABLED,
			PhongkhamImpl.class, phongkham.getPrimaryKey(), phongkham);

		phongkham.resetOriginalValues();
	}

	/**
	 * Caches the phongkhams in the entity cache if it is enabled.
	 *
	 * @param phongkhams the phongkhams
	 */
	@Override
	public void cacheResult(List<Phongkham> phongkhams) {
		for (Phongkham phongkham : phongkhams) {
			if (EntityCacheUtil.getResult(
						PhongkhamModelImpl.ENTITY_CACHE_ENABLED,
						PhongkhamImpl.class, phongkham.getPrimaryKey()) == null) {
				cacheResult(phongkham);
			}
			else {
				phongkham.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all phongkhams.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PhongkhamImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PhongkhamImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the phongkham.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Phongkham phongkham) {
		EntityCacheUtil.removeResult(PhongkhamModelImpl.ENTITY_CACHE_ENABLED,
			PhongkhamImpl.class, phongkham.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Phongkham> phongkhams) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Phongkham phongkham : phongkhams) {
			EntityCacheUtil.removeResult(PhongkhamModelImpl.ENTITY_CACHE_ENABLED,
				PhongkhamImpl.class, phongkham.getPrimaryKey());
		}
	}

	/**
	 * Creates a new phongkham with the primary key. Does not add the phongkham to the database.
	 *
	 * @param Idphongkham the primary key for the new phongkham
	 * @return the new phongkham
	 */
	@Override
	public Phongkham create(String Idphongkham) {
		Phongkham phongkham = new PhongkhamImpl();

		phongkham.setNew(true);
		phongkham.setPrimaryKey(Idphongkham);

		return phongkham;
	}

	/**
	 * Removes the phongkham with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Idphongkham the primary key of the phongkham
	 * @return the phongkham that was removed
	 * @throws com.dkcb.NoSuchPhongkhamException if a phongkham with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Phongkham remove(String Idphongkham)
		throws NoSuchPhongkhamException, SystemException {
		return remove((Serializable)Idphongkham);
	}

	/**
	 * Removes the phongkham with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the phongkham
	 * @return the phongkham that was removed
	 * @throws com.dkcb.NoSuchPhongkhamException if a phongkham with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Phongkham remove(Serializable primaryKey)
		throws NoSuchPhongkhamException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Phongkham phongkham = (Phongkham)session.get(PhongkhamImpl.class,
					primaryKey);

			if (phongkham == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPhongkhamException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(phongkham);
		}
		catch (NoSuchPhongkhamException nsee) {
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
	protected Phongkham removeImpl(Phongkham phongkham)
		throws SystemException {
		phongkham = toUnwrappedModel(phongkham);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(phongkham)) {
				phongkham = (Phongkham)session.get(PhongkhamImpl.class,
						phongkham.getPrimaryKeyObj());
			}

			if (phongkham != null) {
				session.delete(phongkham);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (phongkham != null) {
			clearCache(phongkham);
		}

		return phongkham;
	}

	@Override
	public Phongkham updateImpl(com.dkcb.model.Phongkham phongkham)
		throws SystemException {
		phongkham = toUnwrappedModel(phongkham);

		boolean isNew = phongkham.isNew();

		Session session = null;

		try {
			session = openSession();

			if (phongkham.isNew()) {
				session.save(phongkham);

				phongkham.setNew(false);
			}
			else {
				session.merge(phongkham);
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

		EntityCacheUtil.putResult(PhongkhamModelImpl.ENTITY_CACHE_ENABLED,
			PhongkhamImpl.class, phongkham.getPrimaryKey(), phongkham);

		return phongkham;
	}

	protected Phongkham toUnwrappedModel(Phongkham phongkham) {
		if (phongkham instanceof PhongkhamImpl) {
			return phongkham;
		}

		PhongkhamImpl phongkhamImpl = new PhongkhamImpl();

		phongkhamImpl.setNew(phongkham.isNew());
		phongkhamImpl.setPrimaryKey(phongkham.getPrimaryKey());

		phongkhamImpl.setIdphongkham(phongkham.getIdphongkham());
		phongkhamImpl.setTenPK(phongkham.getTenPK());

		return phongkhamImpl;
	}

	/**
	 * Returns the phongkham with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the phongkham
	 * @return the phongkham
	 * @throws com.dkcb.NoSuchPhongkhamException if a phongkham with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Phongkham findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPhongkhamException, SystemException {
		Phongkham phongkham = fetchByPrimaryKey(primaryKey);

		if (phongkham == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPhongkhamException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return phongkham;
	}

	/**
	 * Returns the phongkham with the primary key or throws a {@link com.dkcb.NoSuchPhongkhamException} if it could not be found.
	 *
	 * @param Idphongkham the primary key of the phongkham
	 * @return the phongkham
	 * @throws com.dkcb.NoSuchPhongkhamException if a phongkham with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Phongkham findByPrimaryKey(String Idphongkham)
		throws NoSuchPhongkhamException, SystemException {
		return findByPrimaryKey((Serializable)Idphongkham);
	}

	/**
	 * Returns the phongkham with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the phongkham
	 * @return the phongkham, or <code>null</code> if a phongkham with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Phongkham fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Phongkham phongkham = (Phongkham)EntityCacheUtil.getResult(PhongkhamModelImpl.ENTITY_CACHE_ENABLED,
				PhongkhamImpl.class, primaryKey);

		if (phongkham == _nullPhongkham) {
			return null;
		}

		if (phongkham == null) {
			Session session = null;

			try {
				session = openSession();

				phongkham = (Phongkham)session.get(PhongkhamImpl.class,
						primaryKey);

				if (phongkham != null) {
					cacheResult(phongkham);
				}
				else {
					EntityCacheUtil.putResult(PhongkhamModelImpl.ENTITY_CACHE_ENABLED,
						PhongkhamImpl.class, primaryKey, _nullPhongkham);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PhongkhamModelImpl.ENTITY_CACHE_ENABLED,
					PhongkhamImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return phongkham;
	}

	/**
	 * Returns the phongkham with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Idphongkham the primary key of the phongkham
	 * @return the phongkham, or <code>null</code> if a phongkham with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Phongkham fetchByPrimaryKey(String Idphongkham)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)Idphongkham);
	}

	/**
	 * Returns all the phongkhams.
	 *
	 * @return the phongkhams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Phongkham> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the phongkhams.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dkcb.model.impl.PhongkhamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of phongkhams
	 * @param end the upper bound of the range of phongkhams (not inclusive)
	 * @return the range of phongkhams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Phongkham> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the phongkhams.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dkcb.model.impl.PhongkhamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of phongkhams
	 * @param end the upper bound of the range of phongkhams (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of phongkhams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Phongkham> findAll(int start, int end,
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

		List<Phongkham> list = (List<Phongkham>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PHONGKHAM);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PHONGKHAM;

				if (pagination) {
					sql = sql.concat(PhongkhamModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Phongkham>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Phongkham>(list);
				}
				else {
					list = (List<Phongkham>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the phongkhams from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Phongkham phongkham : findAll()) {
			remove(phongkham);
		}
	}

	/**
	 * Returns the number of phongkhams.
	 *
	 * @return the number of phongkhams
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

				Query q = session.createQuery(_SQL_COUNT_PHONGKHAM);

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
	 * Initializes the phongkham persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.dkcb.model.Phongkham")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Phongkham>> listenersList = new ArrayList<ModelListener<Phongkham>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Phongkham>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PhongkhamImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PHONGKHAM = "SELECT phongkham FROM Phongkham phongkham";
	private static final String _SQL_COUNT_PHONGKHAM = "SELECT COUNT(phongkham) FROM Phongkham phongkham";
	private static final String _ORDER_BY_ENTITY_ALIAS = "phongkham.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Phongkham exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PhongkhamPersistenceImpl.class);
	private static Phongkham _nullPhongkham = new PhongkhamImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Phongkham> toCacheModel() {
				return _nullPhongkhamCacheModel;
			}
		};

	private static CacheModel<Phongkham> _nullPhongkhamCacheModel = new CacheModel<Phongkham>() {
			@Override
			public Phongkham toEntityModel() {
				return _nullPhongkham;
			}
		};
}