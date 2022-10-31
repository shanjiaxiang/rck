package com.rcb.rck;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan(basePackages = "com.rcb.rck.model.dao")
@EnableCaching
public class RckApplication {

    public static void main(String[] args) {
        SpringApplication.run(RckApplication.class, args);
    }

}
