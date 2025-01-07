package com.demo1;

import java.util.stream.IntStream;

public class ArrayIterate4 {
	public static void main(String[] args) {
		
		int [] ar= {1,2,3,4,5,6};
		
		IntStream.range(0, ar.length-1).map(x->ar[x]).forEach(System.out::println);
	}

}
