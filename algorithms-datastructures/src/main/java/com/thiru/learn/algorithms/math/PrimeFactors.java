package com.thiru.learn.algorithms.math;

import java.util.LinkedList;
import java.util.List;

public class PrimeFactors {

	public static void main(String[] args) {
		int n = 99;
		System.out.printf("Factors of %d are %s%n", n,primeFactors(n));
	}
	
	static List<Integer> primeFactors(int n){
		List<Integer> factors = new LinkedList<>();
		while(n%2==0) {
			n=n/2;
			factors.add(2);
		}
		int factor;
		int stopAt = (int)Math.sqrt(n);
		for(factor=3;factor<=stopAt;factor+=2) {
			while(n%factor==0) {
				factors.add(factor);
				n = n / factor;
				stopAt = (int)Math.sqrt(n);
			}
			
		}
		if(n>1) {
			factors.add(n);
		}
		return factors;
	}

}
