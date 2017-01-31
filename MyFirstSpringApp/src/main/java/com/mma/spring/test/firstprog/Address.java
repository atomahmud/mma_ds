package com.mma.spring.test.firstprog;

/**
 * Address - 01/set/2015
 * 
 * @author Mahmud M. Ali
 *
 */
public class Address {
	private String street;
	private int postalCode;
	
	public Address(){
		
	}
	public Address(String street, int postalCode){
	   this.street = street;
	   this.postalCode = postalCode;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", postalCode=" + postalCode + "]";
	}
	
}
