package com.thiru.learn.recursion;

public class PrintReverse {

	public static void main(String[] args) {
		printReverse(10);
	}
	
	private static void printReverse(int n) {
		if(n==0) {
			return;
		}
		
		printReverse(n-1);
		System.out.printf("%d ",n);
		
	}

}
