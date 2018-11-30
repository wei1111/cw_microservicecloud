package com.chenwei.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: wei1
 * @Date: Create in 2018/11/29 18:24
 * @Description:
 */
@Configuration
public class ConfigBean {
    /**
     * 使用
     * 使用restTemplate访问restful接口非常的简单粗暴无脑。
     * (url, requestMap, ResponseBean.class)这三个参数分别代表 
     * REST请求地址、请求参数、HTTP响应转换被转换成的对象类型。
     * <p>
     * 对ConfigBean进行新注解@LoadBalanced    获得Rest时加入Ribbon的配置
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public IRule myRule() {
        //默认的轮询算法
        //return new RoundRobinRule();
        //随机选择算法
        return new RandomRule();
    }
}
