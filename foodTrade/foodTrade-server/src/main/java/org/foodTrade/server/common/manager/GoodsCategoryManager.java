package org.foodTrade.server.common.manager;

import org.foodTrade.server.common.domain.GoodsCategory;
import org.foodTrade.server.common.option.BaseQueryOption;
import org.foodTrade.server.common.util.DataPage;

public interface GoodsCategoryManager {

	/**
	 * 添加商品种类
	 * @param goodsCategory
	 * @return
	 */
	int addGoodsCategory(GoodsCategory goodsCategory);
	
	/**
	 * 分页查询
	 * @param queryOption
	 * @param dataPage
	 * @return
	 */
	DataPage<GoodsCategory> queryByPage(BaseQueryOption queryOption, DataPage<GoodsCategory> dataPage);
}
