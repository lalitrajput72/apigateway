package com.zuul.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.zuul.apigateway.filters.ErrorFilter;
import com.zuul.apigateway.filters.PostFilter;
import com.zuul.apigateway.filters.PreFilter;
import com.zuul.apigateway.filters.RouteFilter;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ApigatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApigatewayApplication.class, args);
	}
	
	 @Bean
	    public PreFilter preFilter() {
	        return new PreFilter();
	    }
	    @Bean
	    public PostFilter postFilter() {
	        return new PostFilter();
	    }
	    @Bean
	    public ErrorFilter errorFilter() {
	        return new ErrorFilter();
	    }
	    @Bean
	    public RouteFilter routeFilter() {
	        return new RouteFilter();
	    }

}
