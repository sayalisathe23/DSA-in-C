package com.nt;

public class Engine {
	private String c;
	private String q;
	
	
	public Engine() {
	}
	
	public Engine(String c,String q) {
		//super();
		this.c = c;
		this.q = q;
		
	}

	public void setCompany(String c) {
		this.c = c;
	}
	
	public String getCompany() {
		return c;
	}
	public void setQuality(String q) {
		this.q = q;
	}
	
	public String getQuality() {
		return q;
	}
	
	

}
