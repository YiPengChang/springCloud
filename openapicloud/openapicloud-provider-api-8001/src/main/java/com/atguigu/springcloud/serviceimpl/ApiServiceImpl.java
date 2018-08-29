package com.atguigu.springcloud.serviceimpl;

import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpResponse;

import com.alibaba.fastjson.JSONObject;
import com.atguigu.springcloud.model.ExpresDelivery;
import com.atguigu.springcloud.model.ResponseExpresDelivery;
import com.atguigu.springcloud.service.ApiService;
import com.atguigu.springcloud.util.HttpUtils;
@Service
public class ApiServiceImpl implements ApiService{

	@Override
	public ResponseExpresDelivery expresDelivery(ExpresDelivery expresDelivery) throws Exception {
		String host = "https://cexpress.market.alicloudapi.com";
		String path = "/cexpress";
		String method = "GET";
		String appcode = "9f260d43dfd845988285c3d857bdffe5";
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Authorization", "APPCODE " + appcode);
		Map<String, String> querys = new HashMap<String, String>();
		querys.put("no", expresDelivery.getNo());
//	    querys.put("type", "zto");


    	HttpResponse response = HttpUtils.doGet(host, path, method, headers, querys);
    	JSONObject obj = new JSONObject().parseObject(EntityUtils.toString(response.getEntity()));
    	ResponseExpresDelivery bean= (ResponseExpresDelivery)JSONObject.toJavaObject(obj, ResponseExpresDelivery.class);
		return bean;
	}


}
