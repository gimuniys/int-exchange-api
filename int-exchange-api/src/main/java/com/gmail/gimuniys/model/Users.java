package com.gmail.gimuniys.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Users implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="user_id")
	private String userId;
	
	@Column(name="user_pw")
	private String userPw;
	
	@Column(name="user_name")
	private String userName;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userPw=" + userPw + ", userName=" + userName + "]";
	}
	
	
}
