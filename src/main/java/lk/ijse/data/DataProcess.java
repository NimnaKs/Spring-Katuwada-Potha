package lk.ijse.data;

import org.springframework.stereotype.Component;

@Component
public class DataProcess {

    public void dataProcessStarted(){
        System.out.println("---------- Save process started -------");
    }

    public void dataProcessEnd(){
        System.out.println("---------- Complete the Save process-------");
    }
}
