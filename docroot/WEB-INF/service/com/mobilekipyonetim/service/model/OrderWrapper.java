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
 * This class is a wrapper for {@link Order}.
 * </p>
 *
 * @author 002834
 * @see Order
 * @generated
 */
public class OrderWrapper implements Order, ModelWrapper<Order> {
	public OrderWrapper(Order order) {
		_order = order;
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

	/**
	* Returns the primary key of this order.
	*
	* @return the primary key of this order
	*/
	@Override
	public int getPrimaryKey() {
		return _order.getPrimaryKey();
	}

	/**
	* Sets the primary key of this order.
	*
	* @param primaryKey the primary key of this order
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_order.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the order entity ID of this order.
	*
	* @return the order entity ID of this order
	*/
	@Override
	public int getOrderEntityId() {
		return _order.getOrderEntityId();
	}

	/**
	* Sets the order entity ID of this order.
	*
	* @param orderEntityId the order entity ID of this order
	*/
	@Override
	public void setOrderEntityId(int orderEntityId) {
		_order.setOrderEntityId(orderEntityId);
	}

	/**
	* Returns the group ID of this order.
	*
	* @return the group ID of this order
	*/
	@Override
	public long getGroupId() {
		return _order.getGroupId();
	}

	/**
	* Sets the group ID of this order.
	*
	* @param groupId the group ID of this order
	*/
	@Override
	public void setGroupId(long groupId) {
		_order.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this order.
	*
	* @return the company ID of this order
	*/
	@Override
	public long getCompanyId() {
		return _order.getCompanyId();
	}

	/**
	* Sets the company ID of this order.
	*
	* @param companyId the company ID of this order
	*/
	@Override
	public void setCompanyId(long companyId) {
		_order.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this order.
	*
	* @return the user ID of this order
	*/
	@Override
	public long getUserId() {
		return _order.getUserId();
	}

	/**
	* Sets the user ID of this order.
	*
	* @param userId the user ID of this order
	*/
	@Override
	public void setUserId(long userId) {
		_order.setUserId(userId);
	}

	/**
	* Returns the user uuid of this order.
	*
	* @return the user uuid of this order
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _order.getUserUuid();
	}

	/**
	* Sets the user uuid of this order.
	*
	* @param userUuid the user uuid of this order
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_order.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this order.
	*
	* @return the user name of this order
	*/
	@Override
	public java.lang.String getUserName() {
		return _order.getUserName();
	}

	/**
	* Sets the user name of this order.
	*
	* @param userName the user name of this order
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_order.setUserName(userName);
	}

	/**
	* Returns the create date of this order.
	*
	* @return the create date of this order
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _order.getCreateDate();
	}

	/**
	* Sets the create date of this order.
	*
	* @param createDate the create date of this order
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_order.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this order.
	*
	* @return the modified date of this order
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _order.getModifiedDate();
	}

	/**
	* Sets the modified date of this order.
	*
	* @param modifiedDate the modified date of this order
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_order.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the organization ID of this order.
	*
	* @return the organization ID of this order
	*/
	@Override
	public long getOrganizationId() {
		return _order.getOrganizationId();
	}

	/**
	* Sets the organization ID of this order.
	*
	* @param organizationId the organization ID of this order
	*/
	@Override
	public void setOrganizationId(long organizationId) {
		_order.setOrganizationId(organizationId);
	}

	/**
	* Returns the lat of this order.
	*
	* @return the lat of this order
	*/
	@Override
	public java.lang.String getLat() {
		return _order.getLat();
	}

	/**
	* Sets the lat of this order.
	*
	* @param lat the lat of this order
	*/
	@Override
	public void setLat(java.lang.String lat) {
		_order.setLat(lat);
	}

	/**
	* Returns the lng of this order.
	*
	* @return the lng of this order
	*/
	@Override
	public java.lang.String getLng() {
		return _order.getLng();
	}

	/**
	* Sets the lng of this order.
	*
	* @param lng the lng of this order
	*/
	@Override
	public void setLng(java.lang.String lng) {
		_order.setLng(lng);
	}

	/**
	* Returns the date of this order.
	*
	* @return the date of this order
	*/
	@Override
	public java.util.Date getDate() {
		return _order.getDate();
	}

	/**
	* Sets the date of this order.
	*
	* @param date the date of this order
	*/
	@Override
	public void setDate(java.util.Date date) {
		_order.setDate(date);
	}

	/**
	* Returns the address of this order.
	*
	* @return the address of this order
	*/
	@Override
	public java.lang.String getAddress() {
		return _order.getAddress();
	}

	/**
	* Sets the address of this order.
	*
	* @param address the address of this order
	*/
	@Override
	public void setAddress(java.lang.String address) {
		_order.setAddress(address);
	}

	/**
	* Returns the ilce of this order.
	*
	* @return the ilce of this order
	*/
	@Override
	public java.lang.String getIlce() {
		return _order.getIlce();
	}

	/**
	* Sets the ilce of this order.
	*
	* @param ilce the ilce of this order
	*/
	@Override
	public void setIlce(java.lang.String ilce) {
		_order.setIlce(ilce);
	}

	/**
	* Returns the mahalle of this order.
	*
	* @return the mahalle of this order
	*/
	@Override
	public java.lang.String getMahalle() {
		return _order.getMahalle();
	}

	/**
	* Sets the mahalle of this order.
	*
	* @param mahalle the mahalle of this order
	*/
	@Override
	public void setMahalle(java.lang.String mahalle) {
		_order.setMahalle(mahalle);
	}

	/**
	* Returns the sokak of this order.
	*
	* @return the sokak of this order
	*/
	@Override
	public java.lang.String getSokak() {
		return _order.getSokak();
	}

	/**
	* Sets the sokak of this order.
	*
	* @param sokak the sokak of this order
	*/
	@Override
	public void setSokak(java.lang.String sokak) {
		_order.setSokak(sokak);
	}

	/**
	* Returns the bina of this order.
	*
	* @return the bina of this order
	*/
	@Override
	public java.lang.String getBina() {
		return _order.getBina();
	}

	/**
	* Sets the bina of this order.
	*
	* @param bina the bina of this order
	*/
	@Override
	public void setBina(java.lang.String bina) {
		_order.setBina(bina);
	}

	/**
	* Returns the vehicle ID of this order.
	*
	* @return the vehicle ID of this order
	*/
	@Override
	public long getVehicleId() {
		return _order.getVehicleId();
	}

	/**
	* Sets the vehicle ID of this order.
	*
	* @param vehicleId the vehicle ID of this order
	*/
	@Override
	public void setVehicleId(long vehicleId) {
		_order.setVehicleId(vehicleId);
	}

	/**
	* Returns the status ID of this order.
	*
	* @return the status ID of this order
	*/
	@Override
	public long getStatusId() {
		return _order.getStatusId();
	}

	/**
	* Sets the status ID of this order.
	*
	* @param statusId the status ID of this order
	*/
	@Override
	public void setStatusId(long statusId) {
		_order.setStatusId(statusId);
	}

	/**
	* Returns the priority ID of this order.
	*
	* @return the priority ID of this order
	*/
	@Override
	public long getPriorityId() {
		return _order.getPriorityId();
	}

	/**
	* Sets the priority ID of this order.
	*
	* @param priorityId the priority ID of this order
	*/
	@Override
	public void setPriorityId(long priorityId) {
		_order.setPriorityId(priorityId);
	}

	@Override
	public boolean isNew() {
		return _order.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_order.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _order.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_order.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _order.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _order.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_order.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _order.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_order.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_order.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_order.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new OrderWrapper((Order)_order.clone());
	}

	@Override
	public int compareTo(Order order) {
		return _order.compareTo(order);
	}

	@Override
	public int hashCode() {
		return _order.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<Order> toCacheModel() {
		return _order.toCacheModel();
	}

	@Override
	public Order toEscapedModel() {
		return new OrderWrapper(_order.toEscapedModel());
	}

	@Override
	public Order toUnescapedModel() {
		return new OrderWrapper(_order.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _order.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _order.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_order.persist();
	}

	@Override
	public com.mobilekipyonetim.service.model.Vehicle getVehicle() {
		return _order.getVehicle();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OrderWrapper)) {
			return false;
		}

		OrderWrapper orderWrapper = (OrderWrapper)obj;

		if (Validator.equals(_order, orderWrapper._order)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Order getWrappedOrder() {
		return _order;
	}

	@Override
	public Order getWrappedModel() {
		return _order;
	}

	@Override
	public void resetOriginalValues() {
		_order.resetOriginalValues();
	}

	private Order _order;
}