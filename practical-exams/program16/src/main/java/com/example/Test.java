package com.example;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {
    public static void main(String[] args) {
        try (var context = new ClassPathXmlApplicationContext("beans.xml")) {
            Emp emp = context.getBean("emp1", Emp.class);
            System.out.println(emp.getAddress());
            System.out.println("Prototype bean scope demo:");
            System.out.println(context.getBean("prototypeAddress") != context.getBean("prototypeAddress"));
        }
    }
}
