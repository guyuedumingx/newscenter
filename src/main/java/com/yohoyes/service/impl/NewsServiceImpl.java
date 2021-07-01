package com.yohoyes.service.impl;

import com.yohoyes.pojo.News;
import com.yohoyes.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author yohoyes
 * @date 2021/7/1 15:49
 */
@Service("newsService")
public class NewsServiceImpl implements NewsService {

    @Autowired
    NewsService newsService;

    @Override
    public List<News> queryNewsList() {
        return newsService.queryNewsList();
    }

    @Override
    public List<News> queryNewsByUser(int userId) {
        return newsService.queryNewsByUser(userId);
    }

    @Override
    public List<News> queryNewsByArea(int areaId) {
        return newsService.queryNewsByArea(areaId);
    }

    @Override
    public int addNews(News news) {
        return newsService.addNews(news);
    }

    @Override
    public int updateNews(News news) {
        return newsService.updateNews(news);
    }

    @Override
    public int deleteNews(int id) {
        return newsService.deleteNews(id);
    }
}
