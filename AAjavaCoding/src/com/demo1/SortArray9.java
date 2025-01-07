package com.demo1;
import java.util.Iterator;
public class SortArray9 {
	public static void main(String[] args) {
		int[] ar = { 9, 1, 2, 8, 3 };
		for (int i = 0; i < ar.length; i++) {
			for (int j = i; j < ar.length; j++) {
				if (ar[i] >= ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		for (int c : ar) {
			System.out.print(c + " ");
		}
	}

}
