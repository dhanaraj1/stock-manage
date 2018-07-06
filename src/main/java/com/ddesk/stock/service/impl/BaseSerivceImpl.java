/*
 * Copyright (c) XCordis FinTech Ltd 2018-2019.
 *
 * This software is copyrighted. Under the copyright laws, this software may not be copied, in whole or in part, without
 * prior written consent of XCordis FinTech Ltd. This software is provided under the terms of a license between XCordis FinTech Ltd and the
 * recipient, and its use is subject to the terms of that license.
 */
package com.ddesk.stock.service.impl;

import java.io.Serializable;
import java.util.List;

import com.ddesk.stock.repo.BaseRepository;
import com.ddesk.stock.service.BaseService;

/**
 * The <code>BaseSerivceImpl</code> responsible for method in
 * <b>spring-boot-demo</b> application.
 *
 * @author Rob Atkin
 * @param <T>
 */
public class BaseSerivceImpl<T, ID extends Serializable> implements BaseService<T, ID> {

	/*
	 * (non-Javadoc)
	 *
	 * @see com.ddesk.stock.service.BaseService#findAll()
	 */
	protected BaseRepository<T, ID> baseRepo;

	@Override
	public List<T> findAll() {
		return baseRepo.findAll();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.ddesk.stock.service.BaseService#delete(java.lang.Object)
	 */
	@Override
	public void delete(T t) {
		baseRepo.delete(t);

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.ddesk.stock.service.BaseService#saveORupdate(java.lang.Object)
	 */
	@Override
	public T saveORupdate(T t) {
		return baseRepo.save(t);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.ddesk.stock.service.BaseService#findOne(java.lang.Object)
	 */
	@Override
	public T findOne(ID id) {
		return baseRepo.findById(id).get();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.ddesk.stock.service.BaseService#deleteById(java.lang.Object)
	 */
	@Override
	public void deleteById(ID id) {
		baseRepo.deleteById(id);

	}

}
