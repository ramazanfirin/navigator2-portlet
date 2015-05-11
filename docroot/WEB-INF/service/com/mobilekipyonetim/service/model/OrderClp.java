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
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.mobilekipyonetim.service.service.ClpSerializer;
import com.mobilekipyonetim.service.service.OrderLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 002834
 */
public class OrderClp extends BaseModelImpl<Order> implements Order {
	public OrderClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Order.class;
	}

	@Override
	public String getModelClassName() {
		return Order.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _orderEntityId;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setOrderEntityId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _orderEntityId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("orderEntityId", getOrderEntityId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("organizationId", getOrganizationId());
		attributes.put("lat", getLat());
		attributes.put("lng", getLng());
		attributes.put("date", getDate());
		attributes.put("address", getAddress());
		attributes.put("ilce", getIlce());
		attributes.put("mahalle", getMahalle());
		attributes.put("sokak", getSokak());
		attributes.put("bina", getBina());
		attributes.put("vehicleId", getVehicleId());
		attributes.put("statusId", getStatusId());
		attributes.put("priorityId", getPriorityId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer orderEntityId = (Integer)attributes.get("orderEntityId");

		if (orderEntityId != null) {
			setOrderEntityId(orderEntityId);
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

		Long organizationId = (Long)attributes.get("organizationId");

		if (organizationId != null) {
			setOrganizationId(organizationId);
		}

		String lat = (String)attributes.get("lat");

		if (lat != null) {
			setLat(lat);
		}

		String lng = (String)attributes.get("lng");

		if (lng != null) {
			setLng(lng);
		}

		Date date = (Date)attributes.get("date");

		if (date != null) {
			setDate(date);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String ilce = (String)attributes.get("ilce");

		if (ilce != null) {
			setIlce(ilce);
		}

		String mahalle = (String)attributes.get("mahalle");

		if (mahalle != null) {
			setMahalle(mahalle);
		}

		String sokak = (String)attributes.get("sokak");

		if (sokak != null) {
			setSokak(sokak);
		}

		String bina = (String)attributes.get("bina");

		if (bina != null) {
			setBina(bina);
		}

		Long vehicleId = (Long)attributes.get("vehicleId");

		if (vehicleId != null) {
			setVehicleId(vehicleId);
		}

		Long statusId = (Long)attributes.get("statusId");

		if (statusId != null) {
			setStatusId(statusId);
		}

		Long priorityId = (Long)attributes.get("priorityId");

		if (priorityId != null) {
			setPriorityId(priorityId);
		}
	}

	@Override
	public int getOrderEntityId() {
		return _orderEntityId;
	}

	@Override
	public void setOrderEntityId(int orderEntityId) {
		_orderEntityId = orderEntityId;

		if (_orderRemoteModel != null) {
			try {
				Class<?> clazz = _orderRemoteModel.getClass();

				Method method = clazz.getMethod("setOrderEntityId", int.class);

				method.invoke(_orderRemoteModel, orderEntityId);
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

		if (_orderRemoteModel != null) {
			try {
				Class<?> clazz = _orderRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_orderRemoteModel, groupId);
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

		if (_orderRemoteModel != null) {
			try {
				Class<?> clazz = _orderRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_orderRemoteModel, companyId);
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

		if (_orderRemoteModel != null) {
			try {
				Class<?> clazz = _orderRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_orderRemoteModel, userId);
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

		if (_orderRemoteModel != null) {
			try {
				Class<?> clazz = _orderRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_orderRemoteModel, userName);
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

		if (_orderRemoteModel != null) {
			try {
				Class<?> clazz = _orderRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_orderRemoteModel, createDate);
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

		if (_orderRemoteModel != null) {
			try {
				Class<?> clazz = _orderRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_orderRemoteModel, modifiedDate);
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

		if (_orderRemoteModel != null) {
			try {
				Class<?> clazz = _orderRemoteModel.getClass();

				Method method = clazz.getMethod("setOrganizationId", long.class);

				method.invoke(_orderRemoteModel, organizationId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLat() {
		return _lat;
	}

	@Override
	public void setLat(String lat) {
		_lat = lat;

		if (_orderRemoteModel != null) {
			try {
				Class<?> clazz = _orderRemoteModel.getClass();

				Method method = clazz.getMethod("setLat", String.class);

				method.invoke(_orderRemoteModel, lat);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLng() {
		return _lng;
	}

	@Override
	public void setLng(String lng) {
		_lng = lng;

		if (_orderRemoteModel != null) {
			try {
				Class<?> clazz = _orderRemoteModel.getClass();

				Method method = clazz.getMethod("setLng", String.class);

				method.invoke(_orderRemoteModel, lng);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getDate() {
		return _date;
	}

	@Override
	public void setDate(Date date) {
		_date = date;

		if (_orderRemoteModel != null) {
			try {
				Class<?> clazz = _orderRemoteModel.getClass();

				Method method = clazz.getMethod("setDate", Date.class);

				method.invoke(_orderRemoteModel, date);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAddress() {
		return _address;
	}

	@Override
	public void setAddress(String address) {
		_address = address;

		if (_orderRemoteModel != null) {
			try {
				Class<?> clazz = _orderRemoteModel.getClass();

				Method method = clazz.getMethod("setAddress", String.class);

				method.invoke(_orderRemoteModel, address);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getIlce() {
		return _ilce;
	}

	@Override
	public void setIlce(String ilce) {
		_ilce = ilce;

		if (_orderRemoteModel != null) {
			try {
				Class<?> clazz = _orderRemoteModel.getClass();

				Method method = clazz.getMethod("setIlce", String.class);

				method.invoke(_orderRemoteModel, ilce);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMahalle() {
		return _mahalle;
	}

	@Override
	public void setMahalle(String mahalle) {
		_mahalle = mahalle;

		if (_orderRemoteModel != null) {
			try {
				Class<?> clazz = _orderRemoteModel.getClass();

				Method method = clazz.getMethod("setMahalle", String.class);

				method.invoke(_orderRemoteModel, mahalle);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSokak() {
		return _sokak;
	}

	@Override
	public void setSokak(String sokak) {
		_sokak = sokak;

		if (_orderRemoteModel != null) {
			try {
				Class<?> clazz = _orderRemoteModel.getClass();

				Method method = clazz.getMethod("setSokak", String.class);

				method.invoke(_orderRemoteModel, sokak);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBina() {
		return _bina;
	}

	@Override
	public void setBina(String bina) {
		_bina = bina;

		if (_orderRemoteModel != null) {
			try {
				Class<?> clazz = _orderRemoteModel.getClass();

				Method method = clazz.getMethod("setBina", String.class);

				method.invoke(_orderRemoteModel, bina);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getVehicleId() {
		return _vehicleId;
	}

	@Override
	public void setVehicleId(long vehicleId) {
		_vehicleId = vehicleId;

		if (_orderRemoteModel != null) {
			try {
				Class<?> clazz = _orderRemoteModel.getClass();

				Method method = clazz.getMethod("setVehicleId", long.class);

				method.invoke(_orderRemoteModel, vehicleId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getStatusId() {
		return _statusId;
	}

	@Override
	public void setStatusId(long statusId) {
		_statusId = statusId;

		if (_orderRemoteModel != null) {
			try {
				Class<?> clazz = _orderRemoteModel.getClass();

				Method method = clazz.getMethod("setStatusId", long.class);

				method.invoke(_orderRemoteModel, statusId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPriorityId() {
		return _priorityId;
	}

	@Override
	public void setPriorityId(long priorityId) {
		_priorityId = priorityId;

		if (_orderRemoteModel != null) {
			try {
				Class<?> clazz = _orderRemoteModel.getClass();

				Method method = clazz.getMethod("setPriorityId", long.class);

				method.invoke(_orderRemoteModel, priorityId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public com.mobilekipyonetim.service.model.Vehicle getVehicle() {
		try {
			String methodName = "getVehicle";

			Class<?>[] parameterTypes = new Class<?>[] {  };

			Object[] parameterValues = new Object[] {  };

			com.mobilekipyonetim.service.model.Vehicle returnObj = (com.mobilekipyonetim.service.model.Vehicle)invokeOnRemoteModel(methodName,
					parameterTypes, parameterValues);

			return returnObj;
		}
		catch (Exception e) {
			throw new UnsupportedOperationException(e);
		}
	}

	public BaseModel<?> getOrderRemoteModel() {
		return _orderRemoteModel;
	}

	public void setOrderRemoteModel(BaseModel<?> orderRemoteModel) {
		_orderRemoteModel = orderRemoteModel;
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

		Class<?> remoteModelClass = _orderRemoteModel.getClass();

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

		Object returnValue = method.invoke(_orderRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			OrderLocalServiceUtil.addOrder(this);
		}
		else {
			OrderLocalServiceUtil.updateOrder(this);
		}
	}

	@Override
	public Order toEscapedModel() {
		return (Order)ProxyUtil.newProxyInstance(Order.class.getClassLoader(),
			new Class[] { Order.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		OrderClp clone = new OrderClp();

		clone.setOrderEntityId(getOrderEntityId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setOrganizationId(getOrganizationId());
		clone.setLat(getLat());
		clone.setLng(getLng());
		clone.setDate(getDate());
		clone.setAddress(getAddress());
		clone.setIlce(getIlce());
		clone.setMahalle(getMahalle());
		clone.setSokak(getSokak());
		clone.setBina(getBina());
		clone.setVehicleId(getVehicleId());
		clone.setStatusId(getStatusId());
		clone.setPriorityId(getPriorityId());

		return clone;
	}

	@Override
	public int compareTo(Order order) {
		int value = 0;

		value = DateUtil.compareTo(getDate(), order.getDate());

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

		if (!(obj instanceof OrderClp)) {
			return false;
		}

		OrderClp order = (OrderClp)obj;

		int primaryKey = order.getPrimaryKey();

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
		StringBundler sb = new StringBundler(39);

		sb.append("{orderEntityId=");
		sb.append(getOrderEntityId());
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
		sb.append(", organizationId=");
		sb.append(getOrganizationId());
		sb.append(", lat=");
		sb.append(getLat());
		sb.append(", lng=");
		sb.append(getLng());
		sb.append(", date=");
		sb.append(getDate());
		sb.append(", address=");
		sb.append(getAddress());
		sb.append(", ilce=");
		sb.append(getIlce());
		sb.append(", mahalle=");
		sb.append(getMahalle());
		sb.append(", sokak=");
		sb.append(getSokak());
		sb.append(", bina=");
		sb.append(getBina());
		sb.append(", vehicleId=");
		sb.append(getVehicleId());
		sb.append(", statusId=");
		sb.append(getStatusId());
		sb.append(", priorityId=");
		sb.append(getPriorityId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(61);

		sb.append("<model><model-name>");
		sb.append("com.mobilekipyonetim.service.model.Order");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>orderEntityId</column-name><column-value><![CDATA[");
		sb.append(getOrderEntityId());
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
			"<column><column-name>organizationId</column-name><column-value><![CDATA[");
		sb.append(getOrganizationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lat</column-name><column-value><![CDATA[");
		sb.append(getLat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lng</column-name><column-value><![CDATA[");
		sb.append(getLng());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>date</column-name><column-value><![CDATA[");
		sb.append(getDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>address</column-name><column-value><![CDATA[");
		sb.append(getAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ilce</column-name><column-value><![CDATA[");
		sb.append(getIlce());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mahalle</column-name><column-value><![CDATA[");
		sb.append(getMahalle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sokak</column-name><column-value><![CDATA[");
		sb.append(getSokak());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>bina</column-name><column-value><![CDATA[");
		sb.append(getBina());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vehicleId</column-name><column-value><![CDATA[");
		sb.append(getVehicleId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusId</column-name><column-value><![CDATA[");
		sb.append(getStatusId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>priorityId</column-name><column-value><![CDATA[");
		sb.append(getPriorityId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _orderEntityId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _organizationId;
	private String _lat;
	private String _lng;
	private Date _date;
	private String _address;
	private String _ilce;
	private String _mahalle;
	private String _sokak;
	private String _bina;
	private long _vehicleId;
	private long _statusId;
	private long _priorityId;
	private BaseModel<?> _orderRemoteModel;
	private Class<?> _clpSerializerClass = com.mobilekipyonetim.service.service.ClpSerializer.class;
}