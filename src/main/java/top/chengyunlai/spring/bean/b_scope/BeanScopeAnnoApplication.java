package top.chengyunlai.spring.bean.b_scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.chengyunlai.spring.bean.b_scope.bean.Child;
import top.chengyunlai.spring.bean.b_scope.config.BeanScopeConfiguration;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class BeanScopeAnnoApplication {
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanScopeConfiguration.class);
        ctx.getBeansOfType(Child.class).forEach((name, child) -> {
            System.out.println(name + " : " + child);
        });
    }
}
