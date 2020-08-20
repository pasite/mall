package com.cjy.mall.product.dao;

import com.cjy.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author chenjy01
 * @email chenjunyu102@126.com
 * @date 2020-08-20 15:22:28
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
