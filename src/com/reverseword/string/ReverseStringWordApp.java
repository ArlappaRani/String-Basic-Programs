package com.reverseword.string;

import java.util.Scanner;


public class ReverseStringWordApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		//taking the user input as string
		System.out.println("Enter the string value");
		String str=scan.nextLine();
		//calling a method
		String newstr=ReverseStringWord.WordReverse(str);
		System.out.println("The entered string is"+str);
		System.out.println("After reversing the order"+newstr);


	}

}
