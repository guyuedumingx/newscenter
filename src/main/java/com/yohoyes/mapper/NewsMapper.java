package com.yohoyes.mapper;

import com.yohoyes.pojo.News;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yohoyes
 * @date 2021/7/1 12:56
 */
@Mapper
@Repository
public interface NewsMapper {

    @Select("select * from t_news order by time desc")
    List<News> queryNewsList();

    @Select("select * from t_news where user_id=#{userId} order by time desc")
    List<News> queryNewsByUser(int userId);

    @Select("select * from t_news where area_id=#{areaId} order by time desc")
    List<News> queryNewsByArea(int areaId);

    @Insert("insert into t_news (title,author,description,content,link,user_id,area_id,pubDate) values (#{title},#{author},#{description},#{content},#{link},#{userId},#{areaId},#{pubDate})")
    int addNews(News news);

    @Update("update t_news set title=#{title},content=#{content},link=#{link},description=#{description},author=#{author}")
    int updateNews(News news);

    @Delete("delete t_news where id=#{id}")
    int deleteNews(int id);


}
