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

import com.mobilekipyonetim.service.model.Device;

import java.util.List;

/**
 * The persistence utility for the device service. This utility wraps {@link DevicePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author 002834
 * @see DevicePersistence
 * @see DevicePersistenceImpl
 * @generated
 */
public class DeviceUtil {
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
	public static void clearCache(Device device) {
		getPersistence().clearCache(device);
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
	public static List<Device> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Device> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Device> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Device update(Device device) throws SystemException {
		return getPersistence().update(device);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Device update(Device device, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(device, serviceContext);
	}

	/**
	* Returns all the devices where imei LIKE &#63; and organizationId = &#63;.
	*
	* @param imei the imei
	* @param organizationId the organization ID
	* @return the matching devices
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.mobilekipyonetim.service.model.Device> findByimeiAndOrganization(
		java.lang.String imei, long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByimeiAndOrganization(imei, organizationId);
	}

	/**
	* Returns a range of all the devices where imei LIKE &#63; and organizationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param imei the imei
	* @param organizationId the organization ID
	* @param start the lower bound of the range of devices
	* @param end the upper bound of the range of devices (not inclusive)
	* @return the range of matching devices
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.mobilekipyonetim.service.model.Device> findByimeiAndOrganization(
		java.lang.String imei, long organizationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByimeiAndOrganization(imei, organizationId, start, end);
	}

	/**
	* Returns an ordered range of all the devices where imei LIKE &#63; and organizationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param imei the imei
	* @param organizationId the organization ID
	* @param start the lower bound of the range of devices
	* @param end the upper bound of the range of devices (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching devices
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.mobilekipyonetim.service.model.Device> findByimeiAndOrganization(
		java.lang.String imei, long organizationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByimeiAndOrganization(imei, organizationId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first device in the ordered set where imei LIKE &#63; and organizationId = &#63;.
	*
	* @param imei the imei
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching device
	* @throws com.mobilekipyonetim.service.NoSuchDeviceException if a matching device could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.mobilekipyonetim.service.model.Device findByimeiAndOrganization_First(
		java.lang.String imei, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchDeviceException {
		return getPersistence()
				   .findByimeiAndOrganization_First(imei, organizationId,
			orderByComparator);
	}

	/**
	* Returns the first device in the ordered set where imei LIKE &#63; and organizationId = &#63;.
	*
	* @param imei the imei
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching device, or <code>null</code> if a matching device could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.mobilekipyonetim.service.model.Device fetchByimeiAndOrganization_First(
		java.lang.String imei, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByimeiAndOrganization_First(imei, organizationId,
			orderByComparator);
	}

	/**
	* Returns the last device in the ordered set where imei LIKE &#63; and organizationId = &#63;.
	*
	* @param imei the imei
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching device
	* @throws com.mobilekipyonetim.service.NoSuchDeviceException if a matching device could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.mobilekipyonetim.service.model.Device findByimeiAndOrganization_Last(
		java.lang.String imei, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchDeviceException {
		return getPersistence()
				   .findByimeiAndOrganization_Last(imei, organizationId,
			orderByComparator);
	}

	/**
	* Returns the last device in the ordered set where imei LIKE &#63; and organizationId = &#63;.
	*
	* @param imei the imei
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching device, or <code>null</code> if a matching device could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.mobilekipyonetim.service.model.Device fetchByimeiAndOrganization_Last(
		java.lang.String imei, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByimeiAndOrganization_Last(imei, organizationId,
			orderByComparator);
	}

	/**
	* Returns the devices before and after the current device in the ordered set where imei LIKE &#63; and organizationId = &#63;.
	*
	* @param entityId the primary key of the current device
	* @param imei the imei
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next device
	* @throws com.mobilekipyonetim.service.NoSuchDeviceException if a device with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.mobilekipyonetim.service.model.Device[] findByimeiAndOrganization_PrevAndNext(
		int entityId, java.lang.String imei, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchDeviceException {
		return getPersistence()
				   .findByimeiAndOrganization_PrevAndNext(entityId, imei,
			organizationId, orderByComparator);
	}

	/**
	* Removes all the devices where imei LIKE &#63; and organizationId = &#63; from the database.
	*
	* @param imei the imei
	* @param organizationId the organization ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByimeiAndOrganization(java.lang.String imei,
		long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByimeiAndOrganization(imei, organizationId);
	}

	/**
	* Returns the number of devices where imei LIKE &#63; and organizationId = &#63;.
	*
	* @param imei the imei
	* @param organizationId the organization ID
	* @return the number of matching devices
	* @throws SystemException if a system exception occurred
	*/
	public static int countByimeiAndOrganization(java.lang.String imei,
		long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByimeiAndOrganization(imei, organizationId);
	}

	/**
	* Returns all the devices where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @return the matching devices
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.mobilekipyonetim.service.model.Device> findByorganization(
		long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByorganization(organizationId);
	}

	/**
	* Returns a range of all the devices where organizationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationId the organization ID
	* @param start the lower bound of the range of devices
	* @param end the upper bound of the range of devices (not inclusive)
	* @return the range of matching devices
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.mobilekipyonetim.service.model.Device> findByorganization(
		long organizationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByorganization(organizationId, start, end);
	}

	/**
	* Returns an ordered range of all the devices where organizationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationId the organization ID
	* @param start the lower bound of the range of devices
	* @param end the upper bound of the range of devices (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching devices
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.mobilekipyonetim.service.model.Device> findByorganization(
		long organizationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByorganization(organizationId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first device in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching device
	* @throws com.mobilekipyonetim.service.NoSuchDeviceException if a matching device could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.mobilekipyonetim.service.model.Device findByorganization_First(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchDeviceException {
		return getPersistence()
				   .findByorganization_First(organizationId, orderByComparator);
	}

	/**
	* Returns the first device in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching device, or <code>null</code> if a matching device could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.mobilekipyonetim.service.model.Device fetchByorganization_First(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByorganization_First(organizationId, orderByComparator);
	}

	/**
	* Returns the last device in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching device
	* @throws com.mobilekipyonetim.service.NoSuchDeviceException if a matching device could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.mobilekipyonetim.service.model.Device findByorganization_Last(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchDeviceException {
		return getPersistence()
				   .findByorganization_Last(organizationId, orderByComparator);
	}

	/**
	* Returns the last device in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching device, or <code>null</code> if a matching device could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.mobilekipyonetim.service.model.Device fetchByorganization_Last(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByorganization_Last(organizationId, orderByComparator);
	}

	/**
	* Returns the devices before and after the current device in the ordered set where organizationId = &#63;.
	*
	* @param entityId the primary key of the current device
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next device
	* @throws com.mobilekipyonetim.service.NoSuchDeviceException if a device with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.mobilekipyonetim.service.model.Device[] findByorganization_PrevAndNext(
		int entityId, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchDeviceException {
		return getPersistence()
				   .findByorganization_PrevAndNext(entityId, organizationId,
			orderByComparator);
	}

	/**
	* Removes all the devices where organizationId = &#63; from the database.
	*
	* @param organizationId the organization ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByorganization(long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByorganization(organizationId);
	}

	/**
	* Returns the number of devices where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @return the number of matching devices
	* @throws SystemException if a system exception occurred
	*/
	public static int countByorganization(long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByorganization(organizationId);
	}

	/**
	* Caches the device in the entity cache if it is enabled.
	*
	* @param device the device
	*/
	public static void cacheResult(
		com.mobilekipyonetim.service.model.Device device) {
		getPersistence().cacheResult(device);
	}

	/**
	* Caches the devices in the entity cache if it is enabled.
	*
	* @param devices the devices
	*/
	public static void cacheResult(
		java.util.List<com.mobilekipyonetim.service.model.Device> devices) {
		getPersistence().cacheResult(devices);
	}

	/**
	* Creates a new device with the primary key. Does not add the device to the database.
	*
	* @param entityId the primary key for the new device
	* @return the new device
	*/
	public static com.mobilekipyonetim.service.model.Device create(int entityId) {
		return getPersistence().create(entityId);
	}

	/**
	* Removes the device with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param entityId the primary key of the device
	* @return the device that was removed
	* @throws com.mobilekipyonetim.service.NoSuchDeviceException if a device with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.mobilekipyonetim.service.model.Device remove(int entityId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchDeviceException {
		return getPersistence().remove(entityId);
	}

	public static com.mobilekipyonetim.service.model.Device updateImpl(
		com.mobilekipyonetim.service.model.Device device)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(device);
	}

	/**
	* Returns the device with the primary key or throws a {@link com.mobilekipyonetim.service.NoSuchDeviceException} if it could not be found.
	*
	* @param entityId the primary key of the device
	* @return the device
	* @throws com.mobilekipyonetim.service.NoSuchDeviceException if a device with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.mobilekipyonetim.service.model.Device findByPrimaryKey(
		int entityId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchDeviceException {
		return getPersistence().findByPrimaryKey(entityId);
	}

	/**
	* Returns the device with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param entityId the primary key of the device
	* @return the device, or <code>null</code> if a device with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.mobilekipyonetim.service.model.Device fetchByPrimaryKey(
		int entityId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(entityId);
	}

	/**
	* Returns all the devices.
	*
	* @return the devices
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.mobilekipyonetim.service.model.Device> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the devices.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of devices
	* @param end the upper bound of the range of devices (not inclusive)
	* @return the range of devices
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.mobilekipyonetim.service.model.Device> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the devices.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of devices
	* @param end the upper bound of the range of devices (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of devices
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.mobilekipyonetim.service.model.Device> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the devices from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of devices.
	*
	* @return the number of devices
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DevicePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DevicePersistence)PortletBeanLocatorUtil.locate(com.mobilekipyonetim.service.service.ClpSerializer.getServletContextName(),
					DevicePersistence.class.getName());

			ReferenceRegistry.registerReference(DeviceUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DevicePersistence persistence) {
	}

	private static DevicePersistence _persistence;
}