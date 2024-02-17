package lk.ijse.inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Lorry {
    private Engine engine;

    @Autowired
    public void setEngine(Engine engine){
        this.engine=engine;
    }

    public String start(){
        return this.engine.V12();
    }
}
