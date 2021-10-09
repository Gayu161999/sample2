package org.ssampleprogram;

public class PalindromeString {
public static void main(String[] args) {
	String s = "malayalam";
	int len = s.length();
	String rev="";
	for (int i = len-1; i >=0; i--) {
		rev=rev+1;
		char charAt = s.charAt(i);
		
	}
	System.out.println(s);
	if (s.equals(s)) {
		System.out.println("palin");
	} else {
System.out.println("not palin");
	}
	
	
	
}
}
