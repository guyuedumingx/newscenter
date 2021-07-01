package com.yohoyes.mapper;

import com.yohoyes.pojo.Area;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * @author yohoyes
 * @date 2021/7/1 12:46
 */
@Mapper
@Repository
public interface AreaMapper {

    @Select("select * from t_area")
    List<Area> queryAreaList();

    @Select("select * from t_area where id=#{id}")
    Area queryAreaById(int id);

    @Select("select * from t_area where parent_id=#{parentId}")
    List<Area> queryAreaByParent(int parentId);
}
