package com.demo1;

import java.util.Arrays;

public class Stringcount3 {
	public static void main(String[] args) {
		String name = "tushar balasaheb bhosale";
		int count = (int) Arrays.stream(name.split("\\s+")).count();
		System.out.println("count of string = " + count);

	}
}
