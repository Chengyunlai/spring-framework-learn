package top.chengyunlai.spring.basic_ioc.basic_di.a_quickstart_set;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.chengyunlai.spring.basic_ioc.basic_di.a_quickstart_set.bean.Cat;
import top.chengyunlai.spring.basic_ioc.basic_di.a_quickstart_set.bean.Person;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class QuickstartInjectBySetXmlApplication {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("basic_ioc/basic_di/inject-set.xml");
        Person person = beanFactory.getBean(Person.class);
        System.out.println(person);

        Cat cat = beanFactory.getBean(Cat.class);
        System.out.println(cat);
    }
}
