package com.thiru.learn.recursion;

public class TowersOfHonai {

	public static void main(String[] args) {
		// move 3 disks from tower A to tower B using tower C
		moveDisks('A', 'B', 'C', 3);
	}
	
	/**
	 * This method moves the disks from source tower to destination tower using temp tower
	 * @param source
	 * @param dest
	 * @param temp
	 * @param disks
	 */
	static void moveDisks(char source, char dest, char temp, int disks) {
		if (disks == 1) {
			System.out.printf("Move disk %d from %c to %c %n", disks, source, dest);
			return;
		}
		moveDisks(source, temp, dest, disks - 1);
		System.out.printf("Move disk %d from %c to %c %n", disks, source, dest);
		moveDisks(temp, dest, source, disks - 1);
	}
}
