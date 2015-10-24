package org.foodTrade.server.common.domain;

import java.io.Serializable;
import java.util.Calendar;

public class User implements Serializable {
	private static final long serialVersionUID = 137519903656217791L;

	private Long id;

	private String userName;
	
	private Calendar updateTime ;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Calendar getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Calendar updateTime) {
		this.updateTime = updateTime;
	}

	
}
