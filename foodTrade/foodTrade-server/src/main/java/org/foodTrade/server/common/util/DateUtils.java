package org.foodTrade.server.common.util;

import java.util.Calendar;

/**
 * 时间处理工具
 * 
 */
public class DateUtils {

	/**
	 * 获取本月的第一天
	 * @param date
	 * @return
	 */
	public static Calendar getFirstDayOfMonth(Calendar memberDate){
		Calendar result = (Calendar)memberDate.clone();
		result.set(Calendar.DAY_OF_MONTH,1);
		result.set(Calendar.HOUR_OF_DAY,0);
		result.set(Calendar.MINUTE, 0);
		result.set(Calendar.SECOND, 1);
		return result;
	}
	
	/**
	 * 获取本月的最后一天
	 * @param date	要设置的月份日期（如果为空，则为当期日期）
	 * @return
	 */
	public static Calendar getLastDayOfMonth(Calendar memberDate){
		Calendar result = (Calendar)memberDate.clone();
		// 本月的最后一天
		result.set( Calendar.DATE,  1 );
		result.roll(Calendar.DATE,  - 1 );
		result.set(Calendar.HOUR_OF_DAY,23);
		result.set(Calendar.MINUTE, 59);
		result.set(Calendar.SECOND, 59);
		
		return result;
	}
	
	/** 得到今天的凌晨时间 eg: 2011-09-17 00:00:00 */
	public static Calendar getTodayWeekHors(){
	    Calendar calendar = Calendar.getInstance();
	    calendar.set(Calendar.HOUR_OF_DAY, 00);
	    calendar.set(Calendar.MINUTE, 0);
	    calendar.set(Calendar.SECOND, 0);
	    calendar.set(Calendar.MILLISECOND, 0);
	    return calendar;
	}
	
	/**
	 * 得到今天最后的时间
	 * @return
	 * @create_time 2013-8-1 下午10:10:55
	 */
	public static Calendar getTodayEndTime(){
	    Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 999);
        return calendar;
	}
	
	
	
	/**
	 * 根据传入的月份取得时间
	 * @return
	 * @create_time 2013-11-11 上午
	 */
	public static Calendar getMonthTime(int momth){
	    Calendar calendar = Calendar.getInstance();
	    calendar.add(Calendar.MONTH, momth);
        return calendar;
	}
	
	/**
	 * 取得当前时间
	 * @return
	 * @create_time 2013-11-11 上午
	 */
	public static Calendar getCurrentTime(){
	    Calendar calendar = Calendar.getInstance();
        return calendar;
	}
	
	/***
	 * 根据传入的时间  返回传入的时间是  周一、周二  ..... 这样的中文字符
	 * @return
	 */
	public static String getWeekChinese(Calendar calendar){
		int num = calendar.get(Calendar.DAY_OF_WEEK);
		String returnText = "";
		
		switch (num) {
			case 1:
				returnText = "周日";
				break;
			case 2:
				returnText = "周一";
				break;
			case 3:
				returnText = "周二";
				break;
			case 4:
				returnText = "周三";
				break;
			case 5:
				returnText = "周四";
				break;
			case 6:
				returnText = "周五";
				break;
			case 7:
				returnText = "周六";
				break;
			default:
				break;
		}
		return returnText ;
	}
}
