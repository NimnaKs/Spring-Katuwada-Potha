package lk.ijse.lifeCycle;

import lk.ijse.di.GoodFood;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;

public class BeanLifeCycleExplain implements BeanNameAware,
        BeanFactoryAware,
        ApplicationContextAware,
        InitializingBean,
        DisposableBean {

    @Autowired
    GoodFood goodFood;

    public BeanLifeCycleExplain(){
//        goodFood.eat();
//        Cannot access value set with DI
    }

    @PostConstruct
    private void Init() {
        System.out.println("Init");
        goodFood.eat();
    }
    public void myMethod01(){
        System.out.println("My Method 01");
    }

    public void myMethod02(){
        System.out.println("My Method 02");
    }
    @Override
    public void setBeanName(String beanName) {
        System.out.println("Set Bean Name : "+beanName);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Set Bean Factory : "+beanFactory);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Man yanooo.Byee");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After Properties set");
        goodFood.eat();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application Context : "+applicationContext);
    }

}
