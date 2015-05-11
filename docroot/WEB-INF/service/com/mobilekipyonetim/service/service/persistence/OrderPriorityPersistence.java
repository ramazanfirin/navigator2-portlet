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

import com.mobilekipyonetim.service.model.OrderPriority;

/**
 * The persistence interface for the order priority service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author 002834
 * @see OrderPriorityPersistenceImpl
 * @see OrderPriorityUtil
 * @generated
 */
public interface OrderPriorityPersistence extends BasePersistence<OrderPriority> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OrderPriorityUtil} to access the order priority persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the order priority in the entity cache if it is enabled.
	*
	* @param orderPriority the order priority
	*/
	public void cacheResult(
		com.mobilekipyonetim.service.model.OrderPriority orderPriority);

	/**
	* Caches the order priorities in the entity cache if it is enabled.
	*
	* @param orderPriorities the order priorities
	*/
	public void cacheResult(
		java.util.List<com.mobilekipyonetim.service.model.OrderPriority> orderPriorities);

	/**
	* Creates a new order priority with the primary key. Does not add the order priority to the database.
	*
	* @param orderPriorityEntityId the primary key for the new order priority
	* @return the new order priority
	*/
	public com.mobilekipyonetim.service.model.OrderPriority create(
		int orderPriorityEntityId);

	/**
	* Removes the order priority with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param orderPriorityEntityId the primary key of the order priority
	* @return the order priority that was removed
	* @throws com.mobilekipyonetim.service.NoSuchOrderPriorityException if a order priority with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.OrderPriority remove(
		int orderPriorityEntityId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchOrderPriorityException;

	public com.mobilekipyonetim.service.model.OrderPriority updateImpl(
		com.mobilekipyonetim.service.model.OrderPriority orderPriority)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the order priority with the primary key or throws a {@link com.mobilekipyonetim.service.NoSuchOrderPriorityException} if it could not be found.
	*
	* @param orderPriorityEntityId the primary key of the order priority
	* @return the order priority
	* @throws com.mobilekipyonetim.service.NoSuchOrderPriorityException if a order priority with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.OrderPriority findByPrimaryKey(
		int orderPriorityEntityId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchOrderPriorityException;

	/**
	* Returns the order priority with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param orderPriorityEntityId the primary key of the order priority
	* @return the order priority, or <code>null</code> if a order priority with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.OrderPriority fetchByPrimaryKey(
		int orderPriorityEntityId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the order priorities.
	*
	* @return the order priorities
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.mobilekipyonetim.service.model.OrderPriority> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the order priorities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.OrderPriorityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of order priorities
	* @param end the upper bound of the range of order priorities (not inclusive)
	* @return the range of order priorities
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.mobilekipyonetim.service.model.OrderPriority> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the order priorities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.OrderPriorityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of order priorities
	* @param end the upper bound of the range of order priorities (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of order priorities
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.mobilekipyonetim.service.model.OrderPriority> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the order priorities from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of order priorities.
	*
	* @return the number of order priorities
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}