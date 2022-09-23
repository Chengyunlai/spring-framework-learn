package top.chengyunlai.spring.basic_ioc.basic_dl.oftype;

// import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
// import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.chengyunlai.spring.basic_ioc.basic_dl.oftype.dao.DemoDao;

import java.util.Map;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class OftypeApplication {
    public static void main(String[] args) {
        // BeanFactory factory = new ClassPathXmlApplicationContext("basic_dl/oftype-bytype.xml");
        /**
         * 咱想一次性把关于Dao这个接口的所有实现类都拿出来，怎么实现？
         * 将上面的代码注释掉，改为ApplicationContext
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("basic_ioc/basic_dl/oftype-bytype.xml");

        /**
         * getBeansOfType:传入一个类型，返回一个 Map ，而 Map 中的 value 不难猜测就是传入的参数类型对应的那些类 / 实现类。
         */

        Map<String, DemoDao> beansOfType = context.getBeansOfType(DemoDao.class);
        beansOfType.forEach((beanName, bean) -> {
            System.out.println(beanName + " : " + bean.toString());
        });

        /**
         * 为什么换用 ApplicationContext ?
         * 借助 IDEA ，发现 ApplicationContext 也是一个接口，
         * 而且通过接口继承关系发现它是 BeanFactory 的子接口。
         * 那咱想了解这两个接口，最好的办法还是先翻一翻官方文档，
         * 从官方文档中尝试获取最权威的解释。:https://docs.spring.io/spring-framework/docs/5.2.x/spring-framework-reference/core.html#beans-introduction
         */


    }

}
