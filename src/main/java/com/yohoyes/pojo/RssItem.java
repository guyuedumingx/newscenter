package com.yohoyes.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author yohoyes
 * @date 2021/7/1 17:24
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RssItem {
    private String title;
    private String author;
    private String uri;
    private String link;
    private String description;
    private Date pubDate;
    private String type;

    public News convertToNews() {
        News news = new News();
        news.setAuthor(author);
        news.setDescription(description);
        news.setLink(link);
        news.setTitle(title);
        news.setPubDate(pubDate);
        return news;
    }
}
