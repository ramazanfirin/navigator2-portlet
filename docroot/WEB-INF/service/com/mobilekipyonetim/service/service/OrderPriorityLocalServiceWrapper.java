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

package com.mobilekipyonetim.service.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OrderPriorityLocalService}.
 *
 * @author 002834
 * @see OrderPriorityLocalService
 * @generated
 */
public class OrderPriorityLocalServiceWrapper
	implements OrderPriorityLocalService,
		ServiceWrapper<OrderPriorityLocalService> {
	public OrderPriorityLocalServiceWrapper(
		OrderPriorityLocalService orderPriorityLocalService) {
		_orderPriorityLocalService = orderPriorityLocalService;
	}

	/**
	* Adds the order priority to the database. Also notifies the appropriate model listeners.
	*
	* @param orderPriority the order priority
	* @return the order priority that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.mobilekipyonetim.service.model.OrderPriority addOrderPriority(
		com.mobilekipyonetim.service.model.OrderPriority orderPriority)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _orderPriorityLocalService.addOrderPriority(orderPriority);
	}

	/**
	* Creates a new order priority with the primary key. Does not add the order priority to the database.
	*
	* @param orderPriorityEntityId the primary key for the new order priority
	* @return the new order priority
	*/
	@Override
	public com.mobilekipyonetim.service.model.OrderPriority createOrderPriority(
		int orderPriorityEntityId) {
		return _orderPriorityLocalService.createOrderPriority(orderPriorityEntityId);
	}

	/**
	* Deletes the order priority with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param orderPriorityEntityId the primary key of the order priority
	* @return the order priority that was removed
	* @throws PortalException if a order priority with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.mobilekipyonetim.service.model.OrderPriority deleteOrderPriority(
		int orderPriorityEntityId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _orderPriorityLocalService.deleteOrderPriority(orderPriorityEntityId);
	}

	/**
	* Deletes the order priority from the database. Also notifies the appropriate model listeners.
	*
	* @param orderPriority the order priority
	* @return the order priority that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.mobilekipyonetim.service.model.OrderPriority deleteOrderPriority(
		com.mobilekipyonetim.service.model.OrderPriority orderPriority)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _orderPriorityLocalService.deleteOrderPriority(orderPriority);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _orderPriorityLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _orderPriorityLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.OrderPriorityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _orderPriorityLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.OrderPriorityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _orderPriorityLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _orderPriorityLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _orderPriorityLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.mobilekipyonetim.service.model.OrderPriority fetchOrderPriority(
		int orderPriorityEntityId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _orderPriorityLocalService.fetchOrderPriority(orderPriorityEntityId);
	}

	/**
	* Returns the order priority with the primary key.
	*
	* @param orderPriorityEntityId the primary key of the order priority
	* @return the order priority
	* @throws PortalException if a order priority with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.mobilekipyonetim.service.model.OrderPriority getOrderPriority(
		int orderPriorityEntityId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _orderPriorityLocalService.getOrderPriority(orderPriorityEntityId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _orderPriorityLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<com.mobilekipyonetim.service.model.OrderPriority> getOrderPriorities(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _orderPriorityLocalService.getOrderPriorities(start, end);
	}

	/**
	* Returns the number of order priorities.
	*
	* @return the number of order priorities
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getOrderPrioritiesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _orderPriorityLocalService.getOrderPrioritiesCount();
	}

	/**
	* Updates the order priority in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param orderPriority the order priority
	* @return the order priority that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.mobilekipyonetim.service.model.OrderPriority updateOrderPriority(
		com.mobilekipyonetim.service.model.OrderPriority orderPriority)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _orderPriorityLocalService.updateOrderPriority(orderPriority);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _orderPriorityLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_orderPriorityLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _orderPriorityLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public OrderPriorityLocalService getWrappedOrderPriorityLocalService() {
		return _orderPriorityLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedOrderPriorityLocalService(
		OrderPriorityLocalService orderPriorityLocalService) {
		_orderPriorityLocalService = orderPriorityLocalService;
	}

	@Override
	public OrderPriorityLocalService getWrappedService() {
		return _orderPriorityLocalService;
	}

	@Override
	public void setWrappedService(
		OrderPriorityLocalService orderPriorityLocalService) {
		_orderPriorityLocalService = orderPriorityLocalService;
	}

	private OrderPriorityLocalService _orderPriorityLocalService;
}