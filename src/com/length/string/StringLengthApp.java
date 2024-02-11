package com.length.string;
import java.util.Scanner;
public class StringLengthApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first string");
		String Str1=scan.nextLine();
		System.out.println("Enter the second string "); 
		String Str2=scan.nextLine();
		StringLength sl=new StringLength();
		sl.CompareLength(Str1,Str2);
		
	}

}
