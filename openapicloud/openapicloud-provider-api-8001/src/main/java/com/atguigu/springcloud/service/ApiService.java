package com.atguigu.springcloud.service;

import com.atguigu.springcloud.model.ExpresDelivery;
import com.atguigu.springcloud.model.ResponseExpresDelivery;

public interface ApiService {
	public  ResponseExpresDelivery expresDelivery(ExpresDelivery expresDelivery) throws Exception;
}
