package com.huazai.taodi.member.dao;

import com.huazai.taodi.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author huazai
 * @email who.seek.me@java98k.vip
 * @date 2021-02-11 15:46:22
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
