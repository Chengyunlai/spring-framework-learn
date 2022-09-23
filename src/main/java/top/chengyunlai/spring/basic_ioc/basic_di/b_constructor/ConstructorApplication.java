package top.chengyunlai.spring.basic_ioc.basic_di.b_constructor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import top.chengyunlai.spring.basic_ioc.basic_di.b_constructor.bean.Black;
import top.chengyunlai.spring.basic_ioc.basic_di.b_constructor.bean.Person;
import top.chengyunlai.spring.basic_ioc.basic_di.b_constructor.config.ConstructorApplicationConfig;

public class ConstructorApplication {
    public static void main(String[] args) {
        // 通过xml注解的方式，使用构造方式给Bean注入属性
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/basic_ioc/basic_di/b_constructor/constructor.xml");
        Person person = (Person) ctx.getBean("person");
        System.out.println(person);

        // 使用注解的方式，再方法中调用构造方法并返回
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConstructorApplicationConfig.class);
        Person bean = context.getBean(Person.class);
        System.out.println(bean);

        // 使用扫描的方式，扫描定义为@Component的组件，使用@value给属性注入值
        Black bean1 = context.getBean(Black.class);
        System.out.println(bean1);
    }
}
