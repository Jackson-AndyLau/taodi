package com.huazai.taodi.order.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.huazai.taodi.order.entity.OmsPaymentInfoEntity;
import com.huazai.taodi.order.service.OmsPaymentInfoService;
import com.huazai.common.utils.PageUtils;
import com.huazai.common.utils.R;



/**
 * 支付信息表
 *
 * @author huazai
 * @email who.seek.me@java98k.vip
 * @date 2021-02-11 16:03:28
 */
@RestController
@RequestMapping("order/omspaymentinfo")
public class OmsPaymentInfoController {
    @Autowired
    private OmsPaymentInfoService omsPaymentInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("order:omspaymentinfo:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = omsPaymentInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("order:omspaymentinfo:info")
    public R info(@PathVariable("id") Long id){
		OmsPaymentInfoEntity omsPaymentInfo = omsPaymentInfoService.getById(id);

        return R.ok().put("omsPaymentInfo", omsPaymentInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("order:omspaymentinfo:save")
    public R save(@RequestBody OmsPaymentInfoEntity omsPaymentInfo){
		omsPaymentInfoService.save(omsPaymentInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("order:omspaymentinfo:update")
    public R update(@RequestBody OmsPaymentInfoEntity omsPaymentInfo){
		omsPaymentInfoService.updateById(omsPaymentInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("order:omspaymentinfo:delete")
    public R delete(@RequestBody Long[] ids){
		omsPaymentInfoService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
