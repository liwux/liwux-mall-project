package com.liwux.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liwux.common.utils.PageUtils;
import com.liwux.mall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author liwux
 * @email xix0.618@gmail.com
 * @date 2022-12-27 22:44:51
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

