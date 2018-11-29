package com.chenwei.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @Author: wei1
 * @Date: Create in 2018/11/29 15:59
 * @Description:
 */

@NoArgsConstructor
//@AllArgsConstructor
@Data
//开启链式写法
@Accessors(chain = true)
public class Dept {
    /*主键*/
    private Long deptno;
    /*部门名字*/
    private String dname;
    /*存放的数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库，可以通过MySql自带的Database()函数获得，所以不用在构造函数写*/
    private String db_source;

    public Dept(String dname) {
        super();
        this.dname = dname;
    }

}
