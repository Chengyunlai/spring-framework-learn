package top.chengyunlai.spring.basic_ioc.basic_di.d_complexfield;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.chengyunlai.spring.basic_ioc.basic_di.d_complexfield.bean.ComplexfieldPerson;
import top.chengyunlai.spring.basic_ioc.basic_di.d_complexfield.bean.Dog;
import top.chengyunlai.spring.basic_ioc.basic_di.d_complexfield.bean.Person;
import top.chengyunlai.spring.basic_ioc.basic_di.d_complexfield.config.ComplexfieldApplicationConfig;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class ComplexfieldApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ComplexfieldApplicationConfig.class);
        Dog dog = ctx.getBean(Dog.class);
        System.out.println(dog);
        for (String beanDefinitionName : ctx.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
        ComplexfieldPerson bean = ctx.getBean(ComplexfieldPerson.class);
        System.out.println(bean);
    }
}
