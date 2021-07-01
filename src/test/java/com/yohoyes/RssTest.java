package com.yohoyes;

import com.yohoyes.pojo.RssItem;
import com.yohoyes.rss.FeedConsumer;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author yohoyes
 * @date 2021/7/1 19:59
 */
@SpringBootTest
public class RssTest {

    @Test
    public void test1() {
        List<RssItem> allRssItemList = FeedConsumer.getAllRssItemList("http://rss.news.sohu.com/rss/guonei.xml");
        allRssItemList.forEach(System.out::println);
    }
}
