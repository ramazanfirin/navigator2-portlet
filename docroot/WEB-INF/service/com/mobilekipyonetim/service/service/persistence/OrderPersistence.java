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

import com.mobilekipyonetim.service.model.Order;

/**
 * The persistence interface for the order service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author 002834
 * @see OrderPersistenceImpl
 * @see OrderUtil
 * @generated
 */
public interface OrderPersistence extends BasePersistence<Order> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OrderUtil} to access the order persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the orders where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @return the matching orders
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.mobilekipyonetim.service.model.Order> findByorganization(
		long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the orders where organizationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.OrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationId the organization ID
	* @param start the lower bound of the range of orders
	* @param end the upper bound of the range of orders (not inclusive)
	* @return the range of matching orders
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.mobilekipyonetim.service.model.Order> findByorganization(
		long organizationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the orders where organizationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.OrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationId the organization ID
	* @param start the lower bound of the range of orders
	* @param end the upper bound of the range of orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching orders
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.mobilekipyonetim.service.model.Order> findByorganization(
		long organizationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first order in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching order
	* @throws com.mobilekipyonetim.service.NoSuchOrderException if a matching order could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Order findByorganization_First(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchOrderException;

	/**
	* Returns the first order in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching order, or <code>null</code> if a matching order could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Order fetchByorganization_First(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last order in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching order
	* @throws com.mobilekipyonetim.service.NoSuchOrderException if a matching order could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Order findByorganization_Last(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchOrderException;

	/**
	* Returns the last order in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching order, or <code>null</code> if a matching order could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Order fetchByorganization_Last(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the orders before and after the current order in the ordered set where organizationId = &#63;.
	*
	* @param orderEntityId the primary key of the current order
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next order
	* @throws com.mobilekipyonetim.service.NoSuchOrderException if a order with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Order[] findByorganization_PrevAndNext(
		int orderEntityId, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchOrderException;

	/**
	* Removes all the orders where organizationId = &#63; from the database.
	*
	* @param organizationId the organization ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByorganization(long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of orders where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @return the number of matching orders
	* @throws SystemException if a system exception occurred
	*/
	public int countByorganization(long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the orders where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @return the matching orders
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.mobilekipyonetim.service.model.Order> findByorganizationList(
		long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the orders where organizationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.OrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationId the organization ID
	* @param start the lower bound of the range of orders
	* @param end the upper bound of the range of orders (not inclusive)
	* @return the range of matching orders
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.mobilekipyonetim.service.model.Order> findByorganizationList(
		long organizationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the orders where organizationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.OrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationId the organization ID
	* @param start the lower bound of the range of orders
	* @param end the upper bound of the range of orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching orders
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.mobilekipyonetim.service.model.Order> findByorganizationList(
		long organizationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first order in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching order
	* @throws com.mobilekipyonetim.service.NoSuchOrderException if a matching order could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Order findByorganizationList_First(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchOrderException;

	/**
	* Returns the first order in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching order, or <code>null</code> if a matching order could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Order fetchByorganizationList_First(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last order in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching order
	* @throws com.mobilekipyonetim.service.NoSuchOrderException if a matching order could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Order findByorganizationList_Last(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchOrderException;

	/**
	* Returns the last order in the ordered set where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching order, or <code>null</code> if a matching order could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Order fetchByorganizationList_Last(
		long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the orders before and after the current order in the ordered set where organizationId = &#63;.
	*
	* @param orderEntityId the primary key of the current order
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next order
	* @throws com.mobilekipyonetim.service.NoSuchOrderException if a order with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Order[] findByorganizationList_PrevAndNext(
		int orderEntityId, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchOrderException;

	/**
	* Returns all the orders where organizationId = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.OrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationIds the organization IDs
	* @return the matching orders
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.mobilekipyonetim.service.model.Order> findByorganizationList(
		long[] organizationIds)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the orders where organizationId = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.OrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationIds the organization IDs
	* @param start the lower bound of the range of orders
	* @param end the upper bound of the range of orders (not inclusive)
	* @return the range of matching orders
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.mobilekipyonetim.service.model.Order> findByorganizationList(
		long[] organizationIds, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the orders where organizationId = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.OrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param organizationIds the organization IDs
	* @param start the lower bound of the range of orders
	* @param end the upper bound of the range of orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching orders
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.mobilekipyonetim.service.model.Order> findByorganizationList(
		long[] organizationIds, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the orders where organizationId = &#63; from the database.
	*
	* @param organizationId the organization ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByorganizationList(long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of orders where organizationId = &#63;.
	*
	* @param organizationId the organization ID
	* @return the number of matching orders
	* @throws SystemException if a system exception occurred
	*/
	public int countByorganizationList(long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of orders where organizationId = any &#63;.
	*
	* @param organizationIds the organization IDs
	* @return the number of matching orders
	* @throws SystemException if a system exception occurred
	*/
	public int countByorganizationList(long[] organizationIds)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the order where vehicleId = &#63; or throws a {@link com.mobilekipyonetim.service.NoSuchOrderException} if it could not be found.
	*
	* @param vehicleId the vehicle ID
	* @return the matching order
	* @throws com.mobilekipyonetim.service.NoSuchOrderException if a matching order could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Order findByvehicle(
		long vehicleId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchOrderException;

	/**
	* Returns the order where vehicleId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param vehicleId the vehicle ID
	* @return the matching order, or <code>null</code> if a matching order could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Order fetchByvehicle(
		long vehicleId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the order where vehicleId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param vehicleId the vehicle ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching order, or <code>null</code> if a matching order could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Order fetchByvehicle(
		long vehicleId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the order where vehicleId = &#63; from the database.
	*
	* @param vehicleId the vehicle ID
	* @return the order that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Order removeByvehicle(
		long vehicleId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchOrderException;

	/**
	* Returns the number of orders where vehicleId = &#63;.
	*
	* @param vehicleId the vehicle ID
	* @return the number of matching orders
	* @throws SystemException if a system exception occurred
	*/
	public int countByvehicle(long vehicleId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the order in the entity cache if it is enabled.
	*
	* @param order the order
	*/
	public void cacheResult(com.mobilekipyonetim.service.model.Order order);

	/**
	* Caches the orders in the entity cache if it is enabled.
	*
	* @param orders the orders
	*/
	public void cacheResult(
		java.util.List<com.mobilekipyonetim.service.model.Order> orders);

	/**
	* Creates a new order with the primary key. Does not add the order to the database.
	*
	* @param orderEntityId the primary key for the new order
	* @return the new order
	*/
	public com.mobilekipyonetim.service.model.Order create(int orderEntityId);

	/**
	* Removes the order with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param orderEntityId the primary key of the order
	* @return the order that was removed
	* @throws com.mobilekipyonetim.service.NoSuchOrderException if a order with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Order remove(int orderEntityId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchOrderException;

	public com.mobilekipyonetim.service.model.Order updateImpl(
		com.mobilekipyonetim.service.model.Order order)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the order with the primary key or throws a {@link com.mobilekipyonetim.service.NoSuchOrderException} if it could not be found.
	*
	* @param orderEntityId the primary key of the order
	* @return the order
	* @throws com.mobilekipyonetim.service.NoSuchOrderException if a order with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Order findByPrimaryKey(
		int orderEntityId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchOrderException;

	/**
	* Returns the order with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param orderEntityId the primary key of the order
	* @return the order, or <code>null</code> if a order with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Order fetchByPrimaryKey(
		int orderEntityId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the orders.
	*
	* @return the orders
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.mobilekipyonetim.service.model.Order> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the orders.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.OrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of orders
	* @param end the upper bound of the range of orders (not inclusive)
	* @return the range of orders
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.mobilekipyonetim.service.model.Order> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the orders.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.OrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of orders
	* @param end the upper bound of the range of orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of orders
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.mobilekipyonetim.service.model.Order> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the orders from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of orders.
	*
	* @return the number of orders
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}