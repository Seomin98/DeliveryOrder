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
	
	public Order(String orders, String brand, String menu) {
		this.orders = orders;
		this.brand = brand;
		this.menu = menu;
	}
	
	
	// getter �޼ҵ�
	public String getorders() {
		return this.orders;
	}
	public String getbrand() {
		return this.brand;
	}
	
	public String getmenu() {
		return this.menu;
	}
	
	// setter �޼ҵ�
	public void setorders(String orders) {
		this.orders = orders;
	}
	public void setbrand1(String brand) {
		this.brand = brand;
	}
	public void setmenu(String menu) {
		this.menu = menu;
	}
}
 
 