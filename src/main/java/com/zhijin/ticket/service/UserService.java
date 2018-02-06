package com.zhijin.ticket.service;

import com.zhijin.ticket.entity.User;

import java.util.List;

/**
 * Created by litao on 2018/1/31.
 */
public interface UserService {

    //查询所有用户信息
    List<User> getUserList();
}
