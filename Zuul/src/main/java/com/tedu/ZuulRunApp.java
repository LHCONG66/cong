package com.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy //标识是Zuul项目
public class ZuulRunApp {
	public static void main(String[] args) {
		SpringApplication.run(ZuulRunApp.class, args);
	}

}
