package com.min.service;

import com.min.entity.TsUser;
import com.min.view.UserInfo;

public interface UserService {
	public TsUser findUserByUsername(String username);
	public UserInfo loadUserInfoByUsername(String username);
}
