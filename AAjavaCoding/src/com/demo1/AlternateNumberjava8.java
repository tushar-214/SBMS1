package com.demo1;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AlternateNumberjava8 {
	public static void main(String[] args) {
		int[]ar= {1,2,3,4,5,6,7,8};
		IntStream.range(0, ar.length).filter(i->i%2==0).map(i->ar[i]).forEach(System.out::println);
	}

}
