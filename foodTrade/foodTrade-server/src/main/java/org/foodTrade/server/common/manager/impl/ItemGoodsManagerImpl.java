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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ItemGoodsManagerImpl implements ItemGoodsManager {

	private static final Logger logger = LoggerFactory.getLogger(ItemGoodsManagerImpl.class);
	
	@Resource(name="dao")
	private GenericDao dao ;
	
	
	@Override
	public int addItemGoods(ItemGoods itemGoods) {
		return dao.insertAndReturnAffectedCount("ItemGoodsMapper.insert", itemGoods);
	}

	@Override
	public int updateItemGoods(ItemGoods itemGoods) {
		Map<String, Object> map = JSONUtils.object2MapSpecail(itemGoods);
		int result = dao.update("ItemGoodsMapper.update", map);
		ItemGoods tempObj = null ;
		if(result == 0 ){
			int count =0 ;
			while (result == 0 ) {
				if(count > 10){
					logger.warn("超过循环设置了");
					return 0;
				}
				
				tempObj = queryItemGoods(itemGoods.getId());
				
				if(tempObj.getSales() == tempObj.getInventory()){
					logger.info("单品ID：{},单品Name：{}  已经销售完了", itemGoods.getId(), itemGoods.getName());
					return 0;
				}
				itemGoods.setVersion(tempObj.getVersion());
				result = dao.update("ItemGoodsMapper.update", JSONUtils.object2MapSpecail(itemGoods));
				if(result > 0){
					return result;
				}
				count++ ;
			}
		}
		return result;
	}

	@Override
	public List<ItemGoods> queryList(ItemGoodsQueryOption queryOption) {
		Map<String, Object> map = JSONUtils.object2MapSpecail(queryOption);
		return dao.queryList("ItemGoodsMapper.selectList", map) ;
	}

	@Override
	public DataPage<ItemGoods> queryDataPage(ItemGoodsQueryOption queryOption, DataPage<ItemGoods> dataPage) {
		Map<String, Object> map = JSONUtils.object2MapSpecail(queryOption);
		return dao.queryListPage("ItemGoodsMapper.count", "ItemGoodsMapper.selectPage", map, dataPage);
	}

	@Override
	public ItemGoods queryItemGoods(long id) {
		return dao.queryUnique("ItemGoodsMapper.selectOne", id);
	}

}
