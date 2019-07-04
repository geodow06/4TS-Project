package com.qa.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.business.CustomMethodsServiceImpl;

@RestController
public class CustomMethodsController {
	@Autowired
	public CustomMethodsServiceImpl svc;

	@RequestMapping("checkUsernames/{username}")
	public boolean checkUsernames(@PathVariable String username) {
		return svc.checkUsernames(username);
	}

	@RequestMapping("getAllUsernames")
	public List<String> getAllUsernames() {
		return svc.getAllUsernames();
	}

}
