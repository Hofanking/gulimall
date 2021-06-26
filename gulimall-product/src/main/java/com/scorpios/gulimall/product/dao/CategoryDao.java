package com.scorpios.gulimall.product.dao;

import com.scorpios.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author scorpios
 * @email 1435513775@qq.com
 * @date 2021-06-26 19:00:34
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
