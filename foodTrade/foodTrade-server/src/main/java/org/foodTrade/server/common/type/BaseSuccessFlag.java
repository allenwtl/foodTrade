package org.foodTrade.server.common.type;

/**
 * 某些flag 字段只需 成功与失败  这两个意思的时候 就用这个类
 * @author tianlun.wu
 *
 */
public class BaseSuccessFlag extends BaseType{

	private static final long serialVersionUID = 3142522528004398423L;

	public static final BaseSuccessFlag SUCCESS = new BaseSuccessFlag(1, "成功的标识");
	
	public static final BaseSuccessFlag FAIL = new BaseSuccessFlag(2, "成功的标识");
	
	public BaseSuccessFlag (){
		super(null, null);
	}
	
	public BaseSuccessFlag(int index, String description) {
		super(index, description);
	}
	
	
}
