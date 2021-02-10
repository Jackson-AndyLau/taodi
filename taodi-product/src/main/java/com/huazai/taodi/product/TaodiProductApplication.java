package com.huazai.taodi.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.huazai.taodi.product.dao")
@SpringBootApplication
public class TaodiProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaodiProductApplication.class, args);
    }

}
