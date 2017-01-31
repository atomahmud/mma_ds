package com.mma.spring.test.firstprog;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Required;

/**
 * Person - 01/set/2015
 * 
 * @author Mahmud M. Ali
 *
 */

public class Person implements InitializingBean, DisposableBean{
	private int id;
	private String name;
	private Address address;
	
	private int taxId;
	
	public Person(){}
	public Person(int id, String name){
	    this.id = id;
	    this.name = name;
	}
	public void speak(){
		System.out.println("Hello, this is mahmud speaking :P");
	}
	@Required
	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address
				+ ", taxId=" + taxId + "]";
	}
	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
	 */
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing the "+ this.getClass()+"....");
		
	}
	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.DisposableBean#destroy()
	 */
	public void destroy() throws Exception {
		System.out.println(this.getClass()+" class is being destroyed....");
		
	}
	
	
	
	

}
