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
import com.liferay.portal.kernel.util.CharPool;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.mobilekipyonetim.service.NoSuchPoiException;
import com.mobilekipyonetim.service.model.Poi;
import com.mobilekipyonetim.service.model.impl.PoiImpl;
import com.mobilekipyonetim.service.model.impl.PoiModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the poi service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author 002834
 * @see PoiPersistence
 * @see PoiUtil
 * @generated
 */
public class PoiPersistenceImpl extends BasePersistenceImpl<Poi>
	implements PoiPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PoiUtil} to access the poi persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PoiImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PoiModelImpl.ENTITY_CACHE_ENABLED,
			PoiModelImpl.FINDER_CACHE_ENABLED, PoiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PoiModelImpl.ENTITY_CACHE_ENABLED,
			PoiModelImpl.FINDER_CACHE_ENABLED, PoiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PoiModelImpl.ENTITY_CACHE_ENABLED,
			PoiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NAMEANDORGANIZATIONID =
		new FinderPath(PoiModelImpl.ENTITY_CACHE_ENABLED,
			PoiModelImpl.FINDER_CACHE_ENABLED, PoiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBynameAndOrganizationId",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_NAMEANDORGANIZATIONID =
		new FinderPath(PoiModelImpl.ENTITY_CACHE_ENABLED,
			PoiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"countBynameAndOrganizationId",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the pois where name LIKE &#63; and organizationId = &#63;.
	 *
	 * @param name the name
	 * @param organizationId the organization ID
	 * @return the matching pois
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Poi> findBynameAndOrganizationId(String name,
		long organizationId) throws SystemException {
		return findBynameAndOrganizationId(name, organizationId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pois where name LIKE &#63; and organizationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.PoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param name the name
	 * @param organizationId the organization ID
	 * @param start the lower bound of the range of pois
	 * @param end the upper bound of the range of pois (not inclusive)
	 * @return the range of matching pois
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Poi> findBynameAndOrganizationId(String name,
		long organizationId, int start, int end) throws SystemException {
		return findBynameAndOrganizationId(name, organizationId, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the pois where name LIKE &#63; and organizationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.PoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param name the name
	 * @param organizationId the organization ID
	 * @param start the lower bound of the range of pois
	 * @param end the upper bound of the range of pois (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pois
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Poi> findBynameAndOrganizationId(String name,
		long organizationId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NAMEANDORGANIZATIONID;
		finderArgs = new Object[] {
				name, organizationId,
				
				start, end, orderByComparator
			};

		List<Poi> list = (List<Poi>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Poi poi : list) {
				if (!StringUtil.wildcardMatches(poi.getName(), name,
							CharPool.UNDERLINE, CharPool.PERCENT,
							CharPool.BACK_SLASH, true) ||
						(organizationId != poi.getOrganizationId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_POI_WHERE);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_NAMEANDORGANIZATIONID_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NAMEANDORGANIZATIONID_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_NAMEANDORGANIZATIONID_NAME_2);
			}

			query.append(_FINDER_COLUMN_NAMEANDORGANIZATIONID_ORGANIZATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PoiModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindName) {
					qPos.add(name);
				}

				qPos.add(organizationId);

				if (!pagination) {
					list = (List<Poi>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Poi>(list);
				}
				else {
					list = (List<Poi>)QueryUtil.list(q, getDialect(), start, end);
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
	 * Returns the first poi in the ordered set where name LIKE &#63; and organizationId = &#63;.
	 *
	 * @param name the name
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching poi
	 * @throws com.mobilekipyonetim.service.NoSuchPoiException if a matching poi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Poi findBynameAndOrganizationId_First(String name,
		long organizationId, OrderByComparator orderByComparator)
		throws NoSuchPoiException, SystemException {
		Poi poi = fetchBynameAndOrganizationId_First(name, organizationId,
				orderByComparator);

		if (poi != null) {
			return poi;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("name=");
		msg.append(name);

		msg.append(", organizationId=");
		msg.append(organizationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPoiException(msg.toString());
	}

	/**
	 * Returns the first poi in the ordered set where name LIKE &#63; and organizationId = &#63;.
	 *
	 * @param name the name
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching poi, or <code>null</code> if a matching poi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Poi fetchBynameAndOrganizationId_First(String name,
		long organizationId, OrderByComparator orderByComparator)
		throws SystemException {
		List<Poi> list = findBynameAndOrganizationId(name, organizationId, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last poi in the ordered set where name LIKE &#63; and organizationId = &#63;.
	 *
	 * @param name the name
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching poi
	 * @throws com.mobilekipyonetim.service.NoSuchPoiException if a matching poi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Poi findBynameAndOrganizationId_Last(String name,
		long organizationId, OrderByComparator orderByComparator)
		throws NoSuchPoiException, SystemException {
		Poi poi = fetchBynameAndOrganizationId_Last(name, organizationId,
				orderByComparator);

		if (poi != null) {
			return poi;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("name=");
		msg.append(name);

		msg.append(", organizationId=");
		msg.append(organizationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPoiException(msg.toString());
	}

	/**
	 * Returns the last poi in the ordered set where name LIKE &#63; and organizationId = &#63;.
	 *
	 * @param name the name
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching poi, or <code>null</code> if a matching poi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Poi fetchBynameAndOrganizationId_Last(String name,
		long organizationId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBynameAndOrganizationId(name, organizationId);

		if (count == 0) {
			return null;
		}

		List<Poi> list = findBynameAndOrganizationId(name, organizationId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the pois before and after the current poi in the ordered set where name LIKE &#63; and organizationId = &#63;.
	 *
	 * @param poiEntityId the primary key of the current poi
	 * @param name the name
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next poi
	 * @throws com.mobilekipyonetim.service.NoSuchPoiException if a poi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Poi[] findBynameAndOrganizationId_PrevAndNext(int poiEntityId,
		String name, long organizationId, OrderByComparator orderByComparator)
		throws NoSuchPoiException, SystemException {
		Poi poi = findByPrimaryKey(poiEntityId);

		Session session = null;

		try {
			session = openSession();

			Poi[] array = new PoiImpl[3];

			array[0] = getBynameAndOrganizationId_PrevAndNext(session, poi,
					name, organizationId, orderByComparator, true);

			array[1] = poi;

			array[2] = getBynameAndOrganizationId_PrevAndNext(session, poi,
					name, organizationId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Poi getBynameAndOrganizationId_PrevAndNext(Session session,
		Poi poi, String name, long organizationId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_POI_WHERE);

		boolean bindName = false;

		if (name == null) {
			query.append(_FINDER_COLUMN_NAMEANDORGANIZATIONID_NAME_1);
		}
		else if (name.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_NAMEANDORGANIZATIONID_NAME_3);
		}
		else {
			bindName = true;

			query.append(_FINDER_COLUMN_NAMEANDORGANIZATIONID_NAME_2);
		}

		query.append(_FINDER_COLUMN_NAMEANDORGANIZATIONID_ORGANIZATIONID_2);

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
			query.append(PoiModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindName) {
			qPos.add(name);
		}

		qPos.add(organizationId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(poi);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Poi> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the pois where name LIKE &#63; and organizationId = &#63; from the database.
	 *
	 * @param name the name
	 * @param organizationId the organization ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBynameAndOrganizationId(String name, long organizationId)
		throws SystemException {
		for (Poi poi : findBynameAndOrganizationId(name, organizationId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(poi);
		}
	}

	/**
	 * Returns the number of pois where name LIKE &#63; and organizationId = &#63;.
	 *
	 * @param name the name
	 * @param organizationId the organization ID
	 * @return the number of matching pois
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBynameAndOrganizationId(String name, long organizationId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_WITH_PAGINATION_COUNT_BY_NAMEANDORGANIZATIONID;

		Object[] finderArgs = new Object[] { name, organizationId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_POI_WHERE);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_NAMEANDORGANIZATIONID_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NAMEANDORGANIZATIONID_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_NAMEANDORGANIZATIONID_NAME_2);
			}

			query.append(_FINDER_COLUMN_NAMEANDORGANIZATIONID_ORGANIZATIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindName) {
					qPos.add(name);
				}

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

	private static final String _FINDER_COLUMN_NAMEANDORGANIZATIONID_NAME_1 = "poi.name LIKE NULL AND ";
	private static final String _FINDER_COLUMN_NAMEANDORGANIZATIONID_NAME_2 = "poi.name LIKE ? AND ";
	private static final String _FINDER_COLUMN_NAMEANDORGANIZATIONID_NAME_3 = "(poi.name IS NULL OR poi.name LIKE '') AND ";
	private static final String _FINDER_COLUMN_NAMEANDORGANIZATIONID_ORGANIZATIONID_2 =
		"poi.organizationId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ORGANIZATIONID =
		new FinderPath(PoiModelImpl.ENTITY_CACHE_ENABLED,
			PoiModelImpl.FINDER_CACHE_ENABLED, PoiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByorganizationId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONID =
		new FinderPath(PoiModelImpl.ENTITY_CACHE_ENABLED,
			PoiModelImpl.FINDER_CACHE_ENABLED, PoiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByorganizationId",
			new String[] { Long.class.getName() },
			PoiModelImpl.ORGANIZATIONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ORGANIZATIONID = new FinderPath(PoiModelImpl.ENTITY_CACHE_ENABLED,
			PoiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByorganizationId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the pois where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @return the matching pois
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Poi> findByorganizationId(long organizationId)
		throws SystemException {
		return findByorganizationId(organizationId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pois where organizationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.PoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationId the organization ID
	 * @param start the lower bound of the range of pois
	 * @param end the upper bound of the range of pois (not inclusive)
	 * @return the range of matching pois
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Poi> findByorganizationId(long organizationId, int start,
		int end) throws SystemException {
		return findByorganizationId(organizationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the pois where organizationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.PoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationId the organization ID
	 * @param start the lower bound of the range of pois
	 * @param end the upper bound of the range of pois (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pois
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Poi> findByorganizationId(long organizationId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONID;
			finderArgs = new Object[] { organizationId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ORGANIZATIONID;
			finderArgs = new Object[] {
					organizationId,
					
					start, end, orderByComparator
				};
		}

		List<Poi> list = (List<Poi>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Poi poi : list) {
				if ((organizationId != poi.getOrganizationId())) {
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

			query.append(_SQL_SELECT_POI_WHERE);

			query.append(_FINDER_COLUMN_ORGANIZATIONID_ORGANIZATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PoiModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(organizationId);

				if (!pagination) {
					list = (List<Poi>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Poi>(list);
				}
				else {
					list = (List<Poi>)QueryUtil.list(q, getDialect(), start, end);
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
	 * Returns the first poi in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching poi
	 * @throws com.mobilekipyonetim.service.NoSuchPoiException if a matching poi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Poi findByorganizationId_First(long organizationId,
		OrderByComparator orderByComparator)
		throws NoSuchPoiException, SystemException {
		Poi poi = fetchByorganizationId_First(organizationId, orderByComparator);

		if (poi != null) {
			return poi;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("organizationId=");
		msg.append(organizationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPoiException(msg.toString());
	}

	/**
	 * Returns the first poi in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching poi, or <code>null</code> if a matching poi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Poi fetchByorganizationId_First(long organizationId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Poi> list = findByorganizationId(organizationId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last poi in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching poi
	 * @throws com.mobilekipyonetim.service.NoSuchPoiException if a matching poi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Poi findByorganizationId_Last(long organizationId,
		OrderByComparator orderByComparator)
		throws NoSuchPoiException, SystemException {
		Poi poi = fetchByorganizationId_Last(organizationId, orderByComparator);

		if (poi != null) {
			return poi;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("organizationId=");
		msg.append(organizationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPoiException(msg.toString());
	}

	/**
	 * Returns the last poi in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching poi, or <code>null</code> if a matching poi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Poi fetchByorganizationId_Last(long organizationId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByorganizationId(organizationId);

		if (count == 0) {
			return null;
		}

		List<Poi> list = findByorganizationId(organizationId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the pois before and after the current poi in the ordered set where organizationId = &#63;.
	 *
	 * @param poiEntityId the primary key of the current poi
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next poi
	 * @throws com.mobilekipyonetim.service.NoSuchPoiException if a poi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Poi[] findByorganizationId_PrevAndNext(int poiEntityId,
		long organizationId, OrderByComparator orderByComparator)
		throws NoSuchPoiException, SystemException {
		Poi poi = findByPrimaryKey(poiEntityId);

		Session session = null;

		try {
			session = openSession();

			Poi[] array = new PoiImpl[3];

			array[0] = getByorganizationId_PrevAndNext(session, poi,
					organizationId, orderByComparator, true);

			array[1] = poi;

			array[2] = getByorganizationId_PrevAndNext(session, poi,
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

	protected Poi getByorganizationId_PrevAndNext(Session session, Poi poi,
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

		query.append(_SQL_SELECT_POI_WHERE);

		query.append(_FINDER_COLUMN_ORGANIZATIONID_ORGANIZATIONID_2);

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
			query.append(PoiModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(organizationId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(poi);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Poi> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the pois where organizationId = &#63; from the database.
	 *
	 * @param organizationId the organization ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByorganizationId(long organizationId)
		throws SystemException {
		for (Poi poi : findByorganizationId(organizationId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(poi);
		}
	}

	/**
	 * Returns the number of pois where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @return the number of matching pois
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByorganizationId(long organizationId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ORGANIZATIONID;

		Object[] finderArgs = new Object[] { organizationId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_POI_WHERE);

			query.append(_FINDER_COLUMN_ORGANIZATIONID_ORGANIZATIONID_2);

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

	private static final String _FINDER_COLUMN_ORGANIZATIONID_ORGANIZATIONID_2 = "poi.organizationId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ORGANIZATIONIDLIST =
		new FinderPath(PoiModelImpl.ENTITY_CACHE_ENABLED,
			PoiModelImpl.FINDER_CACHE_ENABLED, PoiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByorganizationIdList",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONIDLIST =
		new FinderPath(PoiModelImpl.ENTITY_CACHE_ENABLED,
			PoiModelImpl.FINDER_CACHE_ENABLED, PoiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByorganizationIdList", new String[] { Long.class.getName() },
			PoiModelImpl.ORGANIZATIONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ORGANIZATIONIDLIST = new FinderPath(PoiModelImpl.ENTITY_CACHE_ENABLED,
			PoiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByorganizationIdList", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_ORGANIZATIONIDLIST =
		new FinderPath(PoiModelImpl.ENTITY_CACHE_ENABLED,
			PoiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"countByorganizationIdList", new String[] { Long.class.getName() });

	/**
	 * Returns all the pois where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @return the matching pois
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Poi> findByorganizationIdList(long organizationId)
		throws SystemException {
		return findByorganizationIdList(organizationId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pois where organizationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.PoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationId the organization ID
	 * @param start the lower bound of the range of pois
	 * @param end the upper bound of the range of pois (not inclusive)
	 * @return the range of matching pois
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Poi> findByorganizationIdList(long organizationId, int start,
		int end) throws SystemException {
		return findByorganizationIdList(organizationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the pois where organizationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.PoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationId the organization ID
	 * @param start the lower bound of the range of pois
	 * @param end the upper bound of the range of pois (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pois
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Poi> findByorganizationIdList(long organizationId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONIDLIST;
			finderArgs = new Object[] { organizationId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ORGANIZATIONIDLIST;
			finderArgs = new Object[] {
					organizationId,
					
					start, end, orderByComparator
				};
		}

		List<Poi> list = (List<Poi>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Poi poi : list) {
				if ((organizationId != poi.getOrganizationId())) {
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

			query.append(_SQL_SELECT_POI_WHERE);

			query.append(_FINDER_COLUMN_ORGANIZATIONIDLIST_ORGANIZATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PoiModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(organizationId);

				if (!pagination) {
					list = (List<Poi>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Poi>(list);
				}
				else {
					list = (List<Poi>)QueryUtil.list(q, getDialect(), start, end);
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
	 * Returns the first poi in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching poi
	 * @throws com.mobilekipyonetim.service.NoSuchPoiException if a matching poi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Poi findByorganizationIdList_First(long organizationId,
		OrderByComparator orderByComparator)
		throws NoSuchPoiException, SystemException {
		Poi poi = fetchByorganizationIdList_First(organizationId,
				orderByComparator);

		if (poi != null) {
			return poi;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("organizationId=");
		msg.append(organizationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPoiException(msg.toString());
	}

	/**
	 * Returns the first poi in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching poi, or <code>null</code> if a matching poi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Poi fetchByorganizationIdList_First(long organizationId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Poi> list = findByorganizationIdList(organizationId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last poi in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching poi
	 * @throws com.mobilekipyonetim.service.NoSuchPoiException if a matching poi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Poi findByorganizationIdList_Last(long organizationId,
		OrderByComparator orderByComparator)
		throws NoSuchPoiException, SystemException {
		Poi poi = fetchByorganizationIdList_Last(organizationId,
				orderByComparator);

		if (poi != null) {
			return poi;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("organizationId=");
		msg.append(organizationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPoiException(msg.toString());
	}

	/**
	 * Returns the last poi in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching poi, or <code>null</code> if a matching poi could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Poi fetchByorganizationIdList_Last(long organizationId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByorganizationIdList(organizationId);

		if (count == 0) {
			return null;
		}

		List<Poi> list = findByorganizationIdList(organizationId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the pois before and after the current poi in the ordered set where organizationId = &#63;.
	 *
	 * @param poiEntityId the primary key of the current poi
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next poi
	 * @throws com.mobilekipyonetim.service.NoSuchPoiException if a poi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Poi[] findByorganizationIdList_PrevAndNext(int poiEntityId,
		long organizationId, OrderByComparator orderByComparator)
		throws NoSuchPoiException, SystemException {
		Poi poi = findByPrimaryKey(poiEntityId);

		Session session = null;

		try {
			session = openSession();

			Poi[] array = new PoiImpl[3];

			array[0] = getByorganizationIdList_PrevAndNext(session, poi,
					organizationId, orderByComparator, true);

			array[1] = poi;

			array[2] = getByorganizationIdList_PrevAndNext(session, poi,
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

	protected Poi getByorganizationIdList_PrevAndNext(Session session, Poi poi,
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

		query.append(_SQL_SELECT_POI_WHERE);

		query.append(_FINDER_COLUMN_ORGANIZATIONIDLIST_ORGANIZATIONID_2);

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
			query.append(PoiModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(organizationId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(poi);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Poi> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the pois where organizationId = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.PoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationIds the organization IDs
	 * @return the matching pois
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Poi> findByorganizationIdList(long[] organizationIds)
		throws SystemException {
		return findByorganizationIdList(organizationIds, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pois where organizationId = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.PoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationIds the organization IDs
	 * @param start the lower bound of the range of pois
	 * @param end the upper bound of the range of pois (not inclusive)
	 * @return the range of matching pois
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Poi> findByorganizationIdList(long[] organizationIds,
		int start, int end) throws SystemException {
		return findByorganizationIdList(organizationIds, start, end, null);
	}

	/**
	 * Returns an ordered range of all the pois where organizationId = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.PoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationIds the organization IDs
	 * @param start the lower bound of the range of pois
	 * @param end the upper bound of the range of pois (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pois
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Poi> findByorganizationIdList(long[] organizationIds,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		if ((organizationIds != null) && (organizationIds.length == 1)) {
			return findByorganizationIdList(organizationIds[0], start, end,
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

		List<Poi> list = (List<Poi>)FinderCacheUtil.getResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_ORGANIZATIONIDLIST,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Poi poi : list) {
				if (!ArrayUtil.contains(organizationIds, poi.getOrganizationId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_SELECT_POI_WHERE);

			boolean conjunctionable = false;

			if ((organizationIds == null) || (organizationIds.length > 0)) {
				if (conjunctionable) {
					query.append(WHERE_AND);
				}

				query.append(StringPool.OPEN_PARENTHESIS);

				for (int i = 0; i < organizationIds.length; i++) {
					query.append(_FINDER_COLUMN_ORGANIZATIONIDLIST_ORGANIZATIONID_5);

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
				query.append(PoiModelImpl.ORDER_BY_JPQL);
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
					list = (List<Poi>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Poi>(list);
				}
				else {
					list = (List<Poi>)QueryUtil.list(q, getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_ORGANIZATIONIDLIST,
					finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_ORGANIZATIONIDLIST,
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
	 * Removes all the pois where organizationId = &#63; from the database.
	 *
	 * @param organizationId the organization ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByorganizationIdList(long organizationId)
		throws SystemException {
		for (Poi poi : findByorganizationIdList(organizationId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(poi);
		}
	}

	/**
	 * Returns the number of pois where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @return the number of matching pois
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByorganizationIdList(long organizationId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ORGANIZATIONIDLIST;

		Object[] finderArgs = new Object[] { organizationId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_POI_WHERE);

			query.append(_FINDER_COLUMN_ORGANIZATIONIDLIST_ORGANIZATIONID_2);

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
	 * Returns the number of pois where organizationId = any &#63;.
	 *
	 * @param organizationIds the organization IDs
	 * @return the number of matching pois
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByorganizationIdList(long[] organizationIds)
		throws SystemException {
		Object[] finderArgs = new Object[] { StringUtil.merge(organizationIds) };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_ORGANIZATIONIDLIST,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_COUNT_POI_WHERE);

			boolean conjunctionable = false;

			if ((organizationIds == null) || (organizationIds.length > 0)) {
				if (conjunctionable) {
					query.append(WHERE_AND);
				}

				query.append(StringPool.OPEN_PARENTHESIS);

				for (int i = 0; i < organizationIds.length; i++) {
					query.append(_FINDER_COLUMN_ORGANIZATIONIDLIST_ORGANIZATIONID_5);

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

				FinderCacheUtil.putResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_ORGANIZATIONIDLIST,
					finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_ORGANIZATIONIDLIST,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_ORGANIZATIONIDLIST_ORGANIZATIONID_2 =
		"poi.organizationId = ?";
	private static final String _FINDER_COLUMN_ORGANIZATIONIDLIST_ORGANIZATIONID_5 =
		"(" +
		removeConjunction(_FINDER_COLUMN_ORGANIZATIONIDLIST_ORGANIZATIONID_2) +
		")";

	public PoiPersistenceImpl() {
		setModelClass(Poi.class);
	}

	/**
	 * Caches the poi in the entity cache if it is enabled.
	 *
	 * @param poi the poi
	 */
	@Override
	public void cacheResult(Poi poi) {
		EntityCacheUtil.putResult(PoiModelImpl.ENTITY_CACHE_ENABLED,
			PoiImpl.class, poi.getPrimaryKey(), poi);

		poi.resetOriginalValues();
	}

	/**
	 * Caches the pois in the entity cache if it is enabled.
	 *
	 * @param pois the pois
	 */
	@Override
	public void cacheResult(List<Poi> pois) {
		for (Poi poi : pois) {
			if (EntityCacheUtil.getResult(PoiModelImpl.ENTITY_CACHE_ENABLED,
						PoiImpl.class, poi.getPrimaryKey()) == null) {
				cacheResult(poi);
			}
			else {
				poi.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all pois.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PoiImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PoiImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the poi.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Poi poi) {
		EntityCacheUtil.removeResult(PoiModelImpl.ENTITY_CACHE_ENABLED,
			PoiImpl.class, poi.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Poi> pois) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Poi poi : pois) {
			EntityCacheUtil.removeResult(PoiModelImpl.ENTITY_CACHE_ENABLED,
				PoiImpl.class, poi.getPrimaryKey());
		}
	}

	/**
	 * Creates a new poi with the primary key. Does not add the poi to the database.
	 *
	 * @param poiEntityId the primary key for the new poi
	 * @return the new poi
	 */
	@Override
	public Poi create(int poiEntityId) {
		Poi poi = new PoiImpl();

		poi.setNew(true);
		poi.setPrimaryKey(poiEntityId);

		return poi;
	}

	/**
	 * Removes the poi with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param poiEntityId the primary key of the poi
	 * @return the poi that was removed
	 * @throws com.mobilekipyonetim.service.NoSuchPoiException if a poi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Poi remove(int poiEntityId)
		throws NoSuchPoiException, SystemException {
		return remove((Serializable)poiEntityId);
	}

	/**
	 * Removes the poi with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the poi
	 * @return the poi that was removed
	 * @throws com.mobilekipyonetim.service.NoSuchPoiException if a poi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Poi remove(Serializable primaryKey)
		throws NoSuchPoiException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Poi poi = (Poi)session.get(PoiImpl.class, primaryKey);

			if (poi == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPoiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(poi);
		}
		catch (NoSuchPoiException nsee) {
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
	protected Poi removeImpl(Poi poi) throws SystemException {
		poi = toUnwrappedModel(poi);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(poi)) {
				poi = (Poi)session.get(PoiImpl.class, poi.getPrimaryKeyObj());
			}

			if (poi != null) {
				session.delete(poi);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (poi != null) {
			clearCache(poi);
		}

		return poi;
	}

	@Override
	public Poi updateImpl(com.mobilekipyonetim.service.model.Poi poi)
		throws SystemException {
		poi = toUnwrappedModel(poi);

		boolean isNew = poi.isNew();

		PoiModelImpl poiModelImpl = (PoiModelImpl)poi;

		Session session = null;

		try {
			session = openSession();

			if (poi.isNew()) {
				session.save(poi);

				poi.setNew(false);
			}
			else {
				session.merge(poi);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !PoiModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((poiModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						poiModelImpl.getOriginalOrganizationId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ORGANIZATIONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONID,
					args);

				args = new Object[] { poiModelImpl.getOrganizationId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ORGANIZATIONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONID,
					args);
			}

			if ((poiModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONIDLIST.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						poiModelImpl.getOriginalOrganizationId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ORGANIZATIONIDLIST,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONIDLIST,
					args);

				args = new Object[] { poiModelImpl.getOrganizationId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ORGANIZATIONIDLIST,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONIDLIST,
					args);
			}
		}

		EntityCacheUtil.putResult(PoiModelImpl.ENTITY_CACHE_ENABLED,
			PoiImpl.class, poi.getPrimaryKey(), poi);

		return poi;
	}

	protected Poi toUnwrappedModel(Poi poi) {
		if (poi instanceof PoiImpl) {
			return poi;
		}

		PoiImpl poiImpl = new PoiImpl();

		poiImpl.setNew(poi.isNew());
		poiImpl.setPrimaryKey(poi.getPrimaryKey());

		poiImpl.setPoiEntityId(poi.getPoiEntityId());
		poiImpl.setGroupId(poi.getGroupId());
		poiImpl.setCompanyId(poi.getCompanyId());
		poiImpl.setUserId(poi.getUserId());
		poiImpl.setUserName(poi.getUserName());
		poiImpl.setCreateDate(poi.getCreateDate());
		poiImpl.setModifiedDate(poi.getModifiedDate());
		poiImpl.setOrganizationId(poi.getOrganizationId());
		poiImpl.setName(poi.getName());
		poiImpl.setLat(poi.getLat());
		poiImpl.setLng(poi.getLng());

		return poiImpl;
	}

	/**
	 * Returns the poi with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the poi
	 * @return the poi
	 * @throws com.mobilekipyonetim.service.NoSuchPoiException if a poi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Poi findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPoiException, SystemException {
		Poi poi = fetchByPrimaryKey(primaryKey);

		if (poi == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPoiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return poi;
	}

	/**
	 * Returns the poi with the primary key or throws a {@link com.mobilekipyonetim.service.NoSuchPoiException} if it could not be found.
	 *
	 * @param poiEntityId the primary key of the poi
	 * @return the poi
	 * @throws com.mobilekipyonetim.service.NoSuchPoiException if a poi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Poi findByPrimaryKey(int poiEntityId)
		throws NoSuchPoiException, SystemException {
		return findByPrimaryKey((Serializable)poiEntityId);
	}

	/**
	 * Returns the poi with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the poi
	 * @return the poi, or <code>null</code> if a poi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Poi fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Poi poi = (Poi)EntityCacheUtil.getResult(PoiModelImpl.ENTITY_CACHE_ENABLED,
				PoiImpl.class, primaryKey);

		if (poi == _nullPoi) {
			return null;
		}

		if (poi == null) {
			Session session = null;

			try {
				session = openSession();

				poi = (Poi)session.get(PoiImpl.class, primaryKey);

				if (poi != null) {
					cacheResult(poi);
				}
				else {
					EntityCacheUtil.putResult(PoiModelImpl.ENTITY_CACHE_ENABLED,
						PoiImpl.class, primaryKey, _nullPoi);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PoiModelImpl.ENTITY_CACHE_ENABLED,
					PoiImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return poi;
	}

	/**
	 * Returns the poi with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param poiEntityId the primary key of the poi
	 * @return the poi, or <code>null</code> if a poi with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Poi fetchByPrimaryKey(int poiEntityId) throws SystemException {
		return fetchByPrimaryKey((Serializable)poiEntityId);
	}

	/**
	 * Returns all the pois.
	 *
	 * @return the pois
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Poi> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pois.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.PoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of pois
	 * @param end the upper bound of the range of pois (not inclusive)
	 * @return the range of pois
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Poi> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the pois.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.PoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of pois
	 * @param end the upper bound of the range of pois (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pois
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Poi> findAll(int start, int end,
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

		List<Poi> list = (List<Poi>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_POI);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_POI;

				if (pagination) {
					sql = sql.concat(PoiModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Poi>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Poi>(list);
				}
				else {
					list = (List<Poi>)QueryUtil.list(q, getDialect(), start, end);
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
	 * Removes all the pois from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Poi poi : findAll()) {
			remove(poi);
		}
	}

	/**
	 * Returns the number of pois.
	 *
	 * @return the number of pois
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

				Query q = session.createQuery(_SQL_COUNT_POI);

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
	 * Initializes the poi persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.mobilekipyonetim.service.model.Poi")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Poi>> listenersList = new ArrayList<ModelListener<Poi>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Poi>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PoiImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_POI = "SELECT poi FROM Poi poi";
	private static final String _SQL_SELECT_POI_WHERE = "SELECT poi FROM Poi poi WHERE ";
	private static final String _SQL_COUNT_POI = "SELECT COUNT(poi) FROM Poi poi";
	private static final String _SQL_COUNT_POI_WHERE = "SELECT COUNT(poi) FROM Poi poi WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "poi.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Poi exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Poi exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PoiPersistenceImpl.class);
	private static Poi _nullPoi = new PoiImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Poi> toCacheModel() {
				return _nullPoiCacheModel;
			}
		};

	private static CacheModel<Poi> _nullPoiCacheModel = new CacheModel<Poi>() {
			@Override
			public Poi toEntityModel() {
				return _nullPoi;
			}
		};
}