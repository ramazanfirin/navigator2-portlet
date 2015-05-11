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

package com.mobilekipyonetim.service.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.mobilekipyonetim.service.model.Poi;

/**
 * The persistence interface for the poi service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author 002834
 * @see PoiPersistenceImpl
 * @see PoiUtil
 * @generated
 */
public interface PoiPersistence extends BasePersistence<Poi> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PoiUtil} to access the poi persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the pois where name LIKE &#63; and organizationId = &#63;.
	*
	* @param name the name
	* @param organizationId the organization ID
	* @return the matching pois
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.mobilekipyonetim.service.model.Poi> findBynameAndOrganizationId(
		java.lang.String name, long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the pois where name LIKE &#63; and organizationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.PoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param organizationId the organization ID
	* @param start the lower bound of the range of pois
	* @param end the upper bound of the range of pois (not inclusive)
	* @return the range of matching pois
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.mobilekipyonetim.service.model.Poi> findBynameAndOrganizationId(
		java.lang.String name, long organizationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the pois where name LIKE &#63; and organizationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.PoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param organizationId the organization ID
	* @param start the lower bound of the range of pois
	* @param end the upper bound of the range of pois (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching pois
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.mobilekipyonetim.service.model.Poi> findBynameAndOrganizationId(
		java.lang.String name, long organizationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first poi in the ordered set where name LIKE &#63; and organizationId = &#63;.
	*
	* @param name the name
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching poi
	* @throws com.mobilekipyonetim.service.NoSuchPoiException if a matching poi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Poi findBynameAndOrganizationId_First(
		java.lang.String name, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchPoiException;

	/**
	* Returns the first poi in the ordered set where name LIKE &#63; and organizationId = &#63;.
	*
	* @param name the name
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching poi, or <code>null</code> if a matching poi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Poi fetchBynameAndOrganizationId_First(
		java.lang.String name, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last poi in the ordered set where name LIKE &#63; and organizationId = &#63;.
	*
	* @param name the name
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching poi
	* @throws com.mobilekipyonetim.service.NoSuchPoiException if a matching poi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Poi findBynameAndOrganizationId_Last(
		java.lang.String name, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchPoiException;

	/**
	* Returns the last poi in the ordered set where name LIKE &#63; and organizationId = &#63;.
	*
	* @param name the name
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching poi, or <code>null</code> if a matching poi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Poi fetchBynameAndOrganizationId_Last(
		java.lang.String name, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the pois before and after the current poi in the ordered set where name LIKE &#63; and organizationId = &#63;.
	*
	* @param poiEntityId the primary key of the current poi
	* @param name the name
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next poi
	* @throws com.mobilekipyonetim.service.NoSuchPoiException if a poi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Poi[] findBynameAndOrganizationId_PrevAndNext(
		int poiEntityId, java.lang.String name, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchPoiException;

	/**
	* Removes all the pois where name LIKE &#63; and organizationId = &#63; from the database.
	*
	* @param name the name
	* @param organizationId the organization ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeBynameAndOrganizationId(java.lang.String name,
		long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of pois where name LIKE &#63; and organizationId = &#63;.
	*
	* @param name the name
	* @param organizationId the organization ID
	* @return the number of matching pois
	* @throws SystemException if a system exception occurred
	*/
	public int countBynameAndOrganizationId(java.lang.String name,
		long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the pois where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @return the matching pois
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.mobilekipyonetim.service.model.Poi> findByorganizationId(
		long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the pois where organizationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.PoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationId the organization ID
	* @param start the lower bound of the range of pois
	* @param end the upper bound of the range of pois (not inclusive)
	* @return the range of matching pois
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.mobilekipyonetim.service.model.Poi> findByorganizationId(
		long organizationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the pois where organizationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.PoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationId the organization ID
	* @param start the lower bound of the range of pois
	* @param end the upper bound of the range of pois (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching pois
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.mobilekipyonetim.service.model.Poi> findByorganizationId(
		long organizationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first poi in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching poi
	* @throws com.mobilekipyonetim.service.NoSuchPoiException if a matching poi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Poi findByorganizationId_First(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchPoiException;

	/**
	* Returns the first poi in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching poi, or <code>null</code> if a matching poi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Poi fetchByorganizationId_First(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last poi in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching poi
	* @throws com.mobilekipyonetim.service.NoSuchPoiException if a matching poi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Poi findByorganizationId_Last(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchPoiException;

	/**
	* Returns the last poi in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching poi, or <code>null</code> if a matching poi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Poi fetchByorganizationId_Last(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the pois before and after the current poi in the ordered set where organizationId = &#63;.
	*
	* @param poiEntityId the primary key of the current poi
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next poi
	* @throws com.mobilekipyonetim.service.NoSuchPoiException if a poi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Poi[] findByorganizationId_PrevAndNext(
		int poiEntityId, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchPoiException;

	/**
	* Removes all the pois where organizationId = &#63; from the database.
	*
	* @param organizationId the organization ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByorganizationId(long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of pois where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @return the number of matching pois
	* @throws SystemException if a system exception occurred
	*/
	public int countByorganizationId(long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the pois where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @return the matching pois
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.mobilekipyonetim.service.model.Poi> findByorganizationIdList(
		long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the pois where organizationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.PoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationId the organization ID
	* @param start the lower bound of the range of pois
	* @param end the upper bound of the range of pois (not inclusive)
	* @return the range of matching pois
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.mobilekipyonetim.service.model.Poi> findByorganizationIdList(
		long organizationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the pois where organizationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.PoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationId the organization ID
	* @param start the lower bound of the range of pois
	* @param end the upper bound of the range of pois (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching pois
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.mobilekipyonetim.service.model.Poi> findByorganizationIdList(
		long organizationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first poi in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching poi
	* @throws com.mobilekipyonetim.service.NoSuchPoiException if a matching poi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Poi findByorganizationIdList_First(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchPoiException;

	/**
	* Returns the first poi in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching poi, or <code>null</code> if a matching poi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Poi fetchByorganizationIdList_First(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last poi in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching poi
	* @throws com.mobilekipyonetim.service.NoSuchPoiException if a matching poi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Poi findByorganizationIdList_Last(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchPoiException;

	/**
	* Returns the last poi in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching poi, or <code>null</code> if a matching poi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Poi fetchByorganizationIdList_Last(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the pois before and after the current poi in the ordered set where organizationId = &#63;.
	*
	* @param poiEntityId the primary key of the current poi
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next poi
	* @throws com.mobilekipyonetim.service.NoSuchPoiException if a poi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Poi[] findByorganizationIdList_PrevAndNext(
		int poiEntityId, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchPoiException;

	/**
	* Returns all the pois where organizationId = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.PoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationIds the organization IDs
	* @return the matching pois
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.mobilekipyonetim.service.model.Poi> findByorganizationIdList(
		long[] organizationIds)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the pois where organizationId = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.PoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationIds the organization IDs
	* @param start the lower bound of the range of pois
	* @param end the upper bound of the range of pois (not inclusive)
	* @return the range of matching pois
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.mobilekipyonetim.service.model.Poi> findByorganizationIdList(
		long[] organizationIds, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the pois where organizationId = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.PoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationIds the organization IDs
	* @param start the lower bound of the range of pois
	* @param end the upper bound of the range of pois (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching pois
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.mobilekipyonetim.service.model.Poi> findByorganizationIdList(
		long[] organizationIds, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the pois where organizationId = &#63; from the database.
	*
	* @param organizationId the organization ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByorganizationIdList(long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of pois where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @return the number of matching pois
	* @throws SystemException if a system exception occurred
	*/
	public int countByorganizationIdList(long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of pois where organizationId = any &#63;.
	*
	* @param organizationIds the organization IDs
	* @return the number of matching pois
	* @throws SystemException if a system exception occurred
	*/
	public int countByorganizationIdList(long[] organizationIds)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the poi in the entity cache if it is enabled.
	*
	* @param poi the poi
	*/
	public void cacheResult(com.mobilekipyonetim.service.model.Poi poi);

	/**
	* Caches the pois in the entity cache if it is enabled.
	*
	* @param pois the pois
	*/
	public void cacheResult(
		java.util.List<com.mobilekipyonetim.service.model.Poi> pois);

	/**
	* Creates a new poi with the primary key. Does not add the poi to the database.
	*
	* @param poiEntityId the primary key for the new poi
	* @return the new poi
	*/
	public com.mobilekipyonetim.service.model.Poi create(int poiEntityId);

	/**
	* Removes the poi with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param poiEntityId the primary key of the poi
	* @return the poi that was removed
	* @throws com.mobilekipyonetim.service.NoSuchPoiException if a poi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Poi remove(int poiEntityId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchPoiException;

	public com.mobilekipyonetim.service.model.Poi updateImpl(
		com.mobilekipyonetim.service.model.Poi poi)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the poi with the primary key or throws a {@link com.mobilekipyonetim.service.NoSuchPoiException} if it could not be found.
	*
	* @param poiEntityId the primary key of the poi
	* @return the poi
	* @throws com.mobilekipyonetim.service.NoSuchPoiException if a poi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Poi findByPrimaryKey(
		int poiEntityId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchPoiException;

	/**
	* Returns the poi with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param poiEntityId the primary key of the poi
	* @return the poi, or <code>null</code> if a poi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Poi fetchByPrimaryKey(
		int poiEntityId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the pois.
	*
	* @return the pois
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.mobilekipyonetim.service.model.Poi> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the pois.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.PoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of pois
	* @param end the upper bound of the range of pois (not inclusive)
	* @return the range of pois
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.mobilekipyonetim.service.model.Poi> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the pois.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.PoiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of pois
	* @param end the upper bound of the range of pois (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of pois
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.mobilekipyonetim.service.model.Poi> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the pois from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of pois.
	*
	* @return the number of pois
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}