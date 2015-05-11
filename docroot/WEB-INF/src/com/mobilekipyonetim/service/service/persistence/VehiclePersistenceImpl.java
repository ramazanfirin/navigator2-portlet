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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.mobilekipyonetim.service.NoSuchVehicleException;
import com.mobilekipyonetim.service.model.Vehicle;
import com.mobilekipyonetim.service.model.impl.VehicleImpl;
import com.mobilekipyonetim.service.model.impl.VehicleModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the vehicle service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author 002834
 * @see VehiclePersistence
 * @see VehicleUtil
 * @generated
 */
public class VehiclePersistenceImpl extends BasePersistenceImpl<Vehicle>
	implements VehiclePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VehicleUtil} to access the vehicle persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VehicleImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VehicleModelImpl.ENTITY_CACHE_ENABLED,
			VehicleModelImpl.FINDER_CACHE_ENABLED, VehicleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VehicleModelImpl.ENTITY_CACHE_ENABLED,
			VehicleModelImpl.FINDER_CACHE_ENABLED, VehicleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VehicleModelImpl.ENTITY_CACHE_ENABLED,
			VehicleModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PLATEANDORGANIZATION =
		new FinderPath(VehicleModelImpl.ENTITY_CACHE_ENABLED,
			VehicleModelImpl.FINDER_CACHE_ENABLED, VehicleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByplateAndOrganization",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_PLATEANDORGANIZATION =
		new FinderPath(VehicleModelImpl.ENTITY_CACHE_ENABLED,
			VehicleModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"countByplateAndOrganization",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vehicles where plate LIKE &#63; and organizationId = &#63;.
	 *
	 * @param plate the plate
	 * @param organizationId the organization ID
	 * @return the matching vehicles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Vehicle> findByplateAndOrganization(String plate,
		long organizationId) throws SystemException {
		return findByplateAndOrganization(plate, organizationId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vehicles where plate LIKE &#63; and organizationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.VehicleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param plate the plate
	 * @param organizationId the organization ID
	 * @param start the lower bound of the range of vehicles
	 * @param end the upper bound of the range of vehicles (not inclusive)
	 * @return the range of matching vehicles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Vehicle> findByplateAndOrganization(String plate,
		long organizationId, int start, int end) throws SystemException {
		return findByplateAndOrganization(plate, organizationId, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the vehicles where plate LIKE &#63; and organizationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.VehicleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param plate the plate
	 * @param organizationId the organization ID
	 * @param start the lower bound of the range of vehicles
	 * @param end the upper bound of the range of vehicles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vehicles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Vehicle> findByplateAndOrganization(String plate,
		long organizationId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PLATEANDORGANIZATION;
		finderArgs = new Object[] {
				plate, organizationId,
				
				start, end, orderByComparator
			};

		List<Vehicle> list = (List<Vehicle>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Vehicle vehicle : list) {
				if (!StringUtil.wildcardMatches(vehicle.getPlate(), plate,
							CharPool.UNDERLINE, CharPool.PERCENT,
							CharPool.BACK_SLASH, true) ||
						(organizationId != vehicle.getOrganizationId())) {
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

			query.append(_SQL_SELECT_VEHICLE_WHERE);

			boolean bindPlate = false;

			if (plate == null) {
				query.append(_FINDER_COLUMN_PLATEANDORGANIZATION_PLATE_1);
			}
			else if (plate.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PLATEANDORGANIZATION_PLATE_3);
			}
			else {
				bindPlate = true;

				query.append(_FINDER_COLUMN_PLATEANDORGANIZATION_PLATE_2);
			}

			query.append(_FINDER_COLUMN_PLATEANDORGANIZATION_ORGANIZATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VehicleModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPlate) {
					qPos.add(plate);
				}

				qPos.add(organizationId);

				if (!pagination) {
					list = (List<Vehicle>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Vehicle>(list);
				}
				else {
					list = (List<Vehicle>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vehicle in the ordered set where plate LIKE &#63; and organizationId = &#63;.
	 *
	 * @param plate the plate
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vehicle
	 * @throws com.mobilekipyonetim.service.NoSuchVehicleException if a matching vehicle could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Vehicle findByplateAndOrganization_First(String plate,
		long organizationId, OrderByComparator orderByComparator)
		throws NoSuchVehicleException, SystemException {
		Vehicle vehicle = fetchByplateAndOrganization_First(plate,
				organizationId, orderByComparator);

		if (vehicle != null) {
			return vehicle;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("plate=");
		msg.append(plate);

		msg.append(", organizationId=");
		msg.append(organizationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVehicleException(msg.toString());
	}

	/**
	 * Returns the first vehicle in the ordered set where plate LIKE &#63; and organizationId = &#63;.
	 *
	 * @param plate the plate
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vehicle, or <code>null</code> if a matching vehicle could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Vehicle fetchByplateAndOrganization_First(String plate,
		long organizationId, OrderByComparator orderByComparator)
		throws SystemException {
		List<Vehicle> list = findByplateAndOrganization(plate, organizationId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vehicle in the ordered set where plate LIKE &#63; and organizationId = &#63;.
	 *
	 * @param plate the plate
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vehicle
	 * @throws com.mobilekipyonetim.service.NoSuchVehicleException if a matching vehicle could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Vehicle findByplateAndOrganization_Last(String plate,
		long organizationId, OrderByComparator orderByComparator)
		throws NoSuchVehicleException, SystemException {
		Vehicle vehicle = fetchByplateAndOrganization_Last(plate,
				organizationId, orderByComparator);

		if (vehicle != null) {
			return vehicle;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("plate=");
		msg.append(plate);

		msg.append(", organizationId=");
		msg.append(organizationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVehicleException(msg.toString());
	}

	/**
	 * Returns the last vehicle in the ordered set where plate LIKE &#63; and organizationId = &#63;.
	 *
	 * @param plate the plate
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vehicle, or <code>null</code> if a matching vehicle could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Vehicle fetchByplateAndOrganization_Last(String plate,
		long organizationId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByplateAndOrganization(plate, organizationId);

		if (count == 0) {
			return null;
		}

		List<Vehicle> list = findByplateAndOrganization(plate, organizationId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vehicles before and after the current vehicle in the ordered set where plate LIKE &#63; and organizationId = &#63;.
	 *
	 * @param vehicleEntityId the primary key of the current vehicle
	 * @param plate the plate
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vehicle
	 * @throws com.mobilekipyonetim.service.NoSuchVehicleException if a vehicle with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Vehicle[] findByplateAndOrganization_PrevAndNext(
		int vehicleEntityId, String plate, long organizationId,
		OrderByComparator orderByComparator)
		throws NoSuchVehicleException, SystemException {
		Vehicle vehicle = findByPrimaryKey(vehicleEntityId);

		Session session = null;

		try {
			session = openSession();

			Vehicle[] array = new VehicleImpl[3];

			array[0] = getByplateAndOrganization_PrevAndNext(session, vehicle,
					plate, organizationId, orderByComparator, true);

			array[1] = vehicle;

			array[2] = getByplateAndOrganization_PrevAndNext(session, vehicle,
					plate, organizationId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Vehicle getByplateAndOrganization_PrevAndNext(Session session,
		Vehicle vehicle, String plate, long organizationId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VEHICLE_WHERE);

		boolean bindPlate = false;

		if (plate == null) {
			query.append(_FINDER_COLUMN_PLATEANDORGANIZATION_PLATE_1);
		}
		else if (plate.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PLATEANDORGANIZATION_PLATE_3);
		}
		else {
			bindPlate = true;

			query.append(_FINDER_COLUMN_PLATEANDORGANIZATION_PLATE_2);
		}

		query.append(_FINDER_COLUMN_PLATEANDORGANIZATION_ORGANIZATIONID_2);

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
			query.append(VehicleModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindPlate) {
			qPos.add(plate);
		}

		qPos.add(organizationId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vehicle);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Vehicle> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vehicles where plate LIKE &#63; and organizationId = &#63; from the database.
	 *
	 * @param plate the plate
	 * @param organizationId the organization ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByplateAndOrganization(String plate, long organizationId)
		throws SystemException {
		for (Vehicle vehicle : findByplateAndOrganization(plate,
				organizationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vehicle);
		}
	}

	/**
	 * Returns the number of vehicles where plate LIKE &#63; and organizationId = &#63;.
	 *
	 * @param plate the plate
	 * @param organizationId the organization ID
	 * @return the number of matching vehicles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByplateAndOrganization(String plate, long organizationId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_WITH_PAGINATION_COUNT_BY_PLATEANDORGANIZATION;

		Object[] finderArgs = new Object[] { plate, organizationId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VEHICLE_WHERE);

			boolean bindPlate = false;

			if (plate == null) {
				query.append(_FINDER_COLUMN_PLATEANDORGANIZATION_PLATE_1);
			}
			else if (plate.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PLATEANDORGANIZATION_PLATE_3);
			}
			else {
				bindPlate = true;

				query.append(_FINDER_COLUMN_PLATEANDORGANIZATION_PLATE_2);
			}

			query.append(_FINDER_COLUMN_PLATEANDORGANIZATION_ORGANIZATIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPlate) {
					qPos.add(plate);
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

	private static final String _FINDER_COLUMN_PLATEANDORGANIZATION_PLATE_1 = "vehicle.plate LIKE NULL AND ";
	private static final String _FINDER_COLUMN_PLATEANDORGANIZATION_PLATE_2 = "vehicle.plate LIKE ? AND ";
	private static final String _FINDER_COLUMN_PLATEANDORGANIZATION_PLATE_3 = "(vehicle.plate IS NULL OR vehicle.plate LIKE '') AND ";
	private static final String _FINDER_COLUMN_PLATEANDORGANIZATION_ORGANIZATIONID_2 =
		"vehicle.organizationId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ORGANIZATION =
		new FinderPath(VehicleModelImpl.ENTITY_CACHE_ENABLED,
			VehicleModelImpl.FINDER_CACHE_ENABLED, VehicleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByorganization",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATION =
		new FinderPath(VehicleModelImpl.ENTITY_CACHE_ENABLED,
			VehicleModelImpl.FINDER_CACHE_ENABLED, VehicleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByorganization",
			new String[] { Long.class.getName() },
			VehicleModelImpl.ORGANIZATIONID_COLUMN_BITMASK |
			VehicleModelImpl.PLATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ORGANIZATION = new FinderPath(VehicleModelImpl.ENTITY_CACHE_ENABLED,
			VehicleModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByorganization",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vehicles where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @return the matching vehicles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Vehicle> findByorganization(long organizationId)
		throws SystemException {
		return findByorganization(organizationId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vehicles where organizationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.VehicleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationId the organization ID
	 * @param start the lower bound of the range of vehicles
	 * @param end the upper bound of the range of vehicles (not inclusive)
	 * @return the range of matching vehicles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Vehicle> findByorganization(long organizationId, int start,
		int end) throws SystemException {
		return findByorganization(organizationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vehicles where organizationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.VehicleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationId the organization ID
	 * @param start the lower bound of the range of vehicles
	 * @param end the upper bound of the range of vehicles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vehicles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Vehicle> findByorganization(long organizationId, int start,
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

		List<Vehicle> list = (List<Vehicle>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Vehicle vehicle : list) {
				if ((organizationId != vehicle.getOrganizationId())) {
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

			query.append(_SQL_SELECT_VEHICLE_WHERE);

			query.append(_FINDER_COLUMN_ORGANIZATION_ORGANIZATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VehicleModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(organizationId);

				if (!pagination) {
					list = (List<Vehicle>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Vehicle>(list);
				}
				else {
					list = (List<Vehicle>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vehicle in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vehicle
	 * @throws com.mobilekipyonetim.service.NoSuchVehicleException if a matching vehicle could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Vehicle findByorganization_First(long organizationId,
		OrderByComparator orderByComparator)
		throws NoSuchVehicleException, SystemException {
		Vehicle vehicle = fetchByorganization_First(organizationId,
				orderByComparator);

		if (vehicle != null) {
			return vehicle;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("organizationId=");
		msg.append(organizationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVehicleException(msg.toString());
	}

	/**
	 * Returns the first vehicle in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vehicle, or <code>null</code> if a matching vehicle could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Vehicle fetchByorganization_First(long organizationId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Vehicle> list = findByorganization(organizationId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vehicle in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vehicle
	 * @throws com.mobilekipyonetim.service.NoSuchVehicleException if a matching vehicle could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Vehicle findByorganization_Last(long organizationId,
		OrderByComparator orderByComparator)
		throws NoSuchVehicleException, SystemException {
		Vehicle vehicle = fetchByorganization_Last(organizationId,
				orderByComparator);

		if (vehicle != null) {
			return vehicle;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("organizationId=");
		msg.append(organizationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVehicleException(msg.toString());
	}

	/**
	 * Returns the last vehicle in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vehicle, or <code>null</code> if a matching vehicle could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Vehicle fetchByorganization_Last(long organizationId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByorganization(organizationId);

		if (count == 0) {
			return null;
		}

		List<Vehicle> list = findByorganization(organizationId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vehicles before and after the current vehicle in the ordered set where organizationId = &#63;.
	 *
	 * @param vehicleEntityId the primary key of the current vehicle
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vehicle
	 * @throws com.mobilekipyonetim.service.NoSuchVehicleException if a vehicle with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Vehicle[] findByorganization_PrevAndNext(int vehicleEntityId,
		long organizationId, OrderByComparator orderByComparator)
		throws NoSuchVehicleException, SystemException {
		Vehicle vehicle = findByPrimaryKey(vehicleEntityId);

		Session session = null;

		try {
			session = openSession();

			Vehicle[] array = new VehicleImpl[3];

			array[0] = getByorganization_PrevAndNext(session, vehicle,
					organizationId, orderByComparator, true);

			array[1] = vehicle;

			array[2] = getByorganization_PrevAndNext(session, vehicle,
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

	protected Vehicle getByorganization_PrevAndNext(Session session,
		Vehicle vehicle, long organizationId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VEHICLE_WHERE);

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
			query.append(VehicleModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(organizationId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vehicle);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Vehicle> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vehicles where organizationId = &#63; from the database.
	 *
	 * @param organizationId the organization ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByorganization(long organizationId)
		throws SystemException {
		for (Vehicle vehicle : findByorganization(organizationId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vehicle);
		}
	}

	/**
	 * Returns the number of vehicles where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @return the number of matching vehicles
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

			query.append(_SQL_COUNT_VEHICLE_WHERE);

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

	private static final String _FINDER_COLUMN_ORGANIZATION_ORGANIZATIONID_2 = "vehicle.organizationId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ORGANIZATIONLIST =
		new FinderPath(VehicleModelImpl.ENTITY_CACHE_ENABLED,
			VehicleModelImpl.FINDER_CACHE_ENABLED, VehicleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByorganizationList",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONLIST =
		new FinderPath(VehicleModelImpl.ENTITY_CACHE_ENABLED,
			VehicleModelImpl.FINDER_CACHE_ENABLED, VehicleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByorganizationList", new String[] { Long.class.getName() },
			VehicleModelImpl.ORGANIZATIONID_COLUMN_BITMASK |
			VehicleModelImpl.PLATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ORGANIZATIONLIST = new FinderPath(VehicleModelImpl.ENTITY_CACHE_ENABLED,
			VehicleModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByorganizationList", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_ORGANIZATIONLIST =
		new FinderPath(VehicleModelImpl.ENTITY_CACHE_ENABLED,
			VehicleModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByorganizationList",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vehicles where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @return the matching vehicles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Vehicle> findByorganizationList(long organizationId)
		throws SystemException {
		return findByorganizationList(organizationId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vehicles where organizationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.VehicleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationId the organization ID
	 * @param start the lower bound of the range of vehicles
	 * @param end the upper bound of the range of vehicles (not inclusive)
	 * @return the range of matching vehicles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Vehicle> findByorganizationList(long organizationId, int start,
		int end) throws SystemException {
		return findByorganizationList(organizationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vehicles where organizationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.VehicleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationId the organization ID
	 * @param start the lower bound of the range of vehicles
	 * @param end the upper bound of the range of vehicles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vehicles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Vehicle> findByorganizationList(long organizationId, int start,
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

		List<Vehicle> list = (List<Vehicle>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Vehicle vehicle : list) {
				if ((organizationId != vehicle.getOrganizationId())) {
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

			query.append(_SQL_SELECT_VEHICLE_WHERE);

			query.append(_FINDER_COLUMN_ORGANIZATIONLIST_ORGANIZATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VehicleModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(organizationId);

				if (!pagination) {
					list = (List<Vehicle>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Vehicle>(list);
				}
				else {
					list = (List<Vehicle>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vehicle in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vehicle
	 * @throws com.mobilekipyonetim.service.NoSuchVehicleException if a matching vehicle could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Vehicle findByorganizationList_First(long organizationId,
		OrderByComparator orderByComparator)
		throws NoSuchVehicleException, SystemException {
		Vehicle vehicle = fetchByorganizationList_First(organizationId,
				orderByComparator);

		if (vehicle != null) {
			return vehicle;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("organizationId=");
		msg.append(organizationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVehicleException(msg.toString());
	}

	/**
	 * Returns the first vehicle in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vehicle, or <code>null</code> if a matching vehicle could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Vehicle fetchByorganizationList_First(long organizationId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Vehicle> list = findByorganizationList(organizationId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vehicle in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vehicle
	 * @throws com.mobilekipyonetim.service.NoSuchVehicleException if a matching vehicle could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Vehicle findByorganizationList_Last(long organizationId,
		OrderByComparator orderByComparator)
		throws NoSuchVehicleException, SystemException {
		Vehicle vehicle = fetchByorganizationList_Last(organizationId,
				orderByComparator);

		if (vehicle != null) {
			return vehicle;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("organizationId=");
		msg.append(organizationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVehicleException(msg.toString());
	}

	/**
	 * Returns the last vehicle in the ordered set where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vehicle, or <code>null</code> if a matching vehicle could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Vehicle fetchByorganizationList_Last(long organizationId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByorganizationList(organizationId);

		if (count == 0) {
			return null;
		}

		List<Vehicle> list = findByorganizationList(organizationId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vehicles before and after the current vehicle in the ordered set where organizationId = &#63;.
	 *
	 * @param vehicleEntityId the primary key of the current vehicle
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vehicle
	 * @throws com.mobilekipyonetim.service.NoSuchVehicleException if a vehicle with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Vehicle[] findByorganizationList_PrevAndNext(int vehicleEntityId,
		long organizationId, OrderByComparator orderByComparator)
		throws NoSuchVehicleException, SystemException {
		Vehicle vehicle = findByPrimaryKey(vehicleEntityId);

		Session session = null;

		try {
			session = openSession();

			Vehicle[] array = new VehicleImpl[3];

			array[0] = getByorganizationList_PrevAndNext(session, vehicle,
					organizationId, orderByComparator, true);

			array[1] = vehicle;

			array[2] = getByorganizationList_PrevAndNext(session, vehicle,
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

	protected Vehicle getByorganizationList_PrevAndNext(Session session,
		Vehicle vehicle, long organizationId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VEHICLE_WHERE);

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
			query.append(VehicleModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(organizationId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vehicle);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Vehicle> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the vehicles where organizationId = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.VehicleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationIds the organization IDs
	 * @return the matching vehicles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Vehicle> findByorganizationList(long[] organizationIds)
		throws SystemException {
		return findByorganizationList(organizationIds, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vehicles where organizationId = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.VehicleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationIds the organization IDs
	 * @param start the lower bound of the range of vehicles
	 * @param end the upper bound of the range of vehicles (not inclusive)
	 * @return the range of matching vehicles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Vehicle> findByorganizationList(long[] organizationIds,
		int start, int end) throws SystemException {
		return findByorganizationList(organizationIds, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vehicles where organizationId = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.VehicleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param organizationIds the organization IDs
	 * @param start the lower bound of the range of vehicles
	 * @param end the upper bound of the range of vehicles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vehicles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Vehicle> findByorganizationList(long[] organizationIds,
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

		List<Vehicle> list = (List<Vehicle>)FinderCacheUtil.getResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_ORGANIZATIONLIST,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Vehicle vehicle : list) {
				if (!ArrayUtil.contains(organizationIds,
							vehicle.getOrganizationId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_SELECT_VEHICLE_WHERE);

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
				query.append(VehicleModelImpl.ORDER_BY_JPQL);
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
					list = (List<Vehicle>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Vehicle>(list);
				}
				else {
					list = (List<Vehicle>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes all the vehicles where organizationId = &#63; from the database.
	 *
	 * @param organizationId the organization ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByorganizationList(long organizationId)
		throws SystemException {
		for (Vehicle vehicle : findByorganizationList(organizationId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vehicle);
		}
	}

	/**
	 * Returns the number of vehicles where organizationId = &#63;.
	 *
	 * @param organizationId the organization ID
	 * @return the number of matching vehicles
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

			query.append(_SQL_COUNT_VEHICLE_WHERE);

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
	 * Returns the number of vehicles where organizationId = any &#63;.
	 *
	 * @param organizationIds the organization IDs
	 * @return the number of matching vehicles
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

			query.append(_SQL_COUNT_VEHICLE_WHERE);

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
		"vehicle.organizationId = ?";
	private static final String _FINDER_COLUMN_ORGANIZATIONLIST_ORGANIZATIONID_5 =
		"(" +
		removeConjunction(_FINDER_COLUMN_ORGANIZATIONLIST_ORGANIZATIONID_2) +
		")";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PLATEANDORGANIZATIONLIST =
		new FinderPath(VehicleModelImpl.ENTITY_CACHE_ENABLED,
			VehicleModelImpl.FINDER_CACHE_ENABLED, VehicleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByplateAndOrganizationList",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_PLATEANDORGANIZATIONLIST =
		new FinderPath(VehicleModelImpl.ENTITY_CACHE_ENABLED,
			VehicleModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"countByplateAndOrganizationList",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vehicles where plate LIKE &#63; and organizationId = &#63;.
	 *
	 * @param plate the plate
	 * @param organizationId the organization ID
	 * @return the matching vehicles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Vehicle> findByplateAndOrganizationList(String plate,
		long organizationId) throws SystemException {
		return findByplateAndOrganizationList(plate, organizationId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vehicles where plate LIKE &#63; and organizationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.VehicleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param plate the plate
	 * @param organizationId the organization ID
	 * @param start the lower bound of the range of vehicles
	 * @param end the upper bound of the range of vehicles (not inclusive)
	 * @return the range of matching vehicles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Vehicle> findByplateAndOrganizationList(String plate,
		long organizationId, int start, int end) throws SystemException {
		return findByplateAndOrganizationList(plate, organizationId, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the vehicles where plate LIKE &#63; and organizationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.VehicleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param plate the plate
	 * @param organizationId the organization ID
	 * @param start the lower bound of the range of vehicles
	 * @param end the upper bound of the range of vehicles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vehicles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Vehicle> findByplateAndOrganizationList(String plate,
		long organizationId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PLATEANDORGANIZATIONLIST;
		finderArgs = new Object[] {
				plate, organizationId,
				
				start, end, orderByComparator
			};

		List<Vehicle> list = (List<Vehicle>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Vehicle vehicle : list) {
				if (!StringUtil.wildcardMatches(vehicle.getPlate(), plate,
							CharPool.UNDERLINE, CharPool.PERCENT,
							CharPool.BACK_SLASH, true) ||
						(organizationId != vehicle.getOrganizationId())) {
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

			query.append(_SQL_SELECT_VEHICLE_WHERE);

			boolean bindPlate = false;

			if (plate == null) {
				query.append(_FINDER_COLUMN_PLATEANDORGANIZATIONLIST_PLATE_1);
			}
			else if (plate.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PLATEANDORGANIZATIONLIST_PLATE_3);
			}
			else {
				bindPlate = true;

				query.append(_FINDER_COLUMN_PLATEANDORGANIZATIONLIST_PLATE_2);
			}

			query.append(_FINDER_COLUMN_PLATEANDORGANIZATIONLIST_ORGANIZATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VehicleModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPlate) {
					qPos.add(plate);
				}

				qPos.add(organizationId);

				if (!pagination) {
					list = (List<Vehicle>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Vehicle>(list);
				}
				else {
					list = (List<Vehicle>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vehicle in the ordered set where plate LIKE &#63; and organizationId = &#63;.
	 *
	 * @param plate the plate
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vehicle
	 * @throws com.mobilekipyonetim.service.NoSuchVehicleException if a matching vehicle could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Vehicle findByplateAndOrganizationList_First(String plate,
		long organizationId, OrderByComparator orderByComparator)
		throws NoSuchVehicleException, SystemException {
		Vehicle vehicle = fetchByplateAndOrganizationList_First(plate,
				organizationId, orderByComparator);

		if (vehicle != null) {
			return vehicle;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("plate=");
		msg.append(plate);

		msg.append(", organizationId=");
		msg.append(organizationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVehicleException(msg.toString());
	}

	/**
	 * Returns the first vehicle in the ordered set where plate LIKE &#63; and organizationId = &#63;.
	 *
	 * @param plate the plate
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vehicle, or <code>null</code> if a matching vehicle could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Vehicle fetchByplateAndOrganizationList_First(String plate,
		long organizationId, OrderByComparator orderByComparator)
		throws SystemException {
		List<Vehicle> list = findByplateAndOrganizationList(plate,
				organizationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vehicle in the ordered set where plate LIKE &#63; and organizationId = &#63;.
	 *
	 * @param plate the plate
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vehicle
	 * @throws com.mobilekipyonetim.service.NoSuchVehicleException if a matching vehicle could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Vehicle findByplateAndOrganizationList_Last(String plate,
		long organizationId, OrderByComparator orderByComparator)
		throws NoSuchVehicleException, SystemException {
		Vehicle vehicle = fetchByplateAndOrganizationList_Last(plate,
				organizationId, orderByComparator);

		if (vehicle != null) {
			return vehicle;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("plate=");
		msg.append(plate);

		msg.append(", organizationId=");
		msg.append(organizationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVehicleException(msg.toString());
	}

	/**
	 * Returns the last vehicle in the ordered set where plate LIKE &#63; and organizationId = &#63;.
	 *
	 * @param plate the plate
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vehicle, or <code>null</code> if a matching vehicle could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Vehicle fetchByplateAndOrganizationList_Last(String plate,
		long organizationId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByplateAndOrganizationList(plate, organizationId);

		if (count == 0) {
			return null;
		}

		List<Vehicle> list = findByplateAndOrganizationList(plate,
				organizationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vehicles before and after the current vehicle in the ordered set where plate LIKE &#63; and organizationId = &#63;.
	 *
	 * @param vehicleEntityId the primary key of the current vehicle
	 * @param plate the plate
	 * @param organizationId the organization ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vehicle
	 * @throws com.mobilekipyonetim.service.NoSuchVehicleException if a vehicle with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Vehicle[] findByplateAndOrganizationList_PrevAndNext(
		int vehicleEntityId, String plate, long organizationId,
		OrderByComparator orderByComparator)
		throws NoSuchVehicleException, SystemException {
		Vehicle vehicle = findByPrimaryKey(vehicleEntityId);

		Session session = null;

		try {
			session = openSession();

			Vehicle[] array = new VehicleImpl[3];

			array[0] = getByplateAndOrganizationList_PrevAndNext(session,
					vehicle, plate, organizationId, orderByComparator, true);

			array[1] = vehicle;

			array[2] = getByplateAndOrganizationList_PrevAndNext(session,
					vehicle, plate, organizationId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Vehicle getByplateAndOrganizationList_PrevAndNext(
		Session session, Vehicle vehicle, String plate, long organizationId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VEHICLE_WHERE);

		boolean bindPlate = false;

		if (plate == null) {
			query.append(_FINDER_COLUMN_PLATEANDORGANIZATIONLIST_PLATE_1);
		}
		else if (plate.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PLATEANDORGANIZATIONLIST_PLATE_3);
		}
		else {
			bindPlate = true;

			query.append(_FINDER_COLUMN_PLATEANDORGANIZATIONLIST_PLATE_2);
		}

		query.append(_FINDER_COLUMN_PLATEANDORGANIZATIONLIST_ORGANIZATIONID_2);

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
			query.append(VehicleModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindPlate) {
			qPos.add(plate);
		}

		qPos.add(organizationId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vehicle);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Vehicle> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the vehicles where plate LIKE &#63; and organizationId = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.VehicleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param plate the plate
	 * @param organizationIds the organization IDs
	 * @return the matching vehicles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Vehicle> findByplateAndOrganizationList(String plate,
		long[] organizationIds) throws SystemException {
		return findByplateAndOrganizationList(plate, organizationIds,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vehicles where plate LIKE &#63; and organizationId = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.VehicleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param plate the plate
	 * @param organizationIds the organization IDs
	 * @param start the lower bound of the range of vehicles
	 * @param end the upper bound of the range of vehicles (not inclusive)
	 * @return the range of matching vehicles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Vehicle> findByplateAndOrganizationList(String plate,
		long[] organizationIds, int start, int end) throws SystemException {
		return findByplateAndOrganizationList(plate, organizationIds, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the vehicles where plate LIKE &#63; and organizationId = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.VehicleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param plate the plate
	 * @param organizationIds the organization IDs
	 * @param start the lower bound of the range of vehicles
	 * @param end the upper bound of the range of vehicles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vehicles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Vehicle> findByplateAndOrganizationList(String plate,
		long[] organizationIds, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		if ((organizationIds != null) && (organizationIds.length == 1)) {
			return findByplateAndOrganizationList(plate, organizationIds[0],
				start, end, orderByComparator);
		}

		boolean pagination = true;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderArgs = new Object[] { plate, StringUtil.merge(organizationIds) };
		}
		else {
			finderArgs = new Object[] {
					plate, StringUtil.merge(organizationIds),
					
					start, end, orderByComparator
				};
		}

		List<Vehicle> list = (List<Vehicle>)FinderCacheUtil.getResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_PLATEANDORGANIZATIONLIST,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Vehicle vehicle : list) {
				if (!Validator.equals(plate, vehicle.getPlate()) ||
						!ArrayUtil.contains(organizationIds,
							vehicle.getOrganizationId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_SELECT_VEHICLE_WHERE);

			boolean conjunctionable = false;

			if (conjunctionable) {
				query.append(WHERE_AND);
			}

			boolean bindPlate = false;

			if (plate == null) {
				query.append(_FINDER_COLUMN_PLATEANDORGANIZATIONLIST_PLATE_4);
			}
			else if (plate.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PLATEANDORGANIZATIONLIST_PLATE_6);
			}
			else {
				bindPlate = true;

				query.append(_FINDER_COLUMN_PLATEANDORGANIZATIONLIST_PLATE_5);
			}

			conjunctionable = true;

			if ((organizationIds == null) || (organizationIds.length > 0)) {
				if (conjunctionable) {
					query.append(WHERE_AND);
				}

				query.append(StringPool.OPEN_PARENTHESIS);

				for (int i = 0; i < organizationIds.length; i++) {
					query.append(_FINDER_COLUMN_PLATEANDORGANIZATIONLIST_ORGANIZATIONID_5);

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
				query.append(VehicleModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPlate) {
					qPos.add(plate);
				}

				if (organizationIds != null) {
					qPos.add(organizationIds);
				}

				if (!pagination) {
					list = (List<Vehicle>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Vehicle>(list);
				}
				else {
					list = (List<Vehicle>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_PLATEANDORGANIZATIONLIST,
					finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_PLATEANDORGANIZATIONLIST,
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
	 * Removes all the vehicles where plate LIKE &#63; and organizationId = &#63; from the database.
	 *
	 * @param plate the plate
	 * @param organizationId the organization ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByplateAndOrganizationList(String plate,
		long organizationId) throws SystemException {
		for (Vehicle vehicle : findByplateAndOrganizationList(plate,
				organizationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vehicle);
		}
	}

	/**
	 * Returns the number of vehicles where plate LIKE &#63; and organizationId = &#63;.
	 *
	 * @param plate the plate
	 * @param organizationId the organization ID
	 * @return the number of matching vehicles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByplateAndOrganizationList(String plate, long organizationId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_WITH_PAGINATION_COUNT_BY_PLATEANDORGANIZATIONLIST;

		Object[] finderArgs = new Object[] { plate, organizationId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VEHICLE_WHERE);

			boolean bindPlate = false;

			if (plate == null) {
				query.append(_FINDER_COLUMN_PLATEANDORGANIZATIONLIST_PLATE_1);
			}
			else if (plate.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PLATEANDORGANIZATIONLIST_PLATE_3);
			}
			else {
				bindPlate = true;

				query.append(_FINDER_COLUMN_PLATEANDORGANIZATIONLIST_PLATE_2);
			}

			query.append(_FINDER_COLUMN_PLATEANDORGANIZATIONLIST_ORGANIZATIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPlate) {
					qPos.add(plate);
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

	/**
	 * Returns the number of vehicles where plate LIKE &#63; and organizationId = any &#63;.
	 *
	 * @param plate the plate
	 * @param organizationIds the organization IDs
	 * @return the number of matching vehicles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByplateAndOrganizationList(String plate,
		long[] organizationIds) throws SystemException {
		Object[] finderArgs = new Object[] {
				plate, StringUtil.merge(organizationIds)
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_PLATEANDORGANIZATIONLIST,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_COUNT_VEHICLE_WHERE);

			boolean conjunctionable = false;

			if (conjunctionable) {
				query.append(WHERE_AND);
			}

			boolean bindPlate = false;

			if (plate == null) {
				query.append(_FINDER_COLUMN_PLATEANDORGANIZATIONLIST_PLATE_4);
			}
			else if (plate.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PLATEANDORGANIZATIONLIST_PLATE_6);
			}
			else {
				bindPlate = true;

				query.append(_FINDER_COLUMN_PLATEANDORGANIZATIONLIST_PLATE_5);
			}

			conjunctionable = true;

			if ((organizationIds == null) || (organizationIds.length > 0)) {
				if (conjunctionable) {
					query.append(WHERE_AND);
				}

				query.append(StringPool.OPEN_PARENTHESIS);

				for (int i = 0; i < organizationIds.length; i++) {
					query.append(_FINDER_COLUMN_PLATEANDORGANIZATIONLIST_ORGANIZATIONID_5);

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

				if (bindPlate) {
					qPos.add(plate);
				}

				if (organizationIds != null) {
					qPos.add(organizationIds);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_PLATEANDORGANIZATIONLIST,
					finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_PLATEANDORGANIZATIONLIST,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_PLATEANDORGANIZATIONLIST_PLATE_1 = "vehicle.plate LIKE NULL AND ";
	private static final String _FINDER_COLUMN_PLATEANDORGANIZATIONLIST_PLATE_2 = "vehicle.plate LIKE ? AND ";
	private static final String _FINDER_COLUMN_PLATEANDORGANIZATIONLIST_PLATE_3 = "(vehicle.plate IS NULL OR vehicle.plate LIKE '') AND ";
	private static final String _FINDER_COLUMN_PLATEANDORGANIZATIONLIST_PLATE_4 = "(" +
		removeConjunction(_FINDER_COLUMN_PLATEANDORGANIZATIONLIST_PLATE_1) +
		")";
	private static final String _FINDER_COLUMN_PLATEANDORGANIZATIONLIST_PLATE_5 = "(" +
		removeConjunction(_FINDER_COLUMN_PLATEANDORGANIZATIONLIST_PLATE_2) +
		")";
	private static final String _FINDER_COLUMN_PLATEANDORGANIZATIONLIST_PLATE_6 = "(" +
		removeConjunction(_FINDER_COLUMN_PLATEANDORGANIZATIONLIST_PLATE_3) +
		")";
	private static final String _FINDER_COLUMN_PLATEANDORGANIZATIONLIST_ORGANIZATIONID_2 =
		"vehicle.organizationId = ?";
	private static final String _FINDER_COLUMN_PLATEANDORGANIZATIONLIST_ORGANIZATIONID_5 =
		"(" +
		removeConjunction(_FINDER_COLUMN_PLATEANDORGANIZATIONLIST_ORGANIZATIONID_2) +
		")";

	public VehiclePersistenceImpl() {
		setModelClass(Vehicle.class);
	}

	/**
	 * Caches the vehicle in the entity cache if it is enabled.
	 *
	 * @param vehicle the vehicle
	 */
	@Override
	public void cacheResult(Vehicle vehicle) {
		EntityCacheUtil.putResult(VehicleModelImpl.ENTITY_CACHE_ENABLED,
			VehicleImpl.class, vehicle.getPrimaryKey(), vehicle);

		vehicle.resetOriginalValues();
	}

	/**
	 * Caches the vehicles in the entity cache if it is enabled.
	 *
	 * @param vehicles the vehicles
	 */
	@Override
	public void cacheResult(List<Vehicle> vehicles) {
		for (Vehicle vehicle : vehicles) {
			if (EntityCacheUtil.getResult(
						VehicleModelImpl.ENTITY_CACHE_ENABLED,
						VehicleImpl.class, vehicle.getPrimaryKey()) == null) {
				cacheResult(vehicle);
			}
			else {
				vehicle.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vehicles.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(VehicleImpl.class.getName());
		}

		EntityCacheUtil.clearCache(VehicleImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vehicle.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Vehicle vehicle) {
		EntityCacheUtil.removeResult(VehicleModelImpl.ENTITY_CACHE_ENABLED,
			VehicleImpl.class, vehicle.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Vehicle> vehicles) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Vehicle vehicle : vehicles) {
			EntityCacheUtil.removeResult(VehicleModelImpl.ENTITY_CACHE_ENABLED,
				VehicleImpl.class, vehicle.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vehicle with the primary key. Does not add the vehicle to the database.
	 *
	 * @param vehicleEntityId the primary key for the new vehicle
	 * @return the new vehicle
	 */
	@Override
	public Vehicle create(int vehicleEntityId) {
		Vehicle vehicle = new VehicleImpl();

		vehicle.setNew(true);
		vehicle.setPrimaryKey(vehicleEntityId);

		return vehicle;
	}

	/**
	 * Removes the vehicle with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param vehicleEntityId the primary key of the vehicle
	 * @return the vehicle that was removed
	 * @throws com.mobilekipyonetim.service.NoSuchVehicleException if a vehicle with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Vehicle remove(int vehicleEntityId)
		throws NoSuchVehicleException, SystemException {
		return remove((Serializable)vehicleEntityId);
	}

	/**
	 * Removes the vehicle with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vehicle
	 * @return the vehicle that was removed
	 * @throws com.mobilekipyonetim.service.NoSuchVehicleException if a vehicle with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Vehicle remove(Serializable primaryKey)
		throws NoSuchVehicleException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Vehicle vehicle = (Vehicle)session.get(VehicleImpl.class, primaryKey);

			if (vehicle == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVehicleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vehicle);
		}
		catch (NoSuchVehicleException nsee) {
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
	protected Vehicle removeImpl(Vehicle vehicle) throws SystemException {
		vehicle = toUnwrappedModel(vehicle);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vehicle)) {
				vehicle = (Vehicle)session.get(VehicleImpl.class,
						vehicle.getPrimaryKeyObj());
			}

			if (vehicle != null) {
				session.delete(vehicle);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vehicle != null) {
			clearCache(vehicle);
		}

		return vehicle;
	}

	@Override
	public Vehicle updateImpl(
		com.mobilekipyonetim.service.model.Vehicle vehicle)
		throws SystemException {
		vehicle = toUnwrappedModel(vehicle);

		boolean isNew = vehicle.isNew();

		VehicleModelImpl vehicleModelImpl = (VehicleModelImpl)vehicle;

		Session session = null;

		try {
			session = openSession();

			if (vehicle.isNew()) {
				session.save(vehicle);

				vehicle.setNew(false);
			}
			else {
				session.merge(vehicle);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VehicleModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vehicleModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vehicleModelImpl.getOriginalOrganizationId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ORGANIZATION,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATION,
					args);

				args = new Object[] { vehicleModelImpl.getOrganizationId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ORGANIZATION,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATION,
					args);
			}

			if ((vehicleModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONLIST.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vehicleModelImpl.getOriginalOrganizationId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ORGANIZATIONLIST,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONLIST,
					args);

				args = new Object[] { vehicleModelImpl.getOrganizationId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ORGANIZATIONLIST,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORGANIZATIONLIST,
					args);
			}
		}

		EntityCacheUtil.putResult(VehicleModelImpl.ENTITY_CACHE_ENABLED,
			VehicleImpl.class, vehicle.getPrimaryKey(), vehicle);

		return vehicle;
	}

	protected Vehicle toUnwrappedModel(Vehicle vehicle) {
		if (vehicle instanceof VehicleImpl) {
			return vehicle;
		}

		VehicleImpl vehicleImpl = new VehicleImpl();

		vehicleImpl.setNew(vehicle.isNew());
		vehicleImpl.setPrimaryKey(vehicle.getPrimaryKey());

		vehicleImpl.setVehicleEntityId(vehicle.getVehicleEntityId());
		vehicleImpl.setGroupId(vehicle.getGroupId());
		vehicleImpl.setCompanyId(vehicle.getCompanyId());
		vehicleImpl.setUserId(vehicle.getUserId());
		vehicleImpl.setUserName(vehicle.getUserName());
		vehicleImpl.setCreateDate(vehicle.getCreateDate());
		vehicleImpl.setModifiedDate(vehicle.getModifiedDate());
		vehicleImpl.setPlate(vehicle.getPlate());
		vehicleImpl.setOrganizationId(vehicle.getOrganizationId());
		vehicleImpl.setDeviceId(vehicle.getDeviceId());

		return vehicleImpl;
	}

	/**
	 * Returns the vehicle with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vehicle
	 * @return the vehicle
	 * @throws com.mobilekipyonetim.service.NoSuchVehicleException if a vehicle with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Vehicle findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVehicleException, SystemException {
		Vehicle vehicle = fetchByPrimaryKey(primaryKey);

		if (vehicle == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVehicleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vehicle;
	}

	/**
	 * Returns the vehicle with the primary key or throws a {@link com.mobilekipyonetim.service.NoSuchVehicleException} if it could not be found.
	 *
	 * @param vehicleEntityId the primary key of the vehicle
	 * @return the vehicle
	 * @throws com.mobilekipyonetim.service.NoSuchVehicleException if a vehicle with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Vehicle findByPrimaryKey(int vehicleEntityId)
		throws NoSuchVehicleException, SystemException {
		return findByPrimaryKey((Serializable)vehicleEntityId);
	}

	/**
	 * Returns the vehicle with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vehicle
	 * @return the vehicle, or <code>null</code> if a vehicle with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Vehicle fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Vehicle vehicle = (Vehicle)EntityCacheUtil.getResult(VehicleModelImpl.ENTITY_CACHE_ENABLED,
				VehicleImpl.class, primaryKey);

		if (vehicle == _nullVehicle) {
			return null;
		}

		if (vehicle == null) {
			Session session = null;

			try {
				session = openSession();

				vehicle = (Vehicle)session.get(VehicleImpl.class, primaryKey);

				if (vehicle != null) {
					cacheResult(vehicle);
				}
				else {
					EntityCacheUtil.putResult(VehicleModelImpl.ENTITY_CACHE_ENABLED,
						VehicleImpl.class, primaryKey, _nullVehicle);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(VehicleModelImpl.ENTITY_CACHE_ENABLED,
					VehicleImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vehicle;
	}

	/**
	 * Returns the vehicle with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param vehicleEntityId the primary key of the vehicle
	 * @return the vehicle, or <code>null</code> if a vehicle with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Vehicle fetchByPrimaryKey(int vehicleEntityId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)vehicleEntityId);
	}

	/**
	 * Returns all the vehicles.
	 *
	 * @return the vehicles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Vehicle> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vehicles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.VehicleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vehicles
	 * @param end the upper bound of the range of vehicles (not inclusive)
	 * @return the range of vehicles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Vehicle> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vehicles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.VehicleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vehicles
	 * @param end the upper bound of the range of vehicles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vehicles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Vehicle> findAll(int start, int end,
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

		List<Vehicle> list = (List<Vehicle>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VEHICLE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VEHICLE;

				if (pagination) {
					sql = sql.concat(VehicleModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Vehicle>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Vehicle>(list);
				}
				else {
					list = (List<Vehicle>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the vehicles from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Vehicle vehicle : findAll()) {
			remove(vehicle);
		}
	}

	/**
	 * Returns the number of vehicles.
	 *
	 * @return the number of vehicles
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

				Query q = session.createQuery(_SQL_COUNT_VEHICLE);

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
	 * Initializes the vehicle persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.mobilekipyonetim.service.model.Vehicle")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Vehicle>> listenersList = new ArrayList<ModelListener<Vehicle>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Vehicle>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(VehicleImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_VEHICLE = "SELECT vehicle FROM Vehicle vehicle";
	private static final String _SQL_SELECT_VEHICLE_WHERE = "SELECT vehicle FROM Vehicle vehicle WHERE ";
	private static final String _SQL_COUNT_VEHICLE = "SELECT COUNT(vehicle) FROM Vehicle vehicle";
	private static final String _SQL_COUNT_VEHICLE_WHERE = "SELECT COUNT(vehicle) FROM Vehicle vehicle WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vehicle.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Vehicle exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Vehicle exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(VehiclePersistenceImpl.class);
	private static Vehicle _nullVehicle = new VehicleImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Vehicle> toCacheModel() {
				return _nullVehicleCacheModel;
			}
		};

	private static CacheModel<Vehicle> _nullVehicleCacheModel = new CacheModel<Vehicle>() {
			@Override
			public Vehicle toEntityModel() {
				return _nullVehicle;
			}
		};
}