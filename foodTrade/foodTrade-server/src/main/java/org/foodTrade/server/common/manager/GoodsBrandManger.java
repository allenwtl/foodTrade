package org.foodTrade.server.common.manager;

import java.util.List;

import org.foodTrade.server.common.domain.GoodsBrand;

public interface GoodsBrandManger {
	
	int addGoodsBrand(GoodsBrand goodsBrand);
	
	int updateGoodsBrand(GoodsBrand goodsBrand);
	
	List<GoodsBrand> queryList();
	
	GoodsBrand queryOne(long id );

}
