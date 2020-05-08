package com.bookstracker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @RestController annotation is a combination of @Controller and @ResponseBody
 * 
 * @Controller: used to mark a class as Spring MVC Controller like a web
 *              controller
 * 
 * @ResponseBody: binds a method return value to the web response. we are saying
 *                that we do not want a view produced. We just want to send the
 *                return object as the body
 * 
 * @RequestMapping: It is used to map the web requests. It has many optional
 *                  elements like consumes, header, method, name, params, path,
 *                  produces, and value. We use it with the class as well as the
 *                  method.
 *
 */

@RestController
@RequestMapping("/")
public class HomePageController {

	@GetMapping("/")
	public String getHelloMsg() {
		return "Welcome to Books Tracker";
	}
}
