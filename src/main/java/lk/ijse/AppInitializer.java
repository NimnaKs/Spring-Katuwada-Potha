package lk.ijse;

import lk.ijse.configs.AppConfig;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {

        //Create the context
        var ctx =
                new AnnotationConfigApplicationContext();

        //Register Application configuration
        ctx.register(AppConfig.class);

        //Refresh the context
        ctx.refresh();

        var myComponent =
                ctx.getBean("myComponent");
        System.out.println(myComponent);

        var myBean =
                ctx.getBean("test");
        System.out.println(myBean);


        ConfigurableListableBeanFactory beanFactory
                = ctx.getBeanFactory();
        boolean isSingleton = beanFactory.isSingleton("myComponent");
        System.out.println(isSingleton);

//        ctx.close();
        ctx.registerShutdownHook();
//        Gracefully shutdown
    }
}
