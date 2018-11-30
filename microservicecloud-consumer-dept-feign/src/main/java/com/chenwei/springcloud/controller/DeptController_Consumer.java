package com.chenwei.springcloud.controller;

import com.chenwei.springcloud.entities.Dept;
import com.chenwei.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: wei1
 * @Date: Create in 2018/11/29 19:32
 * @Description: 这里就可以看出不同了，这里使用 生产者提供的api
 */
@RestController
public class DeptController_Consumer {
    @Autowired
    DeptClientService deptClientService;

    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept) {
        return deptClientService.add(dept);
    }

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return deptClientService.get(id);
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list() {
        return deptClientService.list();
    }

}
