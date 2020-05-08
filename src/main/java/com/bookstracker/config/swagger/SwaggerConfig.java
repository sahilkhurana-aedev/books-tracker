package com.bookstracker.config.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static springfox.documentation.spi.DocumentationType.SWAGGER_2;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * @author sahil.khurana
 * 
 * @Configuration is a marker annotation which indicates that a class declares
 *                one or more @Bean methods and may be processed by the Spring
 *                container to generate bean definitions and service requests
 *                for those beans at runtime
 *                
 *                http://localhost:8080/swagger-ui.html
 *                http://localhost:8080/v2/api-docs.
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	/**
	 * @EnableSwagger2 annotation enables Swagger support in the class. 
	 * 
	 * The select() method called on the Docket bean instance returns an ApiSelectorBuilder, 
	 * which provides the apis() and paths() methods that are used to filter the controllers 
	 * and methods that are being documented using String predicates.
	 * 
	 * RequestHandlerSelectors.basePackage predicate 
	 * matches the guru.springframework.controllers base package to filter the API. 
	 * 		Example - .apis(RequestHandlerSelectors.basePackage("guru.springframework.controllers"))
	 * 
	 * The regex parameter passed to paths()acts as an additional filter to 
	 * generate documentation only for the path starting with /product.
	 *  	Example - .paths(regex("/product.*"))
	 * 
	 */

	@Bean
	public Docket api() {
		return new Docket(SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build();
	}

}
