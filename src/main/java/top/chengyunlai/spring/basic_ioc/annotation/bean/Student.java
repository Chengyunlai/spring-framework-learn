package top.chengyunlai.spring.basic_ioc.annotation.bean;

import org.springframework.stereotype.Component;

/**
 * @ClassName
 * @Description 一切组件注册的根源：@Component
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
// @Controller 、@Service 、@Repository ，分别代表表现层、业务层、持久层。这三个注解的作用与 @Component 完全一致，其实它们的底层也就是 @Component
@Component("student")
// 相当于 <bean class="com.linkedbear.spring.basic_dl.a_quickstart_byname.bean.Person"/>
// 如果想指定 Bean 的名称，可以直接在 @Component 中声明 value 属性即可：
// 如果不指定 Bean 的名称，它的默认规则是 “类名的首字母小写”
// （例如 Person 的默认名称是 person ，DepartmentServiceImpl 的默认名称是 departmentServiceImpl ）。
/**
 * 只声明了组件，咱在写配置类时如果还是只写 @Configuration 注解，
 * 随后启动 IOC 容器，那它是感知不到有 @Component 存在的，
 * 一定会报 NoSuchBeanDefinitionException 。
 * 为了解决这个问题，咱需要引入一个新的注解：@ComponentScan 。
 *
 * 见top/chengyunlai/spring/basic_ioc/annotation/config/QuickstartConfiguration.java
 */
public class Student {
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
