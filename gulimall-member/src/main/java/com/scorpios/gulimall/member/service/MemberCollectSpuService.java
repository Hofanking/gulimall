package com.scorpios.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.scorpios.gulimall.common.utils.PageUtils;
import com.scorpios.gulimall.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author scorpios
 * @email 1435513775@qq.com
 * @date 2021-06-26 20:41:39
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

