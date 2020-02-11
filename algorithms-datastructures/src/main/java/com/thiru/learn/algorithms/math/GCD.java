package com.thiru.learn.algorithms.math;

public class GCD {

	public static void main(String[] args) {
		int a = 30;
		int b = 0;
		int g = gcd(a,b);
		System.out.printf("GCD of %d and %d is %d%n", a,b,g);
	}
	
	static int gcd(int a, int b) {
		if(a==0 || b==0) {
			throw new IllegalArgumentException("One or more argument is 0");
		}
		if(a>b) {
			int r;
			while((r = a % b) !=0) {
				a = b;
				b = r;
			}
			return b;
			
		}else {
			return gcd(b,a);
		}
	}
	

}
