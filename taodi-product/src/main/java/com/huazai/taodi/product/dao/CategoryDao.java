package com.huazai.taodi.product.dao;

import com.huazai.taodi.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author huazai
 * @email who.seek.me@java98k.vip
 * @date 2021-02-10 15:49:37
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
