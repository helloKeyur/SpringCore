package com.kdvamja.springcorestart.annotationBasedConf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	private static ApplicationContext applCon;

	public static void main(String args[]) {
		applCon = new AnnotationConfigApplicationContext(AppConfig.class);
		Client client = applCon.getBean("client",Client.class);
		System.out.println(client);
		
		User user = applCon.getBean("user",User.class);
		System.out.println(user);
	}
}
