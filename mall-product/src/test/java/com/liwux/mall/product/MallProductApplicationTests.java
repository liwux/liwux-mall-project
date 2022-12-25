package com.liwux.mall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.liwux.mall.product.entity.BrandEntity;
import com.liwux.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads(){
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");
        brandService.save(brandEntity);
    }

    @Test
    void selectAll(){
        List<BrandEntity> list = brandService.list();
        for (BrandEntity brandEntity : list) {
            System.out.println(brandEntity);
        }
    }

    @Test
    void selectById(){
        List<BrandEntity> list = brandService
                .list(new QueryWrapper<BrandEntity>().eq("brand_id",2));
        for (BrandEntity brandEntity : list) {
            System.out.println(brandEntity);
        }
    }
}
