package lk.ijse;

import lk.ijse.configs.AppConfig;
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
        ctx.close();
    }
}
