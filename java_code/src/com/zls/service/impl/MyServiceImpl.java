package com.zls.service.impl;

import javax.jws.WebService;

import com.zls.service.MyService;

@WebService(endpointInterface = "com.zls.service.MyService")
public class MyServiceImpl implements MyService {
	@Override
	public int add(int x, int y) {
		System.out.println(x + "+" + y + "=" + (x + y));
		return x + y;
	}

	@Override
	public int dec(int x, int y) {
		System.out.println(x + "-" + y + "=" + (x - y));
		return x - y;
	}

	@Override
	public String getStr() {
		
		return "Hello, this is zhangls's first webservice demo site.";
	}
}