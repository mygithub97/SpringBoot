package com.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@Configuration
@ComponentScan(basePackages="com.tutorial.webservice")
@ConfigurationProperties
@PropertySource("classpath:application.yml")
public class YAMLConfig {
	private String ip;
	private String dbConn;
	private String dbUserid;
	private String dbPassword;
	
	public String getDbConn() {
		return dbConn;
	}

	public void setDbConn(String dbConn) {
		this.dbConn = dbConn;
	}

	public String getDbUserid() {
		return dbUserid;
	}

	public void setDbUserid(String dbUserid) {
		this.dbUserid = dbUserid;
	}

	public String getDbPassword() {
		return dbPassword;
	}

	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}

	
	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
}
