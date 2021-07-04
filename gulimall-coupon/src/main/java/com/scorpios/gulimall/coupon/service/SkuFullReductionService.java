package com.scorpios.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.scorpios.gulimall.common.to.SkuReductionTo;
import com.scorpios.gulimall.common.utils.PageUtils;
import com.scorpios.gulimall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author scorpios
 * @email 1435513775@qq.com
 * @date 2021-06-26 19:54:18
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSkuReduction(SkuReductionTo reductionTo);
}

