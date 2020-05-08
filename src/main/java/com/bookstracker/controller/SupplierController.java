package com.bookstracker.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/suppliers")
public class SupplierController {

	@GetMapping("/list")
	public List<String> getListOfSuppliers() {
		List<String> suppliers = new ArrayList<>(Arrays.asList("Ashoka & Company", "Raj Footwear"));
		return suppliers;
	}

}
