package com.scorpios.gulimall.member.dao;

import com.scorpios.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author scorpios
 * @email 1435513775@qq.com
 * @date 2021-06-26 20:41:39
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
