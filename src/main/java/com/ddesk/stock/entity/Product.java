/*
 * Copyright (c) XCordis FinTech Ltd 2018-2019.
 *
 * This software is copyrighted. Under the copyright laws, this software may not be copied, in whole or in part, without
 * prior written consent of XCordis FinTech Ltd. This software is provided under the terms of a license between XCordis FinTech Ltd and the
 * recipient, and its use is subject to the terms of that license.
 */
package com.ddesk.stock.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.ddesk.stock.util.ApplicationConstants;

/**
 * The <code>Product</code> responsible for method in <b>spring-boot-demo</b>
 * application.
 *
 * @author Rob Atkin
 */
@Entity
@Table(name = ApplicationConstants.Tables.TBL_PRODUCT)
public class Product {

	@Id
	@GeneratedValue
	private long productId;
	private String productName;
	private String description;
	private Float amount;
	private Float gstValue;
	private Float cstValue;
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "stockId")
	private Set<Stock> stocks = new HashSet<>();

	/**
	 * @return the productId
	 */
	public long getProductId() {
		return productId;
	}

	/**
	 * @param productId
	 *            the productId to set
	 */
	public void setProductId(long productId) {
		this.productId = productId;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName
	 *            the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the amount
	 */
	public Float getAmount() {
		return amount;
	}

	/**
	 * @param amount
	 *            the amount to set
	 */
	public void setAmount(Float amount) {
		this.amount = amount;
	}

	/**
	 * @return the gstValue
	 */
	public Float getGstValue() {
		return gstValue;
	}

	/**
	 * @param gstValue
	 *            the gstValue to set
	 */
	public void setGstValue(Float gstValue) {
		this.gstValue = gstValue;
	}

	/**
	 * @return the cstValue
	 */
	public Float getCstValue() {
		return cstValue;
	}

	/**
	 * @param cstValue
	 *            the cstValue to set
	 */
	public void setCstValue(Float cstValue) {
		this.cstValue = cstValue;
	}

	/**
	 * @return the stocks
	 */
	public Set<Stock> getStocks() {
		return stocks;
	}

	/**
	 * @param stocks
	 *            the stocks to set
	 */
	public void setStocks(Set<Stock> stocks) {
		this.stocks = stocks;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", description=" + description + ", amount=" + amount
				+ ", gstValue=" + gstValue + ", cstValue=" + cstValue + ", stocks=" + stocks + "]";
	}

}
