package com.yohoyes.service;

import com.yohoyes.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yohoyes
 * @date 2021/7/1 12:00
 */
@Service
public interface UserService {

    List<User> queryUserList();

    User queryUserById(int id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);

    User login(String email, String password);

}
