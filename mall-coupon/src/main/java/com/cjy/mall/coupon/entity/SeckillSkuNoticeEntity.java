package com.cjy.mall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 秒杀商品通知订阅
 * 
 * @author chenjy01
 * @email chenjunyu102@126.com
 * @date 2020-08-20 15:17:50
 */
@Data
@TableName("sms_seckill_sku_notice")
public class SeckillSkuNoticeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Long id;
	/**
	 * $column.comments
	 */
	private Long memberId;
	/**
	 * $column.comments
	 */
	private Long skuId;
	/**
	 * $column.comments
	 */
	private Long sessionId;
	/**
	 * $column.comments
	 */
	private Date subcribeTime;
	/**
	 * $column.comments
	 */
	private Date sendTime;
	/**
	 * $column.comments
	 */
	private Integer noticeType;

}
