package org.foodTrade.server.common.manager.impl;

import java.util.List;

import javax.annotation.Resource;

import org.foodTrade.server.common.dao.GenericDao;
import org.foodTrade.server.common.domain.GoodsBrand;
import org.foodTrade.server.common.manager.GoodsBrandManger;
import org.foodTrade.server.common.util.JSONUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GoodsBrandManagerImpl implements GoodsBrandManger {

	private static final Logger logger = LoggerFactory.getLogger(GoodsBrandManagerImpl.class);
	
	@Resource(name="dao")
	private GenericDao dao ;
	
	@Override
	public int addGoodsBrand(GoodsBrand goodsBrand) {
		return dao.insertAndReturnAffectedCount("GoodsBrandMapper.insert", goodsBrand);
	}

	@Override
	public int updateGoodsBrand(GoodsBrand goodsBrand) {
		return dao.update("GoodsBrandMapper.update", JSONUtils.object2MapSpecail(goodsBrand));
	}

	@Override
	public List<GoodsBrand> queryList() {
		return null;
	}

	@Override
	public GoodsBrand queryOne(long id) {
		return dao.queryUnique("GoodsBrandMapper.selectOne", id);
	}
}
