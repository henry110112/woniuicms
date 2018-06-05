package com.woniuxy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniuxy.dao.UserDAO;
import com.woniuxy.po.UserPO;
@Service
public class UserServiceImp implements UserService{
	
	@Autowired
	private UserDAO userDAO;
	
	@Override
	public List<UserPO> list() {	
		return userDAO.list();	
	}
	
	@Override
	public String checkLogin(UserPO userPO) {
		String result="";
		String pass=userDAO.findPass(userPO);
		if(pass==null){
			result="账号不存在，登陆失败";
			return result;
		}
		if(pass.equals(userPO.getPassword())){
			result="登陆成功";
		}
		else{
			result="密码错误，登陆失败";
		}
		return result;
	}
}
