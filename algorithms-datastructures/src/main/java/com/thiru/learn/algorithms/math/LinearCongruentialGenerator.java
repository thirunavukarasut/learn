package com.thiru.learn.algorithms.math;

/**
 * 1. B & M are relatively prime or co-primes
 * 2. A-1 is divisible by all factors of M
 * 3. If M is multiple of 4 then A-1 is also a multiple of 4.
 *  
 * @author Thirunavukarasu
 *
 */
public class LinearCongruentialGenerator implements RandomNumberGenerator {
	
	private long seed;
	private long a;
	private long b;
	private long m;
	
	public LinearCongruentialGenerator() {
		this.seed = 0;
		this.a = 98;
		this.b = 19;
		this.m = 97;
	}
	
	public LinearCongruentialGenerator(long seed, long a, long b, long m) {
		this.seed = seed;
		this.a = a;
		this.b = b;
		this.m = m;
	}
	
	@Override
	public long nextInt() {
		seed = (a*seed+b)%m;
		return seed;
	}
	
}
