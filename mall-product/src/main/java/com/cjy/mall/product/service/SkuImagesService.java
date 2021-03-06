package com.cjy.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cjy.common.utils.PageUtils;
import com.cjy.mall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author chenjy01
 * @email chenjunyu102@126.com
 * @date 2020-08-20 15:22:28
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

