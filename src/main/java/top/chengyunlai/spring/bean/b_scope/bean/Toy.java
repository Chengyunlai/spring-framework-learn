package top.chengyunlai.spring.bean.b_scope.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @ClassName
 * @Description Scope声明为原型类型；“Scope” 在 ConfigurableBeanFactory中，已经定义好。
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Component
@Scope("prototype")
public class Toy {
    public Toy() {
        System.out.println("Toy constructor run ...");
    }
}
