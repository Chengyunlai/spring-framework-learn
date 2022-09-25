package top.chengyunlai.spring.bean.a_type.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.chengyunlai.spring.bean.a_type.factorybean.bean.Toy;
import top.chengyunlai.spring.bean.a_type.factorybean.cofig.BeanTypeConfiguration;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class BeanTypeAnnoApplication {
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanTypeConfiguration.class);
        // Toy toy = ctx.getBean(Toy.class);
        // System.out.println(toy);
        // 测试工厂函数是否为单例,控制台打印 true ，说明 FactoryBean 默认生成的 Bean 确实是单实例的
        Toy toy1 = ctx.getBean(Toy.class);
        Toy toy2 = ctx.getBean(Toy.class);
        System.out.println(toy1 == toy2);
        // 只会取出生产出来的 Bean
        System.out.println(ctx.getBean("toyFactory"));
        // FactoryBean 的方式，需要在 Bean 的 id 前面加 “&” 符号：
        System.out.println(ctx.getBean("&toyFactory"));
    }
}
