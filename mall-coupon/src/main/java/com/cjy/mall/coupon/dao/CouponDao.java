package com.cjy.mall.coupon.dao;

import com.cjy.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author chenjy01
 * @email chenjunyu102@126.com
 * @date 2020-08-20 15:17:50
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
