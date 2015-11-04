package org.foodTrade.server.common.domain;

import java.io.Serializable;
import java.util.Calendar;

/**
 * 商品种类
 * @author tianlun.wu
 *
 */
public class GoodsCategory implements Serializable {

	private static final long serialVersionUID = 2393003249681949942L;

	private int id ;
	
	private String name ;
	
	private Calendar createTime ;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Calendar getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Calendar createTime) {
		this.createTime = createTime;
	}
	
}
