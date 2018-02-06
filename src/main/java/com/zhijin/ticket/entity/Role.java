package com.zhijin.ticket.entity;

/**
 * 角色类
 * Created by litao on 2018/2/2.
 */
public class Role {

    //系统自增id
    private Integer id;

    //名称 如：管理员，开票员
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
