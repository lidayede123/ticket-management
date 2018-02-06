package com.zhijin.ticket.entity;

/**
 * 品级
 * Created by litao on 2018/2/2.
 */
public class Quality {

    //系统自增id
    private Integer id;

    //品名 比如:一级灰、二级灰等等
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
