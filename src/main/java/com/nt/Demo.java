package com.nt;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Demo {
	public static void main(String[] args) {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/resources/app.xml");
		Car c1 =  (Car) ctx.getBean("c1");
		
		System.out.println(c1.getName()+" "+c1.getPrice()+" "+c1.getEn().getCompany()+" "+c1.getEn().getQuality());
	}
}