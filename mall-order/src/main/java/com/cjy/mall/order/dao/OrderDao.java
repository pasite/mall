package com.cjy.mall.order.dao;

import com.cjy.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author chenjy01
 * @email chenjunyu102@126.com
 * @date 2020-08-20 15:25:16
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
