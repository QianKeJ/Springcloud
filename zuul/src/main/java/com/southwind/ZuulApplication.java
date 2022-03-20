package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

//设置该类是网关启动类,Zuul 自带了负载均衡功能
@EnableZuulProxy
//可以帮助 Spring Boot 应用将所有符合条件的 @Configuration 配置加载到当前 Spring Boot 创建并使用的 IoC 容器中。
@EnableAutoConfiguration
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class,args);
    }
}
