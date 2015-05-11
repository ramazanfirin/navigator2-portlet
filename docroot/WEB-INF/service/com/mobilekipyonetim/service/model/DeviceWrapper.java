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
 * This class is a wrapper for {@link Device}.
 * </p>
 *
 * @author 002834
 * @see Device
 * @generated
 */
public class DeviceWrapper implements Device, ModelWrapper<Device> {
	public DeviceWrapper(Device device) {
		_device = device;
	}

	@Override
	public Class<?> getModelClass() {
		return Device.class;
	}

	@Override
	public String getModelClassName() {
		return Device.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("entityId", getEntityId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("msisdn", getMsisdn());
		attributes.put("imei", getImei());
		attributes.put("regId", getRegId());
		attributes.put("organizationId", getOrganizationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer entityId = (Integer)attributes.get("entityId");

		if (entityId != null) {
			setEntityId(entityId);
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

		String msisdn = (String)attributes.get("msisdn");

		if (msisdn != null) {
			setMsisdn(msisdn);
		}

		String imei = (String)attributes.get("imei");

		if (imei != null) {
			setImei(imei);
		}

		String regId = (String)attributes.get("regId");

		if (regId != null) {
			setRegId(regId);
		}

		Long organizationId = (Long)attributes.get("organizationId");

		if (organizationId != null) {
			setOrganizationId(organizationId);
		}
	}

	/**
	* Returns the primary key of this device.
	*
	* @return the primary key of this device
	*/
	@Override
	public int getPrimaryKey() {
		return _device.getPrimaryKey();
	}

	/**
	* Sets the primary key of this device.
	*
	* @param primaryKey the primary key of this device
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_device.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the entity ID of this device.
	*
	* @return the entity ID of this device
	*/
	@Override
	public int getEntityId() {
		return _device.getEntityId();
	}

	/**
	* Sets the entity ID of this device.
	*
	* @param entityId the entity ID of this device
	*/
	@Override
	public void setEntityId(int entityId) {
		_device.setEntityId(entityId);
	}

	/**
	* Returns the group ID of this device.
	*
	* @return the group ID of this device
	*/
	@Override
	public long getGroupId() {
		return _device.getGroupId();
	}

	/**
	* Sets the group ID of this device.
	*
	* @param groupId the group ID of this device
	*/
	@Override
	public void setGroupId(long groupId) {
		_device.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this device.
	*
	* @return the company ID of this device
	*/
	@Override
	public long getCompanyId() {
		return _device.getCompanyId();
	}

	/**
	* Sets the company ID of this device.
	*
	* @param companyId the company ID of this device
	*/
	@Override
	public void setCompanyId(long companyId) {
		_device.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this device.
	*
	* @return the user ID of this device
	*/
	@Override
	public long getUserId() {
		return _device.getUserId();
	}

	/**
	* Sets the user ID of this device.
	*
	* @param userId the user ID of this device
	*/
	@Override
	public void setUserId(long userId) {
		_device.setUserId(userId);
	}

	/**
	* Returns the user uuid of this device.
	*
	* @return the user uuid of this device
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _device.getUserUuid();
	}

	/**
	* Sets the user uuid of this device.
	*
	* @param userUuid the user uuid of this device
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_device.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this device.
	*
	* @return the user name of this device
	*/
	@Override
	public java.lang.String getUserName() {
		return _device.getUserName();
	}

	/**
	* Sets the user name of this device.
	*
	* @param userName the user name of this device
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_device.setUserName(userName);
	}

	/**
	* Returns the create date of this device.
	*
	* @return the create date of this device
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _device.getCreateDate();
	}

	/**
	* Sets the create date of this device.
	*
	* @param createDate the create date of this device
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_device.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this device.
	*
	* @return the modified date of this device
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _device.getModifiedDate();
	}

	/**
	* Sets the modified date of this device.
	*
	* @param modifiedDate the modified date of this device
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_device.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the msisdn of this device.
	*
	* @return the msisdn of this device
	*/
	@Override
	public java.lang.String getMsisdn() {
		return _device.getMsisdn();
	}

	/**
	* Sets the msisdn of this device.
	*
	* @param msisdn the msisdn of this device
	*/
	@Override
	public void setMsisdn(java.lang.String msisdn) {
		_device.setMsisdn(msisdn);
	}

	/**
	* Returns the imei of this device.
	*
	* @return the imei of this device
	*/
	@Override
	public java.lang.String getImei() {
		return _device.getImei();
	}

	/**
	* Sets the imei of this device.
	*
	* @param imei the imei of this device
	*/
	@Override
	public void setImei(java.lang.String imei) {
		_device.setImei(imei);
	}

	/**
	* Returns the reg ID of this device.
	*
	* @return the reg ID of this device
	*/
	@Override
	public java.lang.String getRegId() {
		return _device.getRegId();
	}

	/**
	* Sets the reg ID of this device.
	*
	* @param regId the reg ID of this device
	*/
	@Override
	public void setRegId(java.lang.String regId) {
		_device.setRegId(regId);
	}

	/**
	* Returns the organization ID of this device.
	*
	* @return the organization ID of this device
	*/
	@Override
	public long getOrganizationId() {
		return _device.getOrganizationId();
	}

	/**
	* Sets the organization ID of this device.
	*
	* @param organizationId the organization ID of this device
	*/
	@Override
	public void setOrganizationId(long organizationId) {
		_device.setOrganizationId(organizationId);
	}

	@Override
	public boolean isNew() {
		return _device.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_device.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _device.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_device.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _device.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _device.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_device.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _device.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_device.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_device.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_device.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DeviceWrapper((Device)_device.clone());
	}

	@Override
	public int compareTo(Device device) {
		return _device.compareTo(device);
	}

	@Override
	public int hashCode() {
		return _device.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<Device> toCacheModel() {
		return _device.toCacheModel();
	}

	@Override
	public Device toEscapedModel() {
		return new DeviceWrapper(_device.toEscapedModel());
	}

	@Override
	public Device toUnescapedModel() {
		return new DeviceWrapper(_device.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _device.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _device.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_device.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DeviceWrapper)) {
			return false;
		}

		DeviceWrapper deviceWrapper = (DeviceWrapper)obj;

		if (Validator.equals(_device, deviceWrapper._device)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Device getWrappedDevice() {
		return _device;
	}

	@Override
	public Device getWrappedModel() {
		return _device;
	}

	@Override
	public void resetOriginalValues() {
		_device.resetOriginalValues();
	}

	private Device _device;
}