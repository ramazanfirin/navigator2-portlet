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
import com.mobilekipyonetim.service.service.PoiLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 002834
 */
public class PoiClp extends BaseModelImpl<Poi> implements Poi {
	public PoiClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Poi.class;
	}

	@Override
	public String getModelClassName() {
		return Poi.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _poiEntityId;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setPoiEntityId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _poiEntityId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("poiEntityId", getPoiEntityId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("organizationId", getOrganizationId());
		attributes.put("name", getName());
		attributes.put("lat", getLat());
		attributes.put("lng", getLng());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer poiEntityId = (Integer)attributes.get("poiEntityId");

		if (poiEntityId != null) {
			setPoiEntityId(poiEntityId);
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

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String lat = (String)attributes.get("lat");

		if (lat != null) {
			setLat(lat);
		}

		String lng = (String)attributes.get("lng");

		if (lng != null) {
			setLng(lng);
		}
	}

	@Override
	public int getPoiEntityId() {
		return _poiEntityId;
	}

	@Override
	public void setPoiEntityId(int poiEntityId) {
		_poiEntityId = poiEntityId;

		if (_poiRemoteModel != null) {
			try {
				Class<?> clazz = _poiRemoteModel.getClass();

				Method method = clazz.getMethod("setPoiEntityId", int.class);

				method.invoke(_poiRemoteModel, poiEntityId);
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

		if (_poiRemoteModel != null) {
			try {
				Class<?> clazz = _poiRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_poiRemoteModel, groupId);
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

		if (_poiRemoteModel != null) {
			try {
				Class<?> clazz = _poiRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_poiRemoteModel, companyId);
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

		if (_poiRemoteModel != null) {
			try {
				Class<?> clazz = _poiRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_poiRemoteModel, userId);
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

		if (_poiRemoteModel != null) {
			try {
				Class<?> clazz = _poiRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_poiRemoteModel, userName);
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

		if (_poiRemoteModel != null) {
			try {
				Class<?> clazz = _poiRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_poiRemoteModel, createDate);
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

		if (_poiRemoteModel != null) {
			try {
				Class<?> clazz = _poiRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_poiRemoteModel, modifiedDate);
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

		if (_poiRemoteModel != null) {
			try {
				Class<?> clazz = _poiRemoteModel.getClass();

				Method method = clazz.getMethod("setOrganizationId", long.class);

				method.invoke(_poiRemoteModel, organizationId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public void setName(String name) {
		_name = name;

		if (_poiRemoteModel != null) {
			try {
				Class<?> clazz = _poiRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_poiRemoteModel, name);
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

		if (_poiRemoteModel != null) {
			try {
				Class<?> clazz = _poiRemoteModel.getClass();

				Method method = clazz.getMethod("setLat", String.class);

				method.invoke(_poiRemoteModel, lat);
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

		if (_poiRemoteModel != null) {
			try {
				Class<?> clazz = _poiRemoteModel.getClass();

				Method method = clazz.getMethod("setLng", String.class);

				method.invoke(_poiRemoteModel, lng);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getPoiRemoteModel() {
		return _poiRemoteModel;
	}

	public void setPoiRemoteModel(BaseModel<?> poiRemoteModel) {
		_poiRemoteModel = poiRemoteModel;
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

		Class<?> remoteModelClass = _poiRemoteModel.getClass();

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

		Object returnValue = method.invoke(_poiRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PoiLocalServiceUtil.addPoi(this);
		}
		else {
			PoiLocalServiceUtil.updatePoi(this);
		}
	}

	@Override
	public Poi toEscapedModel() {
		return (Poi)ProxyUtil.newProxyInstance(Poi.class.getClassLoader(),
			new Class[] { Poi.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PoiClp clone = new PoiClp();

		clone.setPoiEntityId(getPoiEntityId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setOrganizationId(getOrganizationId());
		clone.setName(getName());
		clone.setLat(getLat());
		clone.setLng(getLng());

		return clone;
	}

	@Override
	public int compareTo(Poi poi) {
		int primaryKey = poi.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PoiClp)) {
			return false;
		}

		PoiClp poi = (PoiClp)obj;

		int primaryKey = poi.getPrimaryKey();

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

		sb.append("{poiEntityId=");
		sb.append(getPoiEntityId());
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
		sb.append(", name=");
		sb.append(getName());
		sb.append(", lat=");
		sb.append(getLat());
		sb.append(", lng=");
		sb.append(getLng());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.mobilekipyonetim.service.model.Poi");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>poiEntityId</column-name><column-value><![CDATA[");
		sb.append(getPoiEntityId());
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
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lat</column-name><column-value><![CDATA[");
		sb.append(getLat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lng</column-name><column-value><![CDATA[");
		sb.append(getLng());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _poiEntityId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _organizationId;
	private String _name;
	private String _lat;
	private String _lng;
	private BaseModel<?> _poiRemoteModel;
	private Class<?> _clpSerializerClass = com.mobilekipyonetim.service.service.ClpSerializer.class;
}