package org.foodTrade.server.common.manager;

import org.foodTrade.server.common.domain.User;

public interface UserManager {
	
	public int insert(User user);
	
	public int update(User user);
	
	public User queryOneById(Long id );
	
}
