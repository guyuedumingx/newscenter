package com.yohoyes.mapper;

import com.yohoyes.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yohoyes
 * @date 2021/7/1 11:24
 */
@Mapper
@Repository
public interface UserMapper {

    @Select("select * from t_user")
    List<User> queryUserList();

    User queryUserById(int id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);
}
