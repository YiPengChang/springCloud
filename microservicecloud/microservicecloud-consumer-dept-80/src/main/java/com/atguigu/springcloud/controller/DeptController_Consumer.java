package com.atguigu.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.atguigu.springcloud.entities.Dept;

@RestController
public class DeptController_Consumer {
//	private String URI = "http://localhost:8001/";
	private String URI = "http://microservicecloud-dept/";
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value = "/consumer/dept/add", method = RequestMethod.POST)
	public boolean add(Dept dept) {
		return restTemplate.postForObject(URI + "dept/add", dept, Boolean.class);
	}

	@RequestMapping(value = "/consumer/dept/get/{id}", method = RequestMethod.GET)
	public Dept get(@PathVariable String id) {
		return restTemplate.getForObject(URI + "dept/get/" + id, Dept.class);
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/consumer/dept/list", method = RequestMethod.GET)
	public List<Dept> get() {
		return restTemplate.getForObject(URI + "dept/list", List.class);
	}

}
