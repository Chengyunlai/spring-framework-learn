package top.chengyunlai.spring.basic_ioc.basic_di.b_constructor.bean;

public class Person {
    private String name;
    private Integer age;

    /**
     * 加上这个构造方法后，默认的无参构造方法就没了，这样原来的 <bean> 标签创建时就会失效，提示没有默认的构造方法：
     */

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
