package com.min.facility;


import com.min.view.UserInfo;

public class GlobalContextHolder
{
	private static UserInfo userInfo = null;

	public static UserInfo getUserInfo() {
		return userInfo;
	}

	public static void setUserInfo(UserInfo userInfo) {
		GlobalContextHolder.userInfo = userInfo;
	}
	
}
