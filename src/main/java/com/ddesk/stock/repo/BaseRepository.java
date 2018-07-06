/*
 * Copyright (c) XCordis FinTech Ltd 2018-2019.
 *
 * This software is copyrighted. Under the copyright laws, this software may not be copied, in whole or in part, without
 * prior written consent of XCordis FinTech Ltd. This software is provided under the terms of a license between XCordis FinTech Ltd and the
 * recipient, and its use is subject to the terms of that license.
 */
package com.ddesk.stock.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * The <code>BaseRepository</code> responsible for method in
 * <b>spring-boot-demo</b> application.
 *
 * @author Rob Atkin
 */
@NoRepositoryBean
public interface BaseRepository<T, ID extends Serializable> extends JpaRepository<T, ID> {

}
