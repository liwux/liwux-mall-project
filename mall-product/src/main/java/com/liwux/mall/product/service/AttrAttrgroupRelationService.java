package com.liwux.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liwux.common.utils.PageUtils;
import com.liwux.mall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author liwux
 * @email xix0.618@gmail.com
 * @date 2022-12-02 23:37:27
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

