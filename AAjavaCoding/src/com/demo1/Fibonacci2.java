package com.demo1;

public class Fibonacci2 {
	public static void main(String[] args) {
		//01123
		int a=0;
		int b=1;
		
		System.out.print(" "+a+ " "+b);
		for(int i=2;i<=10;i++)
		{
			int c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			
			
		}
	}

}
