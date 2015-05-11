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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author 002834
 * @generated
 */
public class DeviceSoap implements Serializable {
	public static DeviceSoap toSoapModel(Device model) {
		DeviceSoap soapModel = new DeviceSoap();

		soapModel.setEntityId(model.getEntityId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setMsisdn(model.getMsisdn());
		soapModel.setImei(model.getImei());
		soapModel.setRegId(model.getRegId());
		soapModel.setOrganizationId(model.getOrganizationId());

		return soapModel;
	}

	public static DeviceSoap[] toSoapModels(Device[] models) {
		DeviceSoap[] soapModels = new DeviceSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DeviceSoap[][] toSoapModels(Device[][] models) {
		DeviceSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DeviceSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DeviceSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DeviceSoap[] toSoapModels(List<Device> models) {
		List<DeviceSoap> soapModels = new ArrayList<DeviceSoap>(models.size());

		for (Device model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DeviceSoap[soapModels.size()]);
	}

	public DeviceSoap() {
	}

	public int getPrimaryKey() {
		return _entityId;
	}

	public void setPrimaryKey(int pk) {
		setEntityId(pk);
	}

	public int getEntityId() {
		return _entityId;
	}

	public void setEntityId(int entityId) {
		_entityId = entityId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getMsisdn() {
		return _msisdn;
	}

	public void setMsisdn(String msisdn) {
		_msisdn = msisdn;
	}

	public String getImei() {
		return _imei;
	}

	public void setImei(String imei) {
		_imei = imei;
	}

	public String getRegId() {
		return _regId;
	}

	public void setRegId(String regId) {
		_regId = regId;
	}

	public long getOrganizationId() {
		return _organizationId;
	}

	public void setOrganizationId(long organizationId) {
		_organizationId = organizationId;
	}

	private int _entityId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _msisdn;
	private String _imei;
	private String _regId;
	private long _organizationId;
}