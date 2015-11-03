package org.foodTrade.server.common.domain;

import java.math.BigDecimal;

/**
 * 用户购买的订单 单品详情
 * @author tianlun.wu
 *
 */
public class BuyItemDetail extends BaseEntity {
	
	private static final long serialVersionUID = -1747688824034101390L;
	
	//订单ID
	private long orderId ;
	
	//单品详情
	private long itemGoodsId ;
	
	//单品价格
	private BigDecimal itemGoodsPrice ;
	
	//单品数量
	private int itemGoodsNum ;
	
	//计算这个单品的花销
	public BigDecimal calculateCost() {
		return this.itemGoodsPrice.multiply(new BigDecimal(itemGoodsNum));
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public long getItemGoodsId() {
		return itemGoodsId;
	}

	public void setItemGoodsId(long itemGoodsId) {
		this.itemGoodsId = itemGoodsId;
	}

	public BigDecimal getItemGoodsPrice() {
		return itemGoodsPrice;
	}

	public void setItemGoodsPrice(BigDecimal itemGoodsPrice) {
		this.itemGoodsPrice = itemGoodsPrice;
	}

	public int getItemGoodsNum() {
		return itemGoodsNum;
	}

	public void setItemGoodsNum(int itemGoodsNum) {
		this.itemGoodsNum = itemGoodsNum;
	}
}
