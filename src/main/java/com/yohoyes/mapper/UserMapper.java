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

    @Insert("insert into t_user (name,email,password) values (#{name},#{email},#{password})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    int addUser(User user);

    @Update("update t_user set name=#{name}, email=#{email}, password=#{password} where id=#{id}")
    int updateUser(User user);

    @Delete("delete from t_user where id=#{id}")
    int deleteUser(int id);

    @Select("select * from t_user where email=#{email} and password=#{password}")
    User login(@Param("email") String email,@Param("password") String pwd);
}
