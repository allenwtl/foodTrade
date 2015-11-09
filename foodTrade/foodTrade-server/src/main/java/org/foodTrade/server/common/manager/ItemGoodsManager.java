package org.foodTrade.server.common.manager;

import java.util.List;

import org.foodTrade.server.common.domain.ItemGoods;
import org.foodTrade.server.common.option.ItemGoodsQueryOption;
import org.foodTrade.server.common.util.DataPage;

public interface ItemGoodsManager {
	
	/**
	 * 新增一个单品
	 * @param itemGoods
	 * @return
	 */
	public int addItemGoods(ItemGoods itemGoods);
	
	/**
	 * 更新一个单品
	 * @param itemGoods
	 * @return
	 */
	public int updateItemGoods(ItemGoods itemGoods);
	
	/**
	 * 根据查询参数查询
	 * @param queryOption
	 * @return
	 */
	public List<ItemGoods> queryList(ItemGoodsQueryOption queryOption);
	
	/**
	 * 分页查询
	 * @param queryOption
	 * @param dataPage
	 * @return
	 */
	public DataPage<ItemGoods> queryDataPage(ItemGoodsQueryOption queryOption, DataPage<ItemGoods> dataPage);
	
	
	public ItemGoods queryItemGoods(long id);
}
