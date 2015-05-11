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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.mobilekipyonetim.service.model.Vehicle;

import java.util.List;

/**
 * The persistence utility for the vehicle service. This utility wraps {@link VehiclePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author 002834
 * @see VehiclePersistence
 * @see VehiclePersistenceImpl
 * @generated
 */
public class VehicleUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Vehicle vehicle) {
		getPersistence().clearCache(vehicle);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Vehicle> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Vehicle> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Vehicle> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Vehicle update(Vehicle vehicle) throws SystemException {
		return getPersistence().update(vehicle);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Vehicle update(Vehicle vehicle, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(vehicle, serviceContext);
	}

	/**
	* Returns all the vehicles where plate LIKE &#63; and organizationId = &#63;.
	*
	* @param plate the plate
	* @param organizationId the organization ID
	* @return the matching vehicles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.mobilekipyonetim.service.model.Vehicle> findByplateAndOrganization(
		java.lang.String plate, long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByplateAndOrganization(plate, organizationId);
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
	public static java.util.List<com.mobilekipyonetim.service.model.Vehicle> findByplateAndOrganization(
		java.lang.String plate, long organizationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByplateAndOrganization(plate, organizationId, start, end);
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
	public static java.util.List<com.mobilekipyonetim.service.model.Vehicle> findByplateAndOrganization(
		java.lang.String plate, long organizationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByplateAndOrganization(plate, organizationId, start,
			end, orderByComparator);
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
	public static com.mobilekipyonetim.service.model.Vehicle findByplateAndOrganization_First(
		java.lang.String plate, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchVehicleException {
		return getPersistence()
				   .findByplateAndOrganization_First(plate, organizationId,
			orderByComparator);
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
	public static com.mobilekipyonetim.service.model.Vehicle fetchByplateAndOrganization_First(
		java.lang.String plate, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByplateAndOrganization_First(plate, organizationId,
			orderByComparator);
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
	public static com.mobilekipyonetim.service.model.Vehicle findByplateAndOrganization_Last(
		java.lang.String plate, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchVehicleException {
		return getPersistence()
				   .findByplateAndOrganization_Last(plate, organizationId,
			orderByComparator);
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
	public static com.mobilekipyonetim.service.model.Vehicle fetchByplateAndOrganization_Last(
		java.lang.String plate, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByplateAndOrganization_Last(plate, organizationId,
			orderByComparator);
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
	public static com.mobilekipyonetim.service.model.Vehicle[] findByplateAndOrganization_PrevAndNext(
		int vehicleEntityId, java.lang.String plate, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchVehicleException {
		return getPersistence()
				   .findByplateAndOrganization_PrevAndNext(vehicleEntityId,
			plate, organizationId, orderByComparator);
	}

	/**
	* Removes all the vehicles where plate LIKE &#63; and organizationId = &#63; from the database.
	*
	* @param plate the plate
	* @param organizationId the organization ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByplateAndOrganization(java.lang.String plate,
		long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByplateAndOrganization(plate, organizationId);
	}

	/**
	* Returns the number of vehicles where plate LIKE &#63; and organizationId = &#63;.
	*
	* @param plate the plate
	* @param organizationId the organization ID
	* @return the number of matching vehicles
	* @throws SystemException if a system exception occurred
	*/
	public static int countByplateAndOrganization(java.lang.String plate,
		long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByplateAndOrganization(plate, organizationId);
	}

	/**
	* Returns all the vehicles where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @return the matching vehicles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.mobilekipyonetim.service.model.Vehicle> findByorganization(
		long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByorganization(organizationId);
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
	public static java.util.List<com.mobilekipyonetim.service.model.Vehicle> findByorganization(
		long organizationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByorganization(organizationId, start, end);
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
	public static java.util.List<com.mobilekipyonetim.service.model.Vehicle> findByorganization(
		long organizationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByorganization(organizationId, start, end,
			orderByComparator);
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
	public static com.mobilekipyonetim.service.model.Vehicle findByorganization_First(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchVehicleException {
		return getPersistence()
				   .findByorganization_First(organizationId, orderByComparator);
	}

	/**
	* Returns the first vehicle in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle, or <code>null</code> if a matching vehicle could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.mobilekipyonetim.service.model.Vehicle fetchByorganization_First(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByorganization_First(organizationId, orderByComparator);
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
	public static com.mobilekipyonetim.service.model.Vehicle findByorganization_Last(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchVehicleException {
		return getPersistence()
				   .findByorganization_Last(organizationId, orderByComparator);
	}

	/**
	* Returns the last vehicle in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle, or <code>null</code> if a matching vehicle could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.mobilekipyonetim.service.model.Vehicle fetchByorganization_Last(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByorganization_Last(organizationId, orderByComparator);
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
	public static com.mobilekipyonetim.service.model.Vehicle[] findByorganization_PrevAndNext(
		int vehicleEntityId, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchVehicleException {
		return getPersistence()
				   .findByorganization_PrevAndNext(vehicleEntityId,
			organizationId, orderByComparator);
	}

	/**
	* Removes all the vehicles where organizationId = &#63; from the database.
	*
	* @param organizationId the organization ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByorganization(long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByorganization(organizationId);
	}

	/**
	* Returns the number of vehicles where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @return the number of matching vehicles
	* @throws SystemException if a system exception occurred
	*/
	public static int countByorganization(long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByorganization(organizationId);
	}

	/**
	* Returns all the vehicles where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @return the matching vehicles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.mobilekipyonetim.service.model.Vehicle> findByorganizationList(
		long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByorganizationList(organizationId);
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
	public static java.util.List<com.mobilekipyonetim.service.model.Vehicle> findByorganizationList(
		long organizationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByorganizationList(organizationId, start, end);
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
	public static java.util.List<com.mobilekipyonetim.service.model.Vehicle> findByorganizationList(
		long organizationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByorganizationList(organizationId, start, end,
			orderByComparator);
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
	public static com.mobilekipyonetim.service.model.Vehicle findByorganizationList_First(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchVehicleException {
		return getPersistence()
				   .findByorganizationList_First(organizationId,
			orderByComparator);
	}

	/**
	* Returns the first vehicle in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle, or <code>null</code> if a matching vehicle could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.mobilekipyonetim.service.model.Vehicle fetchByorganizationList_First(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByorganizationList_First(organizationId,
			orderByComparator);
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
	public static com.mobilekipyonetim.service.model.Vehicle findByorganizationList_Last(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchVehicleException {
		return getPersistence()
				   .findByorganizationList_Last(organizationId,
			orderByComparator);
	}

	/**
	* Returns the last vehicle in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle, or <code>null</code> if a matching vehicle could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.mobilekipyonetim.service.model.Vehicle fetchByorganizationList_Last(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByorganizationList_Last(organizationId,
			orderByComparator);
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
	public static com.mobilekipyonetim.service.model.Vehicle[] findByorganizationList_PrevAndNext(
		int vehicleEntityId, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchVehicleException {
		return getPersistence()
				   .findByorganizationList_PrevAndNext(vehicleEntityId,
			organizationId, orderByComparator);
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
	public static java.util.List<com.mobilekipyonetim.service.model.Vehicle> findByorganizationList(
		long[] organizationIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByorganizationList(organizationIds);
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
	public static java.util.List<com.mobilekipyonetim.service.model.Vehicle> findByorganizationList(
		long[] organizationIds, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByorganizationList(organizationIds, start, end);
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
	public static java.util.List<com.mobilekipyonetim.service.model.Vehicle> findByorganizationList(
		long[] organizationIds, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByorganizationList(organizationIds, start, end,
			orderByComparator);
	}

	/**
	* Removes all the vehicles where organizationId = &#63; from the database.
	*
	* @param organizationId the organization ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByorganizationList(long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByorganizationList(organizationId);
	}

	/**
	* Returns the number of vehicles where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @return the number of matching vehicles
	* @throws SystemException if a system exception occurred
	*/
	public static int countByorganizationList(long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByorganizationList(organizationId);
	}

	/**
	* Returns the number of vehicles where organizationId = any &#63;.
	*
	* @param organizationIds the organization IDs
	* @return the number of matching vehicles
	* @throws SystemException if a system exception occurred
	*/
	public static int countByorganizationList(long[] organizationIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByorganizationList(organizationIds);
	}

	/**
	* Returns all the vehicles where plate LIKE &#63; and organizationId = &#63;.
	*
	* @param plate the plate
	* @param organizationId the organization ID
	* @return the matching vehicles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.mobilekipyonetim.service.model.Vehicle> findByplateAndOrganizationList(
		java.lang.String plate, long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByplateAndOrganizationList(plate, organizationId);
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
	public static java.util.List<com.mobilekipyonetim.service.model.Vehicle> findByplateAndOrganizationList(
		java.lang.String plate, long organizationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByplateAndOrganizationList(plate, organizationId,
			start, end);
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
	public static java.util.List<com.mobilekipyonetim.service.model.Vehicle> findByplateAndOrganizationList(
		java.lang.String plate, long organizationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByplateAndOrganizationList(plate, organizationId,
			start, end, orderByComparator);
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
	public static com.mobilekipyonetim.service.model.Vehicle findByplateAndOrganizationList_First(
		java.lang.String plate, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchVehicleException {
		return getPersistence()
				   .findByplateAndOrganizationList_First(plate, organizationId,
			orderByComparator);
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
	public static com.mobilekipyonetim.service.model.Vehicle fetchByplateAndOrganizationList_First(
		java.lang.String plate, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByplateAndOrganizationList_First(plate,
			organizationId, orderByComparator);
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
	public static com.mobilekipyonetim.service.model.Vehicle findByplateAndOrganizationList_Last(
		java.lang.String plate, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchVehicleException {
		return getPersistence()
				   .findByplateAndOrganizationList_Last(plate, organizationId,
			orderByComparator);
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
	public static com.mobilekipyonetim.service.model.Vehicle fetchByplateAndOrganizationList_Last(
		java.lang.String plate, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByplateAndOrganizationList_Last(plate, organizationId,
			orderByComparator);
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
	public static com.mobilekipyonetim.service.model.Vehicle[] findByplateAndOrganizationList_PrevAndNext(
		int vehicleEntityId, java.lang.String plate, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchVehicleException {
		return getPersistence()
				   .findByplateAndOrganizationList_PrevAndNext(vehicleEntityId,
			plate, organizationId, orderByComparator);
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
	public static java.util.List<com.mobilekipyonetim.service.model.Vehicle> findByplateAndOrganizationList(
		java.lang.String plate, long[] organizationIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByplateAndOrganizationList(plate, organizationIds);
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
	public static java.util.List<com.mobilekipyonetim.service.model.Vehicle> findByplateAndOrganizationList(
		java.lang.String plate, long[] organizationIds, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByplateAndOrganizationList(plate, organizationIds,
			start, end);
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
	public static java.util.List<com.mobilekipyonetim.service.model.Vehicle> findByplateAndOrganizationList(
		java.lang.String plate, long[] organizationIds, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByplateAndOrganizationList(plate, organizationIds,
			start, end, orderByComparator);
	}

	/**
	* Removes all the vehicles where plate LIKE &#63; and organizationId = &#63; from the database.
	*
	* @param plate the plate
	* @param organizationId the organization ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByplateAndOrganizationList(
		java.lang.String plate, long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByplateAndOrganizationList(plate, organizationId);
	}

	/**
	* Returns the number of vehicles where plate LIKE &#63; and organizationId = &#63;.
	*
	* @param plate the plate
	* @param organizationId the organization ID
	* @return the number of matching vehicles
	* @throws SystemException if a system exception occurred
	*/
	public static int countByplateAndOrganizationList(java.lang.String plate,
		long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByplateAndOrganizationList(plate, organizationId);
	}

	/**
	* Returns the number of vehicles where plate LIKE &#63; and organizationId = any &#63;.
	*
	* @param plate the plate
	* @param organizationIds the organization IDs
	* @return the number of matching vehicles
	* @throws SystemException if a system exception occurred
	*/
	public static int countByplateAndOrganizationList(java.lang.String plate,
		long[] organizationIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByplateAndOrganizationList(plate, organizationIds);
	}

	/**
	* Caches the vehicle in the entity cache if it is enabled.
	*
	* @param vehicle the vehicle
	*/
	public static void cacheResult(
		com.mobilekipyonetim.service.model.Vehicle vehicle) {
		getPersistence().cacheResult(vehicle);
	}

	/**
	* Caches the vehicles in the entity cache if it is enabled.
	*
	* @param vehicles the vehicles
	*/
	public static void cacheResult(
		java.util.List<com.mobilekipyonetim.service.model.Vehicle> vehicles) {
		getPersistence().cacheResult(vehicles);
	}

	/**
	* Creates a new vehicle with the primary key. Does not add the vehicle to the database.
	*
	* @param vehicleEntityId the primary key for the new vehicle
	* @return the new vehicle
	*/
	public static com.mobilekipyonetim.service.model.Vehicle create(
		int vehicleEntityId) {
		return getPersistence().create(vehicleEntityId);
	}

	/**
	* Removes the vehicle with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vehicleEntityId the primary key of the vehicle
	* @return the vehicle that was removed
	* @throws com.mobilekipyonetim.service.NoSuchVehicleException if a vehicle with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.mobilekipyonetim.service.model.Vehicle remove(
		int vehicleEntityId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchVehicleException {
		return getPersistence().remove(vehicleEntityId);
	}

	public static com.mobilekipyonetim.service.model.Vehicle updateImpl(
		com.mobilekipyonetim.service.model.Vehicle vehicle)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(vehicle);
	}

	/**
	* Returns the vehicle with the primary key or throws a {@link com.mobilekipyonetim.service.NoSuchVehicleException} if it could not be found.
	*
	* @param vehicleEntityId the primary key of the vehicle
	* @return the vehicle
	* @throws com.mobilekipyonetim.service.NoSuchVehicleException if a vehicle with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.mobilekipyonetim.service.model.Vehicle findByPrimaryKey(
		int vehicleEntityId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchVehicleException {
		return getPersistence().findByPrimaryKey(vehicleEntityId);
	}

	/**
	* Returns the vehicle with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vehicleEntityId the primary key of the vehicle
	* @return the vehicle, or <code>null</code> if a vehicle with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.mobilekipyonetim.service.model.Vehicle fetchByPrimaryKey(
		int vehicleEntityId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(vehicleEntityId);
	}

	/**
	* Returns all the vehicles.
	*
	* @return the vehicles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.mobilekipyonetim.service.model.Vehicle> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.mobilekipyonetim.service.model.Vehicle> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
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
	public static java.util.List<com.mobilekipyonetim.service.model.Vehicle> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the vehicles from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vehicles.
	*
	* @return the number of vehicles
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static VehiclePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (VehiclePersistence)PortletBeanLocatorUtil.locate(com.mobilekipyonetim.service.service.ClpSerializer.getServletContextName(),
					VehiclePersistence.class.getName());

			ReferenceRegistry.registerReference(VehicleUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(VehiclePersistence persistence) {
	}

	private static VehiclePersistence _persistence;
}