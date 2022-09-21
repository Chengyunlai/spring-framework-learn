package top.chengyunlai.ioc.dao.impl;

import top.chengyunlai.ioc.dao.DemoDao;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class DemoDaoImpl implements DemoDao {

    @Override
    public List<String> findAll() {
        return Arrays.asList("aaa", "bbb", "ccc");
    }
}
