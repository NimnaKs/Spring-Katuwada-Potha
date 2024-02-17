package lk.ijse.log;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Log {
    @Before("execution(public void dataProcessStarted())")
    public void startLog(){
        System.out.println("Log - Data Processing Started");
    }

    @After("execution(public void dataProcessEnd())")
    public void completeLog(){
        System.out.println("Log - Data Save completed");
    }
}
