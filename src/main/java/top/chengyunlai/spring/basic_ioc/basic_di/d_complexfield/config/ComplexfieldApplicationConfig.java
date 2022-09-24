package top.chengyunlai.spring.basic_ioc.basic_di.d_complexfield.config;

import org.springframework.context.annotation.*;
import top.chengyunlai.spring.basic_ioc.basic_di.d_complexfield.bean.Person;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Configuration
@ComponentScan("top.chengyunlai.spring.basic_ioc.basic_di.d_complexfield.bean")
@PropertySource(value = "classpath:basic_ioc/basic_di/d_complexfield/complexfield.properties",encoding = "UTF8")
// @ImportResource("classpath:basic_ioc/basic_di/d_complexfield/complexfield.xml")
@ImportResource("basic_ioc/basic_di/d_complexfield/ComplexfieldPerson.xml")
public class ComplexfieldApplicationConfig {

    /**
     * IOC 容器发现有两个类型相同的 Person ，它也不知道注入哪一个了，索性直接 “我选择死亡” ，就挂了。
     * @return
     */
    @Bean
    // 可以指定默认注入的 Bean,在别的类需要注入该Person类时，指定这个定义的Bean是默认注入的。但是@Qualifier 不受 @Primary 的干扰。xml 中可以指定 <bean> 标签中的 primary 属性为 true ，跟上面标注 @Primary 注解是一样的。
    @Primary
    public Person master() {
        Person master = new Person();
        master.setName("master");
        return master;
    }
}
