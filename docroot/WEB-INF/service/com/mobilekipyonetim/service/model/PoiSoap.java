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
public class PoiSoap implements Serializable {
	public static PoiSoap toSoapModel(Poi model) {
		PoiSoap soapModel = new PoiSoap();

		soapModel.setPoiEntityId(model.getPoiEntityId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setOrganizationId(model.getOrganizationId());
		soapModel.setName(model.getName());
		soapModel.setLat(model.getLat());
		soapModel.setLng(model.getLng());

		return soapModel;
	}

	public static PoiSoap[] toSoapModels(Poi[] models) {
		PoiSoap[] soapModels = new PoiSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PoiSoap[][] toSoapModels(Poi[][] models) {
		PoiSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PoiSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PoiSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PoiSoap[] toSoapModels(List<Poi> models) {
		List<PoiSoap> soapModels = new ArrayList<PoiSoap>(models.size());

		for (Poi model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PoiSoap[soapModels.size()]);
	}

	public PoiSoap() {
	}

	public int getPrimaryKey() {
		return _poiEntityId;
	}

	public void setPrimaryKey(int pk) {
		setPoiEntityId(pk);
	}

	public int getPoiEntityId() {
		return _poiEntityId;
	}

	public void setPoiEntityId(int poiEntityId) {
		_poiEntityId = poiEntityId;
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

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
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

	private int _poiEntityId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _organizationId;
	private String _name;
	private String _lat;
	private String _lng;
}