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
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.mobilekipyonetim.service.NoSuchOrderException;
import com.mobilekipyonetim.service.model.Order;
import com.mobilekipyonetim.service.model.impl.OrderImpl;
import com.mobilekipyonetim.service.model.impl.OrderModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the order service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author 002834
 * @see OrderPersistence
 * @see OrderUtil
 * @generated
 */
public class OrderPersistenceImpl extends BasePersistenceImpl<Order>
	implements OrderPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link OrderUtil} to access the order persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = OrderImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(OrderModelImpl.ENTITY_CACHE_ENABLED,
			OrderModelImpl.FINDER_CACHE_ENABLED, OrderImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(OrderModelImpl.ENTITY_CACHE_ENABLED,
			OrderModelImpl.FINDER_CACHE_ENABLED, OrderImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(OrderModelImpl.ENTITY_CACHE_ENABLED,
			OrderModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ORGANIZATION =
		new FinderPath(OrderModelImpl.ENTITY_CACHE_ENABLED,
			OrderModelImpl.FINDER_CACHE_ENABLED, OrderImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByorganization",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATION =
		new FinderPath(OrderModelImpl.ENTITY_CACHE_ENABLED,
			OrderModelImpl.FINDER_CACHE_ENABLED, OrderImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByorganization",
			new String[] { Long.class.getName() },
			OrderModelImpl.ORGANIZATIONID_COLUMN_BITMASK |
			OrderModelImpl.DATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ORGANIZATION = new FinderPath(OrderModelImpl.ENTITY_CACHE_ENABLED,
			OrderModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByorganization",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the orders where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @return the matching orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Order> findByorganization(long organizationId)
		throws SystemException {
		return findByorganization(organizationId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the orders where organizationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.OrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationId the organization ID
	 * @param start the lower bound of the range of orders
	 * @param end the upper bound of the range of orders (not inclusive)
	 * @return the range of matching orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Order> findByorganization(long organizationId, int start,
		int end) throws SystemException {
		return findByorganization(organizationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the orders where organizationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.OrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationId the organization ID
	 * @param start the lower bound of the range of orders
	 * @param end the upper bound of the range of orders (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Order> findByorganization(long organizationId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATION;
			finderArgs = new Object[] { organizationId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ORGANIZATION;
			finderArgs = new Object[] {
					organizationId,
					
					start, end, orderByComparator
				};
		}

		List<Order> list = (List<Order>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Order order : list) {
				if ((organizationId != order.getOrganizationId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_ORDER__WHERE);

			query.append(_FINDER_COLUMN_ORGANIZATION_ORGANIZATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(OrderModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(organizationId);

				if (!pagination) {
					list = (List<Order>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Order>(list);
				}
				else {
					list = (List<Order>)QueryUtil.list(q, getDialect(), start,
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
	 * Returns the first order in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching order
	 * @throws com.mobilekipyonetim.service.NoSuchOrderException if a matching order could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Order findByorganization_First(long organizationId,
		OrderByComparator orderByComparator)
		throws NoSuchOrderException, SystemException {
		Order order = fetchByorganization_First(organizationId,
				orderByComparator);

		if (order != null) {
			return order;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("organizationId=");
		msg.append(organizationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOrderException(msg.toString());
	}

	/**
	 * Returns the first order in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching order, or <code>null</code> if a matching order could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Order fetchByorganization_First(long organizationId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Order> list = findByorganization(organizationId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last order in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching order
	 * @throws com.mobilekipyonetim.service.NoSuchOrderException if a matching order could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Order findByorganization_Last(long organizationId,
		OrderByComparator orderByComparator)
		throws NoSuchOrderException, SystemException {
		Order order = fetchByorganization_Last(organizationId, orderByComparator);

		if (order != null) {
			return order;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("organizationId=");
		msg.append(organizationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOrderException(msg.toString());
	}

	/**
	 * Returns the last order in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching order, or <code>null</code> if a matching order could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Order fetchByorganization_Last(long organizationId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByorganization(organizationId);

		if (count == 0) {
			return null;
		}

		List<Order> list = findByorganization(organizationId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the orders before and after the current order in the ordered set where organizationId = &#63;.
	 *
	 * @param orderEntityId the primary key of the current order
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next order
	 * @throws com.mobilekipyonetim.service.NoSuchOrderException if a order with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Order[] findByorganization_PrevAndNext(int orderEntityId,
		long organizationId, OrderByComparator orderByComparator)
		throws NoSuchOrderException, SystemException {
		Order order = findByPrimaryKey(orderEntityId);

		Session session = null;

		try {
			session = openSession();

			Order[] array = new OrderImpl[3];

			array[0] = getByorganization_PrevAndNext(session, order,
					organizationId, orderByComparator, true);

			array[1] = order;

			array[2] = getByorganization_PrevAndNext(session, order,
					organizationId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Order getByorganization_PrevAndNext(Session session, Order order,
		long organizationId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ORDER__WHERE);

		query.append(_FINDER_COLUMN_ORGANIZATION_ORGANIZATIONID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(OrderModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(organizationId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(order);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Order> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the orders where organizationId = &#63; from the database.
	 *
	 * @param organizationId the organization ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByorganization(long organizationId)
		throws SystemException {
		for (Order order : findByorganization(organizationId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(order);
		}
	}

	/**
	 * Returns the number of orders where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @return the number of matching orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByorganization(long organizationId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ORGANIZATION;

		Object[] finderArgs = new Object[] { organizationId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ORDER__WHERE);

			query.append(_FINDER_COLUMN_ORGANIZATION_ORGANIZATIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(organizationId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_ORGANIZATION_ORGANIZATIONID_2 = "order_.organizationId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ORGANIZATIONLIST =
		new FinderPath(OrderModelImpl.ENTITY_CACHE_ENABLED,
			OrderModelImpl.FINDER_CACHE_ENABLED, OrderImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByorganizationList",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONLIST =
		new FinderPath(OrderModelImpl.ENTITY_CACHE_ENABLED,
			OrderModelImpl.FINDER_CACHE_ENABLED, OrderImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByorganizationList", new String[] { Long.class.getName() },
			OrderModelImpl.ORGANIZATIONID_COLUMN_BITMASK |
			OrderModelImpl.DATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ORGANIZATIONLIST = new FinderPath(OrderModelImpl.ENTITY_CACHE_ENABLED,
			OrderModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByorganizationList", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_ORGANIZATIONLIST =
		new FinderPath(OrderModelImpl.ENTITY_CACHE_ENABLED,
			OrderModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByorganizationList",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the orders where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @return the matching orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Order> findByorganizationList(long organizationId)
		throws SystemException {
		return findByorganizationList(organizationId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the orders where organizationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.OrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationId the organization ID
	 * @param start the lower bound of the range of orders
	 * @param end the upper bound of the range of orders (not inclusive)
	 * @return the range of matching orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Order> findByorganizationList(long organizationId, int start,
		int end) throws SystemException {
		return findByorganizationList(organizationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the orders where organizationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.OrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationId the organization ID
	 * @param start the lower bound of the range of orders
	 * @param end the upper bound of the range of orders (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Order> findByorganizationList(long organizationId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONLIST;
			finderArgs = new Object[] { organizationId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ORGANIZATIONLIST;
			finderArgs = new Object[] {
					organizationId,
					
					start, end, orderByComparator
				};
		}

		List<Order> list = (List<Order>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Order order : list) {
				if ((organizationId != order.getOrganizationId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_ORDER__WHERE);

			query.append(_FINDER_COLUMN_ORGANIZATIONLIST_ORGANIZATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(OrderModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(organizationId);

				if (!pagination) {
					list = (List<Order>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Order>(list);
				}
				else {
					list = (List<Order>)QueryUtil.list(q, getDialect(), start,
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
	 * Returns the first order in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching order
	 * @throws com.mobilekipyonetim.service.NoSuchOrderException if a matching order could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Order findByorganizationList_First(long organizationId,
		OrderByComparator orderByComparator)
		throws NoSuchOrderException, SystemException {
		Order order = fetchByorganizationList_First(organizationId,
				orderByComparator);

		if (order != null) {
			return order;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("organizationId=");
		msg.append(organizationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOrderException(msg.toString());
	}

	/**
	 * Returns the first order in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching order, or <code>null</code> if a matching order could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Order fetchByorganizationList_First(long organizationId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Order> list = findByorganizationList(organizationId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last order in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching order
	 * @throws com.mobilekipyonetim.service.NoSuchOrderException if a matching order could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Order findByorganizationList_Last(long organizationId,
		OrderByComparator orderByComparator)
		throws NoSuchOrderException, SystemException {
		Order order = fetchByorganizationList_Last(organizationId,
				orderByComparator);

		if (order != null) {
			return order;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("organizationId=");
		msg.append(organizationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOrderException(msg.toString());
	}

	/**
	 * Returns the last order in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching order, or <code>null</code> if a matching order could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Order fetchByorganizationList_Last(long organizationId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByorganizationList(organizationId);

		if (count == 0) {
			return null;
		}

		List<Order> list = findByorganizationList(organizationId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the orders before and after the current order in the ordered set where organizationId = &#63;.
	 *
	 * @param orderEntityId the primary key of the current order
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next order
	 * @throws com.mobilekipyonetim.service.NoSuchOrderException if a order with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Order[] findByorganizationList_PrevAndNext(int orderEntityId,
		long organizationId, OrderByComparator orderByComparator)
		throws NoSuchOrderException, SystemException {
		Order order = findByPrimaryKey(orderEntityId);

		Session session = null;

		try {
			session = openSession();

			Order[] array = new OrderImpl[3];

			array[0] = getByorganizationList_PrevAndNext(session, order,
					organizationId, orderByComparator, true);

			array[1] = order;

			array[2] = getByorganizationList_PrevAndNext(session, order,
					organizationId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Order getByorganizationList_PrevAndNext(Session session,
		Order order, long organizationId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ORDER__WHERE);

		query.append(_FINDER_COLUMN_ORGANIZATIONLIST_ORGANIZATIONID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(OrderModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(organizationId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(order);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Order> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the orders where organizationId = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.OrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationIds the organization IDs
	 * @return the matching orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Order> findByorganizationList(long[] organizationIds)
		throws SystemException {
		return findByorganizationList(organizationIds, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the orders where organizationId = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.OrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationIds the organization IDs
	 * @param start the lower bound of the range of orders
	 * @param end the upper bound of the range of orders (not inclusive)
	 * @return the range of matching orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Order> findByorganizationList(long[] organizationIds,
		int start, int end) throws SystemException {
		return findByorganizationList(organizationIds, start, end, null);
	}

	/**
	 * Returns an ordered range of all the orders where organizationId = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.OrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationIds the organization IDs
	 * @param start the lower bound of the range of orders
	 * @param end the upper bound of the range of orders (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Order> findByorganizationList(long[] organizationIds,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		if ((organizationIds != null) && (organizationIds.length == 1)) {
			return findByorganizationList(organizationIds[0], start, end,
				orderByComparator);
		}

		boolean pagination = true;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderArgs = new Object[] { StringUtil.merge(organizationIds) };
		}
		else {
			finderArgs = new Object[] {
					StringUtil.merge(organizationIds),
					
					start, end, orderByComparator
				};
		}

		List<Order> list = (List<Order>)FinderCacheUtil.getResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_ORGANIZATIONLIST,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Order order : list) {
				if (!ArrayUtil.contains(organizationIds,
							order.getOrganizationId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_SELECT_ORDER__WHERE);

			boolean conjunctionable = false;

			if ((organizationIds == null) || (organizationIds.length > 0)) {
				if (conjunctionable) {
					query.append(WHERE_AND);
				}

				query.append(StringPool.OPEN_PARENTHESIS);

				for (int i = 0; i < organizationIds.length; i++) {
					query.append(_FINDER_COLUMN_ORGANIZATIONLIST_ORGANIZATIONID_5);

					if ((i + 1) < organizationIds.length) {
						query.append(WHERE_OR);
					}
				}

				query.append(StringPool.CLOSE_PARENTHESIS);

				conjunctionable = true;
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(OrderModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (organizationIds != null) {
					qPos.add(organizationIds);
				}

				if (!pagination) {
					list = (List<Order>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Order>(list);
				}
				else {
					list = (List<Order>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_ORGANIZATIONLIST,
					finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_ORGANIZATIONLIST,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the orders where organizationId = &#63; from the database.
	 *
	 * @param organizationId the organization ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByorganizationList(long organizationId)
		throws SystemException {
		for (Order order : findByorganizationList(organizationId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(order);
		}
	}

	/**
	 * Returns the number of orders where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @return the number of matching orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByorganizationList(long organizationId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ORGANIZATIONLIST;

		Object[] finderArgs = new Object[] { organizationId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ORDER__WHERE);

			query.append(_FINDER_COLUMN_ORGANIZATIONLIST_ORGANIZATIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(organizationId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of orders where organizationId = any &#63;.
	 *
	 * @param organizationIds the organization IDs
	 * @return the number of matching orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByorganizationList(long[] organizationIds)
		throws SystemException {
		Object[] finderArgs = new Object[] { StringUtil.merge(organizationIds) };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_ORGANIZATIONLIST,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_COUNT_ORDER__WHERE);

			boolean conjunctionable = false;

			if ((organizationIds == null) || (organizationIds.length > 0)) {
				if (conjunctionable) {
					query.append(WHERE_AND);
				}

				query.append(StringPool.OPEN_PARENTHESIS);

				for (int i = 0; i < organizationIds.length; i++) {
					query.append(_FINDER_COLUMN_ORGANIZATIONLIST_ORGANIZATIONID_5);

					if ((i + 1) < organizationIds.length) {
						query.append(WHERE_OR);
					}
				}

				query.append(StringPool.CLOSE_PARENTHESIS);

				conjunctionable = true;
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (organizationIds != null) {
					qPos.add(organizationIds);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_ORGANIZATIONLIST,
					finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_ORGANIZATIONLIST,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_ORGANIZATIONLIST_ORGANIZATIONID_2 =
		"order_.organizationId = ?";
	private static final String _FINDER_COLUMN_ORGANIZATIONLIST_ORGANIZATIONID_5 =
		"(" +
		removeConjunction(_FINDER_COLUMN_ORGANIZATIONLIST_ORGANIZATIONID_2) +
		")";
	public static final FinderPath FINDER_PATH_FETCH_BY_VEHICLE = new FinderPath(OrderModelImpl.ENTITY_CACHE_ENABLED,
			OrderModelImpl.FINDER_CACHE_ENABLED, OrderImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByvehicle",
			new String[] { Long.class.getName() },
			OrderModelImpl.VEHICLEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VEHICLE = new FinderPath(OrderModelImpl.ENTITY_CACHE_ENABLED,
			OrderModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByvehicle",
			new String[] { Long.class.getName() });

	/**
	 * Returns the order where vehicleId = &#63; or throws a {@link com.mobilekipyonetim.service.NoSuchOrderException} if it could not be found.
	 *
	 * @param vehicleId the vehicle ID
	 * @return the matching order
	 * @throws com.mobilekipyonetim.service.NoSuchOrderException if a matching order could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Order findByvehicle(long vehicleId)
		throws NoSuchOrderException, SystemException {
		Order order = fetchByvehicle(vehicleId);

		if (order == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("vehicleId=");
			msg.append(vehicleId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchOrderException(msg.toString());
		}

		return order;
	}

	/**
	 * Returns the order where vehicleId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param vehicleId the vehicle ID
	 * @return the matching order, or <code>null</code> if a matching order could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Order fetchByvehicle(long vehicleId) throws SystemException {
		return fetchByvehicle(vehicleId, true);
	}

	/**
	 * Returns the order where vehicleId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param vehicleId the vehicle ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching order, or <code>null</code> if a matching order could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Order fetchByvehicle(long vehicleId, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { vehicleId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_VEHICLE,
					finderArgs, this);
		}

		if (result instanceof Order) {
			Order order = (Order)result;

			if ((vehicleId != order.getVehicleId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_ORDER__WHERE);

			query.append(_FINDER_COLUMN_VEHICLE_VEHICLEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(vehicleId);

				List<Order> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VEHICLE,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"OrderPersistenceImpl.fetchByvehicle(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					Order order = list.get(0);

					result = order;

					cacheResult(order);

					if ((order.getVehicleId() != vehicleId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VEHICLE,
							finderArgs, order);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_VEHICLE,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (Order)result;
		}
	}

	/**
	 * Removes the order where vehicleId = &#63; from the database.
	 *
	 * @param vehicleId the vehicle ID
	 * @return the order that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Order removeByvehicle(long vehicleId)
		throws NoSuchOrderException, SystemException {
		Order order = findByvehicle(vehicleId);

		return remove(order);
	}

	/**
	 * Returns the number of orders where vehicleId = &#63;.
	 *
	 * @param vehicleId the vehicle ID
	 * @return the number of matching orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByvehicle(long vehicleId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_VEHICLE;

		Object[] finderArgs = new Object[] { vehicleId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ORDER__WHERE);

			query.append(_FINDER_COLUMN_VEHICLE_VEHICLEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(vehicleId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_VEHICLE_VEHICLEID_2 = "order_.vehicleId = ?";

	public OrderPersistenceImpl() {
		setModelClass(Order.class);
	}

	/**
	 * Caches the order in the entity cache if it is enabled.
	 *
	 * @param order the order
	 */
	@Override
	public void cacheResult(Order order) {
		EntityCacheUtil.putResult(OrderModelImpl.ENTITY_CACHE_ENABLED,
			OrderImpl.class, order.getPrimaryKey(), order);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VEHICLE,
			new Object[] { order.getVehicleId() }, order);

		order.resetOriginalValues();
	}

	/**
	 * Caches the orders in the entity cache if it is enabled.
	 *
	 * @param orders the orders
	 */
	@Override
	public void cacheResult(List<Order> orders) {
		for (Order order : orders) {
			if (EntityCacheUtil.getResult(OrderModelImpl.ENTITY_CACHE_ENABLED,
						OrderImpl.class, order.getPrimaryKey()) == null) {
				cacheResult(order);
			}
			else {
				order.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all orders.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(OrderImpl.class.getName());
		}

		EntityCacheUtil.clearCache(OrderImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the order.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Order order) {
		EntityCacheUtil.removeResult(OrderModelImpl.ENTITY_CACHE_ENABLED,
			OrderImpl.class, order.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(order);
	}

	@Override
	public void clearCache(List<Order> orders) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Order order : orders) {
			EntityCacheUtil.removeResult(OrderModelImpl.ENTITY_CACHE_ENABLED,
				OrderImpl.class, order.getPrimaryKey());

			clearUniqueFindersCache(order);
		}
	}

	protected void cacheUniqueFindersCache(Order order) {
		if (order.isNew()) {
			Object[] args = new Object[] { order.getVehicleId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_VEHICLE, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VEHICLE, args, order);
		}
		else {
			OrderModelImpl orderModelImpl = (OrderModelImpl)order;

			if ((orderModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_VEHICLE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { order.getVehicleId() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_VEHICLE, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VEHICLE, args,
					order);
			}
		}
	}

	protected void clearUniqueFindersCache(Order order) {
		OrderModelImpl orderModelImpl = (OrderModelImpl)order;

		Object[] args = new Object[] { order.getVehicleId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VEHICLE, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_VEHICLE, args);

		if ((orderModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_VEHICLE.getColumnBitmask()) != 0) {
			args = new Object[] { orderModelImpl.getOriginalVehicleId() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VEHICLE, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_VEHICLE, args);
		}
	}

	/**
	 * Creates a new order with the primary key. Does not add the order to the database.
	 *
	 * @param orderEntityId the primary key for the new order
	 * @return the new order
	 */
	@Override
	public Order create(int orderEntityId) {
		Order order = new OrderImpl();

		order.setNew(true);
		order.setPrimaryKey(orderEntityId);

		return order;
	}

	/**
	 * Removes the order with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param orderEntityId the primary key of the order
	 * @return the order that was removed
	 * @throws com.mobilekipyonetim.service.NoSuchOrderException if a order with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Order remove(int orderEntityId)
		throws NoSuchOrderException, SystemException {
		return remove((Serializable)orderEntityId);
	}

	/**
	 * Removes the order with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the order
	 * @return the order that was removed
	 * @throws com.mobilekipyonetim.service.NoSuchOrderException if a order with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Order remove(Serializable primaryKey)
		throws NoSuchOrderException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Order order = (Order)session.get(OrderImpl.class, primaryKey);

			if (order == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOrderException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(order);
		}
		catch (NoSuchOrderException nsee) {
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
	protected Order removeImpl(Order order) throws SystemException {
		order = toUnwrappedModel(order);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(order)) {
				order = (Order)session.get(OrderImpl.class,
						order.getPrimaryKeyObj());
			}

			if (order != null) {
				session.delete(order);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (order != null) {
			clearCache(order);
		}

		return order;
	}

	@Override
	public Order updateImpl(com.mobilekipyonetim.service.model.Order order)
		throws SystemException {
		order = toUnwrappedModel(order);

		boolean isNew = order.isNew();

		OrderModelImpl orderModelImpl = (OrderModelImpl)order;

		Session session = null;

		try {
			session = openSession();

			if (order.isNew()) {
				session.save(order);

				order.setNew(false);
			}
			else {
				session.merge(order);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !OrderModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((orderModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						orderModelImpl.getOriginalOrganizationId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ORGANIZATION,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATION,
					args);

				args = new Object[] { orderModelImpl.getOrganizationId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ORGANIZATION,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATION,
					args);
			}

			if ((orderModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONLIST.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						orderModelImpl.getOriginalOrganizationId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ORGANIZATIONLIST,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONLIST,
					args);

				args = new Object[] { orderModelImpl.getOrganizationId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ORGANIZATIONLIST,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONLIST,
					args);
			}
		}

		EntityCacheUtil.putResult(OrderModelImpl.ENTITY_CACHE_ENABLED,
			OrderImpl.class, order.getPrimaryKey(), order);

		clearUniqueFindersCache(order);
		cacheUniqueFindersCache(order);

		return order;
	}

	protected Order toUnwrappedModel(Order order) {
		if (order instanceof OrderImpl) {
			return order;
		}

		OrderImpl orderImpl = new OrderImpl();

		orderImpl.setNew(order.isNew());
		orderImpl.setPrimaryKey(order.getPrimaryKey());

		orderImpl.setOrderEntityId(order.getOrderEntityId());
		orderImpl.setGroupId(order.getGroupId());
		orderImpl.setCompanyId(order.getCompanyId());
		orderImpl.setUserId(order.getUserId());
		orderImpl.setUserName(order.getUserName());
		orderImpl.setCreateDate(order.getCreateDate());
		orderImpl.setModifiedDate(order.getModifiedDate());
		orderImpl.setOrganizationId(order.getOrganizationId());
		orderImpl.setLat(order.getLat());
		orderImpl.setLng(order.getLng());
		orderImpl.setDate(order.getDate());
		orderImpl.setAddress(order.getAddress());
		orderImpl.setIlce(order.getIlce());
		orderImpl.setMahalle(order.getMahalle());
		orderImpl.setSokak(order.getSokak());
		orderImpl.setBina(order.getBina());
		orderImpl.setVehicleId(order.getVehicleId());
		orderImpl.setStatusId(order.getStatusId());
		orderImpl.setPriorityId(order.getPriorityId());

		return orderImpl;
	}

	/**
	 * Returns the order with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the order
	 * @return the order
	 * @throws com.mobilekipyonetim.service.NoSuchOrderException if a order with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Order findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOrderException, SystemException {
		Order order = fetchByPrimaryKey(primaryKey);

		if (order == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOrderException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return order;
	}

	/**
	 * Returns the order with the primary key or throws a {@link com.mobilekipyonetim.service.NoSuchOrderException} if it could not be found.
	 *
	 * @param orderEntityId the primary key of the order
	 * @return the order
	 * @throws com.mobilekipyonetim.service.NoSuchOrderException if a order with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Order findByPrimaryKey(int orderEntityId)
		throws NoSuchOrderException, SystemException {
		return findByPrimaryKey((Serializable)orderEntityId);
	}

	/**
	 * Returns the order with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the order
	 * @return the order, or <code>null</code> if a order with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Order fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Order order = (Order)EntityCacheUtil.getResult(OrderModelImpl.ENTITY_CACHE_ENABLED,
				OrderImpl.class, primaryKey);

		if (order == _nullOrder) {
			return null;
		}

		if (order == null) {
			Session session = null;

			try {
				session = openSession();

				order = (Order)session.get(OrderImpl.class, primaryKey);

				if (order != null) {
					cacheResult(order);
				}
				else {
					EntityCacheUtil.putResult(OrderModelImpl.ENTITY_CACHE_ENABLED,
						OrderImpl.class, primaryKey, _nullOrder);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(OrderModelImpl.ENTITY_CACHE_ENABLED,
					OrderImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return order;
	}

	/**
	 * Returns the order with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param orderEntityId the primary key of the order
	 * @return the order, or <code>null</code> if a order with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Order fetchByPrimaryKey(int orderEntityId) throws SystemException {
		return fetchByPrimaryKey((Serializable)orderEntityId);
	}

	/**
	 * Returns all the orders.
	 *
	 * @return the orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Order> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the orders.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.OrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of orders
	 * @param end the upper bound of the range of orders (not inclusive)
	 * @return the range of orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Order> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the orders.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.OrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of orders
	 * @param end the upper bound of the range of orders (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of orders
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Order> findAll(int start, int end,
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

		List<Order> list = (List<Order>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ORDER_);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ORDER_;

				if (pagination) {
					sql = sql.concat(OrderModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Order>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Order>(list);
				}
				else {
					list = (List<Order>)QueryUtil.list(q, getDialect(), start,
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
	 * Removes all the orders from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Order order : findAll()) {
			remove(order);
		}
	}

	/**
	 * Returns the number of orders.
	 *
	 * @return the number of orders
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

				Query q = session.createQuery(_SQL_COUNT_ORDER_);

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

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the order persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.mobilekipyonetim.service.model.Order")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Order>> listenersList = new ArrayList<ModelListener<Order>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Order>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(OrderImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ORDER_ = "SELECT order_ FROM Order order_";
	private static final String _SQL_SELECT_ORDER__WHERE = "SELECT order_ FROM Order order_ WHERE ";
	private static final String _SQL_COUNT_ORDER_ = "SELECT COUNT(order_) FROM Order order_";
	private static final String _SQL_COUNT_ORDER__WHERE = "SELECT COUNT(order_) FROM Order order_ WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "order_.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Order exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Order exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(OrderPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"date"
			});
	private static Order _nullOrder = new OrderImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Order> toCacheModel() {
				return _nullOrderCacheModel;
			}
		};

	private static CacheModel<Order> _nullOrderCacheModel = new CacheModel<Order>() {
			@Override
			public Order toEntityModel() {
				return _nullOrder;
			}
		};
}