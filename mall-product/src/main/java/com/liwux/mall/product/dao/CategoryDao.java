package com.liwux.mall.product.dao;

import com.liwux.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author liwux
 * @email xix0.618@gmail.com
 * @date 2022-12-27 22:44:50
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
