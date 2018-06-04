package com.woniuxy.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.woniuxy.po.UserPO;
import com.woniuxy.service.UserService;

@Controller
@RequestMapping("")
public class ClassController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="hello") 
	public String sucess(Model model){
		List<UserPO> list = userService.list();
		model.addAttribute("p",list);
		System.out.println("运行了");
		return "sucess";
	}
}
