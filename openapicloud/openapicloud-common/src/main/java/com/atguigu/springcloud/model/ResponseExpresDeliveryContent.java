package com.atguigu.springcloud.model;

import java.io.Serializable;

/**
 * 快递实体响应
 * 
 * @author Administrator
 *
 */
public class ResponseExpresDeliveryContent implements Serializable{

	private String content;

	private String time;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "ResponseExpresDeliveryContent [content=" + content + ", time=" + time + "]";
	}


}
