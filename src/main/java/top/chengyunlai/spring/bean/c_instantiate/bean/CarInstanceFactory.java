package top.chengyunlai.spring.bean.c_instantiate.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @ClassName
 * @Description 它跟静态工厂唯一的区别是方法不再是 static 方法了
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
// @Component
public class CarInstanceFactory {
    public Car getCar() {
        return new Car();
    }
}
