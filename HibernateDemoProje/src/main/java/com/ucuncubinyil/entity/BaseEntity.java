package com.ucuncubinyil.entity;

import java.io.Serializable;

public abstract class BaseEntity implements Serializable {

    public abstract Long getId();

    @Override
    public int hashCode() {
        if (getId() == null) return -1;
        return getId().intValue();
    }

    @Override
    public boolean equals(Object o) {
        BaseEntity baseEntity = (BaseEntity) o;
        if (baseEntity == null || baseEntity.getId() == null) return false;
        return baseEntity.getId().equals(getId());
    }

}
