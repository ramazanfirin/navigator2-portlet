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

import com.mobilekipyonetim.service.model.Vehicle;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Vehicle in entity cache.
 *
 * @author 002834
 * @see Vehicle
 * @generated
 */
public class VehicleCacheModel implements CacheModel<Vehicle>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{vehicleEntityId=");
		sb.append(vehicleEntityId);
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
		sb.append(", plate=");
		sb.append(plate);
		sb.append(", organizationId=");
		sb.append(organizationId);
		sb.append(", deviceId=");
		sb.append(deviceId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Vehicle toEntityModel() {
		VehicleImpl vehicleImpl = new VehicleImpl();

		vehicleImpl.setVehicleEntityId(vehicleEntityId);
		vehicleImpl.setGroupId(groupId);
		vehicleImpl.setCompanyId(companyId);
		vehicleImpl.setUserId(userId);

		if (userName == null) {
			vehicleImpl.setUserName(StringPool.BLANK);
		}
		else {
			vehicleImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			vehicleImpl.setCreateDate(null);
		}
		else {
			vehicleImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			vehicleImpl.setModifiedDate(null);
		}
		else {
			vehicleImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (plate == null) {
			vehicleImpl.setPlate(StringPool.BLANK);
		}
		else {
			vehicleImpl.setPlate(plate);
		}

		vehicleImpl.setOrganizationId(organizationId);
		vehicleImpl.setDeviceId(deviceId);

		vehicleImpl.resetOriginalValues();

		return vehicleImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		vehicleEntityId = objectInput.readInt();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		plate = objectInput.readUTF();
		organizationId = objectInput.readLong();
		deviceId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(vehicleEntityId);
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

		if (plate == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(plate);
		}

		objectOutput.writeLong(organizationId);
		objectOutput.writeLong(deviceId);
	}

	public int vehicleEntityId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String plate;
	public long organizationId;
	public long deviceId;
}