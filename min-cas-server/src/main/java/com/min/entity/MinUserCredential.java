package com.min.entity;

import org.jasig.cas.authentication.UsernamePasswordCredential;

public class MinUserCredential extends UsernamePasswordCredential {
	private static final long serialVersionUID = 3952058652638487769L;
	
	private String newPassword;

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
}
