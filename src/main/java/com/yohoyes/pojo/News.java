package com.yohoyes.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author yohoyes
 * @date 2021/7/1 12:40
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class News {
    private int id;
    private String title;
    private String content;
    private String link;
    private Date time;
    private int userId;
    private int areaId;
}
