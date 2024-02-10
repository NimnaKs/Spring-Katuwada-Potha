package lk.ijse.di_update;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Rayan {

    @Autowired
        @Qualifier("Long Hair")
            @Wow
    GoodGirl goodGirl;

    public Rayan(){
//        goodGirl.Kiss();
    }

    @PostConstruct
    public void init(){
        goodGirl.Kiss();
    }

}
