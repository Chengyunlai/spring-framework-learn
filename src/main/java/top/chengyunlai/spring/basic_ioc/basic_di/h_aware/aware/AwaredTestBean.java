package top.chengyunlai.spring.basic_ioc.basic_di.h_aware.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.NamedBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.stream.Stream;

/**
 * @ClassName
 * @Description
 * ApplicationContextAware: 当这个 AwaredTestBean 被初始化好的时候，就会把 ApplicationContext 传给它
 * BeanNameAware : 如果当前的 bean 需要依赖它本身的 name ，使用 @Autowired 就不好使了，这个时候就得使用 BeanNameAware 接口来辅助注入当前 bean 的 name 了。
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class AwaredTestBean implements ApplicationContextAware, BeanNameAware {
    //ApplicationContextAware
    private ApplicationContext ctx;

    //BeanNameAware
    private String beanName;

    @Override
    public void setApplicationContext(ApplicationContext ctx) throws BeansException {
        this.ctx = ctx;
    }

    public void printBeanNames() {
        Stream.of(ctx.getBeanDefinitionNames()).forEach(System.out::println);
    }

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }

    public String getBeanName() {
        return beanName;
    }
}
