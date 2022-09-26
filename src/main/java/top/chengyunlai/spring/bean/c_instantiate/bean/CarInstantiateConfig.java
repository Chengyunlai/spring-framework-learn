package top.chengyunlai.spring.bean.c_instantiate.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Configuration
@ImportResource("bean/c_instantiate/bean-instantiate.xml")
// @ComponentScan("top.chengyunlai.spring.bean.c_instantiate.bean")
public class CarInstantiateConfig {
    @Bean
    public Car car3(CarInstanceFactory carInstanceFactory){
        return carInstanceFactory.getCar();
    }
}
