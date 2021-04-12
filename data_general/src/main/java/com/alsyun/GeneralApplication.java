package com.alsyun;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/***
 * 这里是中台数据库中所有单表的CURD
 * 请不要更改内部任何代码
 *  包括配置文件
 * 端口也避开常用端口 使用 10000后九位位服务端口
 * 千万不要动代码 ！！！！！
 * 该工程内部不包含任何接口 需要远程调用！！！！
 *
 */

@EnableDiscoveryClient
@SpringBootApplication
public class GeneralApplication {
    public static void main(String[] args) {
        SpringApplication.run(GeneralApplication.class,args);
    }
}
