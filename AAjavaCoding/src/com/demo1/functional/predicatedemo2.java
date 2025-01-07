package com.demo1.functional;

import java.util.Arrays;
import java.util.List;

public class predicatedemo2 {
	public static void main(String[] args) {	
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva","Aman"); 
        names.stream().filter(n->n.startsWith("A")).map(x->x).forEach(System.out::println);    
	}

}
