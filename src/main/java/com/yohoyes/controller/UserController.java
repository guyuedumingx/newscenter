package com.yohoyes.controller;

import com.yohoyes.mapper.UserMapper;
import com.yohoyes.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yohoyes
 * @date 2021/7/1 11:30
 */
@RestController
public class UserController {
    @Autowired
    UserMapper userMapper = null;

    @RequestMapping("/user")
    public String getAllUser() {
        List<User> users = userMapper.queryUserList();
        return users.toString();
    }

}
