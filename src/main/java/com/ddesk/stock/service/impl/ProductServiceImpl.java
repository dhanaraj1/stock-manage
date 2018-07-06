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

import com.ddesk.stock.entity.Product;
import com.ddesk.stock.repo.ProductRepository;
import com.ddesk.stock.service.ProductService;

/**
 * The <code>ProductServiceImpl</code> responsible for method in
 * <b>spring-boot-demo</b> application.
 *
 * @author Rob Atkin
 */
@Service
public class ProductServiceImpl extends BaseSerivceImpl<Product, Long> implements ProductService {

	@Autowired
	ProductRepository productRepository;

	@PostConstruct
	public void init() {
		baseRepo = productRepository;
	}

}
