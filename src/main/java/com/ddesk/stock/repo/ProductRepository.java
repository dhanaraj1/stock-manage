/*
 * Copyright (c) XCordis FinTech Ltd 2018-2019.
 *
 * This software is copyrighted. Under the copyright laws, this software may not be copied, in whole or in part, without
 * prior written consent of XCordis FinTech Ltd. This software is provided under the terms of a license between XCordis FinTech Ltd and the
 * recipient, and its use is subject to the terms of that license.
 */
package com.ddesk.stock.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ddesk.stock.entity.Product;
import org.springframework.data.jpa.repository.Query;

/**
 * The <code>ProductRepository</code> responsible for method in
 * <b>spring-boot-demo</b> application.
 *
 * @author Rob Atkin
 */
@Repository
public interface ProductRepository extends BaseRepository<Product, Long> {

	public List<Product> findByProductName(String productName);

	public long countByProductName(String productName);
    
}
