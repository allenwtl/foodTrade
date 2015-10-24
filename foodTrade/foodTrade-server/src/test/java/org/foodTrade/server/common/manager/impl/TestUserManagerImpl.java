package org.foodTrade.server.common.manager.impl;

import java.util.Calendar;

import javax.annotation.Resource;

import org.foodTrade.server.common.BaseTest;
import org.foodTrade.server.common.domain.User;
import org.foodTrade.server.common.manager.UserManager;
import org.junit.Test;

public class TestUserManagerImpl extends BaseTest{

	
	@Resource
	private UserManager userManager ;
	
	@Test
	public void test(){
		User user = null ;
		for (int i = 0; i < 120; i++) {
			user = new User();
			user.setUserName("sb"+i);
			user.setUpdateTime(Calendar.getInstance());
			userManager.insert(user);
		}
	}
	
}
