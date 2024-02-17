package lk.ijse.inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private final Engine engine;

    private final Engine2 engine2;

    @Autowired
    public Car(Engine engine, Engine2 engine2) {
        this.engine = engine;
        this.engine2 = engine2;
    }

    public String start(){
       return this.engine.V12()+this.engine2.V13();
    }
}
