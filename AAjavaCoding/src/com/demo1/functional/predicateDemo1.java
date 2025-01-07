package com.demo1.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class predicateDemo1 {
	public static void main(String[] args) {
		// predicate is functional interface  its predefine interface 
		// it has only one abstract methods
		// take input and return boolean 
		
		//1> usiing predicate interface
		
		  List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		  
	  //   Predicate<Integer> pridicate=n->n%2==0;
	     
	//filter == predicate is input as filter intermediate operator
		  
	List<Integer> even=	  numbers.stream().filter(x->x%2==0).toList();
		  
	System.out.println("even number L:: "+even);
	}

}
