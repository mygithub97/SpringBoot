package com.strut;

import java.util.ArrayList;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



@Component
@Scope("session")
public class CartDetails {
	boolean isLoggedIn;
	ArrayList<String> items = new ArrayList<String>();
	
	public void add(String prod) {
		items.add(prod);
		System.out.println("total items in the cart");
		System.out.println(items);
	}
}
