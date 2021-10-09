package org.testprogram;

public class Constructor3 extends Constructor2{
	public Constructor3(String name ) {
		
		System.out.println("Parameterized Constructor"+name);
	}
	public Constructor3() {
		this("BANK");
		System.out.println("Bank :5325");
	}
	public static void main(String[] args) {
		Constructor3 c = new Constructor3();
		c.bike();
		c.creditCard();
		c.deposit();
		c.emi();
		c.fixed();
		c.fixeddep();
		c.instantln();
		c.loan();
		c.personalLoan();
		c.saving();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	}
	


