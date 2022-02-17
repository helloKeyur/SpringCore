package com.kdvamja.springcorestart.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kdvamja.springcorestart.autowired.entity.Customer;
import com.kdvamja.springcorestart.autowired.entity.Student;

public class AutowiredApplication {
	
	private static ApplicationContext applCont;

	public static void main(String[] args) {
		applCont = new ClassPathXmlApplicationContext("com/kdvamja/springcorestart/autowired/application-config.xml");
		Student student = applCont.getBean("student", Student.class);
		System.out.println(student);
		
		Customer customer = applCont.getBean("customer", Customer.class);
		System.out.println(customer);
	}
	
	// OUTPUT
	
	/* 
	 	Order.class :: super() Constructor 
		Order.class :: setAmount()
		Order.class :: setItemName()
		Order.class :: setOrderId()
		Customer.class :: super() Constructor 
		Customer.class :: setCustomerId()
		Student [studentId=1, studentName=Keyur, address=null]
		Customer.class :: getCustomerId()
		Customer.class :: getOrders()
		Customer [customerId=1, orders=[Orders [orderId=101011, itemName=mobile, amount=10,000]], getCustomerId()=1, getOrders()=[Orders [orderId=101011, itemName=mobile, amount=10,000]], getClass()=class com.kdvamja.springcorestart.autowired.entity.Customer, hashCode()=1423561005, toString()=com.kdvamja.springcorestart.autowired.entity.Customer@54d9d12d]

	 */
}
