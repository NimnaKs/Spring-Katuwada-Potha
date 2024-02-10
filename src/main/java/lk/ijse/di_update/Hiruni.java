package lk.ijse.di_update;

import org.springframework.stereotype.Component;
@Component
public class Hiruni implements GoodGirl{
    @Override
    public void Kiss() {
        System.out.println("Kisssss");
    }
}
