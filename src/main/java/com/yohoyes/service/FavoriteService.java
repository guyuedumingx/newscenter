package com.yohoyes.service;

import com.yohoyes.pojo.Favorite;
import com.yohoyes.pojo.FavoriteNews;
import java.util.List;

/**
 * @author yohoyes
 * @date 2021/7/1 15:52
 */
public interface FavoriteService {

    /**
     * 获取所有用户收藏夹集合
     */
    List<Favorite> queryFavoriteList();

    /**
     * 获取用户的收藏文件夹列表
     */
    List<Favorite> queryFavoriteListByUser(int userId);

    /**
     * 根据id获取收藏夹信息
     * @param id
     */
    Favorite queryFavoriteById(int id);

    /**
     * 给某用户添加收藏夹
     * @param favorite
     */
    int addFavorite(Favorite favorite);

    /**
     * 修改用户的收藏夹信息
     * 主要是名字
     * @param favorite
     */
    int updateFavorite(Favorite favorite);

    /**
     * 删除用户收藏夹
     * @param id
     * @return
     */
    int deleteFavorite(int id);

    /**
     * 获取所有收藏夹新闻列表
     */
    List<FavoriteNews> queryFavoriteNewsList();

    /**
     * 获取某收藏夹收藏的新闻列表
     * @param favoriteId
     * @return
     */
    List<FavoriteNews> queryFavoriteNewsById(int favoriteId);

    /**
     * 根据新闻id获取它处于什么收藏夹中
     * @param newsId
     * @return
     */
    List<FavoriteNews> queryFavoriteNewsByNewsId(int newsId);

    /**
     *  把新闻添加入收藏夹
     * @param favoriteNews
     * @return
     */
    int addFavoriteNews(FavoriteNews favoriteNews);

    /**
     * 从某收藏夹中删除新闻
     * @param favoriteNews
     * @return
     */
    int deleteFavoriteNews(FavoriteNews favoriteNews);
}
