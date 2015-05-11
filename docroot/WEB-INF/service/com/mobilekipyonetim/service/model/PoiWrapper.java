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
 * This class is a wrapper for {@link Poi}.
 * </p>
 *
 * @author 002834
 * @see Poi
 * @generated
 */
public class PoiWrapper implements Poi, ModelWrapper<Poi> {
	public PoiWrapper(Poi poi) {
		_poi = poi;
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

	/**
	* Returns the primary key of this poi.
	*
	* @return the primary key of this poi
	*/
	@Override
	public int getPrimaryKey() {
		return _poi.getPrimaryKey();
	}

	/**
	* Sets the primary key of this poi.
	*
	* @param primaryKey the primary key of this poi
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_poi.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the poi entity ID of this poi.
	*
	* @return the poi entity ID of this poi
	*/
	@Override
	public int getPoiEntityId() {
		return _poi.getPoiEntityId();
	}

	/**
	* Sets the poi entity ID of this poi.
	*
	* @param poiEntityId the poi entity ID of this poi
	*/
	@Override
	public void setPoiEntityId(int poiEntityId) {
		_poi.setPoiEntityId(poiEntityId);
	}

	/**
	* Returns the group ID of this poi.
	*
	* @return the group ID of this poi
	*/
	@Override
	public long getGroupId() {
		return _poi.getGroupId();
	}

	/**
	* Sets the group ID of this poi.
	*
	* @param groupId the group ID of this poi
	*/
	@Override
	public void setGroupId(long groupId) {
		_poi.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this poi.
	*
	* @return the company ID of this poi
	*/
	@Override
	public long getCompanyId() {
		return _poi.getCompanyId();
	}

	/**
	* Sets the company ID of this poi.
	*
	* @param companyId the company ID of this poi
	*/
	@Override
	public void setCompanyId(long companyId) {
		_poi.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this poi.
	*
	* @return the user ID of this poi
	*/
	@Override
	public long getUserId() {
		return _poi.getUserId();
	}

	/**
	* Sets the user ID of this poi.
	*
	* @param userId the user ID of this poi
	*/
	@Override
	public void setUserId(long userId) {
		_poi.setUserId(userId);
	}

	/**
	* Returns the user uuid of this poi.
	*
	* @return the user uuid of this poi
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _poi.getUserUuid();
	}

	/**
	* Sets the user uuid of this poi.
	*
	* @param userUuid the user uuid of this poi
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_poi.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this poi.
	*
	* @return the user name of this poi
	*/
	@Override
	public java.lang.String getUserName() {
		return _poi.getUserName();
	}

	/**
	* Sets the user name of this poi.
	*
	* @param userName the user name of this poi
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_poi.setUserName(userName);
	}

	/**
	* Returns the create date of this poi.
	*
	* @return the create date of this poi
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _poi.getCreateDate();
	}

	/**
	* Sets the create date of this poi.
	*
	* @param createDate the create date of this poi
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_poi.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this poi.
	*
	* @return the modified date of this poi
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _poi.getModifiedDate();
	}

	/**
	* Sets the modified date of this poi.
	*
	* @param modifiedDate the modified date of this poi
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_poi.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the organization ID of this poi.
	*
	* @return the organization ID of this poi
	*/
	@Override
	public long getOrganizationId() {
		return _poi.getOrganizationId();
	}

	/**
	* Sets the organization ID of this poi.
	*
	* @param organizationId the organization ID of this poi
	*/
	@Override
	public void setOrganizationId(long organizationId) {
		_poi.setOrganizationId(organizationId);
	}

	/**
	* Returns the name of this poi.
	*
	* @return the name of this poi
	*/
	@Override
	public java.lang.String getName() {
		return _poi.getName();
	}

	/**
	* Sets the name of this poi.
	*
	* @param name the name of this poi
	*/
	@Override
	public void setName(java.lang.String name) {
		_poi.setName(name);
	}

	/**
	* Returns the lat of this poi.
	*
	* @return the lat of this poi
	*/
	@Override
	public java.lang.String getLat() {
		return _poi.getLat();
	}

	/**
	* Sets the lat of this poi.
	*
	* @param lat the lat of this poi
	*/
	@Override
	public void setLat(java.lang.String lat) {
		_poi.setLat(lat);
	}

	/**
	* Returns the lng of this poi.
	*
	* @return the lng of this poi
	*/
	@Override
	public java.lang.String getLng() {
		return _poi.getLng();
	}

	/**
	* Sets the lng of this poi.
	*
	* @param lng the lng of this poi
	*/
	@Override
	public void setLng(java.lang.String lng) {
		_poi.setLng(lng);
	}

	@Override
	public boolean isNew() {
		return _poi.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_poi.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _poi.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_poi.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _poi.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _poi.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_poi.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _poi.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_poi.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_poi.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_poi.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PoiWrapper((Poi)_poi.clone());
	}

	@Override
	public int compareTo(Poi poi) {
		return _poi.compareTo(poi);
	}

	@Override
	public int hashCode() {
		return _poi.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<Poi> toCacheModel() {
		return _poi.toCacheModel();
	}

	@Override
	public Poi toEscapedModel() {
		return new PoiWrapper(_poi.toEscapedModel());
	}

	@Override
	public Poi toUnescapedModel() {
		return new PoiWrapper(_poi.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _poi.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _poi.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_poi.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PoiWrapper)) {
			return false;
		}

		PoiWrapper poiWrapper = (PoiWrapper)obj;

		if (Validator.equals(_poi, poiWrapper._poi)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Poi getWrappedPoi() {
		return _poi;
	}

	@Override
	public Poi getWrappedModel() {
		return _poi;
	}

	@Override
	public void resetOriginalValues() {
		_poi.resetOriginalValues();
	}

	private Poi _poi;
}