package com.alsyun.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;


/***
 * 管理系统启动
 */
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan(basePackages = {"com.alsyun.admin.dao"})
public class AdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class,args);
    }
}

