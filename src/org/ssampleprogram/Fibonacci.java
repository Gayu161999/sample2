package org.ssampleprogram;

public class Fibonacci {
	public static void main(String[] args) {
		int a =1 ,b=1;
//		0+1+1+2+3+5+8+13....
//		       1         2
		for (int i = 0; i <=5; i++) {
			int c = a +b;    //3
			System.out.println("THE FIBONACCI SERIES>>>>>"); //4
			System.out.println(c);
			 a = b; //5
			 b = c;  //6
				
			
		}
	}

}
