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

package com.mobilekipyonetim.service.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link VehicleLocalService}.
 *
 * @author 002834
 * @see VehicleLocalService
 * @generated
 */
public class VehicleLocalServiceWrapper implements VehicleLocalService,
	ServiceWrapper<VehicleLocalService> {
	public VehicleLocalServiceWrapper(VehicleLocalService vehicleLocalService) {
		_vehicleLocalService = vehicleLocalService;
	}

	/**
	* Adds the vehicle to the database. Also notifies the appropriate model listeners.
	*
	* @param vehicle the vehicle
	* @return the vehicle that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.mobilekipyonetim.service.model.Vehicle addVehicle(
		com.mobilekipyonetim.service.model.Vehicle vehicle)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleLocalService.addVehicle(vehicle);
	}

	/**
	* Creates a new vehicle with the primary key. Does not add the vehicle to the database.
	*
	* @param vehicleEntityId the primary key for the new vehicle
	* @return the new vehicle
	*/
	@Override
	public com.mobilekipyonetim.service.model.Vehicle createVehicle(
		int vehicleEntityId) {
		return _vehicleLocalService.createVehicle(vehicleEntityId);
	}

	/**
	* Deletes the vehicle with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vehicleEntityId the primary key of the vehicle
	* @return the vehicle that was removed
	* @throws PortalException if a vehicle with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.mobilekipyonetim.service.model.Vehicle deleteVehicle(
		int vehicleEntityId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vehicleLocalService.deleteVehicle(vehicleEntityId);
	}

	/**
	* Deletes the vehicle from the database. Also notifies the appropriate model listeners.
	*
	* @param vehicle the vehicle
	* @return the vehicle that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.mobilekipyonetim.service.model.Vehicle deleteVehicle(
		com.mobilekipyonetim.service.model.Vehicle vehicle)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleLocalService.deleteVehicle(vehicle);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vehicleLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.VehicleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.VehicleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.mobilekipyonetim.service.model.Vehicle fetchVehicle(
		int vehicleEntityId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleLocalService.fetchVehicle(vehicleEntityId);
	}

	/**
	* Returns the vehicle with the primary key.
	*
	* @param vehicleEntityId the primary key of the vehicle
	* @return the vehicle
	* @throws PortalException if a vehicle with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.mobilekipyonetim.service.model.Vehicle getVehicle(
		int vehicleEntityId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vehicleLocalService.getVehicle(vehicleEntityId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vehicleLocalService.getPersistedModel(primaryKeyObj);
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
	public java.util.List<com.mobilekipyonetim.service.model.Vehicle> getVehicles(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleLocalService.getVehicles(start, end);
	}

	/**
	* Returns the number of vehicles.
	*
	* @return the number of vehicles
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getVehiclesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleLocalService.getVehiclesCount();
	}

	/**
	* Updates the vehicle in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vehicle the vehicle
	* @return the vehicle that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.mobilekipyonetim.service.model.Vehicle updateVehicle(
		com.mobilekipyonetim.service.model.Vehicle vehicle)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleLocalService.updateVehicle(vehicle);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _vehicleLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_vehicleLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _vehicleLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public java.util.List<com.mobilekipyonetim.service.model.Vehicle> getVehicleByPlateAndOrganization(
		java.lang.String plate, int organizationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleLocalService.getVehicleByPlateAndOrganization(plate,
			organizationId);
	}

	@Override
	public java.util.List<com.mobilekipyonetim.service.model.Vehicle> getDeviceByOrganization(
		java.lang.String plate, int organizationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleLocalService.getDeviceByOrganization(plate,
			organizationId);
	}

	@Override
	public java.util.List<com.mobilekipyonetim.service.model.Vehicle> getVehicleByOrganizationList(
		long[] organizationIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleLocalService.getVehicleByOrganizationList(organizationIds);
	}

	@Override
	public java.util.List<com.mobilekipyonetim.service.model.Vehicle> getVehicleByPlateAndOrganizationList(
		java.lang.String plate, long[] organizationIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleLocalService.getVehicleByPlateAndOrganizationList(plate,
			organizationIds);
	}

	@Override
	public java.util.List<com.mobilekipyonetim.service.model.Vehicle> getVehicleByOrganizationList(
		java.lang.String plate, int organizationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleLocalService.getVehicleByOrganizationList(plate,
			organizationId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public VehicleLocalService getWrappedVehicleLocalService() {
		return _vehicleLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedVehicleLocalService(
		VehicleLocalService vehicleLocalService) {
		_vehicleLocalService = vehicleLocalService;
	}

	@Override
	public VehicleLocalService getWrappedService() {
		return _vehicleLocalService;
	}

	@Override
	public void setWrappedService(VehicleLocalService vehicleLocalService) {
		_vehicleLocalService = vehicleLocalService;
	}

	private VehicleLocalService _vehicleLocalService;
}