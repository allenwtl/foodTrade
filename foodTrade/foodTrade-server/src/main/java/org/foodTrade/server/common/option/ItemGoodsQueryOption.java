package org.foodTrade.server.common.option;

/**
 * itemGoods 查询类
 * 
 * @author tianlun.wu
 *
 */
public class ItemGoodsQueryOption {

	// 单品ID
	private Long id;

	// 单品名称
	private String name;

	// 单品所属品牌
	private Long brandId;

	// 所属种类
	private Long categoryId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getBrandId() {
		return brandId;
	}

	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

}
