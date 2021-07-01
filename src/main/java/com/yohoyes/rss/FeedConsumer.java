package com.yohoyes.rss;

import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;
import com.yohoyes.pojo.RssItem;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yohoyes
 * @date 2021/7/1 17:18
 */
public class FeedConsumer {

    /**
     * 根据RSSUrl获取所有List数据
     * @param rssUrl
     * @return
     */
    public static List<RssItem> getAllRssItemList(String rssUrl){
        try{
            URL feedUrl = new URL(rssUrl);
            SyndFeedInput input = new SyndFeedInput();
            SyndFeed feed = input.build(new XmlReader(feedUrl));

            List<SyndEntry> entries = feed.getEntries();

            RssItem item = null;
            List<RssItem> rssItemBeans = new ArrayList<RssItem>();

            for(SyndEntry entry : entries){
                item = new RssItem();

                item.setTitle(entry.getTitle().trim());
                item.setType(feed.getTitleEx().getValue().trim());
                item.setUri(entry.getUri());
                item.setPubDate(entry.getPublishedDate());
                item.setAuthor(entry.getAuthor());
                item.setDescription(entry.getDescription().getValue());
                item.setLink(entry.getLink());

                rssItemBeans.add(item);
            }
            return rssItemBeans;

        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
