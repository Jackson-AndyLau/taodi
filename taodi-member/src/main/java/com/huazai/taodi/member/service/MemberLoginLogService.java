package com.huazai.taodi.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huazai.common.utils.PageUtils;
import com.huazai.taodi.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author huazai
 * @email who.seek.me@java98k.vip
 * @date 2021-02-11 15:46:22
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

