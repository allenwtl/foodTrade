package org.foodTrade.server.common.domain;

import java.math.BigDecimal;
import java.util.Calendar;

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
	private BigDecimal price ;
	
	//单品数量
	private int num ;
	
	private Calendar createTime ;
	
	//计算这个单品的花销
	public BigDecimal calculateCost() {
		return this.price.multiply(new BigDecimal(num));
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

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Calendar getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Calendar createTime) {
		this.createTime = createTime;
	}
	
}
