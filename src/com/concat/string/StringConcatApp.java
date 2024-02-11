package com.concat.string;

import java.util.Scanner;
public class StringConcatApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first string");
		String Str1=scan.nextLine();
		System.out.println("Enter the second string "); 
		String Str2=scan.nextLine();
		StringConcate sl=new StringConcate();
		sl.CompareValues(Str1,Str2);

	}

}
