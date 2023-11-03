package com.gradeproject.q2;

import java.util.Scanner;

public class PowerOfNumber {

	public static int power(int x, int n) {

		if(n==0) {
			return 1;
		}
		int result = x*power(x, n-1);

		return result;
	}
	public static void main(String[] args) {
		//allowing values from users
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base number X : ");
		int baseNumber = sc.nextInt();
		System.out.println("Enter the power N : ");
		int power = sc.nextInt();
		//printing the power value
		System.out.println("X power N is: "+power(baseNumber, power));
 
	}

}
