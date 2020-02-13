package com.thiru.learn.algorithms.math;

import java.util.Arrays;

public class FindMaxPrimeNumberLessThanX {

	public static void main(String[] args) {
		int n = 100_000_000;
		int p = findMaxPrimeLessThan(n);
		System.out.printf("Max prime less than %d is %d%n",n,p);
	}
	
	static int findMaxPrimeLessThan(final int n) {
		boolean[] isPrime = new boolean[n];
		Arrays.fill(isPrime, true);
		//1 is neither prime or composite
		isPrime[0] = false;
		//cross out all 2 multiples
		for(int multiple=4;multiple<=n;multiple+=2) {
			isPrime[multiple-1] = false; //multiple-1 since array indexes are 1 less than the actual multiple
		}
		//print(isPrime);
		//cross out other multiples
		for(int multiple=3;multiple<=n;multiple+=2) {
			if(isPrime[multiple-1]) {
				for(int m=multiple*multiple;m<n && m>multiple;m+=2*multiple) {
					isPrime[m-1] = false;
				}
				//print(isPrime);
			}
		}
		//print(isPrime);

		//find max prime, the first isPrime=true from the last index
		for(int p=isPrime.length;p>0;p--) {
			if(isPrime[p-1]) {
				return p;
			}
		}
		return -1;
	}
	
	static void print(boolean[] primes) {
		for(int i=0;i<primes.length;i++) {
			if(primes[i]) {
				System.out.printf("%d ", i+1);
			}
		}
		System.out.println();
	}

	
}
