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

import com.mobilekipyonetim.service.model.Branch;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Branch in entity cache.
 *
 * @author 002834
 * @see Branch
 * @generated
 */
public class BranchCacheModel implements CacheModel<Branch>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{entityId=");
		sb.append(entityId);
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
		sb.append(", name=");
		sb.append(name);
		sb.append(", lat=");
		sb.append(lat);
		sb.append(", lng=");
		sb.append(lng);
		sb.append(", organizationId=");
		sb.append(organizationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Branch toEntityModel() {
		BranchImpl branchImpl = new BranchImpl();

		branchImpl.setEntityId(entityId);
		branchImpl.setGroupId(groupId);
		branchImpl.setCompanyId(companyId);
		branchImpl.setUserId(userId);

		if (userName == null) {
			branchImpl.setUserName(StringPool.BLANK);
		}
		else {
			branchImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			branchImpl.setCreateDate(null);
		}
		else {
			branchImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			branchImpl.setModifiedDate(null);
		}
		else {
			branchImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			branchImpl.setName(StringPool.BLANK);
		}
		else {
			branchImpl.setName(name);
		}

		branchImpl.setLat(lat);
		branchImpl.setLng(lng);
		branchImpl.setOrganizationId(organizationId);

		branchImpl.resetOriginalValues();

		return branchImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		entityId = objectInput.readInt();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		lat = objectInput.readInt();
		lng = objectInput.readInt();
		organizationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(entityId);
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

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeInt(lat);
		objectOutput.writeInt(lng);
		objectOutput.writeLong(organizationId);
	}

	public int entityId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public int lat;
	public int lng;
	public long organizationId;
}