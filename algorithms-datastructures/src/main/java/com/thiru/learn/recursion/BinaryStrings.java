package com.thiru.learn.recursion;

import java.util.Arrays;
import java.util.List;

public class BinaryStrings {

	public static void main(String[] args) {
		int[] array = new int[4];
		printBinary(array, 4);
	}

	static void printBinary(int[] array, int len) {
		if (len == 0) {
			System.out.println(Arrays.toString(array));
		} else {
			for (int ch : List.of(0, 1)) {
				array[len - 1] = ch;
				printBinary(array, len - 1);
			}
		}
	}
}
