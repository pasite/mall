package com.cjy.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cjy.common.utils.PageUtils;
import com.cjy.mall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author chenjy01
 * @email chenjunyu102@126.com
 * @date 2020-08-20 15:22:28
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

