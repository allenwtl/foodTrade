package org.foodTrade.server.common.option;

import java.util.Calendar;

/**
 * 查询的基本参数
 * @note 
 * 不一定所有的查询条件 都会用到这个类的属性 
 * 适合一般情况
 * @author tianlun.wu
 *
 */
public class BaseQueryOption {
	
	private long memeberId ;
	
	private String account ;
	
	//时间范围的开始时间
	private Calendar startTime;
	
	//时间范围的结束时间
	private Calendar endTime ;

	public Calendar getStartTime() {
		return startTime;
	}

	public void setStartTime(Calendar startTime) {
		this.startTime = startTime;
	}

	public Calendar getEndTime() {
		return endTime;
	}

	public void setEndTime(Calendar endTime) {
		this.endTime = endTime;
	}

	public long getMemeberId() {
		return memeberId;
	}

	public void setMemeberId(long memeberId) {
		this.memeberId = memeberId;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}
	
}
