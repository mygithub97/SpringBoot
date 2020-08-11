package com.strut;

import org.springframework.beans.factory.annotation.Autowired;

public class CartAction {
	public String prod;

	public String getProd() {
		return prod;
	}

	public void setProd(String prod) {
		this.prod = prod;
	} 
	
	@Autowired
	CartDetails cd;
	public String add() {
		cd.add(prod);
		return "success";
	}
}
