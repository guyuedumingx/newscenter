package com.yohoyes.service.impl;

import com.yohoyes.mapper.UserMapper;
import com.yohoyes.pojo.User;
import com.yohoyes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yohoyes
 * @date 2021/7/1 12:01
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper = null;

    @Override
    public List<User> queryUserList() {
        return userMapper.queryUserList();
    }

    @Override
    public User queryUserById(int id) {
        return userMapper.queryUserById(id);
    }

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return userMapper.deleteUser(id);
    }

    @Override
    public User login(String email, String password) {
        return userMapper.login(email,password);
    }
}
