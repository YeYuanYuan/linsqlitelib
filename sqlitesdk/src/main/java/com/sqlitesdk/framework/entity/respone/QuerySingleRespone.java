package com.sqlitesdk.framework.entity.respone;


import com.sqlitesdk.framework.entity.BaseEntity;
import com.sqlitesdk.framework.interface_model.IModel;

/**
 * Created by lpds on 2017/4/17.
 */
public class QuerySingleRespone<T extends IModel> extends BaseEntity {

    T model;

    public QuerySingleRespone(T model) {
        this.model = model;
    }

    public T getModel() {
        return model;
    }

    public void setModel(T model) {
        this.model = model;
    }
}