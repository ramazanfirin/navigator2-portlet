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

import com.mobilekipyonetim.service.model.Branch;

import java.util.List;

/**
 * The persistence utility for the branch service. This utility wraps {@link BranchPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author 002834
 * @see BranchPersistence
 * @see BranchPersistenceImpl
 * @generated
 */
public class BranchUtil {
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
	public static void clearCache(Branch branch) {
		getPersistence().clearCache(branch);
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
	public static List<Branch> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Branch> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Branch> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Branch update(Branch branch) throws SystemException {
		return getPersistence().update(branch);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Branch update(Branch branch, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(branch, serviceContext);
	}

	/**
	* Returns all the branchs where name LIKE &#63; and organizationId = &#63;.
	*
	* @param name the name
	* @param organizationId the organization ID
	* @return the matching branchs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.mobilekipyonetim.service.model.Branch> findByNameAndOrganization(
		java.lang.String name, long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByNameAndOrganization(name, organizationId);
	}

	/**
	* Returns a range of all the branchs where name LIKE &#63; and organizationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.BranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param organizationId the organization ID
	* @param start the lower bound of the range of branchs
	* @param end the upper bound of the range of branchs (not inclusive)
	* @return the range of matching branchs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.mobilekipyonetim.service.model.Branch> findByNameAndOrganization(
		java.lang.String name, long organizationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNameAndOrganization(name, organizationId, start, end);
	}

	/**
	* Returns an ordered range of all the branchs where name LIKE &#63; and organizationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.BranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param organizationId the organization ID
	* @param start the lower bound of the range of branchs
	* @param end the upper bound of the range of branchs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching branchs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.mobilekipyonetim.service.model.Branch> findByNameAndOrganization(
		java.lang.String name, long organizationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNameAndOrganization(name, organizationId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first branch in the ordered set where name LIKE &#63; and organizationId = &#63;.
	*
	* @param name the name
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching branch
	* @throws com.mobilekipyonetim.service.NoSuchBranchException if a matching branch could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.mobilekipyonetim.service.model.Branch findByNameAndOrganization_First(
		java.lang.String name, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchBranchException {
		return getPersistence()
				   .findByNameAndOrganization_First(name, organizationId,
			orderByComparator);
	}

	/**
	* Returns the first branch in the ordered set where name LIKE &#63; and organizationId = &#63;.
	*
	* @param name the name
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching branch, or <code>null</code> if a matching branch could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.mobilekipyonetim.service.model.Branch fetchByNameAndOrganization_First(
		java.lang.String name, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByNameAndOrganization_First(name, organizationId,
			orderByComparator);
	}

	/**
	* Returns the last branch in the ordered set where name LIKE &#63; and organizationId = &#63;.
	*
	* @param name the name
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching branch
	* @throws com.mobilekipyonetim.service.NoSuchBranchException if a matching branch could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.mobilekipyonetim.service.model.Branch findByNameAndOrganization_Last(
		java.lang.String name, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchBranchException {
		return getPersistence()
				   .findByNameAndOrganization_Last(name, organizationId,
			orderByComparator);
	}

	/**
	* Returns the last branch in the ordered set where name LIKE &#63; and organizationId = &#63;.
	*
	* @param name the name
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching branch, or <code>null</code> if a matching branch could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.mobilekipyonetim.service.model.Branch fetchByNameAndOrganization_Last(
		java.lang.String name, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByNameAndOrganization_Last(name, organizationId,
			orderByComparator);
	}

	/**
	* Returns the branchs before and after the current branch in the ordered set where name LIKE &#63; and organizationId = &#63;.
	*
	* @param entityId the primary key of the current branch
	* @param name the name
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next branch
	* @throws com.mobilekipyonetim.service.NoSuchBranchException if a branch with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.mobilekipyonetim.service.model.Branch[] findByNameAndOrganization_PrevAndNext(
		int entityId, java.lang.String name, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchBranchException {
		return getPersistence()
				   .findByNameAndOrganization_PrevAndNext(entityId, name,
			organizationId, orderByComparator);
	}

	/**
	* Removes all the branchs where name LIKE &#63; and organizationId = &#63; from the database.
	*
	* @param name the name
	* @param organizationId the organization ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByNameAndOrganization(java.lang.String name,
		long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByNameAndOrganization(name, organizationId);
	}

	/**
	* Returns the number of branchs where name LIKE &#63; and organizationId = &#63;.
	*
	* @param name the name
	* @param organizationId the organization ID
	* @return the number of matching branchs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByNameAndOrganization(java.lang.String name,
		long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByNameAndOrganization(name, organizationId);
	}

	/**
	* Caches the branch in the entity cache if it is enabled.
	*
	* @param branch the branch
	*/
	public static void cacheResult(
		com.mobilekipyonetim.service.model.Branch branch) {
		getPersistence().cacheResult(branch);
	}

	/**
	* Caches the branchs in the entity cache if it is enabled.
	*
	* @param branchs the branchs
	*/
	public static void cacheResult(
		java.util.List<com.mobilekipyonetim.service.model.Branch> branchs) {
		getPersistence().cacheResult(branchs);
	}

	/**
	* Creates a new branch with the primary key. Does not add the branch to the database.
	*
	* @param entityId the primary key for the new branch
	* @return the new branch
	*/
	public static com.mobilekipyonetim.service.model.Branch create(int entityId) {
		return getPersistence().create(entityId);
	}

	/**
	* Removes the branch with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param entityId the primary key of the branch
	* @return the branch that was removed
	* @throws com.mobilekipyonetim.service.NoSuchBranchException if a branch with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.mobilekipyonetim.service.model.Branch remove(int entityId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchBranchException {
		return getPersistence().remove(entityId);
	}

	public static com.mobilekipyonetim.service.model.Branch updateImpl(
		com.mobilekipyonetim.service.model.Branch branch)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(branch);
	}

	/**
	* Returns the branch with the primary key or throws a {@link com.mobilekipyonetim.service.NoSuchBranchException} if it could not be found.
	*
	* @param entityId the primary key of the branch
	* @return the branch
	* @throws com.mobilekipyonetim.service.NoSuchBranchException if a branch with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.mobilekipyonetim.service.model.Branch findByPrimaryKey(
		int entityId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchBranchException {
		return getPersistence().findByPrimaryKey(entityId);
	}

	/**
	* Returns the branch with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param entityId the primary key of the branch
	* @return the branch, or <code>null</code> if a branch with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.mobilekipyonetim.service.model.Branch fetchByPrimaryKey(
		int entityId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(entityId);
	}

	/**
	* Returns all the branchs.
	*
	* @return the branchs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.mobilekipyonetim.service.model.Branch> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.mobilekipyonetim.service.model.Branch> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the branchs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.mobilekipyonetim.service.model.impl.BranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of branchs
	* @param end the upper bound of the range of branchs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of branchs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.mobilekipyonetim.service.model.Branch> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the branchs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of branchs.
	*
	* @return the number of branchs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static BranchPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (BranchPersistence)PortletBeanLocatorUtil.locate(com.mobilekipyonetim.service.service.ClpSerializer.getServletContextName(),
					BranchPersistence.class.getName());

			ReferenceRegistry.registerReference(BranchUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(BranchPersistence persistence) {
	}

	private static BranchPersistence _persistence;
}