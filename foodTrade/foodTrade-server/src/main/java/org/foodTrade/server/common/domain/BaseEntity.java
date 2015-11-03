package org.foodTrade.server.common.domain;

import java.io.Serializable;

public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 6591689521930282427L;
    /**主键*/
    public Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
