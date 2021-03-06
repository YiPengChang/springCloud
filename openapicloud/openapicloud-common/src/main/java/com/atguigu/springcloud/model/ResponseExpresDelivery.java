package com.atguigu.springcloud.model;

import java.io.Serializable;
import java.util.List;

/**
 * 快递实体响应
 * 
 * @author Administrator
 *
 */
public class ResponseExpresDelivery implements Serializable{

	private String code;

	private String no;

	private String type;

	private List<ResponseExpresDeliveryContent> list;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<ResponseExpresDeliveryContent> getList() {
		return list;
	}

	public void setList(List<ResponseExpresDeliveryContent> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "ResponseExpresDelivery [code=" + code + ", no=" + no + ", type=" + type + ", list=" + list + "]";
	}



}
