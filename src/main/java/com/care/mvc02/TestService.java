package com.care.mvc02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class TestService {
	@Autowired
	@Qualifier("dao1")
	TestDAO dao;
	
	public TestService() {
		System.out.println("TestService 생성자 실행");
	}
	
	public void service() {
		System.out.println("dao : "+dao);
		System.out.println("서비스 연결");
	}
}
