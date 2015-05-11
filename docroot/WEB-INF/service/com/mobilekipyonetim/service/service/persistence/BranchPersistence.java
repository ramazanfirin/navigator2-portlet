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

import com.mobilekipyonetim.service.model.Branch;

/**
 * The persistence interface for the branch service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author 002834
 * @see BranchPersistenceImpl
 * @see BranchUtil
 * @generated
 */
public interface BranchPersistence extends BasePersistence<Branch> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BranchUtil} to access the branch persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the branchs where name LIKE &#63; and organizationId = &#63;.
	*
	* @param name the name
	* @param organizationId the organization ID
	* @return the matching branchs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.mobilekipyonetim.service.model.Branch> findByNameAndOrganization(
		java.lang.String name, long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.mobilekipyonetim.service.model.Branch> findByNameAndOrganization(
		java.lang.String name, long organizationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.mobilekipyonetim.service.model.Branch> findByNameAndOrganization(
		java.lang.String name, long organizationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.mobilekipyonetim.service.model.Branch findByNameAndOrganization_First(
		java.lang.String name, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchBranchException;

	/**
	* Returns the first branch in the ordered set where name LIKE &#63; and organizationId = &#63;.
	*
	* @param name the name
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching branch, or <code>null</code> if a matching branch could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Branch fetchByNameAndOrganization_First(
		java.lang.String name, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.mobilekipyonetim.service.model.Branch findByNameAndOrganization_Last(
		java.lang.String name, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchBranchException;

	/**
	* Returns the last branch in the ordered set where name LIKE &#63; and organizationId = &#63;.
	*
	* @param name the name
	* @param organizationId the organization ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching branch, or <code>null</code> if a matching branch could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Branch fetchByNameAndOrganization_Last(
		java.lang.String name, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.mobilekipyonetim.service.model.Branch[] findByNameAndOrganization_PrevAndNext(
		int entityId, java.lang.String name, long organizationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchBranchException;

	/**
	* Removes all the branchs where name LIKE &#63; and organizationId = &#63; from the database.
	*
	* @param name the name
	* @param organizationId the organization ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByNameAndOrganization(java.lang.String name,
		long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of branchs where name LIKE &#63; and organizationId = &#63;.
	*
	* @param name the name
	* @param organizationId the organization ID
	* @return the number of matching branchs
	* @throws SystemException if a system exception occurred
	*/
	public int countByNameAndOrganization(java.lang.String name,
		long organizationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the branch in the entity cache if it is enabled.
	*
	* @param branch the branch
	*/
	public void cacheResult(com.mobilekipyonetim.service.model.Branch branch);

	/**
	* Caches the branchs in the entity cache if it is enabled.
	*
	* @param branchs the branchs
	*/
	public void cacheResult(
		java.util.List<com.mobilekipyonetim.service.model.Branch> branchs);

	/**
	* Creates a new branch with the primary key. Does not add the branch to the database.
	*
	* @param entityId the primary key for the new branch
	* @return the new branch
	*/
	public com.mobilekipyonetim.service.model.Branch create(int entityId);

	/**
	* Removes the branch with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param entityId the primary key of the branch
	* @return the branch that was removed
	* @throws com.mobilekipyonetim.service.NoSuchBranchException if a branch with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Branch remove(int entityId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchBranchException;

	public com.mobilekipyonetim.service.model.Branch updateImpl(
		com.mobilekipyonetim.service.model.Branch branch)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the branch with the primary key or throws a {@link com.mobilekipyonetim.service.NoSuchBranchException} if it could not be found.
	*
	* @param entityId the primary key of the branch
	* @return the branch
	* @throws com.mobilekipyonetim.service.NoSuchBranchException if a branch with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Branch findByPrimaryKey(
		int entityId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.mobilekipyonetim.service.NoSuchBranchException;

	/**
	* Returns the branch with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param entityId the primary key of the branch
	* @return the branch, or <code>null</code> if a branch with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.mobilekipyonetim.service.model.Branch fetchByPrimaryKey(
		int entityId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the branchs.
	*
	* @return the branchs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.mobilekipyonetim.service.model.Branch> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.mobilekipyonetim.service.model.Branch> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.mobilekipyonetim.service.model.Branch> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the branchs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of branchs.
	*
	* @return the number of branchs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}