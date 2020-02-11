package com.thiru.learn.sample;

public class ToI {

	public static void main(String[] args) {
		moveDisks("A", "B", "C", 3);
	}
	
	private static void moveDisks(String from, String to, String temp, int n) {
		if(n==1) {
			System.out.printf("Move disk %d from %s to %s%n", n, from, to);
		}else {
			moveDisks(from, temp, to, n-1);
			System.out.printf("Move disk %d from %s to %s%n", n, from, to);
			moveDisks(temp, to, from, n-1);
		}
	}

}
