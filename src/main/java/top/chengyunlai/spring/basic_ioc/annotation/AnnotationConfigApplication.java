package top.chengyunlai.spring.basic_ioc.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.chengyunlai.spring.basic_ioc.annotation.basic.AnnotationApplication;
import top.chengyunlai.spring.basic_ioc.annotation.bean.Cat;
import top.chengyunlai.spring.basic_ioc.annotation.bean.Person;
import top.chengyunlai.spring.basic_ioc.annotation.bean.Student;
import top.chengyunlai.spring.basic_ioc.annotation.config.QuickstartConfiguration;

/**
 * @ClassName
 * @Description在 xml 驱动的 IOC 容器中，咱使用的是 ClassPathXmlApplicationContext ，
 * 它对应的是类路径下的 xml 驱动。对于注解配置的驱动，那自然可以试着猜一下，应该是 Annotation 开头的，
 * ApplicationContext 结尾。那就是下面咱介绍的 AnnotationConfigApplicationContext 。
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class AnnotationConfigApplication {
    public static void main(String[] args) throws Exception{
        // AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(QuickstartConfiguration.class);
        // Person person = ctx.getBean(Person.class);
        // Cat cat = ctx.getBean(Cat.class);
        // System.out.println(person);
        // System.out.println(cat);

        /**
         * AnnotationConfigApplicationContext 的构造方法，
         * 可以发现它还有一个方法，是传入一组 basePackage ，
         * 翻译过来是 “根包” 的意思，它又是什么意思呢？这就涉及到下面的概念了：组件注册与扫描。
         *
         * 见自己创建的Java类Student
         */

        // 其实，如果不写 @ComponentScan ，也是可以做到组件扫描的。
        // 在 AnnotationConfigApplicationContext 的构造方法中有一个类型为 String 可变参数的构造方法：
        // ApplicationContext ctx = new AnnotationConfigApplicationContext("top.chengyunlai.spring.basic_ioc.annotation.bean");
        // String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        // for (String beanDefinitionName : beanDefinitionNames) {
        //     System.out.println(beanDefinitionName);
        // }

        // 那么通过配置类写好了呢？就可以做到如下，通过加载配置类
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(QuickstartConfiguration.class);
        // Student student = (Student) annotationConfigApplicationContext.getBean("student");
        // System.out.println(student);
        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
            // 会发现配置类，quickstartConfiguration也被注册到 IOC 容器了，所以@Configuration也是@Component
        }
    }
}
