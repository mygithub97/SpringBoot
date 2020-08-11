package com.example.demo;


import javax.xml.ws.Endpoint;

import org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;



import com.example.webservice.SoapCalculator;

@SpringBootApplication
@ServletComponentScan
@ComponentScan(basePackages="com.tutorial.webservice")
@ComponentScan(basePackages= {"com.config", "com.strut","com.spring","com.springdata"})
@EnableJpaRepositories("com.springdata")
@EntityScan({"com.springdata"})
@EnableTransactionManagement
public class RoyalNepalFcApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoyalNepalFcApplication.class, args);
		Endpoint.publish("http://localhost:7777/greet", new SoapCalculator());
	}
	
	@Bean
	public FilterRegistrationBean filterRegistrationBean() {
		FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		StrutsPrepareAndExecuteFilter struts = new StrutsPrepareAndExecuteFilter();
		registrationBean.setFilter(struts);
		registrationBean.setOrder(1);
		return registrationBean;
	}

}
