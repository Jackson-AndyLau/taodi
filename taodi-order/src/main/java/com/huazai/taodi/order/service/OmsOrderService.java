package com.huazai.taodi.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huazai.common.utils.PageUtils;
import com.huazai.taodi.order.entity.OmsOrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author huazai
 * @email who.seek.me@java98k.vip
 * @date 2021-02-11 16:03:28
 */
public interface OmsOrderService extends IService<OmsOrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

