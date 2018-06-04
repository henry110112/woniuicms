package com.woniuxy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniuxy.mapper.UserDAO;
import com.woniuxy.po.UserPO;
@Service
public class UserServiceImp implements UserService{
	
	@Autowired
	private UserDAO userDAO;
	@Override
	public List<UserPO> list() {	
		return userDAO.list();	
	}
}
