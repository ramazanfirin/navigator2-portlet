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
 * Provides a wrapper for {@link BranchLocalService}.
 *
 * @author 002834
 * @see BranchLocalService
 * @generated
 */
public class BranchLocalServiceWrapper implements BranchLocalService,
	ServiceWrapper<BranchLocalService> {
	public BranchLocalServiceWrapper(BranchLocalService branchLocalService) {
		_branchLocalService = branchLocalService;
	}

	/**
	* Adds the branch to the database. Also notifies the appropriate model listeners.
	*
	* @param branch the branch
	* @return the branch that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.mobilekipyonetim.service.model.Branch addBranch(
		com.mobilekipyonetim.service.model.Branch branch)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _branchLocalService.addBranch(branch);
	}

	/**
	* Creates a new branch with the primary key. Does not add the branch to the database.
	*
	* @param entityId the primary key for the new branch
	* @return the new branch
	*/
	@Override
	public com.mobilekipyonetim.service.model.Branch createBranch(int entityId) {
		return _branchLocalService.createBranch(entityId);
	}

	/**
	* Deletes the branch with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param entityId the primary key of the branch
	* @return the branch that was removed
	* @throws PortalException if a branch with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.mobilekipyonetim.service.model.Branch deleteBranch(int entityId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _branchLocalService.deleteBranch(entityId);
	}

	/**
	* Deletes the branch from the database. Also notifies the appropriate model listeners.
	*
	* @param branch the branch
	* @return the branch that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.mobilekipyonetim.service.model.Branch deleteBranch(
		com.mobilekipyonetim.service.model.Branch branch)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _branchLocalService.deleteBranch(branch);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _branchLocalService.dynamicQuery();
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
		return _branchLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.BranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _branchLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.BranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _branchLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
		return _branchLocalService.dynamicQueryCount(dynamicQuery);
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
		return _branchLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.mobilekipyonetim.service.model.Branch fetchBranch(int entityId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _branchLocalService.fetchBranch(entityId);
	}

	/**
	* Returns the branch with the primary key.
	*
	* @param entityId the primary key of the branch
	* @return the branch
	* @throws PortalException if a branch with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.mobilekipyonetim.service.model.Branch getBranch(int entityId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _branchLocalService.getBranch(entityId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _branchLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the branchs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.BranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of branchs
	* @param end the upper bound of the range of branchs (not inclusive)
	* @return the range of branchs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.mobilekipyonetim.service.model.Branch> getBranchs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _branchLocalService.getBranchs(start, end);
	}

	/**
	* Returns the number of branchs.
	*
	* @return the number of branchs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getBranchsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _branchLocalService.getBranchsCount();
	}

	/**
	* Updates the branch in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param branch the branch
	* @return the branch that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.mobilekipyonetim.service.model.Branch updateBranch(
		com.mobilekipyonetim.service.model.Branch branch)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _branchLocalService.updateBranch(branch);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _branchLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_branchLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _branchLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public java.util.List<com.mobilekipyonetim.service.model.Branch> getBranchByNameAndOrganization(
		java.lang.String name, int orgId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _branchLocalService.getBranchByNameAndOrganization(name, orgId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public BranchLocalService getWrappedBranchLocalService() {
		return _branchLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedBranchLocalService(
		BranchLocalService branchLocalService) {
		_branchLocalService = branchLocalService;
	}

	@Override
	public BranchLocalService getWrappedService() {
		return _branchLocalService;
	}

	@Override
	public void setWrappedService(BranchLocalService branchLocalService) {
		_branchLocalService = branchLocalService;
	}

	private BranchLocalService _branchLocalService;
}