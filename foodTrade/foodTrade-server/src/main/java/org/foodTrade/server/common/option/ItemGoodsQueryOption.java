package org.foodTrade.server.common.option;

/**
 * itemGoods 查询类
 * 
 * @author tianlun.wu
 *
 */
public class ItemGoodsQueryOption {

	// 单品ID
	private long id;

	// 单品名称
	private String name;

	// 单品所属品牌
	private long brandId;

	// 所属种类
	private long categoryId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getBrandId() {
		return brandId;
	}

	public void setBrandId(long brandId) {
		this.brandId = brandId;
	}

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
