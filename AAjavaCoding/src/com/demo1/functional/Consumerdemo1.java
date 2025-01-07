package com.demo1.functional;

import java.util.Arrays;
import java.util.List;

public class Consumerdemo1 {
	public static void main(String[] args) {
		//The Consumer interface in Java is a functional interface that represents an operation that takes a single input argument
		//and returns no result. It is often used in the context of performing actions on elements in a stream without modifying them.
		//The Consumer interface is commonly used in terminal operations like forEach, where you want to perform an action on each element in a stream.
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        // foreach function in stream api taking consumer inout 
        names.stream().forEach(System.out::println);
	
	
	}

}
