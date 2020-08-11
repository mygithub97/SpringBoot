package com.strut;

import java.sql.Connection;
import java.sql.SQLException;

import com.example.demo.DatabaseConnection;
import com.example.demo.UsersTable;
import com.opensymphony.xwork2.ActionSupport;

public class LoginStructAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	String uid;
	String pwd;
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public String authenticate() {
		Connection con = null;
		boolean val = false;
		try {
			con = DatabaseConnection.getDBConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			val = UsersTable.validateLogin(uid, pwd, con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (val == true)
			return "success";
		else
			return "failure";
		
	}
	
	
}
