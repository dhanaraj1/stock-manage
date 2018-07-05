package com.ddesk.stock.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = "com.ddesk.stock")
@EnableJpaRepositories(basePackages = "com.ddesk.stock.repo")
public class ApplicationConfiguration {
}
