package org.foodTrade.server.common.type;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.foodTrade.server.common.domain.Role;

public  class BaseType implements Serializable {

	private static final long serialVersionUID = -4033829527272568937L;

	private Integer index; // 顺序
	private String description;// 描述

	public BaseType(Integer index, String description) {
		this.index = index;
		this.description = description;
	}

	protected BaseType() {
	}

	@SuppressWarnings("unchecked")
	public static <T extends BaseType> List<T> getAll(Class<T> clazz) {
		List<T> list = new ArrayList<T>();
		try {
			Field[] fieldlist = clazz.getDeclaredFields();
			for (Field field : fieldlist) {
				if (field.getType().isAssignableFrom(clazz)) {
					list.add((T) field.get(null));
				}
			}
		} catch (Exception e) {
		}
		return list;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		BaseType baseType = BaseType.valueOf(this.getClass(), index);
		if (null != baseType) {
			this.index = baseType.getIndex();
			this.description = baseType.getDescription();
			setOtherProp(baseType);
		}
	}

	public  void setOtherProp(BaseType baseType){
		
	}

	public static <T extends BaseType> T valueOf(Class<T> clazz, Integer index) {
		try {
			List<T> list = (List<T>) BaseType.getAll(clazz);
			for (T t : list) {
				if (t.getIndex() == index) {
					return t;
				}
			}
		} catch (Exception e) {
		}
		return null;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public static void main(String[] args) {
		BaseType baseType = BaseType.valueOf(Role.class, 1);
		System.out.println(baseType);
	}
}
