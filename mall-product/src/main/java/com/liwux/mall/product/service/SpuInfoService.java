package com.liwux.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liwux.common.utils.PageUtils;
import com.liwux.mall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author liwux
 * @email xix0.618@gmail.com
 * @date 2022-12-02 23:37:26
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
