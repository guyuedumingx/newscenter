package com.yohoyes.rss;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.safety.Whitelist;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author yohoyes
 * @date 2021/7/2 18:49
 */
@Component
public class HtmlParser {
   private Document doc = null;

   public String parse(String url) {
       try {
           doc = Jsoup.parse(new URL(url), 600);
       } catch (MalformedURLException e1) {
           e1.printStackTrace();
       } catch (IOException e1) {
           e1.printStackTrace();
       }

       if(doc == null) {
           return null;
       }

       //删除javascript代码
       Elements es = doc.select("script");
       if(es != null){
           es.remove();
       }
       String clean = Jsoup.clean(doc.outerHtml(), Whitelist.basic());
       return clean;
   }
}
