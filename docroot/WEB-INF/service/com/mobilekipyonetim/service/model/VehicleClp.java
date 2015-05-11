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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.mobilekipyonetim.service.service.ClpSerializer;
import com.mobilekipyonetim.service.service.VehicleLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 002834
 */
public class VehicleClp extends BaseModelImpl<Vehicle> implements Vehicle {
	public VehicleClp() {
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
	public int getPrimaryKey() {
		return _vehicleEntityId;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setVehicleEntityId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vehicleEntityId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
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

	@Override
	public int getVehicleEntityId() {
		return _vehicleEntityId;
	}

	@Override
	public void setVehicleEntityId(int vehicleEntityId) {
		_vehicleEntityId = vehicleEntityId;

		if (_vehicleRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleRemoteModel.getClass();

				Method method = clazz.getMethod("setVehicleEntityId", int.class);

				method.invoke(_vehicleRemoteModel, vehicleEntityId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_vehicleRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_vehicleRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_vehicleRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_vehicleRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_vehicleRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_vehicleRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getUserName() {
		return _userName;
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;

		if (_vehicleRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_vehicleRemoteModel, userName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_vehicleRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_vehicleRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_vehicleRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_vehicleRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPlate() {
		return _plate;
	}

	@Override
	public void setPlate(String plate) {
		_plate = plate;

		if (_vehicleRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleRemoteModel.getClass();

				Method method = clazz.getMethod("setPlate", String.class);

				method.invoke(_vehicleRemoteModel, plate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getOrganizationId() {
		return _organizationId;
	}

	@Override
	public void setOrganizationId(long organizationId) {
		_organizationId = organizationId;

		if (_vehicleRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleRemoteModel.getClass();

				Method method = clazz.getMethod("setOrganizationId", long.class);

				method.invoke(_vehicleRemoteModel, organizationId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDeviceId() {
		return _deviceId;
	}

	@Override
	public void setDeviceId(long deviceId) {
		_deviceId = deviceId;

		if (_vehicleRemoteModel != null) {
			try {
				Class<?> clazz = _vehicleRemoteModel.getClass();

				Method method = clazz.getMethod("setDeviceId", long.class);

				method.invoke(_vehicleRemoteModel, deviceId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public com.mobilekipyonetim.service.model.Device getDevice() {
		try {
			String methodName = "getDevice";

			Class<?>[] parameterTypes = new Class<?>[] {  };

			Object[] parameterValues = new Object[] {  };

			com.mobilekipyonetim.service.model.Device returnObj = (com.mobilekipyonetim.service.model.Device)invokeOnRemoteModel(methodName,
					parameterTypes, parameterValues);

			return returnObj;
		}
		catch (Exception e) {
			throw new UnsupportedOperationException(e);
		}
	}

	@Override
	public com.liferay.portal.model.Organization getOrganization() {
		try {
			String methodName = "getOrganization";

			Class<?>[] parameterTypes = new Class<?>[] {  };

			Object[] parameterValues = new Object[] {  };

			com.liferay.portal.model.Organization returnObj = (com.liferay.portal.model.Organization)invokeOnRemoteModel(methodName,
					parameterTypes, parameterValues);

			return returnObj;
		}
		catch (Exception e) {
			throw new UnsupportedOperationException(e);
		}
	}

	public BaseModel<?> getVehicleRemoteModel() {
		return _vehicleRemoteModel;
	}

	public void setVehicleRemoteModel(BaseModel<?> vehicleRemoteModel) {
		_vehicleRemoteModel = vehicleRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _vehicleRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_vehicleRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			VehicleLocalServiceUtil.addVehicle(this);
		}
		else {
			VehicleLocalServiceUtil.updateVehicle(this);
		}
	}

	@Override
	public Vehicle toEscapedModel() {
		return (Vehicle)ProxyUtil.newProxyInstance(Vehicle.class.getClassLoader(),
			new Class[] { Vehicle.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		VehicleClp clone = new VehicleClp();

		clone.setVehicleEntityId(getVehicleEntityId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setPlate(getPlate());
		clone.setOrganizationId(getOrganizationId());
		clone.setDeviceId(getDeviceId());

		return clone;
	}

	@Override
	public int compareTo(Vehicle vehicle) {
		int value = 0;

		value = getPlate().compareTo(vehicle.getPlate());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VehicleClp)) {
			return false;
		}

		VehicleClp vehicle = (VehicleClp)obj;

		int primaryKey = vehicle.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{vehicleEntityId=");
		sb.append(getVehicleEntityId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", plate=");
		sb.append(getPlate());
		sb.append(", organizationId=");
		sb.append(getOrganizationId());
		sb.append(", deviceId=");
		sb.append(getDeviceId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.mobilekipyonetim.service.model.Vehicle");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>vehicleEntityId</column-name><column-value><![CDATA[");
		sb.append(getVehicleEntityId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>plate</column-name><column-value><![CDATA[");
		sb.append(getPlate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organizationId</column-name><column-value><![CDATA[");
		sb.append(getOrganizationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>deviceId</column-name><column-value><![CDATA[");
		sb.append(getDeviceId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _vehicleEntityId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _plate;
	private long _organizationId;
	private long _deviceId;
	private BaseModel<?> _vehicleRemoteModel;
	private Class<?> _clpSerializerClass = com.mobilekipyonetim.service.service.ClpSerializer.class;
}