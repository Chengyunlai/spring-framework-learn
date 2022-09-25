package top.chengyunlai.spring.bean.b_scope.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import top.chengyunlai.spring.bean.b_scope.bean.Child;
import top.chengyunlai.spring.bean.b_scope.bean.Toy;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Configuration
@ComponentScan("top.chengyunlai.spring.bean.b_scope.bean")
public class BeanScopeConfiguration {
    // 方法名即id
    @Bean
    public Child child1(Toy toy) {
        Child child = new Child();
        child.setToy(toy);
        return child;
    }

    @Bean
    public Child child2(Toy toy) {
        Child child = new Child();
        child.setToy(toy);
        return child;
    }
}
