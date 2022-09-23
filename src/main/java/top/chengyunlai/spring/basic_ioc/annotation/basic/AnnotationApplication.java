package top.chengyunlai.spring.basic_ioc.annotation.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.chengyunlai.spring.basic_ioc.annotation.basic.ann.Color;

import java.util.Map;
import java.util.stream.Stream;

/**
 * @ClassName
 * @Description 获得某一类注解的所有Bean对象
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class AnnotationApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("basic_ioc/annotation/basic/annotation.xml");
        /**
         * 通过getBeansWithAnnotation 可以获得某一类注解的Bean，返回的是一个Map
         */
        Map<String, Object> beansWithAnnotation = context.getBeansWithAnnotation(Color.class);
        beansWithAnnotation.forEach((key,value)->{
            System.out.println("key:" + key + ",value:" + value);
        });

        /**
         * 返回Spring容器管理的所有对象
         */
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        // 利用jdk8的Stream快速编写打印方法
        Stream.of(beanDefinitionNames).forEach((name)->{
            System.out.println(context.getBean(name));
        });
    }
}
