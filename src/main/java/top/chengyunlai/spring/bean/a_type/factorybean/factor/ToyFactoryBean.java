package top.chengyunlai.spring.bean.a_type.factorybean.factor;

import org.springframework.beans.factory.FactoryBean;
import top.chengyunlai.spring.bean.a_type.factorybean.bean.Ball;
import top.chengyunlai.spring.bean.a_type.factorybean.bean.Car;
import top.chengyunlai.spring.bean.a_type.factorybean.bean.Child;
import top.chengyunlai.spring.bean.a_type.factorybean.bean.Toy;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class ToyFactoryBean implements FactoryBean<Toy> {
    // 咱希望能让它根据小孩子想要玩的玩具来决定生产哪种玩具，
    // 那咱就得在这里面注入 Child 。由于咱这里面使用的不是注解式自动注入，那咱就用 setter 注入吧：
    private Child child;

    // FactoryBean 本身的加载是伴随 IOC 容器的初始化时机一起的。
    public ToyFactoryBean() {
        System.out.println("ToyFactoryBean 初始化了。。。");
    }

    // 返回创建的对象
    // 但是，FactoryBean 生产 Bean 的机制是延迟生产。
    @Override
    public Toy getObject() throws Exception {
        // 当Application从容器中取一个类的时候，如果这个类是由Factory管理的，它会根据某种条件来创建这个具体的对象。
        switch (child.getWantToy()) {
            case "ball":
                return new Ball("ball");
            case "car":
                return new Car("car");
            default:
                // SpringFramework2.0开始允许返回null
                // 之前的1.x版本是不允许的
                return null;
        }
    }

    // 返回创建的对象的类型（即泛型类型）
    @Override
    public Class<?> getObjectType() {
        return Toy.class;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    // 创建的对象是单实例Bean还是原型Bean，默认单实例
    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
