package com.atguigu.springcloud.feignservice;

import java.util.List;
import org.springframework.stereotype.Component;
import com.atguigu.springcloud.entities.Dept;
import feign.hystrix.FallbackFactory;

@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {

	@Override
	public DeptClientService create(Throwable cause) {
		return new DeptClientService() {

			@Override
			public boolean add(Dept dept) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Dept get(String id) {
				Dept dept = new Dept();
				dept.setDname("没有呀");
				return dept;
			}

			@Override
			public List<Dept> get() {
				// TODO Auto-generated method stub
				return null;
			}
			
		};
	}

}
