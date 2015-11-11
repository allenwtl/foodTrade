package org.foodTrade.server.common.manager.impl;

import javax.annotation.Resource;

import org.foodTrade.server.common.dao.GenericDao;
import org.foodTrade.server.common.domain.MemberTradeLog;
import org.foodTrade.server.common.manager.MemberTradeLogManager;
import org.foodTrade.server.common.option.MemberTradeLogQueryOption;
import org.foodTrade.server.common.util.DataPage;
import org.foodTrade.server.common.util.JSONUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MemberTradeLogManagerImpl implements MemberTradeLogManager {

	private static final Logger logger = LoggerFactory.getLogger(MemberTradeLogManagerImpl.class);
	
	@Resource(name="dao")
	private GenericDao dao ;
	
	@Override
	public int addTradeLog(MemberTradeLog log) {
		return dao.insertAndReturnAffectedCount("", log);
	}

	@Override
	public DataPage<MemberTradeLog> queryByPage(MemberTradeLogQueryOption queryOption, DataPage<MemberTradeLog> dataPage) {
		dataPage = dao.queryListPage("", "", JSONUtils.object2MapSpecail(queryOption), dataPage);
		return dataPage;
	}

}
