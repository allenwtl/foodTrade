package org.foodTrade.server.common.option;

public class BuyItemDetailQueryOption extends BaseQueryOption{

	//订单ID
	private long orderId ;

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	
}
