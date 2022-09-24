package top.chengyunlai.spring.basic_ioc.basic_di.d_complexfield.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Component
public class Dog {
    /**
     * 对应XML中的ref 注入，使用注解有三种方式：
     * 方法一：可以直接在属性上添加    @Autowired
     * @Autowired 是按照类型注入
     */
    @Autowired(required = false)
    // @Qualifier 注解的使用目标是要注入的 Bean ，它配合 @Autowired 使用，可以显式的指定要注入哪一个 Bean
    @Qualifier("master")

    // @Resource(name = "master")
    // @Autowired 是按照类型注入，@Resource 是直接按照属性名 / Bean的名称注入。
    private Person person;

    @Autowired
    private List<Person> persons;

    /**
     * 方法二
     * @param person
     */
    // @Autowired
    // public Dog(Person person) {
    //     this.person = person;
    // }

    /**
     * 方法三
     * @param person
     */
    // public void setPerson(Person person) {
    //     this.person = person;
    // }


    @Override
    public String toString() {
        return "Dog{" +
                "person=" + person +
                ", persons=" + persons +
                '}';
    }
}
