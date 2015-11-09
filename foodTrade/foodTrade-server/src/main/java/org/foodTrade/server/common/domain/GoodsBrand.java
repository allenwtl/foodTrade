package org.foodTrade.server.common.domain;

import java.util.Calendar;

/**
 * 商品品牌
 * @author tianlun.wu
 *
 */
public class GoodsBrand extends BaseEntity {

	private static final long serialVersionUID = -4870598473307920007L;

	//品牌名称
	private String brandName ;
	
	//商品种类ID
	private String goodsCategoryId ;
	
	private Calendar createTime;

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getGoodsCategoryId() {
		return goodsCategoryId;
	}

	public void setGoodsCategoryId(String goodsCategoryId) {
		this.goodsCategoryId = goodsCategoryId;
	}

	public Calendar getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Calendar createTime) {
		this.createTime = createTime;
	}
	
}
