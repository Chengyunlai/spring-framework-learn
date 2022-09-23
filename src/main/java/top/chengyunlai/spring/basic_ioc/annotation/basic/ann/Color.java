package top.chengyunlai.spring.basic_ioc.annotation.basic.ann;

import java.lang.annotation.*;

/**
 * 下面的注解是什么意思?
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Color {
}
