package com.kdvamja.springcorestart.autowired.entity;


public class Order {
	private Long orderId;
	private String itemName;
	private String amount;
	
	
	public Order() {
		super();
		System.out.println("Order.class :: super() Constructor ");
	}
	
	public Order(Long orderId, String itemName, String amount) {
		super();
		this.orderId = orderId;
		this.itemName = itemName;
		this.amount = amount;
		System.out.println("Order.class :: Constructor with parameter");
	}
	public Long getOrderId() {
		System.out.println("Order.class :: getOrderId()");
		return orderId;
	}
	public void setOrderId(Long orderId) {
		System.out.println("Order.class :: setOrderId()");
		this.orderId = orderId;
	}
	public String getItemName() {
		System.out.println("Order.class :: getItemName()");
		return itemName;
	}
	public void setItemName(String itemName) {
		System.out.println("Order.class :: setItemName()");
		this.itemName = itemName;
	}
	public String getAmount() {
		System.out.println("Order.class :: getAmount()");
		return amount;
	}
	public void setAmount(String amount) {
		System.out.println("Order.class :: setAmount()");
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", itemName=" + itemName + ", amount=" + amount + "]";
	}
}

