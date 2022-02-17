package com.kdvamja.springcorestart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kdvamja.springcorestart.entity.Student;
import com.kdvamja.springcorestart.entity.User;

public class App {
    
	private static ApplicationContext appCon;

	public static void main( String[] args ){
    	appCon = new ClassPathXmlApplicationContext("application-config.xml");
    	User user = appCon.getBean("user", User.class);
    	System.out.println(user);
    	
    	User userOne = (User) appCon.getBean("userOne");
    	System.out.println(userOne);
    	
    	User userUsingPSchema = (User) appCon.getBean("userUsingPSchema");
    	System.out.println(userUsingPSchema);
    	
    	Student student = appCon.getBean("student", Student.class);
    	System.out.println(student);
    }
}
