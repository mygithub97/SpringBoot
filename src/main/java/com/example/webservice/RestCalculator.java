package com.example.webservice;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.net.HttpHeaders;

import io.swagger.annotations.Api;
import io.swagger.annotations.*;

@RestController
public class RestCalculator {

	// http://localhost/addCal/10/20
	@RequestMapping(value = "/addCal/{param1}/{param2}", method = RequestMethod.GET)
	public int add(@PathVariable int param1, @PathVariable int param2) throws Exception {
		System.out.println("add param 1:" + param1);
		System.out.println("add param 2:" + param2);
		return param1 + param2;
	}

	// http://localhost/subCal?param1=10&param2=5
	@RequestMapping(value = "/subCal", method = RequestMethod.GET)
	public int sub(@RequestParam("param1") int a, @RequestParam("param2") int b) {
		System.out.println("sub param 1:" + a);
		System.out.println("sub param 2:" + b);
		return a - b;
	}

	// http://localhost/jsonRes/1/2
	@RequestMapping(value = "/jsonRes/{param1}/{param2}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Output calculator(@PathVariable int param1, @PathVariable int param2) {
		System.out.println("calculator param 1:" + param1);
		System.out.println("calculator param 2:" + param2);
		Output res = new Output();
		res.setSum(param1 + param2);
		res.setSub(param1 - param2);
		res.setMul(param1 * param2);
		res.setDiv(param1 / param2);
		return res;
	}

	// http://localhost/jsonReq - send json in request body,
	// input type json string
	@RequestMapping(value = "/jsonReq", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public int addCalculator(@RequestBody Input in) {
		System.out.println("calculator param 1:" + in.param1);
		System.out.println("calculator param 2:" + in.param2);
		return in.param1 + in.param2;
	}

}