package top.chengyunlai.spring.bean.a_type.factorybean.cofig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import top.chengyunlai.spring.bean.a_type.factorybean.bean.Child;
import top.chengyunlai.spring.bean.a_type.factorybean.factor.ToyFactoryBean;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Configuration
@ComponentScan("top.chengyunlai.spring.bean.a_type.factorybean.bean")
public class BeanTypeConfiguration {
    @Bean
    public Child child() {
        return new Child();
    }

    // 可以直接在Factor工厂里重写getObjectType方法，指定注入容器的类型（泛型）
    // @Bean Toy getToy() throws Exception {
    //     return toyFactory().getObject();
    // }

    @Bean
    public ToyFactoryBean toyFactory() {
        ToyFactoryBean toyFactory = new ToyFactoryBean();
        // 对应xml的set方法
        toyFactory.setChild(child());
        return toyFactory;
    }
}
