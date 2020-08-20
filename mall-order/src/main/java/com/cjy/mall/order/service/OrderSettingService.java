package com.cjy.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cjy.common.utils.PageUtils;
import com.cjy.mall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author chenjy01
 * @email chenjunyu102@126.com
 * @date 2020-08-20 15:25:16
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

