package com.care.mvc02;

import org.springframework.stereotype.Repository;

@Repository() //bean 이름 지정
public class TestDAO {
	public TestDAO() {
		System.out.println("dao 생성자 실행");
	}
}
