package com.woniuxy.controller;

import java.util.List;

import javax.json.Json;
import javax.naming.spi.DirStateFactory.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.woniuxy.po.UserPO;
import com.woniuxy.service.UserService;

@Controller
@RequestMapping("")
public class ClassController {
	@Autowired
	private UserService userService;
	@RequestMapping(value="login") 
	public String login(){
		return "login";
	}
	@RequestMapping(value="/jsontest") 	
	@ResponseBody//把返回对象变为json的类型，需要修改编码，不然会出现乱码
	public String test(@RequestBody UserPO userPO) {
		String result=userService.checkLogin(userPO);
		System.out.println(userPO.getPassword());
		System.out.println(userPO.getLogin());
		System.out.println(result);	
		return result;
	}	
	@RequestMapping(value="success")
	public String test1(){
		return "main";
	}
}
