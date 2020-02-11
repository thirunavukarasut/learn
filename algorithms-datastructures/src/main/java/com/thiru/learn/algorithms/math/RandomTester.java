package com.thiru.learn.algorithms.math;

import java.util.HashSet;
import java.util.Set;

public class RandomTester {

	public static void main(String[] args) {
		RandomNumberGenerator gen = new LinearCongruentialGenerator(0,998,811,997);
		//RandomNumberGenerator gen = new LinearCongruentialGenerator(0,134775813 ,1,(long)Math.pow(2, 32));
		Set<Long> set = new HashSet<>();
		long n = gen.nextInt();
		while(!set.contains(n)){
			//System.out.println(n);
			set.add(n);
			n = gen.nextInt();
		};
		System.out.println("\nTotal generated :"+set.size());
	}
	
}
