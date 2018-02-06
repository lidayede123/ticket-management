package com.zhijin.ticket.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 灰位信息
 * Created by litao on 2018/2/2.
 */
public class AshPosition {

    //系统自增id
    private Integer id;

    //时间范围 如8:00
    private String time;

    //灰位名称
    private String ashName;

    //灰位数据
    private BigDecimal ashData;

    //起始日期 如2018-01-01 08:00:00
    private String startDate;

    //结束日期 如2018-01-02 06:00:00
    private String endDate;

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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAshName() {
        return ashName;
    }

    public void setAshName(String ashName) {
        this.ashName = ashName;
    }

    public BigDecimal getAshData() {
        return ashData;
    }

    public void setAshData(BigDecimal ashData) {
        this.ashData = ashData;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
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
}
