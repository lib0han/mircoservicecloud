package com.demo.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author libohan
 * @date 2019/9/17
 */
@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced //SpringCloud Ribbon 是基于Netflix Ribbon实现的一套客户端 负载均衡工具
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Bean
    public IRule myRule(){
        //return new RoundRobinRule();//默认轮询
//        return new RetryRule();//先按照RoundRobinRule的策略获取服务，如果获取服务失败则在指定时间内会进行重试，获取可用的服务
        return new RandomRule();//随机
        //...
    }
}
/**
 *  
 * RestTemplate提供了多种便捷访问远程Http服务的方法， 
 * 是一种简单便捷的访问restful服务模板类，是Spring提供的用于访问Rest服务的客户端模板工具集
 *
 * 官网地址
 *  
 * https://docs.spring.io/spring-framework/docs/4.3.7.RELEASE/javadoc-api/org/springframework/web/client/RestTemplate.html
 *  
 *  
 * 使用
 * 使用restTemplate访问restful接口非常的简单粗暴无脑。
 * (url, requestMap, ResponseBean.class)这三个参数分别代表 
 * REST请求地址、请求参数、HTTP响应转换被转换成的对象类型。
 */
