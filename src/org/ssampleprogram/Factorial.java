package org.ssampleprogram;

public class Factorial {
	public static void main(String[] args) {
//		1*2*3*4*5=120
		int fact =1 , count =0;
		for (int i = 1; i <=5; i++) {
			fact=fact*i;
			count++;
			}
		System.out.println(count);
		System.out.println("factorial number : "+fact);
		}

}
