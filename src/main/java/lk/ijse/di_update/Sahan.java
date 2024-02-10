package lk.ijse.di_update;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Long Hair")
@Wow
public class Sahan implements GoodGirl{
    @Override
    public void Kiss() {
        System.out.println("Sex with Kisssssssss");
    }
}
