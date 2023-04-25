package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Customer;
import com.demo.repository.Custrepository;


@CrossOrigin(origins="http://localhost:4200")
@RestController
public class CustController
{

	@Autowired
	private Custrepository crepository;  
	

	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/insertrecord")
	public Customer insertrecord(@RequestBody Customer c1)                    // insert service
	{
		return crepository.save(c1);
		
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/updaterecord")
	public Customer updaterecord(@RequestBody Customer c1)                    // update service
	{
		return crepository.save(c1);
		
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/deleterecord")
	public void deleterecord(@RequestBody Customer c1)                    // update service
	{
		crepository.delete(c1);
		
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/viewrecord")
	public List<Customer> viewrecord()
	{
		return crepository.findAll();
	}


}






