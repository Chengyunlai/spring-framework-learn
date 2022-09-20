package top.chengyunlai.service.impl;

import top.chengyunlai.dao.DemoDao;
import top.chengyunlai.dao.impl.DemoDaoImpl;
import top.chengyunlai.service.DemoService;
import top.chengyunlai.utils.BeanFactory;

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
