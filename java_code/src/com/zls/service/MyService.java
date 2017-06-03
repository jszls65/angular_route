package com.zls.service;

import javax.jws.WebService;

@WebService
public interface MyService {
	public int add(int x, int y);

	public int dec(int x, int y);
	
	public String getStr();
}