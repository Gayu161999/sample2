package org.sam;

public class Sample {
	

	public void series() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <=5-i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println(" ");

		}

	}

	public static void main(String[] args) {
		Sample s = new Sample();
		s.series();
	}

}
