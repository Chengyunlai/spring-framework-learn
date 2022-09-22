package top.chengyunlai.spring.basic_dl.oftype.dao.impl;

import top.chengyunlai.spring.basic_dl.oftype.dao.DemoDao;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class MySqlDemoDaoImpl implements DemoDao {
    @Override
    public String findAll() {
        return "sql";
    }
}
