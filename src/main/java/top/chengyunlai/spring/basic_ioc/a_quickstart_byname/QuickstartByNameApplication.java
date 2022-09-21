package top.chengyunlai.spring.basic_ioc.a_quickstart_byname;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.chengyunlai.spring.basic_ioc.a_quickstart_byname.bean.Person;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class QuickstartByNameApplication {
    public static void main(String[] args) {
        /**
         * 读取配置文件，需要一个载体来加载它，这里咱选用 ClassPathXmlApplicationContext 来加载。
         * 加载完成后咱直接使用 BeanFactory 接口来接收（多态思想）。
         * 下一步就可以从 BeanFactory 中获取 person 了，
         * 由于咱在配置文件中声明了 id ，故这里就可以直接把 id 传入，BeanFactory 就可以给我们返回 Person 对象。
         */
        BeanFactory factory = new ClassPathXmlApplicationContext("basic_ioc/quickstart-byname.xml");
        Person person = (Person) factory.getBean("person");
        System.out.println(person);
    }
}
