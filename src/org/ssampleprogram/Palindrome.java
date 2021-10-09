package org.ssampleprogram;

public class Palindrome {
	public static void main(String[] args) {
		int num = 12345, palin = num, result = 0;
		while (num > 0) {
			num = num % 10;
			result = (result * 10) + 0;
			num = num / 10;
		}
		if (palin == result) {
			System.out.println("reverse");
		} else {
			System.out.println("not reverse");
		}

	}
}
