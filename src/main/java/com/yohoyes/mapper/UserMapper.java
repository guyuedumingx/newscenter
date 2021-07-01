package com.yohoyes.mapper;

import com.yohoyes.pojo.User;
import org.apache.ibatis.annotations.*;
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

    @Select("select * from t_user where id=#{id}")
    User queryUserById(int id);

    @Insert("insert into t_user values (null, #{name},#{email},#{pwd}")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    int addUser(User user);

    @Update("update t_user set name=#{name}, email=#{email}, pwd=#{pwd} where id=#{id}")
    int updateUser(User user);

    @Delete("delete from t_user where id=#{id}")
    int deleteUser(int id);

    @Select("select * from t_user where email=#{email} and pwd=#{pwd}")
    User login(@Param("email") String email,@Param("pwd") String pwd);
}
