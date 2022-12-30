package com.liwux.mall.member.dao;

import com.liwux.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author liwux
 * @email xix0.618@gmail.com
 * @date 2022-12-26 15:15:23
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
