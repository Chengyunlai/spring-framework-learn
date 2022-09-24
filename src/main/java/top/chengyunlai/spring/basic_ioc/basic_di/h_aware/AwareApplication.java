package top.chengyunlai.spring.basic_ioc.basic_di.h_aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.chengyunlai.spring.basic_ioc.basic_di.h_aware.aware.AwaredTestBean;
import top.chengyunlai.spring.basic_ioc.basic_di.h_aware.config.AwareApplicationConfig;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class AwareApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AwareApplicationConfig.class);
        AwaredTestBean bean = ctx.getBean(AwaredTestBean.class);
        bean.printBeanNames();
        System.out.println("----");
        System.out.println(bean.getBeanName());
    }
}
