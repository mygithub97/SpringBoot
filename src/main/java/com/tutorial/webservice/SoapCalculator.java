package com.tutorial.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebParam.Mode;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
@WebService
@SOAPBinding(style=Style.DOCUMENT,use=Use.LITERAL)
public class SoapCalculator {
	
	@WebMethod(operationName="hello")
	public String hello(@WebParam(name="name") String n) {
		 return "hello "+n;
	}
	
	@WebMethod(operationName="add")
	public int add(@WebParam(name="param1") int p1,@WebParam(name="param2") int p2) {
		System.out.println("adding "+p1+"  "+p2); 
		return p1+p2;
	}

}
