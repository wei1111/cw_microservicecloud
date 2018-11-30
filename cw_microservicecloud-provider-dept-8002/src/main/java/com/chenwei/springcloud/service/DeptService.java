package com.chenwei.springcloud.service;

import com.chenwei.springcloud.entities.Dept;

import java.util.List;

/**
 * @Author: wei1
 * @Date: Create in 2018/11/29 17:06
 * @Description: service层的方法就要尽量的和rest风格相符合了
 */
public interface DeptService {
    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
