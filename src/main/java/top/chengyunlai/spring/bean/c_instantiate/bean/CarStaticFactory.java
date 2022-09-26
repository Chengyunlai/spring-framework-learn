package top.chengyunlai.spring.bean.c_instantiate.bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/

public class CarStaticFactory {
    public static Car getCar() {
        return new Car();
    }
}
