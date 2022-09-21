package top.chengyunlai.ioc.service.impl;

import top.chengyunlai.ioc.dao.DemoDao;
import top.chengyunlai.ioc.service.DemoService;
import top.chengyunlai.ioc.utils.BeanFactory;

import java.util.List;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class DemoServiceImpl implements DemoService {
    // private DemoDao demoDao = new DemoDaoImpl();
    DemoDao demoDao = (DemoDao) BeanFactory.getBean("demoDao");
    @Override
    public List<String> findAll() {
        return demoDao.findAll();
    }

    public DemoServiceImpl(){
        for (int i = 0; i < 10; i++) {
            System.out.println(BeanFactory.getBean("demoDao"));
        }
    }
}
