package org.foodTrade.server.common.domain;

import java.util.Calendar;

/**
 * 单品详情 
 * @author tianlun.wu
 *
 */
public class ItemGoods extends BaseEntity{

	private static final long serialVersionUID = -1944547810393026254L;
	
	//单品名称
	private String name ;
	
	private Calendar updateTime ;
	
	//库存
	private int inventory;
	
	//所属种类
	private long categoryId;
	
	//所属品牌
	private long brandId ;
	
	//备注
	private String remark ;
	
	//图片地址
	private String imgUrl ;
	
	//version 防止高并发
	private int version ;
	
	/**
	 * 1:可销售   2：不可销售
	 * 否可销售的状态
	 */
	private int flag ;
	
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public int getInventory() {
		return inventory;
	}

	public void setInventory(int inventory) {
		this.inventory = inventory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

	public long getBrandId() {
		return brandId;
	}

	public void setBrandId(long brandId) {
		this.brandId = brandId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public Calendar getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Calendar updateTime) {
		this.updateTime = updateTime;
	}
}
