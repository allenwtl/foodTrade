package org.foodTrade.server.common.manager.impl;


import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.foodTrade.server.common.dao.GenericDao;
import org.foodTrade.server.common.domain.User;
import org.foodTrade.server.common.manager.UserManager;
import org.foodTrade.server.common.util.JSONUtils;
import org.springframework.stereotype.Service;

@Service
public class UserManagerImpl implements UserManager{

	@Resource(name="dao")
	private GenericDao dao ;
	
	@Override
	public int insert(User user) {
		return dao.insertAndReturnAffectedCount("UserMapper.insertUser", user);
	}

	@Override
	public int update(User user) {
		Map<String, Object> paras = JSONUtils.object2Map(user);
		return dao.update("UserMapper.updateUser", paras);
	}

	@Override
	public User queryOneById(Long id) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		return dao.queryUnique("UserMapper.queryUser", map);
	}

}
