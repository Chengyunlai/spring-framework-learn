package top.chengyunlai.spring.basic_ioc.basic_di.h_aware.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.chengyunlai.spring.basic_ioc.basic_di.h_aware.aware.AwaredTestBean;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Configuration
public class AwareApplicationConfig {

    @Bean("AwaredTestBean")
    public AwaredTestBean getAwaredTestBean(){
        return new AwaredTestBean();
    }
}
