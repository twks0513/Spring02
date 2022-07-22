package com.care.mvc03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MvcServiceImpl {
	@Autowired
	MvcDAO dao;
}
