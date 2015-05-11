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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.mobilekipyonetim.service.model.OrderPriority;

import java.util.List;

/**
 * The persistence utility for the order priority service. This utility wraps {@link OrderPriorityPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author 002834
 * @see OrderPriorityPersistence
 * @see OrderPriorityPersistenceImpl
 * @generated
 */
public class OrderPriorityUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(OrderPriority orderPriority) {
		getPersistence().clearCache(orderPriority);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OrderPriority> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OrderPriority> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OrderPriority> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static OrderPriority update(OrderPriority orderPriority)
		throws SystemException {
		return getPersistence().update(orderPriority);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static OrderPriority update(OrderPriority orderPriority,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(orderPriority, serviceContext);
	}

	/**
	* Caches the order priority in the entity cache if it is enabled.
	*
	* @param orderPriority the order priority
	*/
	public static void cacheResult(
		com.mobilekipyonetim.service.model.OrderPriority orderPriority) {
		getPersistence().cacheResult(orderPriority);
	}

	/**
	* Caches the order priorities in the entity cache if it is enabled.
	*
	* @param orderPriorities the order priorities
	*/
	public static void cacheResult(
		java.util.List<com.mobilekipyonetim.service.model.OrderPriority> orderPriorities) {
		getPersistence().cacheResult(orderPriorities);
	}

	/**
	* Creates a new order priority with the primary key. Does not add the order priority to the database.
	*
	* @param orderPriorityEntityId the primary key for the new order priority
	* @return the new order priority
	*/
	public static com.mobilekipyonetim.service.model.OrderPriority create(
		int orderPriorityEntityId) {
		return getPersistence().create(orderPriorityEntityId);
	}

	/**
	* Removes the order priority with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param orderPriorityEntityId the primary key of the order priority
	* @return the order priority that was removed
	* @throws com.mobilekipyonetim.service.NoSuchOrderPriorityException if a order priority with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.mobilekipyonetim.service.model.OrderPriority remove(
		int orderPriorityEntityId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchOrderPriorityException {
		return getPersistence().remove(orderPriorityEntityId);
	}

	public static com.mobilekipyonetim.service.model.OrderPriority updateImpl(
		com.mobilekipyonetim.service.model.OrderPriority orderPriority)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(orderPriority);
	}

	/**
	* Returns the order priority with the primary key or throws a {@link com.mobilekipyonetim.service.NoSuchOrderPriorityException} if it could not be found.
	*
	* @param orderPriorityEntityId the primary key of the order priority
	* @return the order priority
	* @throws com.mobilekipyonetim.service.NoSuchOrderPriorityException if a order priority with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.mobilekipyonetim.service.model.OrderPriority findByPrimaryKey(
		int orderPriorityEntityId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchOrderPriorityException {
		return getPersistence().findByPrimaryKey(orderPriorityEntityId);
	}

	/**
	* Returns the order priority with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param orderPriorityEntityId the primary key of the order priority
	* @return the order priority, or <code>null</code> if a order priority with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.mobilekipyonetim.service.model.OrderPriority fetchByPrimaryKey(
		int orderPriorityEntityId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(orderPriorityEntityId);
	}

	/**
	* Returns all the order priorities.
	*
	* @return the order priorities
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.mobilekipyonetim.service.model.OrderPriority> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.mobilekipyonetim.service.model.OrderPriority> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.mobilekipyonetim.service.model.OrderPriority> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the order priorities from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of order priorities.
	*
	* @return the number of order priorities
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static OrderPriorityPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (OrderPriorityPersistence)PortletBeanLocatorUtil.locate(com.mobilekipyonetim.service.service.ClpSerializer.getServletContextName(),
					OrderPriorityPersistence.class.getName());

			ReferenceRegistry.registerReference(OrderPriorityUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(OrderPriorityPersistence persistence) {
	}

	private static OrderPriorityPersistence _persistence;
}