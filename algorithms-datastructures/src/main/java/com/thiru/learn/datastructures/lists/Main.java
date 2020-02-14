package com.thiru.learn.datastructures.lists;

public class Main {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.forEach(System.out::println);
		list.remove(25);
		list.forEach(System.out::println);
		list.remove(10);
		list.forEach(System.out::println);
		list.remove(20);
		list.forEach(System.out::println);
		System.out.printf("Contains 30 %s%n", list.contains(30));
		System.out.printf("Contains 20 %s%n", list.contains(20));
		list.remove(30);
		System.out.printf("Contains 30 %s%n", list.contains(30));
		list.forEach(System.out::println);
		System.out.println("Empty "+list.isEmpty());
	}

}
