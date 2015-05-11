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
public class OrderSoap implements Serializable {
	public static OrderSoap toSoapModel(Order model) {
		OrderSoap soapModel = new OrderSoap();

		soapModel.setOrderEntityId(model.getOrderEntityId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setOrganizationId(model.getOrganizationId());
		soapModel.setLat(model.getLat());
		soapModel.setLng(model.getLng());
		soapModel.setDate(model.getDate());
		soapModel.setAddress(model.getAddress());
		soapModel.setIlce(model.getIlce());
		soapModel.setMahalle(model.getMahalle());
		soapModel.setSokak(model.getSokak());
		soapModel.setBina(model.getBina());
		soapModel.setVehicleId(model.getVehicleId());
		soapModel.setStatusId(model.getStatusId());
		soapModel.setPriorityId(model.getPriorityId());

		return soapModel;
	}

	public static OrderSoap[] toSoapModels(Order[] models) {
		OrderSoap[] soapModels = new OrderSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static OrderSoap[][] toSoapModels(Order[][] models) {
		OrderSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new OrderSoap[models.length][models[0].length];
		}
		else {
			soapModels = new OrderSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static OrderSoap[] toSoapModels(List<Order> models) {
		List<OrderSoap> soapModels = new ArrayList<OrderSoap>(models.size());

		for (Order model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new OrderSoap[soapModels.size()]);
	}

	public OrderSoap() {
	}

	public int getPrimaryKey() {
		return _orderEntityId;
	}

	public void setPrimaryKey(int pk) {
		setOrderEntityId(pk);
	}

	public int getOrderEntityId() {
		return _orderEntityId;
	}

	public void setOrderEntityId(int orderEntityId) {
		_orderEntityId = orderEntityId;
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

	public long getOrganizationId() {
		return _organizationId;
	}

	public void setOrganizationId(long organizationId) {
		_organizationId = organizationId;
	}

	public String getLat() {
		return _lat;
	}

	public void setLat(String lat) {
		_lat = lat;
	}

	public String getLng() {
		return _lng;
	}

	public void setLng(String lng) {
		_lng = lng;
	}

	public Date getDate() {
		return _date;
	}

	public void setDate(Date date) {
		_date = date;
	}

	public String getAddress() {
		return _address;
	}

	public void setAddress(String address) {
		_address = address;
	}

	public String getIlce() {
		return _ilce;
	}

	public void setIlce(String ilce) {
		_ilce = ilce;
	}

	public String getMahalle() {
		return _mahalle;
	}

	public void setMahalle(String mahalle) {
		_mahalle = mahalle;
	}

	public String getSokak() {
		return _sokak;
	}

	public void setSokak(String sokak) {
		_sokak = sokak;
	}

	public String getBina() {
		return _bina;
	}

	public void setBina(String bina) {
		_bina = bina;
	}

	public long getVehicleId() {
		return _vehicleId;
	}

	public void setVehicleId(long vehicleId) {
		_vehicleId = vehicleId;
	}

	public long getStatusId() {
		return _statusId;
	}

	public void setStatusId(long statusId) {
		_statusId = statusId;
	}

	public long getPriorityId() {
		return _priorityId;
	}

	public void setPriorityId(long priorityId) {
		_priorityId = priorityId;
	}

	private int _orderEntityId;
	private long _groupId;
	private long _companyId;
	private long _userId;
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
}