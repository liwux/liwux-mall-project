package com.liwux.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liwux.common.utils.PageUtils;
import com.liwux.mall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author liwux
 * @email xix0.618@gmail.com
 * @date 2022-12-26 15:24:23
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

