package com.cjy.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cjy.common.utils.PageUtils;
import com.cjy.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author chenjy01
 * @email chenjunyu102@126.com
 * @date 2020-08-20 15:25:16
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

