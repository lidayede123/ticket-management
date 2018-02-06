package com.zhijin.ticket.entity;

/**
 * 权限
 * Created by litao on 2018/2/2.
 */
public class Authority {

    //系统自增id
    private Integer id;

    //是否可以修改用户信息，1：可以 0：不可以
    private Integer updateUser;

    //是否可以修改车号信息，1：可以 0：不可以
    private Integer updateCart;

    //是否可以创建计划，修改计划，取消计划 1：可以 0：不可以
    private Integer doPlan;

    //是否可以开票 1：可以 0：不可以
    private Integer ticket;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public Integer getUpdateCart() {
        return updateCart;
    }

    public void setUpdateCart(Integer updateCart) {
        this.updateCart = updateCart;
    }

    public Integer getDoPlan() {
        return doPlan;
    }

    public void setDoPlan(Integer doPlan) {
        this.doPlan = doPlan;
    }

    public Integer getTicket() {
        return ticket;
    }

    public void setTicket(Integer ticket) {
        this.ticket = ticket;
    }
}
