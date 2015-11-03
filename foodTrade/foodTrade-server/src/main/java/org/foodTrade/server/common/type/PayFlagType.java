package org.foodTrade.server.common.type;

public class PayFlagType extends BaseType {
	
	private static final long serialVersionUID = -1797266248085484104L;

	public static final PayFlagType PAYWATTING = new PayFlagType(1, "等待支付");
	public static final PayFlagType PAYFAIL = new PayFlagType(2, "支付失败");
	public static final PayFlagType PAYSUCCESS = new PayFlagType(3, "支付成功");
	
	public PayFlagType(){
		super(null, null);
	}
	
	public PayFlagType (Integer index, String  description){
		super(index, description);
	}
	
}
