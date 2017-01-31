package com.mma.spring.test.firstprog;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/mma/spring/test/firstprog/beans/beans.xml");
       
       Person person = (Person) context.getBean("person");
       person.speak();	
       System.out.println(person);
       context.close();
       
    }
}
