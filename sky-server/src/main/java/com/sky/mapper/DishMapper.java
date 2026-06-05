package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DishMapper {

    /**
     * 根据id删除分类
     * @param categoryId
     * @return
     */
    @Select("select  count(id) from dish where category_id = #{categoryId}")
    Integer countByCategoryId(Long categoryId);
}
