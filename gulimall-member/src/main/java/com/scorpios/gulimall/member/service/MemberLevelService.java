package com.scorpios.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.scorpios.gulimall.common.utils.PageUtils;
import com.scorpios.gulimall.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author scorpios
 * @email 1435513775@qq.com
 * @date 2021-06-26 20:41:39
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

