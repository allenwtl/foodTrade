package org.foodTrade.server.common.domain;

import java.io.Serializable;

import org.foodTrade.server.common.type.BaseType;

public class Role extends BaseType implements Serializable {

	private static final long serialVersionUID = 6184494182450973215L;

	public static final Role MANAGER_ROLE = new Role(1, "管理员");
	public static final Role TEST_ROLE = new Role(2, "测试员");

	public Role() {
		super();
	}

	public Role(Integer index, String description) {
		super(index, description);
	}

}
