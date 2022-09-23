package top.chengyunlai.spring.basic_ioc.basic_di.b_constructor.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import top.chengyunlai.spring.basic_ioc.basic_di.b_constructor.bean.Person;

@Configuration
@ComponentScan("top.chengyunlai.spring.basic_ioc.basic_di.b_constructor.bean")
public class ConstructorApplicationConfig {
    @Bean
    public Person person(){
        return new Person("注解注入",20);
    }
}
