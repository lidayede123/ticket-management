package com.zhijin.ticket.web;

import com.zhijin.ticket.entity.User;
import com.zhijin.ticket.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by litao on 2018/1/31.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public String getUserList(){
        List<User> userList = userService.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
        return "index";
    }
}
