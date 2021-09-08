package com.syxy.stumangementsys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.syxy.stumangementsys.mapper")
public class ComSyxyDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComSyxyDemoApplication.class, args);
    }

}
