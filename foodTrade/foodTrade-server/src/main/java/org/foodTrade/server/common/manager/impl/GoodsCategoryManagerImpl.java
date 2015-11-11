package org.foodTrade.server.common.manager.impl;

import javax.annotation.Resource;

import org.foodTrade.server.common.dao.GenericDao;
import org.foodTrade.server.common.domain.GoodsCategory;
import org.foodTrade.server.common.manager.GoodsCategoryManager;
import org.foodTrade.server.common.option.BaseQueryOption;
import org.foodTrade.server.common.util.DataPage;
import org.foodTrade.server.common.util.JSONUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GoodsCategoryManagerImpl implements GoodsCategoryManager {

	private static final Logger logger = LoggerFactory.getLogger(GoodsCategoryManagerImpl.class);
	
	@Resource(name="dao")
	private GenericDao dao ;
	
	@Override
	public int addGoodsCategory(GoodsCategory goodsCategory) {
		return dao.insertAndReturnAffectedCount("", goodsCategory);
	}

	@Override
	public DataPage<GoodsCategory> queryByPage(BaseQueryOption queryOption, DataPage<GoodsCategory> dataPage) {
		dataPage  = dao.queryListPage("", "", JSONUtils.object2MapSpecail(queryOption), dataPage);
		return dataPage;
	}

}
