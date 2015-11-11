package org.foodTrade.server.common.manager.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.foodTrade.server.common.dao.GenericDao;
import org.foodTrade.server.common.domain.Order;
import org.foodTrade.server.common.manager.OrderManager;
import org.foodTrade.server.common.option.OrderQueryOption;
import org.foodTrade.server.common.util.DataPage;
import org.foodTrade.server.common.util.JSONUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrderManagerImpl implements OrderManager {

	private static final Logger logger = LoggerFactory.getLogger(MemberManagerImpl.class);
	
	@Resource(name="dao")
	private GenericDao dao ;
	
	@Override
	public int createOrder(Order order) {
		return dao.insertAndReturnAffectedCount("", order);
	}

	@Override
	public int updateOrder(Map<String, Object> map) {
		return dao.update("", map);
	}

	@Override
	public Order queryOne(long id) {
		return dao.queryUnique("", id);
	}

	@Override
	public DataPage<Order> queryOrderByPage(OrderQueryOption option, DataPage<Order> dataPage) {
		dataPage = dao.queryListPage("", "", JSONUtils.object2MapSpecail(option), dataPage);
		return dataPage;
	}

}
