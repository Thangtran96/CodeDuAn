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

import com.vanban.NoSuchuserException;

import com.vanban.model.impl.userImpl;
import com.vanban.model.impl.userModelImpl;
import com.vanban.model.user;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the user service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author nguye
 * @see userPersistence
 * @see userUtil
 * @generated
 */
public class userPersistenceImpl extends BasePersistenceImpl<user>
	implements userPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link userUtil} to access the user persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = userImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(userModelImpl.ENTITY_CACHE_ENABLED,
			userModelImpl.FINDER_CACHE_ENABLED, userImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(userModelImpl.ENTITY_CACHE_ENABLED,
			userModelImpl.FINDER_CACHE_ENABLED, userImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(userModelImpl.ENTITY_CACHE_ENABLED,
			userModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public userPersistenceImpl() {
		setModelClass(user.class);
	}

	/**
	 * Caches the user in the entity cache if it is enabled.
	 *
	 * @param user the user
	 */
	@Override
	public void cacheResult(user user) {
		EntityCacheUtil.putResult(userModelImpl.ENTITY_CACHE_ENABLED,
			userImpl.class, user.getPrimaryKey(), user);

		user.resetOriginalValues();
	}

	/**
	 * Caches the users in the entity cache if it is enabled.
	 *
	 * @param users the users
	 */
	@Override
	public void cacheResult(List<user> users) {
		for (user user : users) {
			if (EntityCacheUtil.getResult(userModelImpl.ENTITY_CACHE_ENABLED,
						userImpl.class, user.getPrimaryKey()) == null) {
				cacheResult(user);
			}
			else {
				user.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all users.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(userImpl.class.getName());
		}

		EntityCacheUtil.clearCache(userImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the user.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(user user) {
		EntityCacheUtil.removeResult(userModelImpl.ENTITY_CACHE_ENABLED,
			userImpl.class, user.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<user> users) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (user user : users) {
			EntityCacheUtil.removeResult(userModelImpl.ENTITY_CACHE_ENABLED,
				userImpl.class, user.getPrimaryKey());
		}
	}

	/**
	 * Creates a new user with the primary key. Does not add the user to the database.
	 *
	 * @param userId the primary key for the new user
	 * @return the new user
	 */
	@Override
	public user create(long userId) {
		user user = new userImpl();

		user.setNew(true);
		user.setPrimaryKey(userId);

		return user;
	}

	/**
	 * Removes the user with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userId the primary key of the user
	 * @return the user that was removed
	 * @throws com.vanban.NoSuchuserException if a user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public user remove(long userId) throws NoSuchuserException, SystemException {
		return remove((Serializable)userId);
	}

	/**
	 * Removes the user with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the user
	 * @return the user that was removed
	 * @throws com.vanban.NoSuchuserException if a user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public user remove(Serializable primaryKey)
		throws NoSuchuserException, SystemException {
		Session session = null;

		try {
			session = openSession();

			user user = (user)session.get(userImpl.class, primaryKey);

			if (user == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchuserException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(user);
		}
		catch (NoSuchuserException nsee) {
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
	protected user removeImpl(user user) throws SystemException {
		user = toUnwrappedModel(user);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(user)) {
				user = (user)session.get(userImpl.class, user.getPrimaryKeyObj());
			}

			if (user != null) {
				session.delete(user);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (user != null) {
			clearCache(user);
		}

		return user;
	}

	@Override
	public user updateImpl(com.vanban.model.user user)
		throws SystemException {
		user = toUnwrappedModel(user);

		boolean isNew = user.isNew();

		Session session = null;

		try {
			session = openSession();

			if (user.isNew()) {
				session.save(user);

				user.setNew(false);
			}
			else {
				session.merge(user);
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

		EntityCacheUtil.putResult(userModelImpl.ENTITY_CACHE_ENABLED,
			userImpl.class, user.getPrimaryKey(), user);

		return user;
	}

	protected user toUnwrappedModel(user user) {
		if (user instanceof userImpl) {
			return user;
		}

		userImpl userImpl = new userImpl();

		userImpl.setNew(user.isNew());
		userImpl.setPrimaryKey(user.getPrimaryKey());

		userImpl.setUserId(user.getUserId());
		userImpl.setHoten(user.getHoten());
		userImpl.setNgaysinh(user.getNgaysinh());
		userImpl.setGioitinh(user.getGioitinh());
		userImpl.setDiachi(user.getDiachi());
		userImpl.setSdt(user.getSdt());
		userImpl.setDonvi(user.getDonvi());
		userImpl.setMail(user.getMail());
		userImpl.setMatkhau(user.getMatkhau());

		return userImpl;
	}

	/**
	 * Returns the user with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the user
	 * @return the user
	 * @throws com.vanban.NoSuchuserException if a user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public user findByPrimaryKey(Serializable primaryKey)
		throws NoSuchuserException, SystemException {
		user user = fetchByPrimaryKey(primaryKey);

		if (user == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchuserException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return user;
	}

	/**
	 * Returns the user with the primary key or throws a {@link com.vanban.NoSuchuserException} if it could not be found.
	 *
	 * @param userId the primary key of the user
	 * @return the user
	 * @throws com.vanban.NoSuchuserException if a user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public user findByPrimaryKey(long userId)
		throws NoSuchuserException, SystemException {
		return findByPrimaryKey((Serializable)userId);
	}

	/**
	 * Returns the user with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the user
	 * @return the user, or <code>null</code> if a user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public user fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		user user = (user)EntityCacheUtil.getResult(userModelImpl.ENTITY_CACHE_ENABLED,
				userImpl.class, primaryKey);

		if (user == _nulluser) {
			return null;
		}

		if (user == null) {
			Session session = null;

			try {
				session = openSession();

				user = (user)session.get(userImpl.class, primaryKey);

				if (user != null) {
					cacheResult(user);
				}
				else {
					EntityCacheUtil.putResult(userModelImpl.ENTITY_CACHE_ENABLED,
						userImpl.class, primaryKey, _nulluser);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(userModelImpl.ENTITY_CACHE_ENABLED,
					userImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return user;
	}

	/**
	 * Returns the user with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param userId the primary key of the user
	 * @return the user, or <code>null</code> if a user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public user fetchByPrimaryKey(long userId) throws SystemException {
		return fetchByPrimaryKey((Serializable)userId);
	}

	/**
	 * Returns all the users.
	 *
	 * @return the users
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<user> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the users.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vanban.model.impl.userModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of users
	 * @param end the upper bound of the range of users (not inclusive)
	 * @return the range of users
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<user> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the users.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vanban.model.impl.userModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of users
	 * @param end the upper bound of the range of users (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of users
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<user> findAll(int start, int end,
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

		List<user> list = (List<user>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_USER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_USER;

				if (pagination) {
					sql = sql.concat(userModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<user>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<user>(list);
				}
				else {
					list = (List<user>)QueryUtil.list(q, getDialect(), start,
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
	 * Removes all the users from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (user user : findAll()) {
			remove(user);
		}
	}

	/**
	 * Returns the number of users.
	 *
	 * @return the number of users
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

				Query q = session.createQuery(_SQL_COUNT_USER);

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
	 * Initializes the user persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vanban.model.user")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<user>> listenersList = new ArrayList<ModelListener<user>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<user>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(userImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_USER = "SELECT user FROM user user";
	private static final String _SQL_COUNT_USER = "SELECT COUNT(user) FROM user user";
	private static final String _ORDER_BY_ENTITY_ALIAS = "user.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No user exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(userPersistenceImpl.class);
	private static user _nulluser = new userImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<user> toCacheModel() {
				return _nulluserCacheModel;
			}
		};

	private static CacheModel<user> _nulluserCacheModel = new CacheModel<user>() {
			@Override
			public user toEntityModel() {
				return _nulluser;
			}
		};
}