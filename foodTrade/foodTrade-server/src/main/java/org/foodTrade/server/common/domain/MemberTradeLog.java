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
	private Calendar create_time ;
	
	//消费的金额
	private BigDecimal costMoney ;
	
	//对应的订单表ID
	private long orderId ;
	
	
	
	
	
}
