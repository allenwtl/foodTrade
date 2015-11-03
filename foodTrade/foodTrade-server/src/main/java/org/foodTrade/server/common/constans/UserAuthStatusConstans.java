package org.foodTrade.server.common.constans;

/**
 * 帐号在本系统中的认证完成状态
 * 
 * @author tianlun.wu
 *
 */
public class UserAuthStatusConstans {
	
	//创建member
	public static final long user_create = 1 << 1;
	
	//用户完善真实姓名和身份证号码
	public static final long user_info = 1 << 2;
	
	//用户完善手机号码
	public static final long user_phone = 1 << 3;
	
	
	/**
	 * 验证  optionFlagbit操作标识是否已经存在userFlagbit 中
	 * @param optionFlagbit
	 * @param userFlagbit
	 * @return
	 */
	public static boolean isExistFlagBit(long optionFlagbit,long userFlagbit) {
		return 	(optionFlagbit & userFlagbit )> 0;
	}
	
}
