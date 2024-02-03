package lk.ijse.configs;

import lk.ijse.bean.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse")
public class AppConfig {
    @Bean
    public MyBean bean(){
        return new MyBean();
    }
}
