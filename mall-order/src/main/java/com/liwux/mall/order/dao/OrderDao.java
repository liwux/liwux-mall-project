package com.liwux.mall.order.dao;

import com.liwux.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author liwux
 * @email xix0.618@gmail.com
 * @date 2022-12-26 15:24:23
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
