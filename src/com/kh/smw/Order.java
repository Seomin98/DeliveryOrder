package com.kh.smw;

public class Order {
	private String orders;
	private String brand;
	private String menu;
	
	public Order() {}
	
	public Order(String order) {
		this.orders = orders;
	}
	
	public Order(String brand, String menu) {
		this.brand = brand;
		this.menu = menu;
	}
	
	public Order(String food, String brand, String menu) {
		this.orders = food;
		this.brand = brand;
		this.menu = menu;
	}
	
	
	// getter 메소드
	public String getOrders() {
		return this.orders;
	}
	public String getBrand() {
		return this.brand;
	}
	
	public String getMenu() {
		return this.menu;
	}
	
	// setter 메소드
	public void setOrders(String orders) {
		this.orders = orders;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
}
 
 