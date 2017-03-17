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

import com.vanban.NoSuchnguoidungException;

import com.vanban.model.impl.nguoidungImpl;
import com.vanban.model.impl.nguoidungModelImpl;
import com.vanban.model.nguoidung;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the nguoidung service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author nguye
 * @see nguoidungPersistence
 * @see nguoidungUtil
 * @generated
 */
public class nguoidungPersistenceImpl extends BasePersistenceImpl<nguoidung>
	implements nguoidungPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link nguoidungUtil} to access the nguoidung persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = nguoidungImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(nguoidungModelImpl.ENTITY_CACHE_ENABLED,
			nguoidungModelImpl.FINDER_CACHE_ENABLED, nguoidungImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(nguoidungModelImpl.ENTITY_CACHE_ENABLED,
			nguoidungModelImpl.FINDER_CACHE_ENABLED, nguoidungImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(nguoidungModelImpl.ENTITY_CACHE_ENABLED,
			nguoidungModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public nguoidungPersistenceImpl() {
		setModelClass(nguoidung.class);
	}

	/**
	 * Caches the nguoidung in the entity cache if it is enabled.
	 *
	 * @param nguoidung the nguoidung
	 */
	@Override
	public void cacheResult(nguoidung nguoidung) {
		EntityCacheUtil.putResult(nguoidungModelImpl.ENTITY_CACHE_ENABLED,
			nguoidungImpl.class, nguoidung.getPrimaryKey(), nguoidung);

		nguoidung.resetOriginalValues();
	}

	/**
	 * Caches the nguoidungs in the entity cache if it is enabled.
	 *
	 * @param nguoidungs the nguoidungs
	 */
	@Override
	public void cacheResult(List<nguoidung> nguoidungs) {
		for (nguoidung nguoidung : nguoidungs) {
			if (EntityCacheUtil.getResult(
						nguoidungModelImpl.ENTITY_CACHE_ENABLED,
						nguoidungImpl.class, nguoidung.getPrimaryKey()) == null) {
				cacheResult(nguoidung);
			}
			else {
				nguoidung.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all nguoidungs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(nguoidungImpl.class.getName());
		}

		EntityCacheUtil.clearCache(nguoidungImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the nguoidung.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(nguoidung nguoidung) {
		EntityCacheUtil.removeResult(nguoidungModelImpl.ENTITY_CACHE_ENABLED,
			nguoidungImpl.class, nguoidung.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<nguoidung> nguoidungs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (nguoidung nguoidung : nguoidungs) {
			EntityCacheUtil.removeResult(nguoidungModelImpl.ENTITY_CACHE_ENABLED,
				nguoidungImpl.class, nguoidung.getPrimaryKey());
		}
	}

	/**
	 * Creates a new nguoidung with the primary key. Does not add the nguoidung to the database.
	 *
	 * @param userId the primary key for the new nguoidung
	 * @return the new nguoidung
	 */
	@Override
	public nguoidung create(long userId) {
		nguoidung nguoidung = new nguoidungImpl();

		nguoidung.setNew(true);
		nguoidung.setPrimaryKey(userId);

		return nguoidung;
	}

	/**
	 * Removes the nguoidung with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userId the primary key of the nguoidung
	 * @return the nguoidung that was removed
	 * @throws com.vanban.NoSuchnguoidungException if a nguoidung with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public nguoidung remove(long userId)
		throws NoSuchnguoidungException, SystemException {
		return remove((Serializable)userId);
	}

	/**
	 * Removes the nguoidung with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the nguoidung
	 * @return the nguoidung that was removed
	 * @throws com.vanban.NoSuchnguoidungException if a nguoidung with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public nguoidung remove(Serializable primaryKey)
		throws NoSuchnguoidungException, SystemException {
		Session session = null;

		try {
			session = openSession();

			nguoidung nguoidung = (nguoidung)session.get(nguoidungImpl.class,
					primaryKey);

			if (nguoidung == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchnguoidungException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(nguoidung);
		}
		catch (NoSuchnguoidungException nsee) {
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
	protected nguoidung removeImpl(nguoidung nguoidung)
		throws SystemException {
		nguoidung = toUnwrappedModel(nguoidung);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(nguoidung)) {
				nguoidung = (nguoidung)session.get(nguoidungImpl.class,
						nguoidung.getPrimaryKeyObj());
			}

			if (nguoidung != null) {
				session.delete(nguoidung);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (nguoidung != null) {
			clearCache(nguoidung);
		}

		return nguoidung;
	}

	@Override
	public nguoidung updateImpl(com.vanban.model.nguoidung nguoidung)
		throws SystemException {
		nguoidung = toUnwrappedModel(nguoidung);

		boolean isNew = nguoidung.isNew();

		Session session = null;

		try {
			session = openSession();

			if (nguoidung.isNew()) {
				session.save(nguoidung);

				nguoidung.setNew(false);
			}
			else {
				session.merge(nguoidung);
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

		EntityCacheUtil.putResult(nguoidungModelImpl.ENTITY_CACHE_ENABLED,
			nguoidungImpl.class, nguoidung.getPrimaryKey(), nguoidung);

		return nguoidung;
	}

	protected nguoidung toUnwrappedModel(nguoidung nguoidung) {
		if (nguoidung instanceof nguoidungImpl) {
			return nguoidung;
		}

		nguoidungImpl nguoidungImpl = new nguoidungImpl();

		nguoidungImpl.setNew(nguoidung.isNew());
		nguoidungImpl.setPrimaryKey(nguoidung.getPrimaryKey());

		nguoidungImpl.setUserId(nguoidung.getUserId());
		nguoidungImpl.setHoten(nguoidung.getHoten());
		nguoidungImpl.setNgaysinh(nguoidung.getNgaysinh());
		nguoidungImpl.setGioitinh(nguoidung.getGioitinh());
		nguoidungImpl.setDiachi(nguoidung.getDiachi());
		nguoidungImpl.setSdt(nguoidung.getSdt());
		nguoidungImpl.setDonvi(nguoidung.getDonvi());
		nguoidungImpl.setMail(nguoidung.getMail());
		nguoidungImpl.setMatkhau(nguoidung.getMatkhau());
		nguoidungImpl.setTinhtrang(nguoidung.isTinhtrang());

		return nguoidungImpl;
	}

	/**
	 * Returns the nguoidung with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the nguoidung
	 * @return the nguoidung
	 * @throws com.vanban.NoSuchnguoidungException if a nguoidung with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public nguoidung findByPrimaryKey(Serializable primaryKey)
		throws NoSuchnguoidungException, SystemException {
		nguoidung nguoidung = fetchByPrimaryKey(primaryKey);

		if (nguoidung == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchnguoidungException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return nguoidung;
	}

	/**
	 * Returns the nguoidung with the primary key or throws a {@link com.vanban.NoSuchnguoidungException} if it could not be found.
	 *
	 * @param userId the primary key of the nguoidung
	 * @return the nguoidung
	 * @throws com.vanban.NoSuchnguoidungException if a nguoidung with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public nguoidung findByPrimaryKey(long userId)
		throws NoSuchnguoidungException, SystemException {
		return findByPrimaryKey((Serializable)userId);
	}

	/**
	 * Returns the nguoidung with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the nguoidung
	 * @return the nguoidung, or <code>null</code> if a nguoidung with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public nguoidung fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		nguoidung nguoidung = (nguoidung)EntityCacheUtil.getResult(nguoidungModelImpl.ENTITY_CACHE_ENABLED,
				nguoidungImpl.class, primaryKey);

		if (nguoidung == _nullnguoidung) {
			return null;
		}

		if (nguoidung == null) {
			Session session = null;

			try {
				session = openSession();

				nguoidung = (nguoidung)session.get(nguoidungImpl.class,
						primaryKey);

				if (nguoidung != null) {
					cacheResult(nguoidung);
				}
				else {
					EntityCacheUtil.putResult(nguoidungModelImpl.ENTITY_CACHE_ENABLED,
						nguoidungImpl.class, primaryKey, _nullnguoidung);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(nguoidungModelImpl.ENTITY_CACHE_ENABLED,
					nguoidungImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return nguoidung;
	}

	/**
	 * Returns the nguoidung with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param userId the primary key of the nguoidung
	 * @return the nguoidung, or <code>null</code> if a nguoidung with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public nguoidung fetchByPrimaryKey(long userId) throws SystemException {
		return fetchByPrimaryKey((Serializable)userId);
	}

	/**
	 * Returns all the nguoidungs.
	 *
	 * @return the nguoidungs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<nguoidung> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the nguoidungs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vanban.model.impl.nguoidungModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of nguoidungs
	 * @param end the upper bound of the range of nguoidungs (not inclusive)
	 * @return the range of nguoidungs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<nguoidung> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the nguoidungs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vanban.model.impl.nguoidungModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of nguoidungs
	 * @param end the upper bound of the range of nguoidungs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of nguoidungs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<nguoidung> findAll(int start, int end,
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

		List<nguoidung> list = (List<nguoidung>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_NGUOIDUNG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_NGUOIDUNG;

				if (pagination) {
					sql = sql.concat(nguoidungModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<nguoidung>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<nguoidung>(list);
				}
				else {
					list = (List<nguoidung>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the nguoidungs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (nguoidung nguoidung : findAll()) {
			remove(nguoidung);
		}
	}

	/**
	 * Returns the number of nguoidungs.
	 *
	 * @return the number of nguoidungs
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

				Query q = session.createQuery(_SQL_COUNT_NGUOIDUNG);

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
	 * Initializes the nguoidung persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vanban.model.nguoidung")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<nguoidung>> listenersList = new ArrayList<ModelListener<nguoidung>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<nguoidung>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(nguoidungImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_NGUOIDUNG = "SELECT nguoidung FROM nguoidung nguoidung";
	private static final String _SQL_COUNT_NGUOIDUNG = "SELECT COUNT(nguoidung) FROM nguoidung nguoidung";
	private static final String _ORDER_BY_ENTITY_ALIAS = "nguoidung.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No nguoidung exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(nguoidungPersistenceImpl.class);
	private static nguoidung _nullnguoidung = new nguoidungImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<nguoidung> toCacheModel() {
				return _nullnguoidungCacheModel;
			}
		};

	private static CacheModel<nguoidung> _nullnguoidungCacheModel = new CacheModel<nguoidung>() {
			@Override
			public nguoidung toEntityModel() {
				return _nullnguoidung;
			}
		};
}