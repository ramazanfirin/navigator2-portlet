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

import com.mobilekipyonetim.service.model.Poi;
import com.mobilekipyonetim.service.service.base.PoiLocalServiceBaseImpl;

/**
 * The implementation of the poi local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.mobilekipyonetim.service.service.PoiLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author 002834
 * @see com.mobilekipyonetim.service.service.base.PoiLocalServiceBaseImpl
 * @see com.mobilekipyonetim.service.service.PoiLocalServiceUtil
 */
public class PoiLocalServiceImpl extends PoiLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.mobilekipyonetim.service.service.PoiLocalServiceUtil} to access the poi local service.
	 */
	
	public List<Poi> findPoiByNameAndOrganization(String name,long organizationId) throws Exception{
		return this.poiPersistence.findBynameAndOrganizationId(name, organizationId);
		
	}
	public List<Poi> findPoiListOrganizationId(long organizationId) throws Exception{
		return this.poiPersistence.findByorganizationId(organizationId);
		
	}
}