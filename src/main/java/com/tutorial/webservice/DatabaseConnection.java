package com.tutorial.webservice;

import java.sql.Connection;
import java.sql.DriverManager;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.config.YAMLConfig;
@Component
public class DatabaseConnection {
	
	@Value("${dbConn}")
	private String dbConn;
	@Value("${dbUserid}")
	private String dbUid;
	@Value("${dbPassword}")
	private String dbPass;
	@Autowired
	YAMLConfig y;
	
	Logger log=Logger.getLogger("DatabaseConnection");
	
	public  Connection getDBConnection( ) throws Exception
	{
		 
		log.info("yaml config conn :"+y.getDbConn());
		log.info("yaml config db userid :"+y.getDbUserid());
		log.info("yaml config db password :"+y.getDbPassword());
		
		Connection conn =null;
		return conn;
	}
}
