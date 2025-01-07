package com.demo1;

import java.util.stream.IntStream;

public class pallindromeSrtring6 {
	public static void main(String[] args) {
		String name = "MADAM";
		boolean result = checkPallindrome(name);
		if (result) {
			System.out.println("this is pallindrome= " + name);
		} else {
			System.out.println("this is not pallindrome= " + name);
		}
	}

	static boolean checkPallindrome(String name) {
		return IntStream.range(0, name.length() / 2)
				.allMatch(i -> name.charAt(i) == name.charAt(name.length() - 1 - i));
	}

}
