/*
 * Copyright (c) XCordis FinTech Ltd 2018-2019.
 *
 * This software is copyrighted. Under the copyright laws, this software may not be copied, in whole or in part, without
 * prior written consent of XCordis FinTech Ltd. This software is provided under the terms of a license between XCordis FinTech Ltd and the
 * recipient, and its use is subject to the terms of that license.
 */
package com.ddesk.stock.service.impl;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddesk.stock.entity.Stock;
import com.ddesk.stock.repo.StockRepository;
import com.ddesk.stock.service.StockService;

/**
 * The <code>StockServiceImpl</code> responsible for method in
 * <b>spring-boot-demo</b> application.
 *
 * @author Rob Atkin
 */
@Service
public class StockServiceImpl extends BaseSerivceImpl<Stock, Long> implements StockService {

	@Autowired
	StockRepository stockRepository;

	@PostConstruct
	public void init() {
		baseRepo = stockRepository;
	}

}
