package com.thiru.learn.datastructures.lists;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LinkedListTest {
	private List<Integer> list;
	
	@BeforeEach
	public void before() {
		list = new ImprovedLinkedList<Integer>();
	}
	
	@Test
	public void testEmpty() {
		assertTrue(list.isEmpty());
		list.add(10);
		assertFalse(list.isEmpty());
	}
	@Test
	public void testAdd() {
		java.util.List<Integer> nums = java.util.List.of(1,2,3,4,5);
		for(int n: nums) {
			list.add(n);
		}
		java.util.List<Integer> nums2 = new ArrayList<>();
		list.forEach(n-> nums2.add(n));

		assertTrue(nums2.containsAll(nums));
		//assertTrue(nums2.equals(nums));
	}
	
	@Test
	public void testContains() {
		int n = 10;
		assertFalse(list.contains(n));
		list.add(n);
		assertTrue(list.contains(n));
	}
	
	@Test
	public void testRemove() {
		int n = 10;
		list.add(n);
		assertTrue(list.contains(n));
		assertFalse(list.remove(n+1));
		assertTrue(list.remove(n));
		assertFalse(list.contains(n));
		
	}
	
	

}
