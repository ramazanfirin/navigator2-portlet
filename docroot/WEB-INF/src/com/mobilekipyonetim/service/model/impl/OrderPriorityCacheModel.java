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

import com.mobilekipyonetim.service.model.OrderPriority;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OrderPriority in entity cache.
 *
 * @author 002834
 * @see OrderPriority
 * @generated
 */
public class OrderPriorityCacheModel implements CacheModel<OrderPriority>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{orderPriorityEntityId=");
		sb.append(orderPriorityEntityId);
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
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OrderPriority toEntityModel() {
		OrderPriorityImpl orderPriorityImpl = new OrderPriorityImpl();

		orderPriorityImpl.setOrderPriorityEntityId(orderPriorityEntityId);
		orderPriorityImpl.setGroupId(groupId);
		orderPriorityImpl.setCompanyId(companyId);
		orderPriorityImpl.setUserId(userId);

		if (userName == null) {
			orderPriorityImpl.setUserName(StringPool.BLANK);
		}
		else {
			orderPriorityImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			orderPriorityImpl.setCreateDate(null);
		}
		else {
			orderPriorityImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			orderPriorityImpl.setModifiedDate(null);
		}
		else {
			orderPriorityImpl.setModifiedDate(new Date(modifiedDate));
		}

		orderPriorityImpl.setOrganizationId(organizationId);

		if (description == null) {
			orderPriorityImpl.setDescription(StringPool.BLANK);
		}
		else {
			orderPriorityImpl.setDescription(description);
		}

		orderPriorityImpl.resetOriginalValues();

		return orderPriorityImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		orderPriorityEntityId = objectInput.readInt();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		organizationId = objectInput.readLong();
		description = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(orderPriorityEntityId);
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

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}
	}

	public int orderPriorityEntityId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long organizationId;
	public String description;
}