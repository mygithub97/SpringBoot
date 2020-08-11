package com.example.webservice;

import javax.jws.WebMethod;

import javax.jws.WebParam;
import javax.jws.WebParam.Mode;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService
@SOAPBinding(style=Style.DOCUMENT, use = Use.LITERAL,parameterStyle=ParameterStyle.BARE)
public class AgeCalculator {
	@WebMethod(operationName = "calculateAge")
	public int myAge(@WebParam(name = "birthyear")int year){
		return 2020 - year;
}
}
