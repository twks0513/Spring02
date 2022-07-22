package com.care.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping("test")
	public void test() {
		System.out.println("=== test 연결");
	}
	@RequestMapping(value = "index") //url경로
	public String index() {				
		return "member/index"; //jsp경로
	}
	
	@RequestMapping(value = "login")
	public String login(Model model) {
		String[] str = {"aaaa","bbbb","cccc"};
		
		model.addAttribute("test","로그인 페이지");
		
		model.addAttribute("str",str);
		
		return "member/login";
	}
	@RequestMapping(value = "logout")
	public ModelAndView logout() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("logout","로그아웃페이지입니다");
		mv.setViewName("member/logout");
		return mv;
	}
}
