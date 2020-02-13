package com.thiru.learn.algorithms.math;

import java.math.BigInteger;

public class IsProbablePrime {

	public static void main(String[] args) {
		int[] a = {11,17,19,23,37,95,93,97};
		//int[] a = {99999989};
		for(int i=0;i<a.length;i++) {
			System.out.printf("%d is prime=%s\n", a[i],isPrime(a[i]));
		}
	}

	static boolean isPrime(int num) {
		for(int i=2;i<20 && i<num;i++) {
			BigInteger bi = new BigInteger(i+"");
			if(bi.pow(num-1).mod(new BigInteger(num+"")).intValue()!=1) {
				return false;
			}
		}
		return true;
	}
}
