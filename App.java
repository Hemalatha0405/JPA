package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("springconfig.xml");
        //System.out.println( "Hello World!" );
        Student student= (Student) context.getBean("st2");
       //student.setAge(-25);
        System.out.println(student.getAge());
        student.writeExam();
    }
}
