/*
 * Copyright (c) XCordis FinTech Ltd 2018-2019.
 *
 * This software is copyrighted. Under the copyright laws, this software may not be copied, in whole or in part, without
 * prior written consent of XCordis FinTech Ltd. This software is provided under the terms of a license between XCordis FinTech Ltd and the
 * recipient, and its use is subject to the terms of that license.
 */
package com.ddesk.stock.view;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ddesk.stock.entity.Product;
import com.ddesk.stock.service.ProductService;
import com.ddesk.stock.util.Notifications;

/**
 * The <code>TestVIew</code> responsible for method in <b>spring-boot-demo</b>
 * application.
 *
 * @author Rob Atkin
 */
@Component
public class TestVIew extends JFrame {

	private static final long serialVersionUID = 1L;
	private final ProductService productService;

	@Autowired
	public TestVIew(ProductService productService) throws Exception {
		this.setVisible(Boolean.TRUE);
		final JTextField productName = new JTextField();
		productName.setText("");
                productName.setName("ProductName");
		this.productService = productService;
		
                System.out.println("com.ddesk.stock.view.TestVIew.<init>()" +productService.findAll().size());
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.ddesk.stock.service.ProductService#saveProduct(javax.swing.
	 * JTextField, javax.swing.JTextField, javax.swing.JTextField,
	 * javax.swing.JTextField, javax.swing.JTextArea)
	 */
	public void saveProduct(JTextField productName, JTextField gstValue, JTextField cstValue, JTextField amount, JTextArea description) {
		if (Notifications.isNotEmptyTextFiled(productName) && Notifications.isNotEmptyTextFiled(gstValue)
				&& Notifications.isNotEmptyTextFiled(cstValue) && Notifications.isNotEmptyTextFiled(amount)) {

			final Product product = new Product();

			product.setAmount(Float.valueOf(amount.getText()));
			product.setDescription(description.getText());
			product.setGstValue(Float.valueOf(gstValue.getText()));
			product.setProductName(productName.getText());
			product.setCstValue(Float.valueOf(cstValue.getText()));

			productService.saveORupdate(product);
		}

	}

}
