package top.chengyunlai.spring.basic_ioc.basic_di.d_complexfield.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Configuration
@ComponentScan("top.chengyunlai.spring.basic_ioc.basic_di.d_complexfield.bean")
@PropertySource(value = "classpath:basic_ioc/basic_di/d_complexfield/complexfield.properties",encoding = "UTF8")
@ImportResource("classpath:basic_ioc/basic_di/d_complexfield/complexfield.xml")
public class ComplexfieldApplicationConfig {

}
