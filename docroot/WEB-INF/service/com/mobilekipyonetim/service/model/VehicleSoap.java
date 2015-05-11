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
public class VehicleSoap implements Serializable {
	public static VehicleSoap toSoapModel(Vehicle model) {
		VehicleSoap soapModel = new VehicleSoap();

		soapModel.setVehicleEntityId(model.getVehicleEntityId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setPlate(model.getPlate());
		soapModel.setOrganizationId(model.getOrganizationId());
		soapModel.setDeviceId(model.getDeviceId());

		return soapModel;
	}

	public static VehicleSoap[] toSoapModels(Vehicle[] models) {
		VehicleSoap[] soapModels = new VehicleSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VehicleSoap[][] toSoapModels(Vehicle[][] models) {
		VehicleSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VehicleSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VehicleSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VehicleSoap[] toSoapModels(List<Vehicle> models) {
		List<VehicleSoap> soapModels = new ArrayList<VehicleSoap>(models.size());

		for (Vehicle model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VehicleSoap[soapModels.size()]);
	}

	public VehicleSoap() {
	}

	public int getPrimaryKey() {
		return _vehicleEntityId;
	}

	public void setPrimaryKey(int pk) {
		setVehicleEntityId(pk);
	}

	public int getVehicleEntityId() {
		return _vehicleEntityId;
	}

	public void setVehicleEntityId(int vehicleEntityId) {
		_vehicleEntityId = vehicleEntityId;
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

	public String getPlate() {
		return _plate;
	}

	public void setPlate(String plate) {
		_plate = plate;
	}

	public long getOrganizationId() {
		return _organizationId;
	}

	public void setOrganizationId(long organizationId) {
		_organizationId = organizationId;
	}

	public long getDeviceId() {
		return _deviceId;
	}

	public void setDeviceId(long deviceId) {
		_deviceId = deviceId;
	}

	private int _vehicleEntityId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _plate;
	private long _organizationId;
	private long _deviceId;
}