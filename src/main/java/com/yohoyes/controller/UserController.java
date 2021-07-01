package com.yohoyes.controller;

import com.yohoyes.mapper.UserMapper;
import com.yohoyes.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.soap.SOAPBinding;
import java.util.List;

/**
 * @author yohoyes
 * @date 2021/7/1 11:30
 */
@RestController
public class UserController {
    @Autowired
    UserMapper userMapper = null;

    @RequestMapping("/user/list")
    public String getAllUser() {
        List<User> users = userMapper.queryUserList();
        return users.toString();
    }

    @RequestMapping("/user/add")
    public String addUser() {
        User user = new User();
        user.setEmail("111@qq.com");
        user.setName("ww2");
        user.setPassword("111");
        userMapper.addUser(user);
        return user.toString();
    }

}
