package com.woniuxy.service;

import java.util.List;

import com.woniuxy.po.UserPO;

public interface UserService {
	public abstract List<UserPO> list();
	public abstract String checkLogin(UserPO userPO);
}
