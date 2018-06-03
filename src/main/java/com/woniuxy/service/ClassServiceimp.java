package com.woniuxy.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.woniuxy.mapper.ClassMapper;
import com.woniuxy.po.Class;
@Service
public class ClassServiceimp implements ClassService{
	
	@Autowired
	private ClassMapper classMapper;
	@Override
	public List<Class> list() {	
		return classMapper.list();		
	}
}
