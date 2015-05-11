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

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.CharPool;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.mobilekipyonetim.service.NoSuchBranchException;
import com.mobilekipyonetim.service.model.Branch;
import com.mobilekipyonetim.service.model.impl.BranchImpl;
import com.mobilekipyonetim.service.model.impl.BranchModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the branch service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author 002834
 * @see BranchPersistence
 * @see BranchUtil
 * @generated
 */
public class BranchPersistenceImpl extends BasePersistenceImpl<Branch>
	implements BranchPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link BranchUtil} to access the branch persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = BranchImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(BranchModelImpl.ENTITY_CACHE_ENABLED,
			BranchModelImpl.FINDER_CACHE_ENABLED, BranchImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(BranchModelImpl.ENTITY_CACHE_ENABLED,
			BranchModelImpl.FINDER_CACHE_ENABLED, BranchImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(BranchModelImpl.ENTITY_CACHE_ENABLED,
			BranchModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NAMEANDORGANIZATION =
		new FinderPath(BranchModelImpl.ENTITY_CACHE_ENABLED,
			BranchModelImpl.FINDER_CACHE_ENABLED, BranchImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByNameAndOrganization",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_NAMEANDORGANIZATION =
		new FinderPath(BranchModelImpl.ENTITY_CACHE_ENABLED,
			BranchModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"countByNameAndOrganization",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the branchs where name LIKE &#63; and organizationId = &#63;.
	 *
	 * @param name the name
	 * @param organizationId the organization ID
	 * @return the matching branchs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Branch> findByNameAndOrganization(String name,
		long organizationId) throws SystemException {
		return findByNameAndOrganization(name, organizationId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Branch> findByNameAndOrganization(String name,
		long organizationId, int start, int end) throws SystemException {
		return findByNameAndOrganization(name, organizationId, start, end, null);
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
	@Override
	public List<Branch> findByNameAndOrganization(String name,
		long organizationId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NAMEANDORGANIZATION;
		finderArgs = new Object[] {
				name, organizationId,
				
				start, end, orderByComparator
			};

		List<Branch> list = (List<Branch>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Branch branch : list) {
				if (!StringUtil.wildcardMatches(branch.getName(), name,
							CharPool.UNDERLINE, CharPool.PERCENT,
							CharPool.BACK_SLASH, true) ||
						(organizationId != branch.getOrganizationId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_BRANCH_WHERE);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_NAMEANDORGANIZATION_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NAMEANDORGANIZATION_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_NAMEANDORGANIZATION_NAME_2);
			}

			query.append(_FINDER_COLUMN_NAMEANDORGANIZATION_ORGANIZATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(BranchModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindName) {
					qPos.add(name);
				}

				qPos.add(organizationId);

				if (!pagination) {
					list = (List<Branch>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Branch>(list);
				}
				else {
					list = (List<Branch>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public Branch findByNameAndOrganization_First(String name,
		long organizationId, OrderByComparator orderByComparator)
		throws NoSuchBranchException, SystemException {
		Branch branch = fetchByNameAndOrganization_First(name, organizationId,
				orderByComparator);

		if (branch != null) {
			return branch;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("name=");
		msg.append(name);

		msg.append(", organizationId=");
		msg.append(organizationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBranchException(msg.toString());
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
	@Override
	public Branch fetchByNameAndOrganization_First(String name,
		long organizationId, OrderByComparator orderByComparator)
		throws SystemException {
		List<Branch> list = findByNameAndOrganization(name, organizationId, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Branch findByNameAndOrganization_Last(String name,
		long organizationId, OrderByComparator orderByComparator)
		throws NoSuchBranchException, SystemException {
		Branch branch = fetchByNameAndOrganization_Last(name, organizationId,
				orderByComparator);

		if (branch != null) {
			return branch;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("name=");
		msg.append(name);

		msg.append(", organizationId=");
		msg.append(organizationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBranchException(msg.toString());
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
	@Override
	public Branch fetchByNameAndOrganization_Last(String name,
		long organizationId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByNameAndOrganization(name, organizationId);

		if (count == 0) {
			return null;
		}

		List<Branch> list = findByNameAndOrganization(name, organizationId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Branch[] findByNameAndOrganization_PrevAndNext(int entityId,
		String name, long organizationId, OrderByComparator orderByComparator)
		throws NoSuchBranchException, SystemException {
		Branch branch = findByPrimaryKey(entityId);

		Session session = null;

		try {
			session = openSession();

			Branch[] array = new BranchImpl[3];

			array[0] = getByNameAndOrganization_PrevAndNext(session, branch,
					name, organizationId, orderByComparator, true);

			array[1] = branch;

			array[2] = getByNameAndOrganization_PrevAndNext(session, branch,
					name, organizationId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Branch getByNameAndOrganization_PrevAndNext(Session session,
		Branch branch, String name, long organizationId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BRANCH_WHERE);

		boolean bindName = false;

		if (name == null) {
			query.append(_FINDER_COLUMN_NAMEANDORGANIZATION_NAME_1);
		}
		else if (name.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_NAMEANDORGANIZATION_NAME_3);
		}
		else {
			bindName = true;

			query.append(_FINDER_COLUMN_NAMEANDORGANIZATION_NAME_2);
		}

		query.append(_FINDER_COLUMN_NAMEANDORGANIZATION_ORGANIZATIONID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(BranchModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindName) {
			qPos.add(name);
		}

		qPos.add(organizationId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(branch);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Branch> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the branchs where name LIKE &#63; and organizationId = &#63; from the database.
	 *
	 * @param name the name
	 * @param organizationId the organization ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByNameAndOrganization(String name, long organizationId)
		throws SystemException {
		for (Branch branch : findByNameAndOrganization(name, organizationId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(branch);
		}
	}

	/**
	 * Returns the number of branchs where name LIKE &#63; and organizationId = &#63;.
	 *
	 * @param name the name
	 * @param organizationId the organization ID
	 * @return the number of matching branchs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByNameAndOrganization(String name, long organizationId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_WITH_PAGINATION_COUNT_BY_NAMEANDORGANIZATION;

		Object[] finderArgs = new Object[] { name, organizationId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_BRANCH_WHERE);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_NAMEANDORGANIZATION_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NAMEANDORGANIZATION_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_NAMEANDORGANIZATION_NAME_2);
			}

			query.append(_FINDER_COLUMN_NAMEANDORGANIZATION_ORGANIZATIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindName) {
					qPos.add(name);
				}

				qPos.add(organizationId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_NAMEANDORGANIZATION_NAME_1 = "branch.name LIKE NULL AND ";
	private static final String _FINDER_COLUMN_NAMEANDORGANIZATION_NAME_2 = "branch.name LIKE ? AND ";
	private static final String _FINDER_COLUMN_NAMEANDORGANIZATION_NAME_3 = "(branch.name IS NULL OR branch.name LIKE '') AND ";
	private static final String _FINDER_COLUMN_NAMEANDORGANIZATION_ORGANIZATIONID_2 =
		"branch.organizationId = ?";

	public BranchPersistenceImpl() {
		setModelClass(Branch.class);
	}

	/**
	 * Caches the branch in the entity cache if it is enabled.
	 *
	 * @param branch the branch
	 */
	@Override
	public void cacheResult(Branch branch) {
		EntityCacheUtil.putResult(BranchModelImpl.ENTITY_CACHE_ENABLED,
			BranchImpl.class, branch.getPrimaryKey(), branch);

		branch.resetOriginalValues();
	}

	/**
	 * Caches the branchs in the entity cache if it is enabled.
	 *
	 * @param branchs the branchs
	 */
	@Override
	public void cacheResult(List<Branch> branchs) {
		for (Branch branch : branchs) {
			if (EntityCacheUtil.getResult(
						BranchModelImpl.ENTITY_CACHE_ENABLED, BranchImpl.class,
						branch.getPrimaryKey()) == null) {
				cacheResult(branch);
			}
			else {
				branch.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all branchs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(BranchImpl.class.getName());
		}

		EntityCacheUtil.clearCache(BranchImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the branch.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Branch branch) {
		EntityCacheUtil.removeResult(BranchModelImpl.ENTITY_CACHE_ENABLED,
			BranchImpl.class, branch.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Branch> branchs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Branch branch : branchs) {
			EntityCacheUtil.removeResult(BranchModelImpl.ENTITY_CACHE_ENABLED,
				BranchImpl.class, branch.getPrimaryKey());
		}
	}

	/**
	 * Creates a new branch with the primary key. Does not add the branch to the database.
	 *
	 * @param entityId the primary key for the new branch
	 * @return the new branch
	 */
	@Override
	public Branch create(int entityId) {
		Branch branch = new BranchImpl();

		branch.setNew(true);
		branch.setPrimaryKey(entityId);

		return branch;
	}

	/**
	 * Removes the branch with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param entityId the primary key of the branch
	 * @return the branch that was removed
	 * @throws com.mobilekipyonetim.service.NoSuchBranchException if a branch with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Branch remove(int entityId)
		throws NoSuchBranchException, SystemException {
		return remove((Serializable)entityId);
	}

	/**
	 * Removes the branch with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the branch
	 * @return the branch that was removed
	 * @throws com.mobilekipyonetim.service.NoSuchBranchException if a branch with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Branch remove(Serializable primaryKey)
		throws NoSuchBranchException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Branch branch = (Branch)session.get(BranchImpl.class, primaryKey);

			if (branch == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchBranchException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(branch);
		}
		catch (NoSuchBranchException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Branch removeImpl(Branch branch) throws SystemException {
		branch = toUnwrappedModel(branch);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(branch)) {
				branch = (Branch)session.get(BranchImpl.class,
						branch.getPrimaryKeyObj());
			}

			if (branch != null) {
				session.delete(branch);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (branch != null) {
			clearCache(branch);
		}

		return branch;
	}

	@Override
	public Branch updateImpl(com.mobilekipyonetim.service.model.Branch branch)
		throws SystemException {
		branch = toUnwrappedModel(branch);

		boolean isNew = branch.isNew();

		Session session = null;

		try {
			session = openSession();

			if (branch.isNew()) {
				session.save(branch);

				branch.setNew(false);
			}
			else {
				session.merge(branch);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !BranchModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(BranchModelImpl.ENTITY_CACHE_ENABLED,
			BranchImpl.class, branch.getPrimaryKey(), branch);

		return branch;
	}

	protected Branch toUnwrappedModel(Branch branch) {
		if (branch instanceof BranchImpl) {
			return branch;
		}

		BranchImpl branchImpl = new BranchImpl();

		branchImpl.setNew(branch.isNew());
		branchImpl.setPrimaryKey(branch.getPrimaryKey());

		branchImpl.setEntityId(branch.getEntityId());
		branchImpl.setGroupId(branch.getGroupId());
		branchImpl.setCompanyId(branch.getCompanyId());
		branchImpl.setUserId(branch.getUserId());
		branchImpl.setUserName(branch.getUserName());
		branchImpl.setCreateDate(branch.getCreateDate());
		branchImpl.setModifiedDate(branch.getModifiedDate());
		branchImpl.setName(branch.getName());
		branchImpl.setLat(branch.getLat());
		branchImpl.setLng(branch.getLng());
		branchImpl.setOrganizationId(branch.getOrganizationId());

		return branchImpl;
	}

	/**
	 * Returns the branch with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the branch
	 * @return the branch
	 * @throws com.mobilekipyonetim.service.NoSuchBranchException if a branch with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Branch findByPrimaryKey(Serializable primaryKey)
		throws NoSuchBranchException, SystemException {
		Branch branch = fetchByPrimaryKey(primaryKey);

		if (branch == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchBranchException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return branch;
	}

	/**
	 * Returns the branch with the primary key or throws a {@link com.mobilekipyonetim.service.NoSuchBranchException} if it could not be found.
	 *
	 * @param entityId the primary key of the branch
	 * @return the branch
	 * @throws com.mobilekipyonetim.service.NoSuchBranchException if a branch with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Branch findByPrimaryKey(int entityId)
		throws NoSuchBranchException, SystemException {
		return findByPrimaryKey((Serializable)entityId);
	}

	/**
	 * Returns the branch with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the branch
	 * @return the branch, or <code>null</code> if a branch with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Branch fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Branch branch = (Branch)EntityCacheUtil.getResult(BranchModelImpl.ENTITY_CACHE_ENABLED,
				BranchImpl.class, primaryKey);

		if (branch == _nullBranch) {
			return null;
		}

		if (branch == null) {
			Session session = null;

			try {
				session = openSession();

				branch = (Branch)session.get(BranchImpl.class, primaryKey);

				if (branch != null) {
					cacheResult(branch);
				}
				else {
					EntityCacheUtil.putResult(BranchModelImpl.ENTITY_CACHE_ENABLED,
						BranchImpl.class, primaryKey, _nullBranch);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(BranchModelImpl.ENTITY_CACHE_ENABLED,
					BranchImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return branch;
	}

	/**
	 * Returns the branch with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param entityId the primary key of the branch
	 * @return the branch, or <code>null</code> if a branch with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Branch fetchByPrimaryKey(int entityId) throws SystemException {
		return fetchByPrimaryKey((Serializable)entityId);
	}

	/**
	 * Returns all the branchs.
	 *
	 * @return the branchs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Branch> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<Branch> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<Branch> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Branch> list = (List<Branch>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_BRANCH);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BRANCH;

				if (pagination) {
					sql = sql.concat(BranchModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Branch>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Branch>(list);
				}
				else {
					list = (List<Branch>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the branchs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Branch branch : findAll()) {
			remove(branch);
		}
	}

	/**
	 * Returns the number of branchs.
	 *
	 * @return the number of branchs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_BRANCH);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the branch persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.mobilekipyonetim.service.model.Branch")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Branch>> listenersList = new ArrayList<ModelListener<Branch>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Branch>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(BranchImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_BRANCH = "SELECT branch FROM Branch branch";
	private static final String _SQL_SELECT_BRANCH_WHERE = "SELECT branch FROM Branch branch WHERE ";
	private static final String _SQL_COUNT_BRANCH = "SELECT COUNT(branch) FROM Branch branch";
	private static final String _SQL_COUNT_BRANCH_WHERE = "SELECT COUNT(branch) FROM Branch branch WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "branch.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Branch exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Branch exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(BranchPersistenceImpl.class);
	private static Branch _nullBranch = new BranchImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Branch> toCacheModel() {
				return _nullBranchCacheModel;
			}
		};

	private static CacheModel<Branch> _nullBranchCacheModel = new CacheModel<Branch>() {
			@Override
			public Branch toEntityModel() {
				return _nullBranch;
			}
		};
}