package com.cjy.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cjy.common.utils.PageUtils;
import com.cjy.mall.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author chenjy01
 * @email chenjunyu102@126.com
 * @date 2020-08-20 15:17:51
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

