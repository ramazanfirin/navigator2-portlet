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

package com.mobilekipyonetim.service.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.mobilekipyonetim.service.model.Device;
import com.mobilekipyonetim.service.model.Vehicle;
import com.mobilekipyonetim.service.model.impl.DeviceImpl;
import com.mobilekipyonetim.service.service.base.VehicleLocalServiceBaseImpl;

/**
 * The implementation of the vehicle local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.mobilekipyonetim.service.service.VehicleLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author 002834
 * @see com.mobilekipyonetim.service.service.base.VehicleLocalServiceBaseImpl
 * @see com.mobilekipyonetim.service.service.VehicleLocalServiceUtil
 */
public class VehicleLocalServiceImpl extends VehicleLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.mobilekipyonetim.service.service.VehicleLocalServiceUtil} to access the vehicle local service.
	 */
	
	public List<Vehicle> getVehicleByPlateAndOrganization(String plate,int organizationId) throws SystemException{
		
		return this.vehiclePersistence.findByplateAndOrganization(plate, organizationId);
	}

	public List<Vehicle> getDeviceByOrganization(String plate,int organizationId) throws SystemException{
		
		return this.vehiclePersistence.findByplateAndOrganization(plate, organizationId);
	}
	
public List<Vehicle> getVehicleByOrganizationList(long[] organizationIds) throws SystemException{
		
		return this.vehiclePersistence.findByorganizationList(organizationIds);

	}

public List<Vehicle> getVehicleByPlateAndOrganizationList(String plate,long[] organizationIds) throws SystemException{
	
	return this.vehiclePersistence.findByplateAndOrganizationList(plate, organizationIds);

}

@Override
public List<Vehicle> getVehicleByOrganizationList(String plate,
		int organizationId) throws SystemException {
	// TODO Auto-generated method stub
	return null;
}
	
}