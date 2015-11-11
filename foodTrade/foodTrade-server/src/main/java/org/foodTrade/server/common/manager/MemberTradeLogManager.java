package org.foodTrade.server.common.manager;

import org.foodTrade.server.common.domain.MemberTradeLog;
import org.foodTrade.server.common.option.MemberTradeLogQueryOption;
import org.foodTrade.server.common.util.DataPage;

public interface MemberTradeLogManager {
	
	/**
	 * 添加流水
	 * @param log
	 * @return
	 */
	int addTradeLog(MemberTradeLog log);
	
	
	/**
	 * 查询流水
	 * 
	 * @param queryOption
	 * @param log
	 * @return
	 */
	DataPage<MemberTradeLog> queryByPage(MemberTradeLogQueryOption queryOption, DataPage<MemberTradeLog> dataPage);
	

}
