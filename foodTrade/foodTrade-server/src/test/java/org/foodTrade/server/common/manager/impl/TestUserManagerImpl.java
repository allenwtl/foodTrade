package org.foodTrade.server.common.manager.impl;

import java.util.Calendar;

import javax.annotation.Resource;

import org.foodTrade.server.common.BaseTest;
import org.foodTrade.server.common.domain.User;
import org.foodTrade.server.common.manager.UserManager;
import org.foodTrade.server.common.util.JSONUtils;
import org.foodTrade.server.common.util.ViewObjectValueUtil;
import org.junit.Test;

public class TestUserManagerImpl extends BaseTest{

	private static final User user = new User(){
		private static final long serialVersionUID = 1L;
		
		
	};
	
	
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
	
	@Test
	public void test2(){
		User user = userManager.queryOneById(1L);
		System.out.println(user);
		System.out.println(JSONUtils.object2Map(user));
		
		try {
			ViewObjectValueUtil.viewClass(User.class, user);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}
