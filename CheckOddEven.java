package com.java.coding.practice.first;

import java.util.Scanner;

public class CheckOddEven {
	public static void oddEven() {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	if(a%2==0) {
		System.out.println(a+" is an even number");
	} else {
		System.out.println(a+" is an odd number");
	}
	
	}
}
