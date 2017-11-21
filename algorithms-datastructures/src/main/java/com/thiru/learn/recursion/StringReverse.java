package com.thiru.learn.recursion;

public class StringReverse {

	public static void main(String[] args) {
		String rev = reverse("Hello World");
		System.out.println(rev);
	}

	private static String reverse(String str) {
		if(str.length()<2) {
			return str;
		}else if(str.length()==2) {
			return str.charAt(1)+""+str.charAt(0);
		}else {
			return str.charAt(str.length()-1)+reverse(str.substring(0, str.length()-1));	
		}
		
	}

}
