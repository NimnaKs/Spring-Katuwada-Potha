package lk.ijse.bean;

import lk.ijse.di.GoodFood;
import org.springframework.stereotype.Component;

@Component
public class MyFood implements GoodFood {
    @Override
    public void eat() {
        System.out.println("Eat Rice.");
    }
}
