package com.atguigu.springcloud.util;

import java.util.Map;
import java.util.Set;

import org.apache.commons.beanutils.BeanUtils;

public class MapToModelUtil {

	 public static <T> T decode(Class<T> clazz , Map<String,String> msg){
	        try {
	            T cls = clazz.newInstance();
	            Set<Map.Entry<String, String>> entrySet = msg.entrySet();
	            for(Map.Entry<String,String> entry : entrySet){
	                BeanUtils.setProperty(cls,entry.getKey(),entry.getValue());
	            }
	            return cls;
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return null;
	    }
}
