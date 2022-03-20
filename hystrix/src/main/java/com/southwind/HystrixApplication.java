package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
//声明启用数据监控
@EnableCircuitBreaker
//声明启用可视化数据监控
@EnableHystrixDashboard
public class HystrixApplication {
    public static void main(String[] args) {
        //启动成功之后，访问 http://localhost:8060/actuator/hystrix.stream 可以监控到请求数据，
        //访问 http://localhost:8060/hystrix，可以看到可视化的监控界面，输入要监控的地址节点即可看到该节点的可视化数据监控。
        SpringApplication.run(HystrixApplication.class,args);
    }
}
