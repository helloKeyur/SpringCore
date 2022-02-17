package com.kdvamja.springcorestart.stereotype;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class StereotypeApplication {
	
	private static ApplicationContext applCon;
	
	/*
	 
	 Bean Scope
 	=>	Singleton
 	=>	prototype
 	=>	request
 	=>	session
 	=>	globalsession
 	=>	NOTE:: @Scope annotation always use with @Component annotation

 	XML Based::
 	<bean class="" name="" scope=""> //default Singleton

 	Annotation based::
 	@Component
 	@Scope("prototype")
	 
	 * */
	public static void main(String args[]) {
		applCon = new ClassPathXmlApplicationContext("com/kdvamja/springcorestart/stereotype/application-config.xml");
		Student student = applCon.getBean("student",Student.class);
		System.out.println(student);
		System.out.println(student.getBooks().getClass().getName());
		System.out.println(student.getAuthors().getClass().getName());
		
		System.out.println(student.hashCode());
		
		Student stu = applCon.getBean("student",Student.class);
		System.out.println(stu.hashCode());
		
		//SPRING SpEL EXPRESSION LANG
		SpelExpressionParser parser = new SpelExpressionParser();
		Expression exp = parser.parseExpression("30+40");
		System.out.println(exp.getValue());
	}
}
