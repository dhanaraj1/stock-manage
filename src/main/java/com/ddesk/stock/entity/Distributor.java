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
import javax.persistence.Table;

import com.ddesk.stock.util.ApplicationConstants;

/**
 * The <code>Distributer</code> responsible for method in
 * <b>spring-boot-demo</b> application.
 *
 * @author Rob Atkin
 */
@Entity
@Table(name = ApplicationConstants.Tables.TBL_DISTRIBUTER)
public class Distributor {

	@GeneratedValue
	@Id
	private long distributerId;
	private String name;
	private String mobileNumber;

	/**
	 * @return the distributerId
	 */
	public long getDistributerId() {
		return distributerId;
	}

	/**
	 * @param distributerId
	 *            the distributerId to set
	 */
	public void setDistributerId(long distributerId) {
		this.distributerId = distributerId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the mobileNumber
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}

	/**
	 * @param mobileNumber
	 *            the mobileNumber to set
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

}
