package com.scorpios.gulimall.order.dao;

import com.scorpios.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author scorpios
 * @email 1435513775@qq.com
 * @date 2021-06-26 20:54:30
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
