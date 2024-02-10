package lk.ijse.components;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component
public class Timer {

    public Timer(){
        System.out.println("Timer is running");
    }
    @Scheduled(fixedDelay = 2000) // Run every 2 seconds
    public void scheduledTask() {
        System.out.println("Executing scheduled task...");
    }

}
