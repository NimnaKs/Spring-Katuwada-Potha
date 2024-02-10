package lk.ijse.components;

import lk.ijse.bean.MyBean;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableListableBeanFactory.SCOPE_PROTOTYPE)
public class MyComponent{
    MyComponent(){
        System.out.println("My Component");
    }

    @Bean
    public MyBean bean(){
        return new MyBean();
    }
//    Light mode

}
