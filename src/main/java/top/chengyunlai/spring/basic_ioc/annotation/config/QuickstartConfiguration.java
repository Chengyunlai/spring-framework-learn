package top.chengyunlai.spring.basic_ioc.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import top.chengyunlai.spring.basic_ioc.annotation.bean.Cat;
import top.chengyunlai.spring.basic_ioc.annotation.bean.Person;

/**
 * @ClassName
 * @Description 对比于 xml 文件作为驱动，注解驱动需要的是配置类。一个配置类就可以类似的理解为一个 xml 。
 * 配置类没有特殊的限制，只需要在类上标注一个 @Configuration 注解即可。
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
// 对比于 xml 文件作为驱动，注解驱动需要的是配置类。只需要在类上标注一个 @Configuration 注解即可。
@Configuration
/**
 * <context:component-scan base-package="com.linkedbear.spring.annotation.c_scan.bean"/>
 * <!-- 注意标签是package，不是packages，代表一个标签只能声明一个根包 -->
 */
// 指定要扫描的路径，它就可以扫描指定路径包及子包下的所有@Component 组件：
// 如果不指定扫描路径，则默认扫描本类所在包及子包下的所有 @Component 组件。
@ComponentScan("top.chengyunlai.spring.basic_ioc.annotation.bean")
public class QuickstartConfiguration {
    /**
     * 在 xml 中，咱声明 Bean 是通过 <bean> 标签。
     * <bean id="person" class="com.linkedbear.spring.basic_dl.a_quickstart_byname.bean.Person"/>
     * 在配置类中，要想替换掉 <bean> 标签，自然也能想到，它是使用 @Bean 注解。
     */

    /**
     * @Description: 这种使用方式，可以解释为：向 IOC 容器注册一个类型为 Person ，
     * id 为 person 的 Bean 。
     * 方法的返回值代表注册的类型，
     * 方法名代表 Bean 的 id 。
     * 当然，也可以直接在 @Bean 注解上显式的声明 Bean 的 id ，
     * 只不过在注解驱动的范畴里，它不叫 id 而是叫 name ：
     * @Param: []
     * @return: top.chengyunlai.spring.basic_ioc.annotation.bean.Person
     * @Author: chengyunlai
     * @Date: 2022/9/23
     */
    @Bean("aaa")
    public Person person() {
        Person person = new Person();
        person.setName("person");
        person.setAge(123);
        return person;
    }

    /**
     * 当然属性注入相当于
     * <bean id="person" class="com.linkedbear.spring.basic_di.a_quickstart_set.bean.Person">
     *     <property name="name" value="test-person-byset"/>
     *     <property name="age" value="18"/>
     * </bean>
     */

    @Bean
    public Cat cat() {
        Cat cat = new Cat();
        cat.setName("test-cat-anno");
        // 直接拿上面的person()方法作为返回值即可，相当于ref
        cat.setMaster(person());
        return cat;
    }


}
