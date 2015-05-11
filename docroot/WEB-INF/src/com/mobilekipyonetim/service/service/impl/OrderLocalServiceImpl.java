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

import com.liferay.portal.kernel.exception.SystemException;
import com.mobilekipyonetim.service.NoSuchVehicleException;
import com.mobilekipyonetim.service.model.Vehicle;
import com.mobilekipyonetim.service.service.base.OrderLocalServiceBaseImpl;

/**
 * The implementation of the order local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.mobilekipyonetim.service.service.OrderLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author 002834
 * @see com.mobilekipyonetim.service.service.base.OrderLocalServiceBaseImpl
 * @see com.mobilekipyonetim.service.service.OrderLocalServiceUtil
 */
public class OrderLocalServiceImpl extends OrderLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.mobilekipyonetim.service.service.OrderLocalServiceUtil} to access the order local service.
	 */
	
	public Vehicle getVechile(long vehicleId){
		try {
			return this.vehiclePersistence.findByPrimaryKey((int)vehicleId);
		} catch (Exception e) {
			return null;
		}
			
	}
}