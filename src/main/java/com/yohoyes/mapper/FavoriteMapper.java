package com.yohoyes.mapper;

import com.yohoyes.pojo.Favorite;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yohoyes
 * @date 2021/7/1 12:51
 */
@Mapper
@Repository
public interface FavoriteMapper {

    @Select("select * from t_favorite")
    List<Favorite> queryFavoriteList();

    @Select("select * from t_favorite where user_id = #{userId}")
    List<Favorite> queryFavoriteListByUser(int userId);

    @Select("select * from t_favorite where id = #{id}")
    Favorite queryFavoriteById(int id);

    @Insert("insert into t_favorite (name, user_id) values (#{name},#{userId}")
    int addFavorite(Favorite favorite);

    @Update("update t_favorite set name=#{name} where id=#{id}")
    int updateFavorite(Favorite favorite);

    @Delete("delete from t_favorite where id=#{id}")
    int deleteFavorite(int id);

}
