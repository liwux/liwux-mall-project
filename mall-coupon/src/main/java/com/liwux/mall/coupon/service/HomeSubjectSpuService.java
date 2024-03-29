package com.liwux.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liwux.common.utils.PageUtils;
import com.liwux.mall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author liwux
 * @email xix0.618@gmail.com
 * @date 2022-12-26 15:18:40
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

