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

import com.liferay.portal.service.persistence.BasePersistence;

import com.mobilekipyonetim.service.model.Vehicle;

/**
 * The persistence interface for the vehicle service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author 002834
 * @see VehiclePersistenceImpl
 * @see VehicleUtil
 * @generated
 */
public interface VehiclePersistence extends BasePersistence<Vehicle> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VehicleUtil} to access the vehicle persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vehicles where plate LIKE &#63; and organizationId = &#63;.
	*
	* @param plate the plate
	* @param organizationId the organization ID
	* @return the matching vehicles
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.mobilekipyonetim.service.model.Vehicle> findByplateAndOrganization(
		java.lang.String plate, long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.mobilekipyonetim.service.model.Vehicle> findByplateAndOrganization(
		java.lang.String plate, long organizationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.mobilekipyonetim.service.model.Vehicle> findByplateAndOrganization(
		java.lang.String plate, long organizationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.mobilekipyonetim.service.model.Vehicle findByplateAndOrganization_First(
		java.lang.String plate, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchVehicleException;

	/**
	* Returns the first vehicle in the ordered set where plate LIKE &#63; and organizationId = &#63;.
	*
	* @param plate the plate
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle, or <code>null</code> if a matching vehicle could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Vehicle fetchByplateAndOrganization_First(
		java.lang.String plate, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.mobilekipyonetim.service.model.Vehicle findByplateAndOrganization_Last(
		java.lang.String plate, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchVehicleException;

	/**
	* Returns the last vehicle in the ordered set where plate LIKE &#63; and organizationId = &#63;.
	*
	* @param plate the plate
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle, or <code>null</code> if a matching vehicle could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Vehicle fetchByplateAndOrganization_Last(
		java.lang.String plate, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.mobilekipyonetim.service.model.Vehicle[] findByplateAndOrganization_PrevAndNext(
		int vehicleEntityId, java.lang.String plate, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchVehicleException;

	/**
	* Removes all the vehicles where plate LIKE &#63; and organizationId = &#63; from the database.
	*
	* @param plate the plate
	* @param organizationId the organization ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByplateAndOrganization(java.lang.String plate,
		long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of vehicles where plate LIKE &#63; and organizationId = &#63;.
	*
	* @param plate the plate
	* @param organizationId the organization ID
	* @return the number of matching vehicles
	* @throws SystemException if a system exception occurred
	*/
	public int countByplateAndOrganization(java.lang.String plate,
		long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the vehicles where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @return the matching vehicles
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.mobilekipyonetim.service.model.Vehicle> findByorganization(
		long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.mobilekipyonetim.service.model.Vehicle> findByorganization(
		long organizationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.mobilekipyonetim.service.model.Vehicle> findByorganization(
		long organizationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first vehicle in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle
	* @throws com.mobilekipyonetim.service.NoSuchVehicleException if a matching vehicle could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Vehicle findByorganization_First(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchVehicleException;

	/**
	* Returns the first vehicle in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle, or <code>null</code> if a matching vehicle could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Vehicle fetchByorganization_First(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last vehicle in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle
	* @throws com.mobilekipyonetim.service.NoSuchVehicleException if a matching vehicle could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Vehicle findByorganization_Last(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchVehicleException;

	/**
	* Returns the last vehicle in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle, or <code>null</code> if a matching vehicle could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Vehicle fetchByorganization_Last(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.mobilekipyonetim.service.model.Vehicle[] findByorganization_PrevAndNext(
		int vehicleEntityId, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchVehicleException;

	/**
	* Removes all the vehicles where organizationId = &#63; from the database.
	*
	* @param organizationId the organization ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByorganization(long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of vehicles where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @return the number of matching vehicles
	* @throws SystemException if a system exception occurred
	*/
	public int countByorganization(long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the vehicles where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @return the matching vehicles
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.mobilekipyonetim.service.model.Vehicle> findByorganizationList(
		long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.mobilekipyonetim.service.model.Vehicle> findByorganizationList(
		long organizationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.mobilekipyonetim.service.model.Vehicle> findByorganizationList(
		long organizationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first vehicle in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle
	* @throws com.mobilekipyonetim.service.NoSuchVehicleException if a matching vehicle could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Vehicle findByorganizationList_First(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchVehicleException;

	/**
	* Returns the first vehicle in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle, or <code>null</code> if a matching vehicle could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Vehicle fetchByorganizationList_First(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last vehicle in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle
	* @throws com.mobilekipyonetim.service.NoSuchVehicleException if a matching vehicle could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Vehicle findByorganizationList_Last(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchVehicleException;

	/**
	* Returns the last vehicle in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle, or <code>null</code> if a matching vehicle could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Vehicle fetchByorganizationList_Last(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.mobilekipyonetim.service.model.Vehicle[] findByorganizationList_PrevAndNext(
		int vehicleEntityId, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchVehicleException;

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
	public java.util.List<com.mobilekipyonetim.service.model.Vehicle> findByorganizationList(
		long[] organizationIds)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.mobilekipyonetim.service.model.Vehicle> findByorganizationList(
		long[] organizationIds, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.mobilekipyonetim.service.model.Vehicle> findByorganizationList(
		long[] organizationIds, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the vehicles where organizationId = &#63; from the database.
	*
	* @param organizationId the organization ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByorganizationList(long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of vehicles where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @return the number of matching vehicles
	* @throws SystemException if a system exception occurred
	*/
	public int countByorganizationList(long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of vehicles where organizationId = any &#63;.
	*
	* @param organizationIds the organization IDs
	* @return the number of matching vehicles
	* @throws SystemException if a system exception occurred
	*/
	public int countByorganizationList(long[] organizationIds)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the vehicles where plate LIKE &#63; and organizationId = &#63;.
	*
	* @param plate the plate
	* @param organizationId the organization ID
	* @return the matching vehicles
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.mobilekipyonetim.service.model.Vehicle> findByplateAndOrganizationList(
		java.lang.String plate, long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.mobilekipyonetim.service.model.Vehicle> findByplateAndOrganizationList(
		java.lang.String plate, long organizationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.mobilekipyonetim.service.model.Vehicle> findByplateAndOrganizationList(
		java.lang.String plate, long organizationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.mobilekipyonetim.service.model.Vehicle findByplateAndOrganizationList_First(
		java.lang.String plate, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchVehicleException;

	/**
	* Returns the first vehicle in the ordered set where plate LIKE &#63; and organizationId = &#63;.
	*
	* @param plate the plate
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle, or <code>null</code> if a matching vehicle could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Vehicle fetchByplateAndOrganizationList_First(
		java.lang.String plate, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.mobilekipyonetim.service.model.Vehicle findByplateAndOrganizationList_Last(
		java.lang.String plate, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchVehicleException;

	/**
	* Returns the last vehicle in the ordered set where plate LIKE &#63; and organizationId = &#63;.
	*
	* @param plate the plate
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle, or <code>null</code> if a matching vehicle could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Vehicle fetchByplateAndOrganizationList_Last(
		java.lang.String plate, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.mobilekipyonetim.service.model.Vehicle[] findByplateAndOrganizationList_PrevAndNext(
		int vehicleEntityId, java.lang.String plate, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchVehicleException;

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
	public java.util.List<com.mobilekipyonetim.service.model.Vehicle> findByplateAndOrganizationList(
		java.lang.String plate, long[] organizationIds)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.mobilekipyonetim.service.model.Vehicle> findByplateAndOrganizationList(
		java.lang.String plate, long[] organizationIds, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.mobilekipyonetim.service.model.Vehicle> findByplateAndOrganizationList(
		java.lang.String plate, long[] organizationIds, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the vehicles where plate LIKE &#63; and organizationId = &#63; from the database.
	*
	* @param plate the plate
	* @param organizationId the organization ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByplateAndOrganizationList(java.lang.String plate,
		long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of vehicles where plate LIKE &#63; and organizationId = &#63;.
	*
	* @param plate the plate
	* @param organizationId the organization ID
	* @return the number of matching vehicles
	* @throws SystemException if a system exception occurred
	*/
	public int countByplateAndOrganizationList(java.lang.String plate,
		long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of vehicles where plate LIKE &#63; and organizationId = any &#63;.
	*
	* @param plate the plate
	* @param organizationIds the organization IDs
	* @return the number of matching vehicles
	* @throws SystemException if a system exception occurred
	*/
	public int countByplateAndOrganizationList(java.lang.String plate,
		long[] organizationIds)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the vehicle in the entity cache if it is enabled.
	*
	* @param vehicle the vehicle
	*/
	public void cacheResult(com.mobilekipyonetim.service.model.Vehicle vehicle);

	/**
	* Caches the vehicles in the entity cache if it is enabled.
	*
	* @param vehicles the vehicles
	*/
	public void cacheResult(
		java.util.List<com.mobilekipyonetim.service.model.Vehicle> vehicles);

	/**
	* Creates a new vehicle with the primary key. Does not add the vehicle to the database.
	*
	* @param vehicleEntityId the primary key for the new vehicle
	* @return the new vehicle
	*/
	public com.mobilekipyonetim.service.model.Vehicle create(
		int vehicleEntityId);

	/**
	* Removes the vehicle with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vehicleEntityId the primary key of the vehicle
	* @return the vehicle that was removed
	* @throws com.mobilekipyonetim.service.NoSuchVehicleException if a vehicle with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Vehicle remove(
		int vehicleEntityId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchVehicleException;

	public com.mobilekipyonetim.service.model.Vehicle updateImpl(
		com.mobilekipyonetim.service.model.Vehicle vehicle)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the vehicle with the primary key or throws a {@link com.mobilekipyonetim.service.NoSuchVehicleException} if it could not be found.
	*
	* @param vehicleEntityId the primary key of the vehicle
	* @return the vehicle
	* @throws com.mobilekipyonetim.service.NoSuchVehicleException if a vehicle with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Vehicle findByPrimaryKey(
		int vehicleEntityId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchVehicleException;

	/**
	* Returns the vehicle with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vehicleEntityId the primary key of the vehicle
	* @return the vehicle, or <code>null</code> if a vehicle with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Vehicle fetchByPrimaryKey(
		int vehicleEntityId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the vehicles.
	*
	* @return the vehicles
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.mobilekipyonetim.service.model.Vehicle> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.mobilekipyonetim.service.model.Vehicle> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.mobilekipyonetim.service.model.Vehicle> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the vehicles from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of vehicles.
	*
	* @return the number of vehicles
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}