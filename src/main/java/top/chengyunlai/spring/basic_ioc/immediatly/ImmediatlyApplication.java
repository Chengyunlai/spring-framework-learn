package top.chengyunlai.spring.basic_ioc.immediatly;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.chengyunlai.spring.basic_ioc.immediatly.bean.Cat;
import top.chengyunlai.spring.basic_ioc.immediatly.bean.Dog;

/**
 * @ClassName
 * @Description 我们现在都是直接从容器里面直接获取Bean对象，倘若这个对象不存在呢？或者Spring容器没有管理它
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class ImmediatlyApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("basic_ioc/immediatly/immediatlyApplication.xml");
        /**
         * Spring容器管理了Cat这个类，所以并不会报错
         */
        Cat cat = (Cat) context.getBean("cat");
        System.out.println(cat);

        /**
         * 因为Springring器没有管理Dog这个类，所以会报一个:NoSuchBeanDefinitionException 错误
         */
        // Dog dog = context.getBean(Dog.class);

        /**
         * 方法一：利用try catch
         */
        // Dog dog = null;
        // try {
        //     dog = context.getBean(Dog.class);
        // } catch (NoSuchBeanDefinitionException e) {
        //     // 找不到Dog时手动创建
        //     dog = new Dog();
        // }
        // System.out.println(dog);

        /**
         * 方法二：
         */
        Dog dog = context.containsBean("dog") ? (Dog) context.getBean("dog") : new Dog();

        /**
         * 方法三
         */
        // 这一行代码不会报错
        ObjectProvider<Dog> dogProvider = context.getBeanProvider(Dog.class);
        Dog dog1 = dogProvider.getIfAvailable(Dog::new);
    }
}
