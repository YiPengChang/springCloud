package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.Server;

@Configuration
public class ConfigBean {
	@Bean
	@LoadBalanced//Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端       负载均衡的工具。默认是轮询
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	//现在我要把负载均衡算法改成别的：比如随机
	@Bean
	public IRule myIRule() {
		return new RandomRule();
	}
	
	
}
