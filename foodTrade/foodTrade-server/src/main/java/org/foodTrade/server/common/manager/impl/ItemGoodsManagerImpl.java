package org.foodTrade.server.common.manager.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.foodTrade.server.common.dao.GenericDao;
import org.foodTrade.server.common.domain.ItemGoods;
import org.foodTrade.server.common.manager.ItemGoodsManager;
import org.foodTrade.server.common.option.ItemGoodsQueryOption;
import org.foodTrade.server.common.util.DataPage;
import org.foodTrade.server.common.util.JSONUtils;

public class ItemGoodsManagerImpl implements ItemGoodsManager {

	@Resource(name="dao")
	private GenericDao dao ;
	
	
	@Override
	public int addItemGoods(ItemGoods itemGoods) {
		return dao.insertAndReturnAffectedCount("", itemGoods);
	}

	@Override
	public int updateItemGoods(ItemGoods itemGoods) {
		Map<String, Object> map = JSONUtils.object2MapSpecail(itemGoods);
		return dao.update("", map);
	}

	@Override
	public List<ItemGoods> queryList(ItemGoodsQueryOption queryOption) {
		Map<String, Object> map = JSONUtils.object2MapSpecail(queryOption);
		return dao.queryList("", map) ;
	}

	@Override
	public DataPage<ItemGoods> queryDataPage(ItemGoodsQueryOption queryOption, DataPage<ItemGoods> dataPage) {
		Map<String, Object> map = JSONUtils.object2MapSpecail(queryOption);
		return dao.queryListPage("", "", map, dataPage);
	}

	@Override
	public ItemGoods queryItemGoods(ItemGoodsQueryOption queryOption) {
		return dao.queryUnique("", JSONUtils.object2MapSpecail(queryOption));
	}

}
