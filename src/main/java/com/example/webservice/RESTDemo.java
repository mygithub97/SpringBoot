package com.example.webservice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTDemo {
	@RequestMapping(value ="/centimeter/{meter}", method = RequestMethod.GET)
	//converting method into htttp url
	public int centimeter(@PathVariable int meter)
	{
		return meter * 100;
	}

}
