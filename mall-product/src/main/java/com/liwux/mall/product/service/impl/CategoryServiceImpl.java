package com.liwux.mall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liwux.common.utils.PageUtils;
import com.liwux.common.utils.Query;

import com.liwux.mall.product.dao.CategoryDao;
import com.liwux.mall.product.entity.CategoryEntity;
import com.liwux.mall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    /**
     * 查询所有的类别数据，然后将数据封装为树形结构
     * @param params
     * @return
     */
    @Override
    public List<CategoryEntity> queryPageWithTree(Map<String, Object> params) {
        // 1. 查询所有的商品分类信息
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);
        List<CategoryEntity> collect = categoryEntities.stream().filter(categoryEntity -> categoryEntity.getParentCid() == 0)
                .map(categoryEntity -> {
                    //categoryEntity.setC
                    categoryEntity.setChildrens(getCategoryChildrens(categoryEntity, categoryEntities));
                    return categoryEntity;
                }).sorted((entity1, entity2) -> (entity1.getSort() == null ? 0 : entity1.getSort()) - (entity2.getSort() == null ? 0 : entity2.getSort()))
                .collect(Collectors.toList());
        // 2. 将商品分类信息拆解为树形结构

        return collect;
    }

    /**
     * 查找该大类下的所有子类，递归查找
     * @param categoryEntity
     * @param categoryEntities
     * @return
     */
    private List<CategoryEntity> getCategoryChildrens(CategoryEntity categoryEntity, List<CategoryEntity> categoryEntities) {
        List<CategoryEntity> collect = categoryEntities.stream().filter(entity -> {
                    return Objects.equals(entity.getParentCid(), categoryEntity.getCatId());
                }).map(entity -> {
                    //根据小类递归找到对应的小小类
                    entity.setChildrens(getCategoryChildrens(entity, categoryEntities));
                    return entity;
                }).sorted((entity1, entity2) -> (entity1.getSort() == null ? 0 : entity1.getSort()) - (entity2.getSort() == null ? 0 : entity2.getSort()))
                .collect(Collectors.toList());
        return collect;
    }

}