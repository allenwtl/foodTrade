package org.foodTrade.server.common.manager.impl;

import javax.annotation.Resource;

import org.apache.commons.lang3.RandomUtils;
import org.foodTrade.server.common.BaseTest;
import org.foodTrade.server.common.domain.ItemGoods;
import org.foodTrade.server.common.manager.ItemGoodsManager;
import org.foodTrade.server.common.util.DateUtils;
import org.foodTrade.server.common.util.ThreadPoolManager;
import org.junit.Test;

public class TestItemGoodsManagerImpl extends BaseTest {

	@Resource
	private ItemGoodsManager itemGoodsManager;

	private volatile int count = 0;

	@Test
	public void test() {
		// 单品加库存
		ItemGoods itemGoods = new ItemGoods();
		itemGoods.setName("茶油");
		itemGoods.setBrandId(2L);
		itemGoods.setCategoryId(3L);
		itemGoods.setCreateTime(DateUtils.getCurrentTime());
		itemGoods.setInventory(200);
		itemGoods.setRemark("好一个备注");
		itemGoods.setUpdateTime(DateUtils.getCurrentTime());
		itemGoods.setVersion(1);
		itemGoodsManager.addItemGoods(itemGoods);
	}

	@Test
	public void test2() {
		// 买东西 剪库存
		for (int i = 0; i < 60; i++) {
			ThreadPoolManager.getInstance().execute(new Runnable() {
				@Override
				public void run() {
					ItemGoods itemGoods = itemGoodsManager.queryItemGoods(1L);
					// itemGoods.setInventory(itemGoods.getInventory() -1);
					itemGoods.setUpdateTime(DateUtils.getCurrentTime());
					int result = RandomUtils.nextInt(3, 5);
					count = count + result;
					itemGoods.setSales(result);
					itemGoodsManager.updateItemGoods(itemGoods);
					System.out.println(count + "----------");
				}
			});
		}

		try {
			Thread.currentThread().join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * ItemGoods itemGoods = itemGoodsManager.queryItemGoods(1L);
		 * itemGoods.setInventory(itemGoods.getInventory() -1);
		 * itemGoods.setUpdateTime(DateUtils.getCurrentTime());
		 * 
		 * itemGoodsManager.updateItemGoods(itemGoods);
		 */

	}

	@Test
	public void test3() {

		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0) {
				ThreadPoolManager.getInstance().execute(new Runnable() {
					@Override
					public void run() {

					}
				});
			} else {
				ThreadPoolManager.getInstance().execute(new Runnable() {
					@Override
					public void run() {

					}
				});
			}
		}
	}
}
