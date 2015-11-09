package org.foodTrade.server.common.manager.impl;

import java.util.Calendar;

import javax.annotation.Resource;

import org.foodTrade.server.common.BaseTest;
import org.foodTrade.server.common.domain.Role;
import org.foodTrade.server.common.domain.User;
import org.foodTrade.server.common.manager.UserManager;
import org.foodTrade.server.common.util.JSONUtils;
import org.foodTrade.server.common.util.ViewObjectValueUtil;
import org.junit.Test;

public class TestUserManagerImpl extends BaseTest{
	
	@Resource
	private UserManager userManager ;
	
	@Test
	public void userTest(){
		User user = null ;
		for (int i = 0; i < 20; i++) {
			user = new User();
			user.setUserName("sb2"+i);
			user.setUpdateTime(Calendar.getInstance());
			user.setRole(Role.MANAGER_ROLE);
			userManager.insert(user);
		}
	}
	
	@Test
	public void test2(){
		
		try {
			
			User user = userManager.queryOneById(1L);
			System.out.println(user);
			System.out.println(JSONUtils.object2Map(user));
			ViewObjectValueUtil.viewClass(User.class, user);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}
