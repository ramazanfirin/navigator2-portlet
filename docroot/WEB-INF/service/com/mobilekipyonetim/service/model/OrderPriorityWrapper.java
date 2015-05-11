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
 * This class is a wrapper for {@link OrderPriority}.
 * </p>
 *
 * @author 002834
 * @see OrderPriority
 * @generated
 */
public class OrderPriorityWrapper implements OrderPriority,
	ModelWrapper<OrderPriority> {
	public OrderPriorityWrapper(OrderPriority orderPriority) {
		_orderPriority = orderPriority;
	}

	@Override
	public Class<?> getModelClass() {
		return OrderPriority.class;
	}

	@Override
	public String getModelClassName() {
		return OrderPriority.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("orderPriorityEntityId", getOrderPriorityEntityId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("organizationId", getOrganizationId());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer orderPriorityEntityId = (Integer)attributes.get(
				"orderPriorityEntityId");

		if (orderPriorityEntityId != null) {
			setOrderPriorityEntityId(orderPriorityEntityId);
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

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	/**
	* Returns the primary key of this order priority.
	*
	* @return the primary key of this order priority
	*/
	@Override
	public int getPrimaryKey() {
		return _orderPriority.getPrimaryKey();
	}

	/**
	* Sets the primary key of this order priority.
	*
	* @param primaryKey the primary key of this order priority
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_orderPriority.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the order priority entity ID of this order priority.
	*
	* @return the order priority entity ID of this order priority
	*/
	@Override
	public int getOrderPriorityEntityId() {
		return _orderPriority.getOrderPriorityEntityId();
	}

	/**
	* Sets the order priority entity ID of this order priority.
	*
	* @param orderPriorityEntityId the order priority entity ID of this order priority
	*/
	@Override
	public void setOrderPriorityEntityId(int orderPriorityEntityId) {
		_orderPriority.setOrderPriorityEntityId(orderPriorityEntityId);
	}

	/**
	* Returns the group ID of this order priority.
	*
	* @return the group ID of this order priority
	*/
	@Override
	public long getGroupId() {
		return _orderPriority.getGroupId();
	}

	/**
	* Sets the group ID of this order priority.
	*
	* @param groupId the group ID of this order priority
	*/
	@Override
	public void setGroupId(long groupId) {
		_orderPriority.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this order priority.
	*
	* @return the company ID of this order priority
	*/
	@Override
	public long getCompanyId() {
		return _orderPriority.getCompanyId();
	}

	/**
	* Sets the company ID of this order priority.
	*
	* @param companyId the company ID of this order priority
	*/
	@Override
	public void setCompanyId(long companyId) {
		_orderPriority.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this order priority.
	*
	* @return the user ID of this order priority
	*/
	@Override
	public long getUserId() {
		return _orderPriority.getUserId();
	}

	/**
	* Sets the user ID of this order priority.
	*
	* @param userId the user ID of this order priority
	*/
	@Override
	public void setUserId(long userId) {
		_orderPriority.setUserId(userId);
	}

	/**
	* Returns the user uuid of this order priority.
	*
	* @return the user uuid of this order priority
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _orderPriority.getUserUuid();
	}

	/**
	* Sets the user uuid of this order priority.
	*
	* @param userUuid the user uuid of this order priority
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_orderPriority.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this order priority.
	*
	* @return the user name of this order priority
	*/
	@Override
	public java.lang.String getUserName() {
		return _orderPriority.getUserName();
	}

	/**
	* Sets the user name of this order priority.
	*
	* @param userName the user name of this order priority
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_orderPriority.setUserName(userName);
	}

	/**
	* Returns the create date of this order priority.
	*
	* @return the create date of this order priority
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _orderPriority.getCreateDate();
	}

	/**
	* Sets the create date of this order priority.
	*
	* @param createDate the create date of this order priority
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_orderPriority.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this order priority.
	*
	* @return the modified date of this order priority
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _orderPriority.getModifiedDate();
	}

	/**
	* Sets the modified date of this order priority.
	*
	* @param modifiedDate the modified date of this order priority
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_orderPriority.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the organization ID of this order priority.
	*
	* @return the organization ID of this order priority
	*/
	@Override
	public long getOrganizationId() {
		return _orderPriority.getOrganizationId();
	}

	/**
	* Sets the organization ID of this order priority.
	*
	* @param organizationId the organization ID of this order priority
	*/
	@Override
	public void setOrganizationId(long organizationId) {
		_orderPriority.setOrganizationId(organizationId);
	}

	/**
	* Returns the description of this order priority.
	*
	* @return the description of this order priority
	*/
	@Override
	public java.lang.String getDescription() {
		return _orderPriority.getDescription();
	}

	/**
	* Sets the description of this order priority.
	*
	* @param description the description of this order priority
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_orderPriority.setDescription(description);
	}

	@Override
	public boolean isNew() {
		return _orderPriority.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_orderPriority.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _orderPriority.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_orderPriority.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _orderPriority.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _orderPriority.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_orderPriority.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _orderPriority.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_orderPriority.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_orderPriority.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_orderPriority.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new OrderPriorityWrapper((OrderPriority)_orderPriority.clone());
	}

	@Override
	public int compareTo(OrderPriority orderPriority) {
		return _orderPriority.compareTo(orderPriority);
	}

	@Override
	public int hashCode() {
		return _orderPriority.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<OrderPriority> toCacheModel() {
		return _orderPriority.toCacheModel();
	}

	@Override
	public OrderPriority toEscapedModel() {
		return new OrderPriorityWrapper(_orderPriority.toEscapedModel());
	}

	@Override
	public OrderPriority toUnescapedModel() {
		return new OrderPriorityWrapper(_orderPriority.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _orderPriority.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _orderPriority.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_orderPriority.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OrderPriorityWrapper)) {
			return false;
		}

		OrderPriorityWrapper orderPriorityWrapper = (OrderPriorityWrapper)obj;

		if (Validator.equals(_orderPriority, orderPriorityWrapper._orderPriority)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public OrderPriority getWrappedOrderPriority() {
		return _orderPriority;
	}

	@Override
	public OrderPriority getWrappedModel() {
		return _orderPriority;
	}

	@Override
	public void resetOriginalValues() {
		_orderPriority.resetOriginalValues();
	}

	private OrderPriority _orderPriority;
}