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
import com.mobilekipyonetim.service.service.DeviceLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 002834
 */
public class DeviceClp extends BaseModelImpl<Device> implements Device {
	public DeviceClp() {
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
	public int getPrimaryKey() {
		return _entityId;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setEntityId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _entityId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
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

	@Override
	public int getEntityId() {
		return _entityId;
	}

	@Override
	public void setEntityId(int entityId) {
		_entityId = entityId;

		if (_deviceRemoteModel != null) {
			try {
				Class<?> clazz = _deviceRemoteModel.getClass();

				Method method = clazz.getMethod("setEntityId", int.class);

				method.invoke(_deviceRemoteModel, entityId);
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

		if (_deviceRemoteModel != null) {
			try {
				Class<?> clazz = _deviceRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_deviceRemoteModel, groupId);
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

		if (_deviceRemoteModel != null) {
			try {
				Class<?> clazz = _deviceRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_deviceRemoteModel, companyId);
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

		if (_deviceRemoteModel != null) {
			try {
				Class<?> clazz = _deviceRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_deviceRemoteModel, userId);
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

		if (_deviceRemoteModel != null) {
			try {
				Class<?> clazz = _deviceRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_deviceRemoteModel, userName);
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

		if (_deviceRemoteModel != null) {
			try {
				Class<?> clazz = _deviceRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_deviceRemoteModel, createDate);
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

		if (_deviceRemoteModel != null) {
			try {
				Class<?> clazz = _deviceRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_deviceRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMsisdn() {
		return _msisdn;
	}

	@Override
	public void setMsisdn(String msisdn) {
		_msisdn = msisdn;

		if (_deviceRemoteModel != null) {
			try {
				Class<?> clazz = _deviceRemoteModel.getClass();

				Method method = clazz.getMethod("setMsisdn", String.class);

				method.invoke(_deviceRemoteModel, msisdn);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getImei() {
		return _imei;
	}

	@Override
	public void setImei(String imei) {
		_imei = imei;

		if (_deviceRemoteModel != null) {
			try {
				Class<?> clazz = _deviceRemoteModel.getClass();

				Method method = clazz.getMethod("setImei", String.class);

				method.invoke(_deviceRemoteModel, imei);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRegId() {
		return _regId;
	}

	@Override
	public void setRegId(String regId) {
		_regId = regId;

		if (_deviceRemoteModel != null) {
			try {
				Class<?> clazz = _deviceRemoteModel.getClass();

				Method method = clazz.getMethod("setRegId", String.class);

				method.invoke(_deviceRemoteModel, regId);
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

		if (_deviceRemoteModel != null) {
			try {
				Class<?> clazz = _deviceRemoteModel.getClass();

				Method method = clazz.getMethod("setOrganizationId", long.class);

				method.invoke(_deviceRemoteModel, organizationId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDeviceRemoteModel() {
		return _deviceRemoteModel;
	}

	public void setDeviceRemoteModel(BaseModel<?> deviceRemoteModel) {
		_deviceRemoteModel = deviceRemoteModel;
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

		Class<?> remoteModelClass = _deviceRemoteModel.getClass();

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

		Object returnValue = method.invoke(_deviceRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DeviceLocalServiceUtil.addDevice(this);
		}
		else {
			DeviceLocalServiceUtil.updateDevice(this);
		}
	}

	@Override
	public Device toEscapedModel() {
		return (Device)ProxyUtil.newProxyInstance(Device.class.getClassLoader(),
			new Class[] { Device.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DeviceClp clone = new DeviceClp();

		clone.setEntityId(getEntityId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setMsisdn(getMsisdn());
		clone.setImei(getImei());
		clone.setRegId(getRegId());
		clone.setOrganizationId(getOrganizationId());

		return clone;
	}

	@Override
	public int compareTo(Device device) {
		int value = 0;

		value = getImei().compareTo(device.getImei());

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

		if (!(obj instanceof DeviceClp)) {
			return false;
		}

		DeviceClp device = (DeviceClp)obj;

		int primaryKey = device.getPrimaryKey();

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
		StringBundler sb = new StringBundler(23);

		sb.append("{entityId=");
		sb.append(getEntityId());
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
		sb.append(", msisdn=");
		sb.append(getMsisdn());
		sb.append(", imei=");
		sb.append(getImei());
		sb.append(", regId=");
		sb.append(getRegId());
		sb.append(", organizationId=");
		sb.append(getOrganizationId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.mobilekipyonetim.service.model.Device");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>entityId</column-name><column-value><![CDATA[");
		sb.append(getEntityId());
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
			"<column><column-name>msisdn</column-name><column-value><![CDATA[");
		sb.append(getMsisdn());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>imei</column-name><column-value><![CDATA[");
		sb.append(getImei());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>regId</column-name><column-value><![CDATA[");
		sb.append(getRegId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organizationId</column-name><column-value><![CDATA[");
		sb.append(getOrganizationId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _entityId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _msisdn;
	private String _imei;
	private String _regId;
	private long _organizationId;
	private BaseModel<?> _deviceRemoteModel;
	private Class<?> _clpSerializerClass = com.mobilekipyonetim.service.service.ClpSerializer.class;
}