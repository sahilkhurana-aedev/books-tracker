package com.bookstracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author sahil.khurana
 * @SpringBootApplication Annotation It is a combination of three
 *                        annotations @EnableAutoConfiguration, @ComponentScan,
 *                        and @Configuration.
 * 
 *                        RESTful architecture: In this case, there is no View.
 *                        The Controller only sends back the model (or resource
 *                        representation). That data will come in some format
 *                        like JSON.
 */

@SpringBootApplication
public class BooksTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooksTrackerApplication.class, args);
	}

}

/**
 * HTTP Requests:
 * 
 * @GetMapping: It maps the HTTP GET requests on the specific handler method. It
 *              is used to create a web service endpoint that fetches. It is
 *              used instead of using: @RequestMapping(method =
 *              RequestMethod.GET)
 * 
 * @PostMapping: It maps the HTTP POST requests on the specific handler method.
 *               It is used to create a web service endpoint that creates. It is
 *               used instead of using: @RequestMapping(method =
 *               RequestMethod.POST)
 * 
 * @PutMapping: It maps the HTTP PUT requests on the specific handler method. It
 *              is used to create a web service endpoint that creates or
 *              updates. It is used instead of using: @RequestMapping(method =
 *              RequestMethod.PUT)
 * 
 * @DeleteMapping: It maps the HTTP DELETE requests on the specific handler
 *                 method. It is used to create a web service endpoint that
 *                 deletes a resource. It is used instead of
 *                 using: @RequestMapping(method = RequestMethod.DELETE)
 * 
 * @PatchMapping: It maps the HTTP PATCH requests on the specific handler
 *                method. It is used instead of using: @RequestMapping(method =
 *                RequestMethod.PATCH)
 * 
 * @RequestBody: It is used to bind HTTP request with an object in a method
 *               parameter. Internally it uses HTTP MessageConverters to convert
 *               the body of the request. When we annotate a method parameter
 *               with @RequestBody, the Spring framework binds the incoming HTTP
 *               request body to that parameter.
 * 
 * @ResponseBody: It binds the method return value to the response body. It
 *                tells the Spring Boot Framework to serialize a return an
 *                object into JSON and XML format.
 * 
 * @PathVariable: It is used to extract the values from the URI
 * 
 * @RequestParam: It is used to extract the query parameters form the URL
 * 
 * @RequestHeader: It is used to get the details about the HTTP request headers.
 *                 We use this annotation as a method parameter. The optional
 *                 elements of the annotation are name, required, value,
 *                 defaultValue. For each detail in the header, we should
 *                 specify separate annotations. We can use it multiple time in
 *                 a method
 * 
 * @RequestAttribute: It binds a method parameter to request attribute. It
 *                    provides convenient access to the request attributes from
 *                    a controller method. With the help of @RequestAttribute
 *                    annotation, we can access objects that are populated on
 *                    the server-side.
 */
