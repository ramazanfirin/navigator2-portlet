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
 * This class is a wrapper for {@link Branch}.
 * </p>
 *
 * @author 002834
 * @see Branch
 * @generated
 */
public class BranchWrapper implements Branch, ModelWrapper<Branch> {
	public BranchWrapper(Branch branch) {
		_branch = branch;
	}

	@Override
	public Class<?> getModelClass() {
		return Branch.class;
	}

	@Override
	public String getModelClassName() {
		return Branch.class.getName();
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
		attributes.put("name", getName());
		attributes.put("lat", getLat());
		attributes.put("lng", getLng());
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

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Integer lat = (Integer)attributes.get("lat");

		if (lat != null) {
			setLat(lat);
		}

		Integer lng = (Integer)attributes.get("lng");

		if (lng != null) {
			setLng(lng);
		}

		Long organizationId = (Long)attributes.get("organizationId");

		if (organizationId != null) {
			setOrganizationId(organizationId);
		}
	}

	/**
	* Returns the primary key of this branch.
	*
	* @return the primary key of this branch
	*/
	@Override
	public int getPrimaryKey() {
		return _branch.getPrimaryKey();
	}

	/**
	* Sets the primary key of this branch.
	*
	* @param primaryKey the primary key of this branch
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_branch.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the entity ID of this branch.
	*
	* @return the entity ID of this branch
	*/
	@Override
	public int getEntityId() {
		return _branch.getEntityId();
	}

	/**
	* Sets the entity ID of this branch.
	*
	* @param entityId the entity ID of this branch
	*/
	@Override
	public void setEntityId(int entityId) {
		_branch.setEntityId(entityId);
	}

	/**
	* Returns the group ID of this branch.
	*
	* @return the group ID of this branch
	*/
	@Override
	public long getGroupId() {
		return _branch.getGroupId();
	}

	/**
	* Sets the group ID of this branch.
	*
	* @param groupId the group ID of this branch
	*/
	@Override
	public void setGroupId(long groupId) {
		_branch.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this branch.
	*
	* @return the company ID of this branch
	*/
	@Override
	public long getCompanyId() {
		return _branch.getCompanyId();
	}

	/**
	* Sets the company ID of this branch.
	*
	* @param companyId the company ID of this branch
	*/
	@Override
	public void setCompanyId(long companyId) {
		_branch.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this branch.
	*
	* @return the user ID of this branch
	*/
	@Override
	public long getUserId() {
		return _branch.getUserId();
	}

	/**
	* Sets the user ID of this branch.
	*
	* @param userId the user ID of this branch
	*/
	@Override
	public void setUserId(long userId) {
		_branch.setUserId(userId);
	}

	/**
	* Returns the user uuid of this branch.
	*
	* @return the user uuid of this branch
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _branch.getUserUuid();
	}

	/**
	* Sets the user uuid of this branch.
	*
	* @param userUuid the user uuid of this branch
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_branch.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this branch.
	*
	* @return the user name of this branch
	*/
	@Override
	public java.lang.String getUserName() {
		return _branch.getUserName();
	}

	/**
	* Sets the user name of this branch.
	*
	* @param userName the user name of this branch
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_branch.setUserName(userName);
	}

	/**
	* Returns the create date of this branch.
	*
	* @return the create date of this branch
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _branch.getCreateDate();
	}

	/**
	* Sets the create date of this branch.
	*
	* @param createDate the create date of this branch
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_branch.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this branch.
	*
	* @return the modified date of this branch
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _branch.getModifiedDate();
	}

	/**
	* Sets the modified date of this branch.
	*
	* @param modifiedDate the modified date of this branch
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_branch.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the name of this branch.
	*
	* @return the name of this branch
	*/
	@Override
	public java.lang.String getName() {
		return _branch.getName();
	}

	/**
	* Sets the name of this branch.
	*
	* @param name the name of this branch
	*/
	@Override
	public void setName(java.lang.String name) {
		_branch.setName(name);
	}

	/**
	* Returns the lat of this branch.
	*
	* @return the lat of this branch
	*/
	@Override
	public int getLat() {
		return _branch.getLat();
	}

	/**
	* Sets the lat of this branch.
	*
	* @param lat the lat of this branch
	*/
	@Override
	public void setLat(int lat) {
		_branch.setLat(lat);
	}

	/**
	* Returns the lng of this branch.
	*
	* @return the lng of this branch
	*/
	@Override
	public int getLng() {
		return _branch.getLng();
	}

	/**
	* Sets the lng of this branch.
	*
	* @param lng the lng of this branch
	*/
	@Override
	public void setLng(int lng) {
		_branch.setLng(lng);
	}

	/**
	* Returns the organization ID of this branch.
	*
	* @return the organization ID of this branch
	*/
	@Override
	public long getOrganizationId() {
		return _branch.getOrganizationId();
	}

	/**
	* Sets the organization ID of this branch.
	*
	* @param organizationId the organization ID of this branch
	*/
	@Override
	public void setOrganizationId(long organizationId) {
		_branch.setOrganizationId(organizationId);
	}

	@Override
	public boolean isNew() {
		return _branch.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_branch.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _branch.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_branch.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _branch.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _branch.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_branch.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _branch.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_branch.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_branch.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_branch.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new BranchWrapper((Branch)_branch.clone());
	}

	@Override
	public int compareTo(Branch branch) {
		return _branch.compareTo(branch);
	}

	@Override
	public int hashCode() {
		return _branch.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<Branch> toCacheModel() {
		return _branch.toCacheModel();
	}

	@Override
	public Branch toEscapedModel() {
		return new BranchWrapper(_branch.toEscapedModel());
	}

	@Override
	public Branch toUnescapedModel() {
		return new BranchWrapper(_branch.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _branch.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _branch.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_branch.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BranchWrapper)) {
			return false;
		}

		BranchWrapper branchWrapper = (BranchWrapper)obj;

		if (Validator.equals(_branch, branchWrapper._branch)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Branch getWrappedBranch() {
		return _branch;
	}

	@Override
	public Branch getWrappedModel() {
		return _branch;
	}

	@Override
	public void resetOriginalValues() {
		_branch.resetOriginalValues();
	}

	private Branch _branch;
}