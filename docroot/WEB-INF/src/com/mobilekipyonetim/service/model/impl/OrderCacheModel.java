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

import com.mobilekipyonetim.service.model.Order;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Order in entity cache.
 *
 * @author 002834
 * @see Order
 * @generated
 */
public class OrderCacheModel implements CacheModel<Order>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{orderEntityId=");
		sb.append(orderEntityId);
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
		sb.append(", lat=");
		sb.append(lat);
		sb.append(", lng=");
		sb.append(lng);
		sb.append(", date=");
		sb.append(date);
		sb.append(", address=");
		sb.append(address);
		sb.append(", ilce=");
		sb.append(ilce);
		sb.append(", mahalle=");
		sb.append(mahalle);
		sb.append(", sokak=");
		sb.append(sokak);
		sb.append(", bina=");
		sb.append(bina);
		sb.append(", vehicleId=");
		sb.append(vehicleId);
		sb.append(", statusId=");
		sb.append(statusId);
		sb.append(", priorityId=");
		sb.append(priorityId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Order toEntityModel() {
		OrderImpl orderImpl = new OrderImpl();

		orderImpl.setOrderEntityId(orderEntityId);
		orderImpl.setGroupId(groupId);
		orderImpl.setCompanyId(companyId);
		orderImpl.setUserId(userId);

		if (userName == null) {
			orderImpl.setUserName(StringPool.BLANK);
		}
		else {
			orderImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			orderImpl.setCreateDate(null);
		}
		else {
			orderImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			orderImpl.setModifiedDate(null);
		}
		else {
			orderImpl.setModifiedDate(new Date(modifiedDate));
		}

		orderImpl.setOrganizationId(organizationId);

		if (lat == null) {
			orderImpl.setLat(StringPool.BLANK);
		}
		else {
			orderImpl.setLat(lat);
		}

		if (lng == null) {
			orderImpl.setLng(StringPool.BLANK);
		}
		else {
			orderImpl.setLng(lng);
		}

		if (date == Long.MIN_VALUE) {
			orderImpl.setDate(null);
		}
		else {
			orderImpl.setDate(new Date(date));
		}

		if (address == null) {
			orderImpl.setAddress(StringPool.BLANK);
		}
		else {
			orderImpl.setAddress(address);
		}

		if (ilce == null) {
			orderImpl.setIlce(StringPool.BLANK);
		}
		else {
			orderImpl.setIlce(ilce);
		}

		if (mahalle == null) {
			orderImpl.setMahalle(StringPool.BLANK);
		}
		else {
			orderImpl.setMahalle(mahalle);
		}

		if (sokak == null) {
			orderImpl.setSokak(StringPool.BLANK);
		}
		else {
			orderImpl.setSokak(sokak);
		}

		if (bina == null) {
			orderImpl.setBina(StringPool.BLANK);
		}
		else {
			orderImpl.setBina(bina);
		}

		orderImpl.setVehicleId(vehicleId);
		orderImpl.setStatusId(statusId);
		orderImpl.setPriorityId(priorityId);

		orderImpl.resetOriginalValues();

		return orderImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		orderEntityId = objectInput.readInt();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		organizationId = objectInput.readLong();
		lat = objectInput.readUTF();
		lng = objectInput.readUTF();
		date = objectInput.readLong();
		address = objectInput.readUTF();
		ilce = objectInput.readUTF();
		mahalle = objectInput.readUTF();
		sokak = objectInput.readUTF();
		bina = objectInput.readUTF();
		vehicleId = objectInput.readLong();
		statusId = objectInput.readLong();
		priorityId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(orderEntityId);
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

		objectOutput.writeLong(date);

		if (address == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(address);
		}

		if (ilce == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ilce);
		}

		if (mahalle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mahalle);
		}

		if (sokak == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(sokak);
		}

		if (bina == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(bina);
		}

		objectOutput.writeLong(vehicleId);
		objectOutput.writeLong(statusId);
		objectOutput.writeLong(priorityId);
	}

	public int orderEntityId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long organizationId;
	public String lat;
	public String lng;
	public long date;
	public String address;
	public String ilce;
	public String mahalle;
	public String sokak;
	public String bina;
	public long vehicleId;
	public long statusId;
	public long priorityId;
}