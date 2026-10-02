package com.nt;

public class Car {
	private String name;
	private int price ;
	private Engine en;
	
	public Car() {
	}
	
	
	
	public Car(String name, int price, Engine en) {
		super();
		
		this.name = name;
		this.price = price;
		this.en = en;
	}



	public void setEn(Engine en) {
		this.en = en;
	}
	public Engine getEn() {
		return en;
	}
	

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
}



