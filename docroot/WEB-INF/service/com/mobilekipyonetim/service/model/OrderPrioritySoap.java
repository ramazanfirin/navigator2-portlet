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
public class OrderPrioritySoap implements Serializable {
	public static OrderPrioritySoap toSoapModel(OrderPriority model) {
		OrderPrioritySoap soapModel = new OrderPrioritySoap();

		soapModel.setOrderPriorityEntityId(model.getOrderPriorityEntityId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setOrganizationId(model.getOrganizationId());
		soapModel.setDescription(model.getDescription());

		return soapModel;
	}

	public static OrderPrioritySoap[] toSoapModels(OrderPriority[] models) {
		OrderPrioritySoap[] soapModels = new OrderPrioritySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static OrderPrioritySoap[][] toSoapModels(OrderPriority[][] models) {
		OrderPrioritySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new OrderPrioritySoap[models.length][models[0].length];
		}
		else {
			soapModels = new OrderPrioritySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static OrderPrioritySoap[] toSoapModels(List<OrderPriority> models) {
		List<OrderPrioritySoap> soapModels = new ArrayList<OrderPrioritySoap>(models.size());

		for (OrderPriority model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new OrderPrioritySoap[soapModels.size()]);
	}

	public OrderPrioritySoap() {
	}

	public int getPrimaryKey() {
		return _orderPriorityEntityId;
	}

	public void setPrimaryKey(int pk) {
		setOrderPriorityEntityId(pk);
	}

	public int getOrderPriorityEntityId() {
		return _orderPriorityEntityId;
	}

	public void setOrderPriorityEntityId(int orderPriorityEntityId) {
		_orderPriorityEntityId = orderPriorityEntityId;
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

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	private int _orderPriorityEntityId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _organizationId;
	private String _description;
}