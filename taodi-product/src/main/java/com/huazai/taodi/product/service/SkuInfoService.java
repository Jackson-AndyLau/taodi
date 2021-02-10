package com.huazai.taodi.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huazai.common.utils.PageUtils;
import com.huazai.taodi.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author huazai
 * @email who.seek.me@java98k.vip
 * @date 2021-02-10 15:49:37
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

