package com.demo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

/**
 * @author libohan
 * @date 2019/9/10
 */
@SpringBootApplication
@EnableZuulProxy
public class Zuul_Gateway_9527_App {

    public static void main(String[] args) {
        SpringApplication.run(Zuul_Gateway_9527_App.class,args);

    }
}
