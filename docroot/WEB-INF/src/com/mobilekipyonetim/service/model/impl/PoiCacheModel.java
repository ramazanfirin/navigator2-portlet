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

package com.mobilekipyonetim.service.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.mobilekipyonetim.service.model.Poi;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Poi in entity cache.
 *
 * @author 002834
 * @see Poi
 * @generated
 */
public class PoiCacheModel implements CacheModel<Poi>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{poiEntityId=");
		sb.append(poiEntityId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", organizationId=");
		sb.append(organizationId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", lat=");
		sb.append(lat);
		sb.append(", lng=");
		sb.append(lng);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Poi toEntityModel() {
		PoiImpl poiImpl = new PoiImpl();

		poiImpl.setPoiEntityId(poiEntityId);
		poiImpl.setGroupId(groupId);
		poiImpl.setCompanyId(companyId);
		poiImpl.setUserId(userId);

		if (userName == null) {
			poiImpl.setUserName(StringPool.BLANK);
		}
		else {
			poiImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			poiImpl.setCreateDate(null);
		}
		else {
			poiImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			poiImpl.setModifiedDate(null);
		}
		else {
			poiImpl.setModifiedDate(new Date(modifiedDate));
		}

		poiImpl.setOrganizationId(organizationId);

		if (name == null) {
			poiImpl.setName(StringPool.BLANK);
		}
		else {
			poiImpl.setName(name);
		}

		if (lat == null) {
			poiImpl.setLat(StringPool.BLANK);
		}
		else {
			poiImpl.setLat(lat);
		}

		if (lng == null) {
			poiImpl.setLng(StringPool.BLANK);
		}
		else {
			poiImpl.setLng(lng);
		}

		poiImpl.resetOriginalValues();

		return poiImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		poiEntityId = objectInput.readInt();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		organizationId = objectInput.readLong();
		name = objectInput.readUTF();
		lat = objectInput.readUTF();
		lng = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(poiEntityId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(organizationId);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (lat == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lat);
		}

		if (lng == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lng);
		}
	}

	public int poiEntityId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long organizationId;
	public String name;
	public String lat;
	public String lng;
}