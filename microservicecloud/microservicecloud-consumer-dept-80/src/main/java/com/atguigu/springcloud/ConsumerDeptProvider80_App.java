package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConsumerDeptProvider80_App {
	public static void main(String[] args) {
		SpringApplication.run(ConsumerDeptProvider80_App.class, args);
	}
}
