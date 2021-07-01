package com.yohoyes.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yohoyes
 * @date 2021/7/1 12:38
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Area {
    private int id;
    private String name;
    private int parentId;
}
