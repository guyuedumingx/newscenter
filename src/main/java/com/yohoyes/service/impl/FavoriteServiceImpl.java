package com.yohoyes.service.impl;

import com.yohoyes.mapper.FavoriteMapper;
import com.yohoyes.mapper.FavoriteNewsMapper;
import com.yohoyes.pojo.Favorite;
import com.yohoyes.pojo.FavoriteNews;
import com.yohoyes.service.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author yohoyes
 * @date 2021/7/1 15:53
 */
@Service("favoriteService")
public class FavoriteServiceImpl implements FavoriteService {

    @Autowired
    private FavoriteMapper favoriteMapper;

    @Autowired
    private FavoriteNewsMapper favoriteNewsMapper;

    @Override
    public List<Favorite> queryFavoriteList() {
        return favoriteMapper.queryFavoriteList();
    }

    @Override
    public List<Favorite> queryFavoriteListByUser(int userId) {
        return favoriteMapper.queryFavoriteListByUser(userId);
    }

    @Override
    public Favorite queryFavoriteById(int id) {
        return favoriteMapper.queryFavoriteById(id);
    }

    @Override
    public int addFavorite(Favorite favorite) {
        return favoriteMapper.addFavorite(favorite);
    }

    @Override
    public int updateFavorite(Favorite favorite) {
        return favoriteMapper.updateFavorite(favorite);
    }

    @Override
    public int deleteFavorite(int id) {
        return favoriteMapper.deleteFavorite(id);
    }

    @Override
    public List<FavoriteNews> queryFavoriteNewsList() {
        return favoriteNewsMapper.queryFavoriteNewsList();
    }

    @Override
    public List<FavoriteNews> queryFavoriteNewsById(int favoriteId) {
        return favoriteNewsMapper.queryFavoriteNewsById(favoriteId);
    }

    @Override
    public List<FavoriteNews> queryFavoriteNewsByNewsId(int newsId) {
        return favoriteNewsMapper.queryFavoriteNewsByNewsId(newsId);
    }

    @Override
    public int addFavoriteNews(FavoriteNews favoriteNews) {
        return favoriteNewsMapper.addFavoriteNews(favoriteNews);
    }

    @Override
    public int deleteFavoriteNews(FavoriteNews favoriteNews) {
        return favoriteNewsMapper.deleteFavoriteNews(favoriteNews);
    }
}
