/*
 * Copyright (c) XCordis FinTech Ltd 2018-2019.
 *
 * This software is copyrighted. Under the copyright laws, this software may not be copied, in whole or in part, without
 * prior written consent of XCordis FinTech Ltd. This software is provided under the terms of a license between XCordis FinTech Ltd and the
 * recipient, and its use is subject to the terms of that license.
 */
package com.ddesk.stock.view;

import javax.swing.JFrame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ddesk.stock.entity.Product;
import com.ddesk.stock.util.RepoFactory;

/**
 * The <code>TestVIew</code> responsible for method in <b>spring-boot-demo</b>
 * application.
 *
 * @author Rob Atkin
 */
@Component
public class TestVIew extends JFrame {

	private static final long serialVersionUID = 1L;

	@Autowired
	public TestVIew(RepoFactory repoFactory) throws Exception {
		this.setVisible(Boolean.TRUE);

		final Product product = new Product();
		product.setAmount(Float.valueOf(10));
		product.setCstValue(Float.valueOf(1));
		product.setDescription("sdsdsdsd");
		product.setGstValue(Float.valueOf(1));
		product.setProductName("test");

		// repoFactory.getProductRepository().save(product);
		System.out.println(repoFactory.getProductRepository().findById(Long.valueOf(1)));
	}

}
