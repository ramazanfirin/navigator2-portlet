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

package com.mobilekipyonetim.service.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Vehicle}.
 * </p>
 *
 * @author 002834
 * @see Vehicle
 * @generated
 */
public class VehicleWrapper implements Vehicle, ModelWrapper<Vehicle> {
	public VehicleWrapper(Vehicle vehicle) {
		_vehicle = vehicle;
	}

	@Override
	public Class<?> getModelClass() {
		return Vehicle.class;
	}

	@Override
	public String getModelClassName() {
		return Vehicle.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("vehicleEntityId", getVehicleEntityId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("plate", getPlate());
		attributes.put("organizationId", getOrganizationId());
		attributes.put("deviceId", getDeviceId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer vehicleEntityId = (Integer)attributes.get("vehicleEntityId");

		if (vehicleEntityId != null) {
			setVehicleEntityId(vehicleEntityId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String plate = (String)attributes.get("plate");

		if (plate != null) {
			setPlate(plate);
		}

		Long organizationId = (Long)attributes.get("organizationId");

		if (organizationId != null) {
			setOrganizationId(organizationId);
		}

		Long deviceId = (Long)attributes.get("deviceId");

		if (deviceId != null) {
			setDeviceId(deviceId);
		}
	}

	/**
	* Returns the primary key of this vehicle.
	*
	* @return the primary key of this vehicle
	*/
	@Override
	public int getPrimaryKey() {
		return _vehicle.getPrimaryKey();
	}

	/**
	* Sets the primary key of this vehicle.
	*
	* @param primaryKey the primary key of this vehicle
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_vehicle.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the vehicle entity ID of this vehicle.
	*
	* @return the vehicle entity ID of this vehicle
	*/
	@Override
	public int getVehicleEntityId() {
		return _vehicle.getVehicleEntityId();
	}

	/**
	* Sets the vehicle entity ID of this vehicle.
	*
	* @param vehicleEntityId the vehicle entity ID of this vehicle
	*/
	@Override
	public void setVehicleEntityId(int vehicleEntityId) {
		_vehicle.setVehicleEntityId(vehicleEntityId);
	}

	/**
	* Returns the group ID of this vehicle.
	*
	* @return the group ID of this vehicle
	*/
	@Override
	public long getGroupId() {
		return _vehicle.getGroupId();
	}

	/**
	* Sets the group ID of this vehicle.
	*
	* @param groupId the group ID of this vehicle
	*/
	@Override
	public void setGroupId(long groupId) {
		_vehicle.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this vehicle.
	*
	* @return the company ID of this vehicle
	*/
	@Override
	public long getCompanyId() {
		return _vehicle.getCompanyId();
	}

	/**
	* Sets the company ID of this vehicle.
	*
	* @param companyId the company ID of this vehicle
	*/
	@Override
	public void setCompanyId(long companyId) {
		_vehicle.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this vehicle.
	*
	* @return the user ID of this vehicle
	*/
	@Override
	public long getUserId() {
		return _vehicle.getUserId();
	}

	/**
	* Sets the user ID of this vehicle.
	*
	* @param userId the user ID of this vehicle
	*/
	@Override
	public void setUserId(long userId) {
		_vehicle.setUserId(userId);
	}

	/**
	* Returns the user uuid of this vehicle.
	*
	* @return the user uuid of this vehicle
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicle.getUserUuid();
	}

	/**
	* Sets the user uuid of this vehicle.
	*
	* @param userUuid the user uuid of this vehicle
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_vehicle.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this vehicle.
	*
	* @return the user name of this vehicle
	*/
	@Override
	public java.lang.String getUserName() {
		return _vehicle.getUserName();
	}

	/**
	* Sets the user name of this vehicle.
	*
	* @param userName the user name of this vehicle
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_vehicle.setUserName(userName);
	}

	/**
	* Returns the create date of this vehicle.
	*
	* @return the create date of this vehicle
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _vehicle.getCreateDate();
	}

	/**
	* Sets the create date of this vehicle.
	*
	* @param createDate the create date of this vehicle
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_vehicle.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this vehicle.
	*
	* @return the modified date of this vehicle
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _vehicle.getModifiedDate();
	}

	/**
	* Sets the modified date of this vehicle.
	*
	* @param modifiedDate the modified date of this vehicle
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_vehicle.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the plate of this vehicle.
	*
	* @return the plate of this vehicle
	*/
	@Override
	public java.lang.String getPlate() {
		return _vehicle.getPlate();
	}

	/**
	* Sets the plate of this vehicle.
	*
	* @param plate the plate of this vehicle
	*/
	@Override
	public void setPlate(java.lang.String plate) {
		_vehicle.setPlate(plate);
	}

	/**
	* Returns the organization ID of this vehicle.
	*
	* @return the organization ID of this vehicle
	*/
	@Override
	public long getOrganizationId() {
		return _vehicle.getOrganizationId();
	}

	/**
	* Sets the organization ID of this vehicle.
	*
	* @param organizationId the organization ID of this vehicle
	*/
	@Override
	public void setOrganizationId(long organizationId) {
		_vehicle.setOrganizationId(organizationId);
	}

	/**
	* Returns the device ID of this vehicle.
	*
	* @return the device ID of this vehicle
	*/
	@Override
	public long getDeviceId() {
		return _vehicle.getDeviceId();
	}

	/**
	* Sets the device ID of this vehicle.
	*
	* @param deviceId the device ID of this vehicle
	*/
	@Override
	public void setDeviceId(long deviceId) {
		_vehicle.setDeviceId(deviceId);
	}

	@Override
	public boolean isNew() {
		return _vehicle.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_vehicle.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _vehicle.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vehicle.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _vehicle.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _vehicle.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_vehicle.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _vehicle.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_vehicle.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_vehicle.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_vehicle.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new VehicleWrapper((Vehicle)_vehicle.clone());
	}

	@Override
	public int compareTo(Vehicle vehicle) {
		return _vehicle.compareTo(vehicle);
	}

	@Override
	public int hashCode() {
		return _vehicle.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<Vehicle> toCacheModel() {
		return _vehicle.toCacheModel();
	}

	@Override
	public Vehicle toEscapedModel() {
		return new VehicleWrapper(_vehicle.toEscapedModel());
	}

	@Override
	public Vehicle toUnescapedModel() {
		return new VehicleWrapper(_vehicle.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _vehicle.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vehicle.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_vehicle.persist();
	}

	@Override
	public com.mobilekipyonetim.service.model.Device getDevice()
		throws java.lang.Exception {
		return _vehicle.getDevice();
	}

	@Override
	public com.liferay.portal.model.Organization getOrganization()
		throws java.lang.Exception {
		return _vehicle.getOrganization();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VehicleWrapper)) {
			return false;
		}

		VehicleWrapper vehicleWrapper = (VehicleWrapper)obj;

		if (Validator.equals(_vehicle, vehicleWrapper._vehicle)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Vehicle getWrappedVehicle() {
		return _vehicle;
	}

	@Override
	public Vehicle getWrappedModel() {
		return _vehicle;
	}

	@Override
	public void resetOriginalValues() {
		_vehicle.resetOriginalValues();
	}

	private Vehicle _vehicle;
}