package com.huazai.taodi.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.huazai.taodi.order.dao")
@SpringBootApplication
public class TaodiOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaodiOrderApplication.class, args);
    }

}
