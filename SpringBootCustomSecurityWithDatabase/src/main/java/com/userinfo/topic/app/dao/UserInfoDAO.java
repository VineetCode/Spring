package com.userinfo.topic.app.dao;

import com.userinfo.topic.app.entities.UserInfo;

public interface UserInfoDAO {
	public abstract UserInfo getActiveUser(String userName);
}
