package lk.ijse.di_update;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Long Hair")
public class Wibasha implements GoodGirl{
    @Override
    public void Kiss() {
        System.out.println("French Kisssss");
    }
}
