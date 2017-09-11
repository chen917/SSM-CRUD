package com.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.IUserDao;
import com.entity.User;
import com.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService{ 
	@Resource  
	private IUserDao userDao;  
	@Override  
	public User getUserById(Integer id) {  
	    
	    return this.userDao.getUserById(id); 
	}  
}
