package org.foodTrade.server.common.domain;

import java.math.BigDecimal;
import java.util.Calendar;

/**
 * 用户交易流水
 * 注：保存用户交易是否成功的记录
 * @author tianlun.wu
 *
 */
public class MemberTradeLog extends BaseEntity {

	private static final long serialVersionUID = -5523585604683138227L;

	//memberID
	private long memberId ;
	
	//用户帐号
	private String account ;
	
	//记录创建时间
	private Calendar createTime ;
	
	//消费的金额
	private BigDecimal costMoney ;
	
	//对应的订单表ID
	private long orderId ;
	
	/**
	 * 用户交易是否成功
	 * @see org.foodTrade.server.common.type.BaseSuccessFlag
	 */
	private int flag ;
	
	//与 flag 相对应的信息
	private String info ;

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

	public Calendar getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Calendar createTime) {
		this.createTime = createTime;
	}

	public BigDecimal getCostMoney() {
		return costMoney;
	}

	public void setCostMoney(BigDecimal costMoney) {
		this.costMoney = costMoney;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
}
