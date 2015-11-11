package org.foodTrade.server.common.option;


public class MemberTradeLogQueryOption extends BaseQueryOption{
	
	//交易是否成功的flag
	private int flag ;

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}
	
}
