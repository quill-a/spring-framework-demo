package dev.quilla.SpringDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  
  public static void main(String[] args) {
    
    //BeanFactory factory = new ClassPathXmlApplicationContext("spring.xsd");
    
    ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
    
    Alien obj = (Alien) factory.getBean("alien");
    obj.code();
  }
}
