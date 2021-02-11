package com.huazai.taodi.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.huazai.taodi.member.dao")
@SpringBootApplication
public class TaodiMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaodiMemberApplication.class, args);
    }

}
