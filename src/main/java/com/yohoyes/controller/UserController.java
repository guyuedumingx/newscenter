package com.yohoyes.controller;

import com.yohoyes.pojo.User;
import com.yohoyes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * @author yohoyes
 * @date 2021/7/1 11:30
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService = null;

    @RequestMapping("/list")
    public String getAllUser() {
        List<User> users = userService.queryUserList();
        return users.toString();
    }

    @RequestMapping("/add")
    public String addUser() {
        User user = new User();
        user.setEmail("111@qq.com");
        user.setName("ww2");
        user.setPassword("111");
        userService.addUser(user);
        return user.toString();
    }

}
