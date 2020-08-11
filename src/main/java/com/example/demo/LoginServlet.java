package com.example.demo;

import java.io.IOException;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.RegularExpression;


@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	
	/*
	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		System.out.println("I am in server program get");
		String uid = req.getParameter("uid");
		System.out.println(uid);
		String passwd = req.getParameter("pwd");
		System.out.println(passwd);
		
		if (uid.equals("royal@") && passwd.equals("nepal"))
		{
			try {
				//res.getWriter().print("success login.");
				HttpSession  custoSession = req.getSession();
				custoSession.setAttribute("isloggedIn",true);
				res.sendRedirect("welcome.html");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else
			try {
				res.sendRedirect("SignUp.html");
				//res.getWriter().print("login failed");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	*/
	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		String uid = req.getParameter("uid");
		String pwd = req.getParameter("pwd");

		Connection con = null;
		boolean val;
		try {
			con=DatabaseConnection.getDBConnection();
			val = UsersTable.validateLogin(uid, pwd, con);

		if(val == true)
			res.sendRedirect("welcome.html");
		else
			res.sendRedirect("SignUp.html");

		} catch (Exception e) {
		e.printStackTrace();
		}
		}

	

	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		doGet(req, res);
	}
	/*
		System.out.println("I am in server program post");
		String uid = req.getParameter("uid");
		String pwd = req.getParameter("pwd");
		HttpSession custoSession = req.getSession();
		boolean isLoggedIn = (boolean) custoSession.getAttribute("isloogedIn");
		
		String ip = req.getRemoteAddr();
		if (ip == "12.12.12.12") {
		res.getWriter().print("security threat detected... you are blocked");
		return;
		
		if(isLoggedIn == true) {
			System.out.println("It is logged in");
		} else
			try {
				res.sendRedirect("royalnepal.html");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	*/

}

