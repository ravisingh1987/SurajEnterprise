/**
 * 
 */
package com.suraj.mm.config;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author RO854994 Swagger configuration to test application in dev environment
 */
@Configuration
@EnableSwagger2
public class SwaggerConf {

	private static final String URL = "http://www.suraj.com/india/";

	/**
	 * @author Roshan Singh creating bean
	 * @return
	 */
	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.suraj.mm.controller")).paths(regex("/[a-z,A-Z].*"))
				.build().apiInfo(metaData());
	}

	/**
	 * @author RO854994 Information to be display in swagger page
	 */
	private ApiInfo metaData() {
		return new ApiInfo("Suraj enterprise application API for Online settlement", "Made by Roshan Kumar Singh",
				"version 1.0", "Terms of service", new Contact("Suraj Limited", URL, URL), "Suraj License Version 2.0",
				URL);

	}
}
