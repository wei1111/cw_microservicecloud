package com.chenwei.springcloud.service.impl;

import com.chenwei.springcloud.dao.DeptDao;
import com.chenwei.springcloud.entities.Dept;
import com.chenwei.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wei1
 * @Date: Create in 2018/11/29 17:07
 * @Description:
 */

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    DeptDao deptDao;

    @Override
    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }
}
