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

package com.mobilekipyonetim.service.service.persistence;

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

import com.mobilekipyonetim.service.NoSuchOrderPriorityException;
import com.mobilekipyonetim.service.model.OrderPriority;
import com.mobilekipyonetim.service.model.impl.OrderPriorityImpl;
import com.mobilekipyonetim.service.model.impl.OrderPriorityModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the order priority service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author 002834
 * @see OrderPriorityPersistence
 * @see OrderPriorityUtil
 * @generated
 */
public class OrderPriorityPersistenceImpl extends BasePersistenceImpl<OrderPriority>
	implements OrderPriorityPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link OrderPriorityUtil} to access the order priority persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = OrderPriorityImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(OrderPriorityModelImpl.ENTITY_CACHE_ENABLED,
			OrderPriorityModelImpl.FINDER_CACHE_ENABLED,
			OrderPriorityImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(OrderPriorityModelImpl.ENTITY_CACHE_ENABLED,
			OrderPriorityModelImpl.FINDER_CACHE_ENABLED,
			OrderPriorityImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(OrderPriorityModelImpl.ENTITY_CACHE_ENABLED,
			OrderPriorityModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public OrderPriorityPersistenceImpl() {
		setModelClass(OrderPriority.class);
	}

	/**
	 * Caches the order priority in the entity cache if it is enabled.
	 *
	 * @param orderPriority the order priority
	 */
	@Override
	public void cacheResult(OrderPriority orderPriority) {
		EntityCacheUtil.putResult(OrderPriorityModelImpl.ENTITY_CACHE_ENABLED,
			OrderPriorityImpl.class, orderPriority.getPrimaryKey(),
			orderPriority);

		orderPriority.resetOriginalValues();
	}

	/**
	 * Caches the order priorities in the entity cache if it is enabled.
	 *
	 * @param orderPriorities the order priorities
	 */
	@Override
	public void cacheResult(List<OrderPriority> orderPriorities) {
		for (OrderPriority orderPriority : orderPriorities) {
			if (EntityCacheUtil.getResult(
						OrderPriorityModelImpl.ENTITY_CACHE_ENABLED,
						OrderPriorityImpl.class, orderPriority.getPrimaryKey()) == null) {
				cacheResult(orderPriority);
			}
			else {
				orderPriority.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all order priorities.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(OrderPriorityImpl.class.getName());
		}

		EntityCacheUtil.clearCache(OrderPriorityImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the order priority.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OrderPriority orderPriority) {
		EntityCacheUtil.removeResult(OrderPriorityModelImpl.ENTITY_CACHE_ENABLED,
			OrderPriorityImpl.class, orderPriority.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<OrderPriority> orderPriorities) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (OrderPriority orderPriority : orderPriorities) {
			EntityCacheUtil.removeResult(OrderPriorityModelImpl.ENTITY_CACHE_ENABLED,
				OrderPriorityImpl.class, orderPriority.getPrimaryKey());
		}
	}

	/**
	 * Creates a new order priority with the primary key. Does not add the order priority to the database.
	 *
	 * @param orderPriorityEntityId the primary key for the new order priority
	 * @return the new order priority
	 */
	@Override
	public OrderPriority create(int orderPriorityEntityId) {
		OrderPriority orderPriority = new OrderPriorityImpl();

		orderPriority.setNew(true);
		orderPriority.setPrimaryKey(orderPriorityEntityId);

		return orderPriority;
	}

	/**
	 * Removes the order priority with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param orderPriorityEntityId the primary key of the order priority
	 * @return the order priority that was removed
	 * @throws com.mobilekipyonetim.service.NoSuchOrderPriorityException if a order priority with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OrderPriority remove(int orderPriorityEntityId)
		throws NoSuchOrderPriorityException, SystemException {
		return remove((Serializable)orderPriorityEntityId);
	}

	/**
	 * Removes the order priority with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the order priority
	 * @return the order priority that was removed
	 * @throws com.mobilekipyonetim.service.NoSuchOrderPriorityException if a order priority with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OrderPriority remove(Serializable primaryKey)
		throws NoSuchOrderPriorityException, SystemException {
		Session session = null;

		try {
			session = openSession();

			OrderPriority orderPriority = (OrderPriority)session.get(OrderPriorityImpl.class,
					primaryKey);

			if (orderPriority == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOrderPriorityException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(orderPriority);
		}
		catch (NoSuchOrderPriorityException nsee) {
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
	protected OrderPriority removeImpl(OrderPriority orderPriority)
		throws SystemException {
		orderPriority = toUnwrappedModel(orderPriority);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(orderPriority)) {
				orderPriority = (OrderPriority)session.get(OrderPriorityImpl.class,
						orderPriority.getPrimaryKeyObj());
			}

			if (orderPriority != null) {
				session.delete(orderPriority);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (orderPriority != null) {
			clearCache(orderPriority);
		}

		return orderPriority;
	}

	@Override
	public OrderPriority updateImpl(
		com.mobilekipyonetim.service.model.OrderPriority orderPriority)
		throws SystemException {
		orderPriority = toUnwrappedModel(orderPriority);

		boolean isNew = orderPriority.isNew();

		Session session = null;

		try {
			session = openSession();

			if (orderPriority.isNew()) {
				session.save(orderPriority);

				orderPriority.setNew(false);
			}
			else {
				session.merge(orderPriority);
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

		EntityCacheUtil.putResult(OrderPriorityModelImpl.ENTITY_CACHE_ENABLED,
			OrderPriorityImpl.class, orderPriority.getPrimaryKey(),
			orderPriority);

		return orderPriority;
	}

	protected OrderPriority toUnwrappedModel(OrderPriority orderPriority) {
		if (orderPriority instanceof OrderPriorityImpl) {
			return orderPriority;
		}

		OrderPriorityImpl orderPriorityImpl = new OrderPriorityImpl();

		orderPriorityImpl.setNew(orderPriority.isNew());
		orderPriorityImpl.setPrimaryKey(orderPriority.getPrimaryKey());

		orderPriorityImpl.setOrderPriorityEntityId(orderPriority.getOrderPriorityEntityId());
		orderPriorityImpl.setGroupId(orderPriority.getGroupId());
		orderPriorityImpl.setCompanyId(orderPriority.getCompanyId());
		orderPriorityImpl.setUserId(orderPriority.getUserId());
		orderPriorityImpl.setUserName(orderPriority.getUserName());
		orderPriorityImpl.setCreateDate(orderPriority.getCreateDate());
		orderPriorityImpl.setModifiedDate(orderPriority.getModifiedDate());
		orderPriorityImpl.setOrganizationId(orderPriority.getOrganizationId());
		orderPriorityImpl.setDescription(orderPriority.getDescription());

		return orderPriorityImpl;
	}

	/**
	 * Returns the order priority with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the order priority
	 * @return the order priority
	 * @throws com.mobilekipyonetim.service.NoSuchOrderPriorityException if a order priority with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OrderPriority findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOrderPriorityException, SystemException {
		OrderPriority orderPriority = fetchByPrimaryKey(primaryKey);

		if (orderPriority == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOrderPriorityException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return orderPriority;
	}

	/**
	 * Returns the order priority with the primary key or throws a {@link com.mobilekipyonetim.service.NoSuchOrderPriorityException} if it could not be found.
	 *
	 * @param orderPriorityEntityId the primary key of the order priority
	 * @return the order priority
	 * @throws com.mobilekipyonetim.service.NoSuchOrderPriorityException if a order priority with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OrderPriority findByPrimaryKey(int orderPriorityEntityId)
		throws NoSuchOrderPriorityException, SystemException {
		return findByPrimaryKey((Serializable)orderPriorityEntityId);
	}

	/**
	 * Returns the order priority with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the order priority
	 * @return the order priority, or <code>null</code> if a order priority with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OrderPriority fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		OrderPriority orderPriority = (OrderPriority)EntityCacheUtil.getResult(OrderPriorityModelImpl.ENTITY_CACHE_ENABLED,
				OrderPriorityImpl.class, primaryKey);

		if (orderPriority == _nullOrderPriority) {
			return null;
		}

		if (orderPriority == null) {
			Session session = null;

			try {
				session = openSession();

				orderPriority = (OrderPriority)session.get(OrderPriorityImpl.class,
						primaryKey);

				if (orderPriority != null) {
					cacheResult(orderPriority);
				}
				else {
					EntityCacheUtil.putResult(OrderPriorityModelImpl.ENTITY_CACHE_ENABLED,
						OrderPriorityImpl.class, primaryKey, _nullOrderPriority);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(OrderPriorityModelImpl.ENTITY_CACHE_ENABLED,
					OrderPriorityImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return orderPriority;
	}

	/**
	 * Returns the order priority with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param orderPriorityEntityId the primary key of the order priority
	 * @return the order priority, or <code>null</code> if a order priority with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OrderPriority fetchByPrimaryKey(int orderPriorityEntityId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)orderPriorityEntityId);
	}

	/**
	 * Returns all the order priorities.
	 *
	 * @return the order priorities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OrderPriority> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the order priorities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.OrderPriorityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of order priorities
	 * @param end the upper bound of the range of order priorities (not inclusive)
	 * @return the range of order priorities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OrderPriority> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the order priorities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.OrderPriorityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of order priorities
	 * @param end the upper bound of the range of order priorities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of order priorities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OrderPriority> findAll(int start, int end,
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

		List<OrderPriority> list = (List<OrderPriority>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ORDERPRIORITY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ORDERPRIORITY;

				if (pagination) {
					sql = sql.concat(OrderPriorityModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<OrderPriority>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<OrderPriority>(list);
				}
				else {
					list = (List<OrderPriority>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the order priorities from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (OrderPriority orderPriority : findAll()) {
			remove(orderPriority);
		}
	}

	/**
	 * Returns the number of order priorities.
	 *
	 * @return the number of order priorities
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

				Query q = session.createQuery(_SQL_COUNT_ORDERPRIORITY);

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
	 * Initializes the order priority persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.mobilekipyonetim.service.model.OrderPriority")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<OrderPriority>> listenersList = new ArrayList<ModelListener<OrderPriority>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<OrderPriority>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(OrderPriorityImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ORDERPRIORITY = "SELECT orderPriority FROM OrderPriority orderPriority";
	private static final String _SQL_COUNT_ORDERPRIORITY = "SELECT COUNT(orderPriority) FROM OrderPriority orderPriority";
	private static final String _ORDER_BY_ENTITY_ALIAS = "orderPriority.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No OrderPriority exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(OrderPriorityPersistenceImpl.class);
	private static OrderPriority _nullOrderPriority = new OrderPriorityImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<OrderPriority> toCacheModel() {
				return _nullOrderPriorityCacheModel;
			}
		};

	private static CacheModel<OrderPriority> _nullOrderPriorityCacheModel = new CacheModel<OrderPriority>() {
			@Override
			public OrderPriority toEntityModel() {
				return _nullOrderPriority;
			}
		};
}