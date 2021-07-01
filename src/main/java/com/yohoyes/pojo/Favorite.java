package com.yohoyes.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yohoyes
 * @date 2021/7/1 12:39
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Favorite {
    private int id;
    private String name;
    private int userId;
}
