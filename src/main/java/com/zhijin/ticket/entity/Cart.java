package com.zhijin.ticket.entity;

import java.util.Date;

/**
 * 车的信息
 * Created by litao on 2018/2/2.
 */
public class Cart {

    //系统自增id
    private Integer id;

    //车牌号
    private String cartNo;

    //品级
    private Quality quality;

    //客户
    private String customer;

    //是否使用 1：正常使用 0：停用
    private Integer used;

    //创建时间
    private Date createTime;

    //修改时间
    private Date updateTime;

    //修改人
    private Integer mender;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCartNo() {
        return cartNo;
    }

    public void setCartNo(String cartNo) {
        this.cartNo = cartNo;
    }

    public Quality getQuality() {
        return quality;
    }

    public void setQuality(Quality quality) {
        this.quality = quality;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getMender() {
        return mender;
    }

    public void setMender(Integer mender) {
        this.mender = mender;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Integer getUsed() {
        return used;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }
}
