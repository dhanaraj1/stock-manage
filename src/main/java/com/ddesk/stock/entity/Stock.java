/*
 * Copyright (c) XCordis FinTech Ltd 2018-2019.
 *
 * This software is copyrighted. Under the copyright laws, this software may not be copied, in whole or in part, without
 * prior written consent of XCordis FinTech Ltd. This software is provided under the terms of a license between XCordis FinTech Ltd and the
 * recipient, and its use is subject to the terms of that license.
 */
package com.ddesk.stock.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

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
	@JoinColumn(name = "distributorId")
	private Distributor distributor;
	private Integer initialQuatity;
	private Integer existingQuantity;
	private Float totalCst;
	private Float totalGst;
	private Float totalGrossValue;
	@CreatedDate
	private Date createdDate;
	@LastModifiedDate
	private Date updateDate;
	private String refId;

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
	 * @return the distributor
	 */
	public Distributor getDistributor() {
		return distributor;
	}

	/**
	 * @param distributor
	 *            the distributor to set
	 */
	public void setDistributor(Distributor distributor) {
		this.distributor = distributor;
	}

	/**
	 * @return the initialQuatity
	 */
	public Integer getInitialQuatity() {
		return initialQuatity;
	}

	/**
	 * @param initialQuatity
	 *            the initialQuatity to set
	 */
	public void setInitialQuatity(Integer initialQuatity) {
		this.initialQuatity = initialQuatity;
	}

	/**
	 * @return the existingQuantity
	 */
	public Integer getExistingQuantity() {
		return existingQuantity;
	}

	/**
	 * @param existingQuantity
	 *            the existingQuantity to set
	 */
	public void setExistingQuantity(Integer existingQuantity) {
		this.existingQuantity = existingQuantity;
	}

	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate
	 *            the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the updateDate
	 */
	public Date getUpdateDate() {
		return updateDate;
	}

	/**
	 * @param updateDate
	 *            the updateDate to set
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
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

	/**
	 * @return the refId
	 */
	public String getRefId() {
		return refId;
	}

	/**
	 * @param refId
	 *            the refId to set
	 */
	public void setRefId(String refId) {
		this.refId = refId;
	}

}
