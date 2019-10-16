package com.jdcloud.demo.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: client
 * @description: client模块启动入口类
 * @author: zhangjunfeng7
 * @create: 2018-09-19 21:45
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Client {

    public static void main(String args[]){
        SpringApplication.run(Client.class);
    }
}
