package top.chengyunlai.spring.basic_ioc.a_quickstart_bytype;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.chengyunlai.ioc.dao.impl.DemoDaoImpl;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class QuickstartByTypeApplication {
    public static void main(String[] args) {
        /**
         * 读取配置文件，需要一个载体来加载它，这里咱选用 ClassPathXmlApplicationContext 来加载。
         * 加载完成后咱直接使用 BeanFactory 接口来接收（多态思想）。
         * 下一步就可以从 BeanFactory 中获取 person 了，
         * 这次使用Class的类型获取。
         */
        BeanFactory factory = new ClassPathXmlApplicationContext("basic_ioc/a_quickstart_bytype/quickstart-bytype.xml");
        Person person = factory.getBean(Person.class);
        DemoDaoImpl bean = factory.getBean(DemoDaoImpl.class);
        System.out.println(person);
        System.out.println(bean.findAll());

        /**
         * 如果我要创建的 Bean 需要一些预设的属性，那该怎么办呢？
         * 那就涉及到 IOC 的另外一种实现了，就是依赖注入。还是延续 IOC 的思想，
         * 如果你需要属性依赖，不要自己去找，交给 IOC 容器，让它帮你找，并给你赋上值。
         */
    }
}
