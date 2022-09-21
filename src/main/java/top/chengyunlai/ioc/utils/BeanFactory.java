package top.chengyunlai.ioc.utils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class BeanFactory {
    // jdk 中刚好也有一个 API 叫 Properties ，它可以解析 .properties 文件。
    private static Properties properties;

    // 缓存区，保存已经创建好的对象
    private static Map<String, Object> beanMap = new HashMap<>();

    // 下面要在工程刚启动的时候就初始化 Properties ，这咱可以使用静态代码块实现吧：
    static {
        properties = new Properties();
        try {
            // 必须使用类加载器读取resource文件夹下的配置文件
            properties.load(BeanFactory.class.getClassLoader().getResourceAsStream("factory.properties"));
        } catch (IOException e) {
            // BeanFactory类的静态初始化都失败了，那后续也没有必要继续执行了
            throw new ExceptionInInitializerError("BeanFactory initialize error, cause: " + e.getMessage());
        }
    }

    // public static DemoDao getDemoDao(String beanName) {
    //     // return new DemoDaoImpl();// DemoDaoImpl.java不存在导致编译失败
    //
    //     /*
    //     使用反射之后，错误现象不再是在编译器就出现，而是在工程启动后，由于 BeanFactory 要构造 DemoDaoImpl 时确实还没有该类，
    //     所以抛出 ClassNotFoundException 异常。
    //     这样 BeanFactory 对 DemoDaoImpl 的依赖程度就相当于降低了，也就可以算作“弱依赖”了。
    //      */
    //     try {
    //         //【这里会出现一个问题，每次调用一下getDemoDao的时候，会重新分配新的地址】 每次打印的内存地址都不相同，证明是创建了10个不同的 DemoDaoImpl！我们需要创建缓存区
    //         Class<?> clazz = Class.forName(properties.getProperty(beanName));
    //         // return (DemoDao) Class.forName("top.chengyunlai.ioc.dao.impl.DemoDaoImpl").newInstance();
    //         return (DemoDao) clazz.newInstance();
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //         throw new RuntimeException("DemoDao instantiation error, cause: " + e.getMessage());
    //     }
    //
    //     /*
    //     由于类的全限定名是写死在 BeanFactory 的源码中，导致每次切换数据库后还得重新编译工程才可以正常运行，
    //     这显得貌似很没必要，应该有更好的处理方案。见17句
    //      */
    //
    //
    //
    // }

    public static Object getBean(String beanName) {
        // 先判断缓存区中有没有创建好对象
        // 双检锁保证beanMap中确实没有beanName对应的对象
        if (!beanMap.containsKey(beanName)){
            synchronized (BeanFactory.class){
                if (!beanMap.containsKey(beanName)){
                    try {
                        Class<?> clazz = Class.forName(properties.getProperty(beanName));
                        Object bean = clazz.newInstance();
                        // 反射创建后放入缓存再返回
                        beanMap.put(beanName,bean);
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    } catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        }
        // 若已经存在的情况 直接从缓存池中返回该对象
        return beanMap.get(beanName);
    }
}
