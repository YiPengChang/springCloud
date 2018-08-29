package com.atguigu.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.feignservice.DeptClientService;


@RestController
public class DeptController_Consumer {
//	private String URI = "http://localhost:8001/";
//	private String URI = "http://microservicecloud-dept/";
	
//	@Autowired
//	private RestTemplate restTemplate;
	
	@Autowired
	private DeptClientService feignService;
	
	@RequestMapping(value = "/consumer/dept/add", method = RequestMethod.POST)
	public boolean add(Dept dept) {
		return feignService.add(dept);
	}

	@RequestMapping(value = "/consumer/dept/get/{id}", method = RequestMethod.GET)
	public Dept get(@PathVariable(value="id") String id) {
		return feignService.get(id);
	}

	@RequestMapping(value = "/consumer/dept/list", method = RequestMethod.GET)
	public List<Dept> get() {
		return feignService.get();
	}

}
