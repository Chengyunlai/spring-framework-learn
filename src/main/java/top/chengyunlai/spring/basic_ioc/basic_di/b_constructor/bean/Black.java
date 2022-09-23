package top.chengyunlai.spring.basic_ioc.basic_di.b_constructor.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Black {
    // 实现注解式属性注入，可以直接在要注入的字段上标注 @Value 注解：
    @Value("属性注入")
    private String name;
    @Value("19")
    private Integer order;

    @Override
    public String toString() {
        return "Black{" + "name='" + name + '\'' + ", order=" + order + '}';
    }
}