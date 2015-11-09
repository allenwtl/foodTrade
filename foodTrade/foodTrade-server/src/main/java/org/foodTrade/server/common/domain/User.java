package org.foodTrade.server.common.domain;

import java.io.Serializable;
import java.util.Calendar;

public class User implements Serializable {
	private static final long serialVersionUID = 137519903656217791L;

	private long id;

	private String userName;

	private Calendar updateTime;

	private Role role;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Calendar getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Calendar updateTime) {
		this.updateTime = updateTime;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}
