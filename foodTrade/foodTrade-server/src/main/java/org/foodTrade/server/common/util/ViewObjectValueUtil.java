package org.foodTrade.server.common.util;

import java.lang.reflect.Field;

public class ViewObjectValueUtil {

	public static <T> void viewClass(Class<T> clazz, Object obj) throws IllegalArgumentException, IllegalAccessException {
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			field.setAccessible(true);
			System.out.println(field.getName() + "--" + field.get(obj));
		}
	}

}
