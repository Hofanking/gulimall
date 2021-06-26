package com.scorpios.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.scorpios.gulimall.common.utils.PageUtils;
import com.scorpios.gulimall.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author scorpios
 * @email 1435513775@qq.com
 * @date 2021-06-26 20:41:39
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

