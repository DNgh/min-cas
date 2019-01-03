package com.min.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.min.dao.UserDao;
import com.min.entity.TsUser;
import com.min.view.UserInfo;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	
	@Override
	public TsUser findUserByUsername(String username) {
		return userDao.findByUsername(username);
	}

	@Override
	public UserInfo loadUserInfoByUsername(String username) {
		TsUser user = userDao.findByUsername(username);
		UserInfo userInfo = new UserInfo();
		if(user != null) {
			userInfo.setUsername(user.getUsername());
			userInfo.setEmail(user.getEmail());
		}
		
		return userInfo;
	}

}
