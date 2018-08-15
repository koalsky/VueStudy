package com.wang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * TODO：
 * @author Wang926454
 * @date 2018/8/9 15:42
 */
@SpringBootApplication
@tk.mybatis.spring.annotation.MapperScan("com.wang.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
