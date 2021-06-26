package com.scorpios.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.scorpios.gulimall.common.utils.PageUtils;
import com.scorpios.gulimall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author scorpios
 * @email 1435513775@qq.com
 * @date 2021-06-26 20:41:39
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

