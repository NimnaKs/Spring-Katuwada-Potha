package lk.ijse.di_update;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Chamodi implements GoodGirl{
    @Override
    public void Kiss() {
        System.out.println("Kissssssssssssssssssssssssssss");
    }
}
