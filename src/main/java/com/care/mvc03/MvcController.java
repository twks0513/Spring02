package com.care.mvc03;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MvcController {
	@RequestMapping("mvcindex")
	public String index() {
		return "/mvc/index";
	}
	
	
	@RequestMapping("members")
	public String members(Model model) {
		ArrayList<MvcDTO> list = new ArrayList<MvcDTO>();
		MvcDAO dao = new MvcDAO();
		list = dao.members();
		
		model.addAttribute("list",list);
		return "/mvc/members";
	}
	
	@RequestMapping("member")
	public String member(Model model) {
		MvcDAO dao = new MvcDAO();
		 model.addAttribute("member",dao.member());		
		return "/mvc/member";
	}
}
