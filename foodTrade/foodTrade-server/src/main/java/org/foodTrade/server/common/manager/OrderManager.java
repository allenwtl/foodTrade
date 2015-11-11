package org.foodTrade.server.common.manager;

import java.util.Map;

import org.foodTrade.server.common.domain.Order;
import org.foodTrade.server.common.option.OrderQueryOption;
import org.foodTrade.server.common.util.DataPage;

public interface OrderManager {
	
	/**
	 * 创建订单
	 * @param order
	 * @return
	 */
	int createOrder(Order order);
	
	/**
	 * 修改订单
	 * @param map
	 * @return
	 */
	int updateOrder(Map<String, Object> map);
	
	/**
	 * 查询订单
	 * @param id
	 * @return
	 */
	Order queryOne(long id);

	/**
	 * 分页查询 订单
	 * @param option
	 * @param dataPage
	 * @return
	 */
	DataPage<Order> queryOrderByPage(OrderQueryOption option , DataPage<Order> dataPage);
}
