package com.zhijin.ticket.service.impl;

import com.zhijin.ticket.dao.mapper.UserMapper;
import com.zhijin.ticket.entity.User;
import com.zhijin.ticket.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by litao on 2018/1/31.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }
}
