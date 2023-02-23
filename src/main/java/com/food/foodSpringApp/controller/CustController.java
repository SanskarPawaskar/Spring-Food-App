package com.food.foodSpringApp.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.food.foodSpringApp.dao.CustomerDao;
import com.food.foodSpringApp.dto.Customer;

@RestController
@RequestMapping("/customers")
public class CustController {
	
	@Autowired
	CustomerDao customerDao;
	
	@PostMapping
	public Customer saveCustomer(@RequestBody Customer customer) {
		return customerDao.saveCustomer(customer);
	}
	
	

}
