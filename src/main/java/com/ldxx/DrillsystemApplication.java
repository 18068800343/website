package com.ldxx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ldxx.mapper")
public class DrillsystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(DrillsystemApplication.class, args);
    }

}
