/*
 * Copyright (c) XCordis FinTech Ltd 2018-2019.
 *
 * This software is copyrighted. Under the copyright laws, this software may not be copied, in whole or in part, without
 * prior written consent of XCordis FinTech Ltd. This software is provided under the terms of a license between XCordis FinTech Ltd and the
 * recipient, and its use is subject to the terms of that license.
 */
package com.ddesk.stock.service;

import java.util.List;

/**
 * The <code>BaseService</code> responsible for method in
 * <b>spring-boot-demo</b> application.
 *
 * @author Rob Atkin
 */
public interface BaseService<T, ID> {

	/**
	 *
	 * This <code>getAll</code> method is used for get all records.
	 *
	 * @param <T>
	 *
	 * @return
	 */
	public List<T> findAll();

	/**
	 *
	 * This <code>delete</code> method is used for delete single record.
	 *
	 * @param <T>
	 *
	 * @param t
	 * @return
	 */
	public void delete(T t);

	/**
	 *
	 * This <code>update</code> method is used for update record.
	 *
	 * @param <T>
	 *
	 * @param t
	 * @return
	 */
	public T saveORupdate(T t);

	/**
	 *
	 * This <code>findOne</code> method is used for find single record by id.
	 *
	 * @param <T>
	 *
	 * @param id
	 * @return
	 */
	public T findOne(ID id);

	/**
	 *
	 * This <code>deleteById</code> method is used for delete record by id.
	 *
	 * @param id
	 * @return
	 */
	public void deleteById(ID id);
}
