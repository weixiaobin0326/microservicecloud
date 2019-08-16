package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author wxb
 * @Date 2019/8/8
 * @Time 17:24
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {
        //return new RandomRule();
        return new RandomRule_XB();
    }
}
