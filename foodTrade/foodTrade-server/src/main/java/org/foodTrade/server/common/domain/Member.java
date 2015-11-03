package org.foodTrade.server.common.domain;

import java.util.Calendar;

import org.foodTrade.server.common.constans.UserAuthStatusConstans;

public class Member extends BaseEntity {

	private static final long serialVersionUID = -6657962114861593194L;

	// 用户名
	private String account;

	// 真实姓名
	private String name;

	// 密码
	private String password;

	// 手机号码
	private String phoneNo;

	// 身份证号码
	private String cardNo;

	// 注册时间
	private Calendar createTime;

	// 最后一次修改时间
	private Calendar updateTime;

	// 帐号状态(可用：1 不可用 ：2)
	private long status;

	/**
	 * 帐号在本系统的可用状态下的各种认证
	 * 
	 * @see org.foodTrade.server.common.constans.UserAuthStatusConstans
	 */
	private Integer authFlag;

	// 邮箱
	private String email;

	// 最后一次登录时间
	private Calendar lastLoginTime;

	public boolean hasNameAndCardNo() {
		return UserAuthStatusConstans.isExistFlagBit(UserAuthStatusConstans.user_info, this.authFlag);
	}

	public boolean hasAvliablePhone() {
		return UserAuthStatusConstans.isExistFlagBit(UserAuthStatusConstans.user_phone, this.authFlag);
	}

	public Calendar getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Calendar lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public Calendar getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Calendar createTime) {
		this.createTime = createTime;
	}

	public Calendar getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Calendar updateTime) {
		this.updateTime = updateTime;
	}

	public long getStatus() {
		return status;
	}

	public void setStatus(long status) {
		this.status = status;
	}

	public Integer getAuthFlag() {
		return authFlag;
	}

	public void setAuthFlag(Integer authFlag) {
		this.authFlag = authFlag;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
