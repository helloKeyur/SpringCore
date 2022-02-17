package com.kdvamja.springcorestart.autowired.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
public class Customer {
	
	private Long customerId;
	@Autowired
	private List<Order> orders;
	
	
	
	public Customer() {
		super();
		System.out.println("Customer.class :: super() Constructor ");
	}
	public Customer(Long customerId, List<Order> orders) {
		super();
		this.customerId = customerId;
		this.orders = orders;
		System.out.println("Customer.class :: Constructor with parameter");
	}
	
	public Long getCustomerId() {
		System.out.println("Customer.class :: getCustomerId()");
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		System.out.println("Customer.class :: setCustomerId()");
		this.customerId = customerId;
	}
	public List<Order> getOrders() {
		System.out.println("Customer.class :: getOrders()");
		return orders;
	}
	public void setOrders(List<Order> orders) {
		System.out.println("Customer.class :: setOrders()");
		this.orders = orders;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", orders=" + orders + ", getCustomerId()=" + getCustomerId()
				+ ", getOrders()=" + getOrders() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
