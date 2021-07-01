package com.yohoyes.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yohoyes
 * @date 2021/7/1 13:26
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FavoriteNews {
    private int favoriteId;
    private int newsId;
}
