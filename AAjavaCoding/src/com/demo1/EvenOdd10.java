package com.demo1;

import java.util.Arrays;
import java.util.List;

public class EvenOdd10 {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8);
	list.stream().filter(x->x%2==0).map(x->x).forEach(System.out::println);
}
}
