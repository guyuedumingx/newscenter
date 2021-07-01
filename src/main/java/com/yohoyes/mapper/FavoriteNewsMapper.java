package com.yohoyes.mapper;

import com.yohoyes.pojo.FavoriteNews;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yohoyes
 * @date 2021/7/1 13:29
 */
@Mapper
@Repository
public interface FavoriteNewsMapper {

    @Select("select * from t_favorite_news")
    List<FavoriteNews> queryFavoriteNewsList();

    @Select("select * from t_favorite_news where favorite_id=#{favoriteId}")
    List<FavoriteNews> queryFavoriteNewsById(int favoriteId);

    @Select("select * from t_favorite_news where news_id=#{newsId}")
    List<FavoriteNews> queryFavoriteNewsByNewsId(int newsId);

    @Insert("insert into t_favorite_news values(#{favoriteId}, #{newsId}")
    int addFavoriteNews(FavoriteNews favoriteNews);

    @Delete("delete from t_favorite_news where favorite_id=#{favoriteId} and news_id=#{newsId}")
    int deleteFavoriteNews(FavoriteNews favoriteNews);
}
