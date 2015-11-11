package org.foodTrade.server.common.option;


public class OrderQueryOption extends BaseQueryOption{

	/**
	 * @see org.foodTrade.server.common.type.PayFlagType
	 */
	private int flag ;

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}
}
