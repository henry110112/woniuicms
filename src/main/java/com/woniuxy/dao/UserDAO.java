package com.woniuxy.dao;

import java.util.List;

import com.woniuxy.po.UserPO;

public interface UserDAO {
	
    List<UserPO> list();
    String findPass(UserPO userPO);
}