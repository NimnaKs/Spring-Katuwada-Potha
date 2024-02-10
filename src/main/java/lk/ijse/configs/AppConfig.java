package lk.ijse.configs;

import lk.ijse.bean.MyBean;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

@Configuration
@ComponentScan(basePackages = "lk.ijse")
@EnableScheduling
public class AppConfig {
    @Bean("test")
    @Scope(ConfigurableListableBeanFactory.SCOPE_PROTOTYPE)
    public MyBean bean(){
        return new MyBean();
    }

    @Bean
    public ThreadPoolTaskScheduler threadPoolTaskScheduler(){
        return new ThreadPoolTaskScheduler();
    }
}
