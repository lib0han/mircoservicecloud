package com.demo.myrule;

/**
 * @author libohan
 * @date 2019/9/22
 */

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule() {
        return new RandomRule_MySelf();//Ribbon默认是轮询，我自定义为随机
    }
}
