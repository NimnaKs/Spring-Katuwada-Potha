package lk.ijse.inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bus {

    @Autowired
    private Engine engine;
}
