package com.yohoyes;

import com.yohoyes.pojo.User;
import com.yohoyes.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author yohoyes
 * @date 2021/7/1 14:03
 */
@SpringBootTest
public class UserTest {

    @Autowired
    private UserService userService;

//    @Test
    public void test1() {
        userService.queryUserList().forEach(System.out::println);
        System.out.println();

        System.out.println(userService.queryUserById(1).toString());
        System.out.println();

        User user = new User();
        user.setName("test");
        user.setPassword("111");
        user.setEmail("test@qq.com");
        int i = userService.addUser(user);
        userService.queryUserList().forEach(System.out::println);
        System.out.println();

        user.setEmail("test2@qq.com");
        int i1 = userService.updateUser(user);
        userService.queryUserList().forEach(System.out::println);
        System.out.println();

        userService.deleteUser(user.getId());
        userService.queryUserList().forEach(System.out::println);

        User login = userService.login("11@qq.com", "111");
        System.out.println();
        System.out.println(login);
    }
}
