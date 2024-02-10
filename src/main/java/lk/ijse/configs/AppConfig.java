package lk.ijse.configs;

import lk.ijse.bean.MyBean;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "lk.ijse")
public class AppConfig {
    @Bean("test")
    @Scope(ConfigurableListableBeanFactory.SCOPE_PROTOTYPE)
    public MyBean bean(){
        return new MyBean();
    }
}
