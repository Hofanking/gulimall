package com.scorpios.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.scorpios.gulimall.common.utils.PageUtils;
import com.scorpios.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author scorpios
 * @email 1435513775@qq.com
 * @date 2021-06-26 20:54:30
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

