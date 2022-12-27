package com.liwux.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liwux.common.utils.PageUtils;
import com.liwux.mall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author liwux
 * @email xix0.618@gmail.com
 * @date 2022-12-27 22:44:51
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

