package com.chenwei.springcloud.dao;

import com.chenwei.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: wei1
 * @Date: Create in 2018/11/29 16:32
 * @Description:
 */
@Mapper
public interface DeptDao {
    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
