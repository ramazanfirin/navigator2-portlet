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

import com.mobilekipyonetim.service.model.Device;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Device in entity cache.
 *
 * @author 002834
 * @see Device
 * @generated
 */
public class DeviceCacheModel implements CacheModel<Device>, Externalizable {
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
		sb.append(", msisdn=");
		sb.append(msisdn);
		sb.append(", imei=");
		sb.append(imei);
		sb.append(", regId=");
		sb.append(regId);
		sb.append(", organizationId=");
		sb.append(organizationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Device toEntityModel() {
		DeviceImpl deviceImpl = new DeviceImpl();

		deviceImpl.setEntityId(entityId);
		deviceImpl.setGroupId(groupId);
		deviceImpl.setCompanyId(companyId);
		deviceImpl.setUserId(userId);

		if (userName == null) {
			deviceImpl.setUserName(StringPool.BLANK);
		}
		else {
			deviceImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			deviceImpl.setCreateDate(null);
		}
		else {
			deviceImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			deviceImpl.setModifiedDate(null);
		}
		else {
			deviceImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (msisdn == null) {
			deviceImpl.setMsisdn(StringPool.BLANK);
		}
		else {
			deviceImpl.setMsisdn(msisdn);
		}

		if (imei == null) {
			deviceImpl.setImei(StringPool.BLANK);
		}
		else {
			deviceImpl.setImei(imei);
		}

		if (regId == null) {
			deviceImpl.setRegId(StringPool.BLANK);
		}
		else {
			deviceImpl.setRegId(regId);
		}

		deviceImpl.setOrganizationId(organizationId);

		deviceImpl.resetOriginalValues();

		return deviceImpl;
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
		msisdn = objectInput.readUTF();
		imei = objectInput.readUTF();
		regId = objectInput.readUTF();
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

		if (msisdn == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(msisdn);
		}

		if (imei == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(imei);
		}

		if (regId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(regId);
		}

		objectOutput.writeLong(organizationId);
	}

	public int entityId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String msisdn;
	public String imei;
	public String regId;
	public long organizationId;
}