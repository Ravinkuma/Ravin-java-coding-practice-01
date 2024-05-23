package com.java.coding.practice.first;

import java.util.Scanner;

public class MaxInThreeNo {
	public static void findMaxInThree() {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b && a>c) {
			System.out.println(a+" is grater out of given three numbers");
		} else if(b>a && b>c){
			System.out.println(b+" is grater out of given three numbers ");
		} else {
			System.out.println(c+" is greater out of given three numbers");
		}
			
	}
}
