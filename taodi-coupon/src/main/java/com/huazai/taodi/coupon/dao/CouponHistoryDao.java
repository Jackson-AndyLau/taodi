package com.huazai.taodi.coupon.dao;

import com.huazai.taodi.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author huazai
 * @email who.seek.me@java98k.vip
 * @date 2021-02-10 21:07:32
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
