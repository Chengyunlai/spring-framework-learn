package top.chengyunlai.spring.bean.c_instantiate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.chengyunlai.spring.bean.c_instantiate.bean.Car;
import top.chengyunlai.spring.bean.c_instantiate.bean.CarInstantiateConfig;
import top.chengyunlai.spring.bean.c_instantiate.bean.CarStaticFactory;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class BeanInstantiateXmlApplication {
    public static void main(String[] args) {
        /**
         * 运行 main 方法，发现控制台上打印了两次 Car 的构造方法运行，并且创建了两个 Car 对象：
         */
        ApplicationContext ctx = new AnnotationConfigApplicationContext(CarInstantiateConfig.class);
        ctx.getBeansOfType(Car.class).forEach((beanName, car) -> {
            System.out.println(beanName + " : " + car);
        });

        // 尝试取一下试试(出错)
        // System.out.println(ctx.getBean(CarStaticFactory.class));
    }
}
