package com.huazai.taodi.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan(value = "com.huazai.taodi.coupon.dao")
@SpringBootApplication
public class TaodiCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaodiCouponApplication.class, args);
    }

}
