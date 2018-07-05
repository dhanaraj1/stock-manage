/*
 * Copyright (c) XCordis FinTech Ltd 2018-2019.
 *
 * This software is copyrighted. Under the copyright laws, this software may not be copied, in whole or in part, without
 * prior written consent of XCordis FinTech Ltd. This software is provided under the terms of a license between XCordis FinTech Ltd and the
 * recipient, and its use is subject to the terms of that license.
 */
package com.ddesk.stock.util;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ddesk.stock.repo.DistributorRepository;
import com.ddesk.stock.repo.ProductRepository;
import com.ddesk.stock.repo.StockRepository;

/**
 * The <code>RepoFactory</code> responsible for method in
 * <b>spring-boot-demo</b> application.
 *
 * @author Rob Atkin
 */
@Component
public class RepoFactory implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private DistributorRepository distributorRepository;
	@Autowired
	private StockRepository stockRepository;

	/**
	 * @return the productRepository
	 */
	public ProductRepository getProductRepository() {
		return productRepository;
	}

	/**
	 * @return the distributorRepository
	 */
	public DistributorRepository getDistributorRepository() {
		return distributorRepository;
	}

	/**
	 * @return the stockRepository
	 */
	public StockRepository getStockRepository() {
		return stockRepository;
	}

}
