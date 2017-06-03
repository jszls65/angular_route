package com.zls.endpoint;

import javax.xml.ws.Endpoint;

import com.zls.service.impl.MyServiceImpl;

public class ServicePublic {

	public static void main(String[] args) throws Exception {
		Endpoint.publish("http://localhost:8083/wcms/", new MyServiceImpl());

	}
}