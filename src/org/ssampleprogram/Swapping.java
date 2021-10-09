package org.ssampleprogram;

public class Swapping {
public static void main(String[] args) {
	int a = 10,b=20;
	/*int c =a; using third variable
	a=b;
	b=c;*/
//	without using 3rd variable
	a=a+b;
	b=a-b;
	a=a-b;
	
	System.out.println("the a value is...."+a);
	System.out.println("the b value is...."+b);
}
}
