package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.springcloud.model.ExpresDelivery;
import com.atguigu.springcloud.model.ResponseExpresDelivery;
import com.atguigu.springcloud.service.ApiService;

@RestController
public class ApiController {
	
	@Autowired
	private ApiService apiService;
	
	@RequestMapping(value="/expresDelivery",method=RequestMethod.POST)
	public ResponseExpresDelivery expresDelivery(ExpresDelivery expresDelivery) throws Exception {
		ResponseExpresDelivery result = apiService.expresDelivery(expresDelivery);
		return result;
	}
}
