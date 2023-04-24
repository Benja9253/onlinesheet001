package com.agsl.onlinesheet;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.agsl.onlinesheet.mapper")
public class OnlinesheetApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlinesheetApplication.class, args);
    }

}