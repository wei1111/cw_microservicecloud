package com.chenwei.springcloud.service;

import com.chenwei.springcloud.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @Author: wei1
 * @Date: Create in 2018/11/30 20:35
 * @Description: 这里抽象到api中因为所有的消费者子模块中都可能调用
 * 虽然这里名字是service倒是我们要认识到他起的作用确实是和servicegong
 * 层一样的，就是供controller层调用，但是他其实和服务的提供者的controller
 * 层内容一样的。
 */
@FeignClient(value = "MICROSERVICECLOUD-DEPT")
public interface DeptClientService {
    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") long id);

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list();

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(Dept dept);
}
