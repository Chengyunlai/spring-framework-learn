package top.chengyunlai.spring.basic_ioc.basic_di.d_complexfield.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Component
public class Dog {
    @Autowired
    private Person person;

    @Override
    public String toString() {
        return "Dog{" +
                "person=" + person +
                '}';
    }
}
