package org.foodTrade.server.common.manager.impl;

import javax.annotation.Resource;

import org.foodTrade.server.common.dao.GenericDao;
import org.foodTrade.server.common.domain.BuyItemDetail;
import org.foodTrade.server.common.manager.BuyItemDetailManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BuyItemDetailManagerImpl implements BuyItemDetailManager {

	private static final Logger logger = LoggerFactory.getLogger(BuyItemDetailManagerImpl.class);
	
	@Resource(name="dao")
	private GenericDao dao ;
	
	@Override
	public int createBuyItemDetail(BuyItemDetail detail) {
		return dao.insertAndReturnAffectedCount("BuyItemDetailMapper.insert", detail);
	}

}
