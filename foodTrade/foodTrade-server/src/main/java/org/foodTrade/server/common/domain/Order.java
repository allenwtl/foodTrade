package org.foodTrade.server.common.domain;

import java.math.BigDecimal;
import java.util.Calendar;

/**
 * 会员订单表
 * 
 * @author tianlun.wu
 *
 */
public class Order extends BaseEntity {

	private static final long serialVersionUID = -4219000560361211638L;

	private long memberId;

	private String account;
	
	// 应该给的金额
	private BigDecimal needPayMoney ;
	
	// 实际给的金额
	private BigDecimal actualPayMoney ;
	
	// 记录创建时间
	private Calendar createTime;

	// 记录修改时间
	private Calendar updateTime;
	
	// 送货地址
	private String goodsAddress ;

	/**
	 * 订单的状态 1：等待支付 2：支付成功 3：支付失败
	 * @see org.foodTrade.server.common.type.PayFlagType
	 */
	private int flag;
	

	public long getMemberId() {
		return memberId;
	}

	public void setMemberId(long memberId) {
		this.memberId = memberId;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public Calendar getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Calendar createTime) {
		this.createTime = createTime;
	}

	public Calendar getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Calendar updateTime) {
		this.updateTime = updateTime;
	}

	public BigDecimal getNeedPayMoney() {
		return needPayMoney;
	}

	public void setNeedPayMoney(BigDecimal needPayMoney) {
		this.needPayMoney = needPayMoney;
	}

	public BigDecimal getActualPayMoney() {
		return actualPayMoney;
	}

	public void setActualPayMoney(BigDecimal actualPayMoney) {
		this.actualPayMoney = actualPayMoney;
	}

	public String getGoodsAddress() {
		return goodsAddress;
	}

	public void setGoodsAddress(String goodsAddress) {
		this.goodsAddress = goodsAddress;
	}
}
