package com.yohoyes.service;

import com.yohoyes.pojo.News;
import java.util.List;

/**
 * @author yohoyes
 * @date 2021/7/1 15:48
 */
public interface NewsService {

    /**
     * 获取所有的新闻列表
     */
    List<News> queryNewsList();

    /**
     * 获取某用户的所有新闻
     * @return
     */
    List<News> queryNewsByUser(int userId);

    /**
     * 根据地区获取新闻
     * @return
     */
    List<News> queryNewsByArea(int areaId);

    /**
     * 添加新闻
     * @return
     */
    int addNews(News news);

    /**
     * 修改新闻
     * @return
     */
    int updateNews(News news);

    /**
     * 删除新闻
     * @param id
     * @return
     */
    int deleteNews(int id);
}
