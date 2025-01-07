package com.demo1.functional;

import java.util.Arrays;
import java.util.List;

public class FunctionDemo1 {

	public static void main(String[] args) {

		// the Function interface is a functional interface in Java that represents a
		// function that takes an
		// argument of type T and returns a result of type R. It is used extensively in
		// Stream API for transforming or
		// mapping elements from one type to another.

		// in the Stream API, the Function interface is commonly used in operations that
		// transform or map the elements in the stream.
		// The most typical operations using Function are map(), flatMap(), and
		// collect().
		List<String> names = Arrays.asList("alice", "bob", "charlie");
		List<String> na = names.stream().map(n -> n.toUpperCase()).toList();
		System.out.println(" uppercase :: " +na );

	}

}
