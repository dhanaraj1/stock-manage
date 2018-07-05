/*
 * Copyright (c) XCordis FinTech Ltd 2018-2019.
 *
 * This software is copyrighted. Under the copyright laws, this software may not be copied, in whole or in part, without
 * prior written consent of XCordis FinTech Ltd. This software is provided under the terms of a license between XCordis FinTech Ltd and the
 * recipient, and its use is subject to the terms of that license.
 */
package com.ddesk.stock.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ddesk.stock.util.ApplicationConstants;

/**
 * The <code>Stock</code> responsible for method in <b>spring-boot-demo</b>
 * application.
 *
 * @author Rob Atkin
 */
@Entity
@Table(name = ApplicationConstants.Tables.TBL_STOCK)
public class Stock {

	@GeneratedValue
	@Id
	private long stockId;
	@ManyToOne
	@JoinColumn(name = "productId")
	private Product product;
	@ManyToOne
	@JoinColumn(name = "distributerId")
	private Distributor distributer;
	private Integer quatity;
	private Float totalCst;
	private Float totalGst;
	private Float totalGrossValue;

	/**
	 * @return the stockId
	 */
	public long getStockId() {
		return stockId;
	}

	/**
	 * @param stockId
	 *            the stockId to set
	 */
	public void setStockId(long stockId) {
		this.stockId = stockId;
	}

	/**
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * @param product
	 *            the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}

	/**
	 * @return the distributer
	 */
	public Distributor getDistributer() {
		return distributer;
	}

	/**
	 * @param distributer
	 *            the distributer to set
	 */
	public void setDistributer(Distributor distributer) {
		this.distributer = distributer;
	}

	/**
	 * @return the quatity
	 */
	public Integer getQuatity() {
		return quatity;
	}

	/**
	 * @param quatity
	 *            the quatity to set
	 */
	public void setQuatity(Integer quatity) {
		this.quatity = quatity;
	}

	/**
	 * @return the totalCst
	 */
	public Float getTotalCst() {
		return totalCst;
	}

	/**
	 * @param totalCst
	 *            the totalCst to set
	 */
	public void setTotalCst(Float totalCst) {
		this.totalCst = totalCst;
	}

	/**
	 * @return the totalGst
	 */
	public Float getTotalGst() {
		return totalGst;
	}

	/**
	 * @param totalGst
	 *            the totalGst to set
	 */
	public void setTotalGst(Float totalGst) {
		this.totalGst = totalGst;
	}

	/**
	 * @return the totalGrossValue
	 */
	public Float getTotalGrossValue() {
		return totalGrossValue;
	}

	/**
	 * @param totalGrossValue
	 *            the totalGrossValue to set
	 */
	public void setTotalGrossValue(Float totalGrossValue) {
		this.totalGrossValue = totalGrossValue;
	}

}
